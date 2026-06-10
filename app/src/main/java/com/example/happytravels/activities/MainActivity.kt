package com.example.happytravels.activities

import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.happytravels.R
import com.example.happytravels.adapters.DestinationPlacesAdapter
import com.example.happytravels.databinding.ActivityMainBinding
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.utils.ShakeDetector
import com.example.happytravels.utils.SwipeToDeleteCallback
import com.example.happytravels.utils.SwipeToEditCallback
import com.example.happytravels.viewmodel.DestinationViewModel
import com.google.android.gms.location.LocationServices
import com.google.android.libraries.places.api.Places
import android.telephony.SmsManager
import android.telephony.SubscriptionManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: DestinationViewModel
    private lateinit var prefs: SharedPreferences

    private var isFabMenuOpen = false
    private var isSosActive = false
    private var sosHandler: Handler? = null
    private var sosRunnable: Runnable? = null

    private var userLat: Double = 0.0
    private var userLon: Double = 0.0

    private lateinit var sensorManager: SensorManager
    private lateinit var shakeDetector: ShakeDetector



    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("PLACES_DEBUG", "MainActivity onCreate - Places initialized: ${Places.isInitialized()}")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefs = getSharedPreferences("emergency_prefs", MODE_PRIVATE)
        viewModel = ViewModelProvider(this)[DestinationViewModel::class.java]

        setupShakeDetector()
        setupFabMenu()
        setupSOS()
        fetchUserLocationThenObserve()
    }

    private fun setupShakeDetector() {
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        shakeDetector = ShakeDetector {
            runOnUiThread {
                if (!isSosActive) {
                    Toast.makeText(this, "Shake detected — activating SOS!", Toast.LENGTH_SHORT).show()
                    startSOS()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        // BUG FIX: sensor manager and location need refreshing
        sensorManager.registerListener(
            shakeDetector,
            sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI
        )
        fetchUserLocationThenObserve()
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(shakeDetector)
    }

    private fun setupFabMenu() {
        binding.fabMain.setOnClickListener {
            if (isFabMenuOpen) closeFabMenu() else openFabMenu()
        }
        binding.fabAddDestination.setOnClickListener {
            closeFabMenu()
            startActivityForResult(
                Intent(this, AddDestinationPlacesActivity::class.java),
                ADD_PLACE_ACTIVITY_REQUEST_CODE
            )
        }
        binding.fabDeleteAll.setOnClickListener {
            closeFabMenu()
            androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Delete All")
                .setMessage("Are you sure you want to delete all destinations?")
                .setPositiveButton("Delete All") { _, _ -> viewModel.deleteAll() }
                .setNegativeButton("Cancel", null)
                .show()
        }
        binding.fabEmergency.setOnClickListener {
            closeFabMenu()
            startActivity(Intent(this, EmergencyContactsActivity::class.java))
        }
        binding.fabHistory.setOnClickListener {
            closeFabMenu()
            startActivity(Intent(this, TripHistoryActivity::class.java))
        }
    }

    private fun openFabMenu() {
        isFabMenuOpen = true
        binding.fabMain.setImageResource(R.drawable.ic_fab_close)
        binding.fabAddRow.visibility = View.VISIBLE
        binding.fabDeleteRow.visibility = View.VISIBLE
        binding.fabEmergencyRow.visibility = View.VISIBLE
        binding.fabHistoryRow.visibility = View.VISIBLE
    }

    private fun closeFabMenu() {
        isFabMenuOpen = false
        binding.fabMain.setImageResource(R.drawable.ic_fab_add)
        binding.fabAddRow.visibility = View.GONE
        binding.fabDeleteRow.visibility = View.GONE
        binding.fabEmergencyRow.visibility = View.GONE
        binding.fabHistoryRow.visibility = View.GONE
    }

    private fun setupSOS() {
        binding.fabSos.setOnClickListener { if (!isSosActive) startSOS() }
        binding.fabStopSos.setOnClickListener { stopSOS() }
    }

    private fun startSOS() {
        // BUG FIX: Re-load prefs inside startSOS to get latest saved contacts
        val c1 = prefs.getString("contact1", "")?.trim()
        val c2 = prefs.getString("contact2", "")?.trim()
        val c3 = prefs.getString("contact3", "")?.trim()

        if (c1.isNullOrEmpty() && c2.isNullOrEmpty() && c3.isNullOrEmpty()) {
            Toast.makeText(this, "Please save emergency contacts first", Toast.LENGTH_LONG).show()
            return
        }

        isSosActive = true
        binding.fabSos.backgroundTintList = android.content.res.ColorStateList.valueOf(
            resources.getColor(R.color.sos_color, theme))
        binding.fabStopSos.visibility = View.VISIBLE
        Toast.makeText(this, "SOS ACTIVE — Sending location every minute", Toast.LENGTH_LONG).show()

        sosHandler = Handler(Looper.getMainLooper())
        sosRunnable = object : Runnable {
            override fun run() {
                sendSOSLocation()
                sosHandler?.postDelayed(this, 60000)
            }
        }
        sosHandler?.post(sosRunnable!!)
    }

    private fun stopSOS() {
        isSosActive = false
        sosHandler?.removeCallbacks(sosRunnable!!)
        sosHandler = null
        binding.fabStopSos.visibility = View.GONE
        binding.fabSos.backgroundTintList = android.content.res.ColorStateList.valueOf(
            resources.getColor(R.color.white, theme))
        Toast.makeText(this, "SOS stopped", Toast.LENGTH_SHORT).show()
    }

    private fun sendSOSLocation() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), 100)
            return
        }

        val fusedClient = LocationServices.getFusedLocationProviderClient(this)
        fusedClient.lastLocation.addOnSuccessListener { location ->
            if (location != null) {
                dispatchSMS(location.latitude, location.longitude)
            } else {
                val req = com.google.android.gms.location.LocationRequest.Builder(
                    com.google.android.gms.location.Priority.PRIORITY_HIGH_ACCURACY, 5000
                ).setMaxUpdates(1).build()
                fusedClient.requestLocationUpdates(req,
                    object : com.google.android.gms.location.LocationCallback() {
                        override fun onLocationResult(r: com.google.android.gms.location.LocationResult) {
                            fusedClient.removeLocationUpdates(this)
                            r.lastLocation?.let { dispatchSMS(it.latitude, it.longitude) }
                        }
                    }, Looper.getMainLooper())
            }
        }
    }

    private fun getSafeSmsManager(): SmsManager {
        val subId = SubscriptionManager.getDefaultSmsSubscriptionId()
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            if (subId != SubscriptionManager.INVALID_SUBSCRIPTION_ID) {
                getSystemService(SmsManager::class.java).createForSubscriptionId(subId)
            } else {
                getSystemService(SmsManager::class.java)
            }
        } else {
            if (subId != SubscriptionManager.INVALID_SUBSCRIPTION_ID) {
                @Suppress("DEPRECATION")
                SmsManager.getSmsManagerForSubscriptionId(subId)
            } else {
                @Suppress("DEPRECATION")
                SmsManager.getDefault()
            }
        }
    }

    private fun dispatchSMS(lat: Double, lon: Double) {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS), 101)
            return
        }

        val message = "SOS! I need help. My location: http://maps.google.com/maps?q=$lat,$lon"
        
        // BUG FIX: Load latest contacts directly from prefs here
        val contacts = listOf(
            prefs.getString("contact1","")?.trim(),
            prefs.getString("contact2","")?.trim(),
            prefs.getString("contact3","")?.trim()
        ).filter { !it.isNullOrEmpty() }

        var sentCount = 0
        val sms = getSafeSmsManager()

        contacts.forEach { contact ->
            try {
                // Sanitize target address to strip spaces, dashes, parentheses
                val cleanContact = contact!!.replace("[^0-9+]".toRegex(), "")
                
                val sentPI = android.app.PendingIntent.getBroadcast(this, cleanContact.hashCode(),
                    android.content.Intent("SMS_SENT"), android.app.PendingIntent.FLAG_IMMUTABLE)
                val deliveredPI = android.app.PendingIntent.getBroadcast(this, cleanContact.hashCode(),
                    android.content.Intent("SMS_DELIVERED"), android.app.PendingIntent.FLAG_IMMUTABLE)
                
                sms.sendTextMessage(cleanContact, null, message, sentPI, deliveredPI)
                sentCount++
            } catch (e: Exception) {
                Log.e("SOS", "SMS failed for $contact: ${e.message}")
            }
        }
        
        if (sentCount > 0) {
            Toast.makeText(this, "Sending SOS to $sentCount contact(s)...", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "No valid contacts found. Please check emergency settings.", Toast.LENGTH_LONG).show()
        }
    }

    private fun fetchUserLocationThenObserve() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            LocationServices.getFusedLocationProviderClient(this).lastLocation
                .addOnSuccessListener { loc ->
                    if (loc != null) { userLat = loc.latitude; userLon = loc.longitude }
                    observeDestinations()
                }
                .addOnFailureListener { observeDestinations() }
        } else {
            observeDestinations()
        }
    }

    private fun observeDestinations() {
        viewModel.allDestinations.observe(this) { list ->
            if (list.isNullOrEmpty()) {
                binding.rvDestinationPlacesList.visibility = View.GONE
                binding.tvNoRecordsAvailable.visibility = View.VISIBLE
            } else {
                binding.rvDestinationPlacesList.visibility = View.VISIBLE
                binding.tvNoRecordsAvailable.visibility = View.GONE
                setupRecyclerView(ArrayList(list))
            }
        }
    }

    private fun setupRecyclerView(list: ArrayList<TravelDestinationModel>) {
        binding.rvDestinationPlacesList.layoutManager = LinearLayoutManager(this)
        binding.rvDestinationPlacesList.setHasFixedSize(true)
        val adapter = DestinationPlacesAdapter(this, list, userLat, userLon, viewModel)
        binding.rvDestinationPlacesList.adapter = adapter

        adapter.setOnClickListener(object : DestinationPlacesAdapter.OnClickListener {
            override fun onClick(position: Int, model: TravelDestinationModel) {
                startActivity(Intent(this@MainActivity, DestinationDetailActivity::class.java)
                    .putExtra(EXTRA_PLACE_DETAILS, model))
            }
        })

        val editSwipe = object : SwipeToEditCallback(this) {
            override fun onSwiped(vh: RecyclerView.ViewHolder, d: Int) {
                (binding.rvDestinationPlacesList.adapter as DestinationPlacesAdapter)
                    .notifyEditItem(this@MainActivity, vh.adapterPosition, ADD_PLACE_ACTIVITY_REQUEST_CODE)
            }
        }
        ItemTouchHelper(editSwipe).attachToRecyclerView(binding.rvDestinationPlacesList)

        val deleteSwipe = object : SwipeToDeleteCallback(this) {
            override fun onSwiped(vh: RecyclerView.ViewHolder, d: Int) {
                val a = binding.rvDestinationPlacesList.adapter as DestinationPlacesAdapter
                a.removeAt(vh.adapterPosition)
            }
        }
        ItemTouchHelper(deleteSwipe).attachToRecyclerView(binding.rvDestinationPlacesList)
    }

    fun onListBecameEmpty() {
        binding.rvDestinationPlacesList.visibility = View.GONE
        binding.tvNoRecordsAvailable.visibility = View.VISIBLE
    }

    override fun onBackPressed() {
        if (isFabMenuOpen) { closeFabMenu(); return }
        super.onBackPressed()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isSosActive) stopSOS()
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_PLACE_ACTIVITY_REQUEST_CODE) fetchUserLocationThenObserve()
        else Log.e("Activity", "cancelled or back pressed")
    }

    companion object {
        var ADD_PLACE_ACTIVITY_REQUEST_CODE = 1
        var EXTRA_PLACE_DETAILS = "extra_place_details"
    }
}
