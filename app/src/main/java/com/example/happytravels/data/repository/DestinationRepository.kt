package com.example.happytravels.data.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.happytravels.data.local.AppDatabase
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.models.TripHistory

class DestinationRepository(context: Context) {

    private val db = AppDatabase.getInstance(context)
    private val destinationDao = db.destinationDao()
    private val tripHistoryDao = db.tripHistoryDao()

    // ── Destinations ──────────────────────────────────────────────────────────
    val allDestinations: LiveData<List<TravelDestinationModel>> =
        destinationDao.getAllDestinations()

    fun getAllSync(): List<TravelDestinationModel> =
        destinationDao.getAllDestinationsSync()

    fun insert(destination: TravelDestinationModel): Long =
        destinationDao.insert(destination)

    fun update(destination: TravelDestinationModel): Int =
        destinationDao.update(destination)

    fun delete(destination: TravelDestinationModel): Int =
        destinationDao.delete(destination)

    fun deleteAllDestinations() =
        destinationDao.deleteAll()

    // ── Trip History ──────────────────────────────────────────────────────────
    val allTrips: LiveData<List<TripHistory>> =
        tripHistoryDao.getAllTrips()

    fun insertTrip(trip: TripHistory) =
        tripHistoryDao.insert(trip)

    fun getTripCount(): Int =
        tripHistoryDao.getTripCount()

    fun getTotalDistance(): Double =
        tripHistoryDao.getTotalDistanceTravelled()

    fun getAverageDuration(): Double =
        tripHistoryDao.getAverageTripDuration()

    fun clearHistory() =
        tripHistoryDao.deleteAll()
}
