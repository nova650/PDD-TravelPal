package com.example.happytravels.activities

import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.happytravels.databinding.ActivityEmergencyContactsBinding
import com.google.android.gms.location.LocationServices
import android.telephony.SmsManager
import android.telephony.SubscriptionManager

class EmergencyContactsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmergencyContactsBinding
    private lateinit var prefs: SharedPreferences
    private var sosHandler: Handler? = null
    private var sosRunnable: Runnable? = null
    private var sosActive = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmergencyContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarEmergency)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Emergency Contacts"
        binding.toolbarEmergency.setNavigationOnClickListener { onBackPressed() }

        prefs = getSharedPreferences("emergency_prefs", Context.MODE_PRIVATE)

        // Load saved contacts
        binding.etEmergencyContact1.setText(prefs.getString("contact1", ""))
        binding.etEmergencyContact2.setText(prefs.getString("contact2", ""))
        binding.etEmergencyContact3.setText(prefs.getString("contact3", ""))

        binding.btnSaveContacts.setOnClickListener {
            saveContacts()
            Toast.makeText(this, "Emergency contacts saved!", Toast.LENGTH_SHORT).show()
        }

        binding.btnSos.setOnClickListener {
            if (!sosActive) {
                // BUG FIX: Auto-save before starting SOS so current input is used
                saveContacts()
                startSOS()
            } else {
                stopSOS()
            }
        }

        // Handle auto_sos from shake detector
        if (intent.getBooleanExtra("auto_sos", false)) {
            startSOS()
        }
    }

    private fun saveContacts() {
        prefs.edit()
            .putString("contact1", binding.etEmergencyContact1.text.toString().trim())
            .putString("contact2", binding.etEmergencyContact2.text.toString().trim())
            .putString("contact3", binding.etEmergencyContact3.text.toString().trim())
            .apply()
    }

    override fun onPause() {
        super.onPause()
        // BUG FIX: Auto-save when leaving the screen to prevent data loss
        saveContacts()
    }

    private fun startSOS() {
        val contact1 = prefs.getString("contact1", "")
        val contact2 = prefs.getString("contact2", "")
        val contact3 = prefs.getString("contact3", "")

        if (contact1.isNullOrEmpty() && contact2.isNullOrEmpty() && contact3.isNullOrEmpty()) {
            Toast.makeText(this, "Please save at least one emergency contact first", Toast.LENGTH_LONG).show()
            return
        }

        sosActive = true
        binding.btnSos.text = "STOP SOS"
        binding.btnSos.setBackgroundColor(getColor(android.R.color.darker_gray))
        Toast.makeText(this, "SOS ACTIVE — Sending location every minute", Toast.LENGTH_LONG).show()

        sosHandler = Handler(Looper.getMainLooper())
        sosRunnable = object : Runnable {
            override fun run() {
                sendSOSLocation()
                sosHandler?.postDelayed(this, 60000) // every 60 seconds
            }
        }
        sosHandler?.post(sosRunnable!!)
    }

    private fun stopSOS() {
        sosActive = false
        sosHandler?.removeCallbacks(sosRunnable!!)
        sosHandler = null
        binding.btnSos.text = "SOS"
        binding.btnSos.setBackgroundColor(getColor(android.R.color.holo_red_dark))
        Toast.makeText(this, "SOS stopped", Toast.LENGTH_SHORT).show()
    }

    private fun sendSOSLocation() {
        val permissionsNeeded = mutableListOf<String>()
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            permissionsNeeded.add(android.Manifest.permission.ACCESS_FINE_LOCATION)
        }
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            permissionsNeeded.add(android.Manifest.permission.SEND_SMS)
        }

        if (permissionsNeeded.isNotEmpty()) {
            ActivityCompat.requestPermissions(this, permissionsNeeded.toTypedArray(), 999)
            return
        }

        val fusedClient = LocationServices.getFusedLocationProviderClient(this)

        fusedClient.lastLocation.addOnSuccessListener { location ->
            if (location != null) {
                sendSMS(location.latitude, location.longitude)
            } else {
                Toast.makeText(this, "Getting your location...", Toast.LENGTH_SHORT).show()
                val locationRequest = com.google.android.gms.location.LocationRequest.Builder(
                    com.google.android.gms.location.Priority.PRIORITY_HIGH_ACCURACY, 5000
                ).setMaxUpdates(1).build()

                fusedClient.requestLocationUpdates(
                    locationRequest,
                    object : com.google.android.gms.location.LocationCallback() {
                        override fun onLocationResult(result: com.google.android.gms.location.LocationResult) {
                            fusedClient.removeLocationUpdates(this)
                            val freshLocation = result.lastLocation
                            if (freshLocation != null) {
                                sendSMS(freshLocation.latitude, freshLocation.longitude)
                            } else {
                                Toast.makeText(this@EmergencyContactsActivity,
                                    "Could not get location. Make sure GPS is on.", Toast.LENGTH_LONG).show()
                            }
                        }
                    },
                    android.os.Looper.getMainLooper()
                )
            }
        }.addOnFailureListener {
            Toast.makeText(this, "Location error: ${it.message}", Toast.LENGTH_LONG).show()
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

    private fun sendSMS(lat: Double, lon: Double) {
        val message = "SOS! I need help. My location: http://maps.google.com/maps?q=$lat,$lon"

        val contacts = listOf(
            prefs.getString("contact1", ""),
            prefs.getString("contact2", ""),
            prefs.getString("contact3", "")
        )

        var sentCount = 0
        val sms = getSafeSmsManager()

        contacts.forEach { contact ->
            if (!contact.isNullOrEmpty()) {
                try {
                    // Sanitize target address to strip spaces, dashes, parentheses
                    val cleanContact = contact.replace("[^0-9+]".toRegex(), "")
                    
                    val sentPI = android.app.PendingIntent.getBroadcast(
                        this, cleanContact.hashCode(), // Unique ID for PendingIntent
                        android.content.Intent("SMS_SENT"),
                        android.app.PendingIntent.FLAG_IMMUTABLE
                    )
                    val deliveredPI = android.app.PendingIntent.getBroadcast(
                        this, cleanContact.hashCode(),
                        android.content.Intent("SMS_DELIVERED"),
                        android.app.PendingIntent.FLAG_IMMUTABLE
                    )

                    sms.sendTextMessage(cleanContact, null, message, sentPI, deliveredPI)
                    sentCount++

                } catch (e: Exception) {
                    // Fail silently or log
                }
            }
        }
        if (sentCount > 0) {
            Toast.makeText(this, "Sending SOS to $sentCount contact(s)...", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "No contacts saved. Please add emergency contacts first.", Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (sosActive) stopSOS()
    }
}
