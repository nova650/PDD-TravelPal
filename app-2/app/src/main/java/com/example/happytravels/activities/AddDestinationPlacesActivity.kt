package com.example.happytravels.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.happytravels.BuildConfig
import com.example.happytravels.R
import com.example.happytravels.databinding.ActivityAddDestinationPlacesBinding
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.utils.GetAddressFromLatLng
import com.example.happytravels.viewmodel.DestinationViewModel
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.api.net.FetchPlaceRequest
import com.google.android.libraries.places.widget.PlaceAutocomplete
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddDestinationPlacesActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAddDestinationPlacesBinding
    private val viewModel: DestinationViewModel by viewModels()

    private var mLatitude: Double = 0.0
    private var mLongitude: Double = 0.0
    private var mDestinationPlaceDetails: TravelDestinationModel? = null

    private val autocompleteLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        when (result.resultCode) {
            Activity.RESULT_OK -> {
                result.data?.let { intent ->
                    val prediction = PlaceAutocomplete.getPredictionFromIntent(intent)
                    val sessionToken = PlaceAutocomplete.getSessionTokenFromIntent(intent)

                    if (prediction == null) {
                        Toast.makeText(this, "Could not get place prediction", Toast.LENGTH_SHORT).show()
                        return@let
                    }

                    val placeFields = listOf(
                        Place.Field.ID,
                        Place.Field.DISPLAY_NAME,
                        Place.Field.LOCATION,
                        Place.Field.FORMATTED_ADDRESS
                    )

                    val fetchRequest = FetchPlaceRequest.builder(prediction.placeId, placeFields)
                        .setSessionToken(sessionToken)
                        .build()

                    Places.createClient(this).fetchPlace(fetchRequest)
                        .addOnSuccessListener { response ->
                            val place = response.place
                            binding.etLocation.setText(place.formattedAddress ?: place.displayName)
                            mLatitude = place.location?.latitude ?: 0.0
                            mLongitude = place.location?.longitude ?: 0.0
                        }
                        .addOnFailureListener { e ->
                            Log.e("PLACES_DEBUG", "FetchPlace failed: ${e.message}")
                            Toast.makeText(this, "Could not get place details", Toast.LENGTH_SHORT).show()
                        }
                }
            }
            Activity.RESULT_CANCELED -> {
                Log.d("PLACES_DEBUG", "Search cancelled by user")
            }
            else -> {
                Log.e("PLACES_DEBUG", "Autocomplete error")
            }
        }
    }

    private val mapMarkerLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            result.data?.let {
                mLatitude = it.getDoubleExtra("Latitude", 0.0)
                mLongitude = it.getDoubleExtra("Longitude", 0.0)

                val addressTask = GetAddressFromLatLng(this, mLatitude, mLongitude)
                addressTask.setAddressListener(object : GetAddressFromLatLng.AddressListener {
                    override fun onAddressFound(address: String?) {
                        binding.etLocation.setText(address)
                    }
                    override fun onError() {
                        Log.e("Get Address", "Could not fetch address from coordinates")
                    }
                })
                addressTask.getAddress()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddDestinationPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAddPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarAddPlace.setNavigationOnClickListener { onBackPressed() }

        Places.initializeWithNewPlacesApiEnabled(applicationContext, BuildConfig.MAPS_API_KEY)

        if (intent.hasExtra(MainActivity.EXTRA_PLACE_DETAILS)) {
            @Suppress("DEPRECATION")
            mDestinationPlaceDetails = intent.getParcelableExtra(MainActivity.EXTRA_PLACE_DETAILS)
        }

        mDestinationPlaceDetails?.let {
            supportActionBar?.title = "Edit Destination Place"
            binding.etTitle.setText(it.title)
            binding.etLocation.setText(it.location)
            binding.etContact.setText(it.contactNumber)
            mLatitude = it.latitude
            mLongitude = it.longitude
            binding.btnSave.text = "UPDATE"
        }

        binding.btnSave.setOnClickListener(this)
        binding.etLocation.setOnClickListener(this)
        binding.tvMarkOnMap.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_save -> saveDataToDatabase()

            R.id.et_location -> {
                try {
                    val intent = PlaceAutocomplete.IntentBuilder()
                        .build(this)
                    autocompleteLauncher.launch(intent)
                } catch (e: Exception) {
                    Log.e("PLACES_DEBUG", "Intent Builder failed: ${e.message}")
                }
            }

            R.id.tv_mark_on_map -> {
                mapMarkerLauncher.launch(Intent(this, MarkOnMapActivity::class.java))
            }
        }
    }

    private fun saveDataToDatabase() {
        val title = binding.etTitle.text.toString().trim()
        val location = binding.etLocation.text.toString().trim()
        val contact = binding.etContact.text.toString().trim()

        if (title.isEmpty()) {
            Toast.makeText(this, "Please enter Title", Toast.LENGTH_SHORT).show()
            return
        }
        if (location.isEmpty()) {
            Toast.makeText(this, "Please select a Location", Toast.LENGTH_SHORT).show()
            return
        }

        val model = TravelDestinationModel(
            id = mDestinationPlaceDetails?.id ?: 0,
            title = title,
            location = location,
            latitude = mLatitude,
            longitude = mLongitude,
            contactNumber = contact
        )

        lifecycleScope.launch {
            val success = withContext(Dispatchers.IO) {
                if (mDestinationPlaceDetails == null) {
                    viewModel.insert(model) > 0
                } else {
                    viewModel.update(model) > 0
                }
            }

            if (success) {
                setResult(Activity.RESULT_OK)
                finish()
            } else {
                Toast.makeText(
                    this@AddDestinationPlacesActivity,
                    "Error saving destination",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}