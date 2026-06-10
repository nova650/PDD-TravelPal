package com.example.happytravels.models

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "destinations")
data class TravelDestinationModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String? = "",
    val location: String? = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val contactNumber: String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readString()
    )
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(location)
        parcel.writeDouble(latitude)
        parcel.writeDouble(longitude)
        parcel.writeString(contactNumber)
    }
    override fun describeContents(): Int = 0
    companion object CREATOR : Parcelable.Creator<TravelDestinationModel> {
        override fun createFromParcel(parcel: Parcel) = TravelDestinationModel(parcel)
        override fun newArray(size: Int): Array<TravelDestinationModel?> = arrayOfNulls(size)
    }
}
