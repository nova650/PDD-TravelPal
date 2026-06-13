package com.example.happytravels.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.happytravels.models.TravelDestinationModel

@Dao
interface DestinationDao {

    @Query("SELECT * FROM destinations ORDER BY id ASC")
    fun getAllDestinations(): LiveData<List<TravelDestinationModel>>

    @Query("SELECT * FROM destinations ORDER BY id ASC")
    fun getAllDestinationsSync(): List<TravelDestinationModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(destination: TravelDestinationModel): Long

    @Update
    fun update(destination: TravelDestinationModel): Int

    @Delete
    fun delete(destination: TravelDestinationModel): Int

    @Query("DELETE FROM destinations")
    fun deleteAll()
}
