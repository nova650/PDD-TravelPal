package com.example.happytravels.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.models.TripHistory

@Database(
    entities = [TravelDestinationModel::class, TripHistory::class],
    version = 3,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun destinationDao(): DestinationDao
    abstract fun tripHistoryDao(): TripHistoryDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        // Migrate from SQLite v2 (old DatabaseHandler) to Room v3
        val MIGRATION_2_3 = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Rename old table, create new one with Room schema, copy data, drop old
                database.execSQL("""
                    CREATE TABLE IF NOT EXISTS destinations (
                        id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                        title TEXT,
                        location TEXT,
                        latitude REAL NOT NULL DEFAULT 0.0,
                        longitude REAL NOT NULL DEFAULT 0.0,
                        contactNumber TEXT
                    )
                """.trimIndent())
                database.execSQL("""
                    INSERT INTO destinations (id, title, location, latitude, longitude, contactNumber)
                    SELECT _id, title, location,
                           CAST(latitude AS REAL), CAST(longitude AS REAL),
                           contact_number
                    FROM TravelDestination
                """.trimIndent())
                database.execSQL("DROP TABLE IF EXISTS TravelDestination")
                database.execSQL("""
                    CREATE TABLE IF NOT EXISTS trip_history (
                        id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                        destinationTitle TEXT NOT NULL,
                        destinationLocation TEXT NOT NULL,
                        arrivedAt INTEGER NOT NULL,
                        distanceTravelled REAL NOT NULL,
                        durationMinutes INTEGER NOT NULL
                    )
                """.trimIndent())
            }
        }

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "HappyTravelsDatabase"
                )
                .addMigrations(MIGRATION_2_3)
                .allowMainThreadQueries() // kept for simplicity; ViewModels use background threads
                .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
