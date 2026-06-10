package com.example.happytravels.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.happytravels.models.TripHistory

@Dao
interface TripHistoryDao {

    @Query("SELECT * FROM trip_history ORDER BY arrivedAt DESC")
    fun getAllTrips(): LiveData<List<TripHistory>>

    @Insert
    fun insert(trip: TripHistory)

    @Query("DELETE FROM trip_history")
    fun deleteAll()

    @Query("SELECT COUNT(*) FROM trip_history")
    fun getTripCount(): Int

    @Query("SELECT SUM(distanceTravelled) FROM trip_history")
    fun getTotalDistanceTravelled(): Double

    @Query("SELECT AVG(durationMinutes) FROM trip_history")
    fun getAverageTripDuration(): Double
}
