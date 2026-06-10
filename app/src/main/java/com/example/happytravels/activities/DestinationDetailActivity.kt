package com.example.happytravels.activities

import android.app.*
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PowerManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.happytravels.R
import com.example.happytravels.databinding.ActivityDestinationDetailBinding
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.utils.ShakeDetector
import com.example.happytravels.viewmodel.DestinationViewModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.math.RoundingMode
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import android.telephony.SmsManager
import android.telephony.SubscriptionManager

class DestinationDetailActivity : AppCompatActivity() {

    val SMS_PERMISSION_CODE = 123
    val CHANNEL_ID = "ALARM"
    val CHANNEL_NAME = "ALARM"

    private var _binding: ActivityDestinationDetailBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: DestinationViewModel
    private var service: Intent? = null
    private var alarmAlreadyFired = false
    private var notifyContact = false

    // ETA tracking
    private var tripStartTime = 0L
    private var initialDistance = 0.0
    private var tripStarted = false

    // Shake-to-SOS
    private lateinit var sensorManager: SensorManager
    private lateinit var shakeDetector: ShakeDetector
    private var sosActive = false

    private val backgroundLocation = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        startService(service)
        Toast.makeText(this, "Alarm set! Tracking your location...", Toast.LENGTH_SHORT).show()
    }

    private val notificationPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) {}

    private val locationPermissions = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
        val granted = permissions.getOrDefault(android.Manifest.permission.ACCESS_FINE_LOCATION, false) ||
                permissions.getOrDefault(android.Manifest.permission.ACCESS_COARSE_LOCATION, false)
        if (granted) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q &&
                ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Please select 'Allow all the time'", Toast.LENGTH_LONG).show()
                backgroundLocation.launch(android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)
            } else {
                startServiceAndTrack()
            }
        } else {
            Toast.makeText(this, "Location permission required", Toast.LENGTH_LONG).show()
        }
    }

    var destinationPlaceDetailModel: TravelDestinationModel? = null
    var cLatitude: Double? = null
    var cLongitude: Double? = null
    lateinit var notification: Notification
    lateinit var notificationManager: NotificationManagerCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDestinationDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[DestinationViewModel::class.java]

        // Notification permission
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS)
            != PackageManager.PERMISSION_GRANTED) {
            notificationPermission.launch(android.Manifest.permission.POST_NOTIFICATIONS)
        }

        // SMS permission
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.SEND_SMS), SMS_PERMISSION_CODE)
        }

        service = Intent(this, LocationService::class.java)

        if (intent.hasExtra(MainActivity.EXTRA_PLACE_DETAILS)) {
            destinationPlaceDetailModel = intent.getParcelableExtra(MainActivity.EXTRA_PLACE_DETAILS)
        }

        destinationPlaceDetailModel?.let { model ->
            setSupportActionBar(binding.toolbarDestinationDetail)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = model.title
            binding.toolbarDestinationDetail.setNavigationOnClickListener { onBackPressed() }
            binding.tvLocation.text = model.location
            binding.btnViewOnMap.setOnClickListener {
                startActivity(Intent(this, MapActivity::class.java)
                    .putExtra(MainActivity.EXTRA_PLACE_DETAILS, model))
            }
        }

        binding.btnViewStartService.setOnClickListener {
            alarmAlreadyFired = false
            tripStartTime = System.currentTimeMillis()
            tripStarted = true
            // BUG FIX: reset initialDistance so ETA re-calibrates for each new trip
            initialDistance = 0.0
            checkPermissions()
        }

        binding.btnViewStopService.setOnClickListener {
            stopService(service)
            binding.remainingKm.text = "~"
            binding.tvBearingDetail.text = ""
            binding.tvEta.text = ""
            alarmAlreadyFired = false
            tripStarted = false
            notificationManager.cancelAll()
            Toast.makeText(this, "Alarm dismissed", Toast.LENGTH_SHORT).show()
        }

        binding.switchNotifyContact.setOnCheckedChangeListener { _, isChecked ->
            notifyContact = isChecked
            if (isChecked && destinationPlaceDetailModel?.contactNumber.isNullOrEmpty()) {
                Toast.makeText(this, "No contact number saved for this destination", Toast.LENGTH_LONG).show()
                binding.switchNotifyContact.isChecked = false
                notifyContact = false
            }
        }

        setupShake()
        createNotificationChannel()

        val alarmPendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(Intent(this@DestinationDetailActivity, Alarm::class.java))
            getPendingIntent(0, PendingIntent.FLAG_MUTABLE)
        }
        notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Destination Reached")
            .setContentText("You are near your destination!")
            .setAutoCancel(true)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setFullScreenIntent(alarmPendingIntent, true)
            .setContentIntent(alarmPendingIntent)
            .build()

        notificationManager = NotificationManagerCompat.from(this)
    }

    // ── Shake-to-SOS ──────────────────────────────────────────────────────────
    private fun setupShake() {
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        val prefs = getSharedPreferences("emergency_prefs", MODE_PRIVATE)
        shakeDetector = ShakeDetector {
            runOnUiThread {
                if (!sosActive) {
                    sosActive = true
                    Toast.makeText(this, "📳 Shake detected — SOS sent!", Toast.LENGTH_SHORT).show()
                    val c1 = prefs.getString("contact1","")
                    val c2 = prefs.getString("contact2","")
                    val c3 = prefs.getString("contact3","")
                    if (!c1.isNullOrEmpty() || !c2.isNullOrEmpty() || !c3.isNullOrEmpty()) {
                        startActivity(Intent(this, EmergencyContactsActivity::class.java)
                            .putExtra("auto_sos", true))
                    }
                    sosActive = false
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        if (!EventBus.getDefault().isRegistered(this)) EventBus.getDefault().register(this)
        sensorManager.registerListener(shakeDetector,
            sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI)
    }

    override fun onStop() {
        super.onStop()
        sensorManager.unregisterListener(shakeDetector)
    }

    fun checkPermissions() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            locationPermissions.launch(arrayOf(
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.ACCESS_COARSE_LOCATION))
        } else {
            startServiceAndTrack()
        }
    }

    private fun startServiceAndTrack() {
        startService(service)
        Toast.makeText(this, "Alarm set! Tracking your location...", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        stopService(service)
        if (EventBus.getDefault().isRegistered(this)) EventBus.getDefault().unregister(this)
        _binding = null
    }

    @Subscribe
    fun receiveLocationEvent(locationEvent: LocationEvent) {
        cLatitude = locationEvent.latitude
        cLongitude = locationEvent.longitude
        val distance = calculateDistance(cLatitude!!, cLongitude!!,
            destinationPlaceDetailModel!!.latitude, destinationPlaceDetailModel!!.longitude)

        binding.remainingKm.text = "$distance km"

        // Bearing
        val bearing = calculateBearing(cLatitude!!, cLongitude!!,
            destinationPlaceDetailModel!!.latitude, destinationPlaceDetailModel!!.longitude)
        binding.tvBearingDetail.text = bearing

        // ETA — calculate from current speed (distance change over time)
        if (tripStarted) {
            if (initialDistance == 0.0) initialDistance = distance
            val elapsedMin = (System.currentTimeMillis() - tripStartTime) / 60000.0
            if (elapsedMin > 0.5 && distance < initialDistance) {
                val distanceCovered = initialDistance - distance
                val speedKmPerMin = distanceCovered / elapsedMin
                if (speedKmPerMin > 0) {
                    val etaMin = (distance / speedKmPerMin).toInt()
                    binding.tvEta.text = "ETA: ~${etaMin} min"
                }
            }
        }

        if (distance < 5 && !alarmAlreadyFired) {
            alarmAlreadyFired = true
            stopService(service)
            notificationManager.notify(0, notification)

            // Log trip to Room
            if (tripStarted) {
                val durationMin = (System.currentTimeMillis() - tripStartTime) / 60000
                viewModel.logTrip(
                    title = destinationPlaceDetailModel?.title ?: "",
                    location = destinationPlaceDetailModel?.location ?: "",
                    distanceKm = initialDistance,
                    durationMinutes = durationMin
                )
                tripStarted = false
            }

            // Notify contact
            if (notifyContact && !destinationPlaceDetailModel?.contactNumber.isNullOrEmpty()) {
                try {
                    val cleanContact = destinationPlaceDetailModel!!.contactNumber!!.replace("[^0-9+]".toRegex(), "")
                    val sms = getSafeSmsManager()
                    sms.sendTextMessage(cleanContact, null,
                        "${destinationPlaceDetailModel!!.title} has arrived at ${destinationPlaceDetailModel!!.location}",
                        null, null)
                    Toast.makeText(this, "Contact notified via SMS", Toast.LENGTH_SHORT).show()
                } catch (e: Exception) {
                    Toast.makeText(this, "SMS failed: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }

            startActivity(Intent(this, Alarm::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP))
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

    // ── Algorithms ────────────────────────────────────────────────────────────
    fun calculateDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val r = 6371
        val dLat = Math.toRadians(lat2 - lat1)
        val dLon = Math.toRadians(lon2 - lon1)
        val a = sin(dLat / 2) * sin(dLat / 2) +
                cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) *
                sin(dLon / 2) * sin(dLon / 2)
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))
        return (r * c).toBigDecimal().setScale(1, RoundingMode.UP).toDouble()
    }

    fun calculateBearing(lat1: Double, lon1: Double, lat2: Double, lon2: Double): String {
        val dLon = Math.toRadians(lon2 - lon1)
        val lat1R = Math.toRadians(lat1)
        val lat2R = Math.toRadians(lat2)
        val x = Math.sin(dLon) * Math.cos(lat2R)
        val y = Math.cos(lat1R) * Math.sin(lat2R) - Math.sin(lat1R) * Math.cos(lat2R) * Math.cos(dLon)
        val deg = (Math.toDegrees(Math.atan2(x, y)) + 360) % 360
        return when {
            deg < 22.5  -> "↑ N"
            deg < 67.5  -> "↗ NE"
            deg < 112.5 -> "→ E"
            deg < 157.5 -> "↘ SE"
            deg < 202.5 -> "↓ S"
            deg < 247.5 -> "↙ SW"
            deg < 292.5 -> "← W"
            deg < 337.5 -> "↖ NW"
            else        -> "↑ N"
        }
    }

    fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH).apply {
                lightColor = Color.GREEN
                enableLights(true)
            }
            (getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager)
                .createNotificationChannel(channel)
        }
    }

    fun isScreenOn(activity: Activity): Boolean {
        val pm = activity.getSystemService(Context.POWER_SERVICE) as PowerManager
        return pm.isInteractive
    }
}
