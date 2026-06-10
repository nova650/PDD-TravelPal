package com.example.happytravels.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.happytravels.data.repository.DestinationRepository
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.models.TripHistory

class DestinationViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = DestinationRepository(application)

    // LiveData — observed by MainActivity
    val allDestinations: LiveData<List<TravelDestinationModel>> = repository.allDestinations

    // LiveData — observed by TripHistoryActivity
    val allTrips: LiveData<List<TripHistory>> = repository.allTrips

    // ── Destination CRUD ──────────────────────────────────────────────────────
    fun insert(destination: TravelDestinationModel): Long =
        repository.insert(destination)

    fun update(destination: TravelDestinationModel): Int =
        repository.update(destination)

    fun delete(destination: TravelDestinationModel): Int =
        repository.delete(destination)

    fun deleteAll() =
        repository.deleteAllDestinations()

    fun getAllSync(): List<TravelDestinationModel> =
        repository.getAllSync()

    // ── Trip History ──────────────────────────────────────────────────────────
    fun logTrip(title: String, location: String, distanceKm: Double, durationMinutes: Long) {
        repository.insertTrip(
            TripHistory(
                destinationTitle = title,
                destinationLocation = location,
                arrivedAt = System.currentTimeMillis(),
                distanceTravelled = distanceKm,
                durationMinutes = durationMinutes
            )
        )
    }

    fun getTripStats(): Triple<Int, Double, Double> {
        val count = repository.getTripCount()
        val totalDist = repository.getTotalDistance()
        val avgDuration = repository.getAverageDuration()
        return Triple(count, totalDist, avgDuration)
    }

    fun clearHistory() = repository.clearHistory()
}
