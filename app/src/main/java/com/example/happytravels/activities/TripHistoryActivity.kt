package com.example.happytravels.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.happytravels.databinding.ActivityTripHistoryBinding
import com.example.happytravels.models.TripHistory
import com.example.happytravels.viewmodel.DestinationViewModel
import java.text.SimpleDateFormat
import java.util.*

class TripHistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTripHistoryBinding
    private lateinit var viewModel: DestinationViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTripHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarHistory)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Trip History"
        binding.toolbarHistory.setNavigationOnClickListener { onBackPressed() }

        viewModel = ViewModelProvider(this)[DestinationViewModel::class.java]

        val adapter = TripAdapter()
        binding.rvTripHistory.layoutManager = LinearLayoutManager(this)
        binding.rvTripHistory.adapter = adapter

        // BUG FIX: observe LiveData for list AND compute stats from the live list
        // instead of calling synchronous DB queries on main thread (which showed 0 before data loaded)
        viewModel.allTrips.observe(this) { trips ->
            if (trips.isEmpty()) {
                binding.rvTripHistory.visibility = View.GONE
                binding.tvEmptyHistory.visibility = View.VISIBLE
                binding.tvTripCount.text = "0"
                binding.tvTotalDistance.text = "0.0 km"
                binding.tvAvgDuration.text = "0 min"
            } else {
                binding.rvTripHistory.visibility = View.VISIBLE
                binding.tvEmptyHistory.visibility = View.GONE
                adapter.submitList(trips)

                // Compute stats from live list — no main-thread DB call needed
                val count = trips.size
                val totalDist = trips.sumOf { it.distanceTravelled }
                val avgDur = trips.map { it.durationMinutes }.average()

                binding.tvTripCount.text = "$count"
                binding.tvTotalDistance.text = String.format("%.1f km", totalDist)
                binding.tvAvgDuration.text = "${avgDur.toInt()} min"
            }
        }

        binding.btnClearHistory.setOnClickListener {
            androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Clear History")
                .setMessage("Delete all trip history?")
                .setPositiveButton("Clear") { _, _ -> viewModel.clearHistory() }
                .setNegativeButton("Cancel", null)
                .show()
        }
    }

    inner class TripAdapter : RecyclerView.Adapter<TripAdapter.TripViewHolder>() {
        private var trips: List<TripHistory> = emptyList()

        fun submitList(list: List<TripHistory>) {
            trips = list
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): TripViewHolder {
            val view = android.view.LayoutInflater.from(parent.context)
                .inflate(com.example.happytravels.R.layout.item_trip_history, parent, false)
            return TripViewHolder(view)
        }

        override fun onBindViewHolder(holder: TripViewHolder, position: Int) {
            holder.bind(trips[position])
        }

        override fun getItemCount() = trips.size

        inner class TripViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            private val tvTitle: android.widget.TextView = view.findViewById(com.example.happytravels.R.id.tv_trip_title)
            private val tvDate: android.widget.TextView = view.findViewById(com.example.happytravels.R.id.tv_trip_date)
            private val tvDistance: android.widget.TextView = view.findViewById(com.example.happytravels.R.id.tv_trip_distance)
            private val tvDuration: android.widget.TextView = view.findViewById(com.example.happytravels.R.id.tv_trip_duration)

            fun bind(trip: TripHistory) {
                tvTitle.text = trip.destinationTitle
                val sdf = SimpleDateFormat("dd MMM yyyy, hh:mm a", Locale.getDefault())
                tvDate.text = sdf.format(Date(trip.arrivedAt))
                tvDistance.text = String.format("%.1f km", trip.distanceTravelled)
                tvDuration.text = "${trip.durationMinutes} min"
            }
        }
    }
}
