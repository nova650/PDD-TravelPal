package com.example.happytravels.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happytravels.R
import com.example.happytravels.databinding.ActivityMapBinding
import com.example.happytravels.models.TravelDestinationModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityMapBinding
    private var mDestinationPlaceDetails: TravelDestinationModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra(MainActivity.EXTRA_PLACE_DETAILS)) {
            mDestinationPlaceDetails = intent.getParcelableExtra(MainActivity.EXTRA_PLACE_DETAILS)
                    as TravelDestinationModel?
        }

        if (mDestinationPlaceDetails != null) {
            setSupportActionBar(binding.toolbarMap)
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.title = mDestinationPlaceDetails!!.title

            binding.toolbarMap.setNavigationOnClickListener {
                onBackPressed()
            }

            val supportMapFragment: SupportMapFragment =
                supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
            supportMapFragment.getMapAsync(this)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val position = LatLng(mDestinationPlaceDetails!!.latitude, mDestinationPlaceDetails!!.longitude)
        googleMap.addMarker(MarkerOptions().position(position).title(mDestinationPlaceDetails!!.location))
        val newLatLngZoom = CameraUpdateFactory.newLatLngZoom(position, 15f)
        googleMap.animateCamera(newLatLngZoom)
    }
}