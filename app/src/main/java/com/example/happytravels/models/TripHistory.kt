package com.example.happytravels.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trip_history")
data class TripHistory(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val destinationTitle: String,
    val destinationLocation: String,
    val arrivedAt: Long = System.currentTimeMillis(), // epoch ms
    val distanceTravelled: Double = 0.0,              // km
    val durationMinutes: Long = 0L                    // minutes
)
