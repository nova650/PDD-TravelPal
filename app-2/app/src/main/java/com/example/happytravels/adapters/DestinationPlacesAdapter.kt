package com.example.happytravels.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.happytravels.R
import com.example.happytravels.activities.AddDestinationPlacesActivity
import com.example.happytravels.activities.MainActivity
import com.example.happytravels.models.TravelDestinationModel
import com.example.happytravels.viewmodel.DestinationViewModel
import kotlin.math.*

open class DestinationPlacesAdapter(
    private val context: Context,
    private var list: ArrayList<TravelDestinationModel>,
    private val userLat: Double = 0.0,
    private val userLon: Double = 0.0,
    // BUG FIX: pass ViewModel so delete/edit go through Room, not old DatabaseHandler
    private val viewModel: DestinationViewModel? = null
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var onClickListener: OnClickListener? = null

    // KNN sort on init
    init {
        if (userLat != 0.0 || userLon != 0.0) {
            list.sortBy { destination ->
                haversineDistance(userLat, userLon, destination.latitude, destination.longitude)
            }
        }
    }

    private fun haversineDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val r = 6371.0
        val dLat = Math.toRadians(lat2 - lat1)
        val dLon = Math.toRadians(lon2 - lon1)
        val a = sin(dLat / 2).pow(2) +
                cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) *
                sin(dLon / 2).pow(2)
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))
        return r * c
    }

    private fun bearingToDirection(lat1: Double, lon1: Double, lat2: Double, lon2: Double): String {
        val dLon = Math.toRadians(lon2 - lon1)
        val lat1R = Math.toRadians(lat1)
        val lat2R = Math.toRadians(lat2)
        val x = sin(dLon) * cos(lat2R)
        val y = cos(lat1R) * sin(lat2R) - sin(lat1R) * cos(lat2R) * cos(dLon)
        val bearingDeg = (Math.toDegrees(atan2(x, y)) + 360) % 360
        return when {
            bearingDeg < 22.5  -> "↑ N"
            bearingDeg < 67.5  -> "↗ NE"
            bearingDeg < 112.5 -> "→ E"
            bearingDeg < 157.5 -> "↘ SE"
            bearingDeg < 202.5 -> "↓ S"
            bearingDeg < 247.5 -> "↙ SW"
            bearingDeg < 292.5 -> "← W"
            bearingDeg < 337.5 -> "↖ NW"
            else               -> "↑ N"
        }
    }

    private fun formatDistance(km: Double): String {
        return when {
            km < 1.0  -> "${(km * 1000).toInt()} m"
            km < 10.0 -> String.format("%.1f km", km)
            else      -> "${km.toInt()} km"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_destination_place, parent, false)
        )
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = list[position]
        if (holder is MyViewHolder) {
            holder.tvTitle.text = model.title
            if (userLat != 0.0 || userLon != 0.0) {
                val dist = haversineDistance(userLat, userLon, model.latitude, model.longitude)
                val bearing = bearingToDirection(userLat, userLon, model.latitude, model.longitude)
                holder.tvDistance.text = formatDistance(dist)
                holder.tvBearing.text = bearing
                holder.tvDistance.visibility = View.VISIBLE
                holder.tvBearing.visibility = View.VISIBLE
            } else {
                holder.tvDistance.visibility = View.GONE
                holder.tvBearing.text = "Tap to set alarm"
                holder.tvBearing.visibility = View.VISIBLE
            }
            holder.itemView.setOnClickListener {
                onClickListener?.onClick(position, model)
            }
            holder.btnDelete.setOnClickListener {
                removeAt(holder.adapterPosition)
            }
        }
    }

    // BUG FIX: use ViewModel.delete() instead of DatabaseHandler
    fun removeAt(position: Int) {
        val item = list[position]
        viewModel?.delete(item)
        list.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, list.size)
        if (list.isEmpty() && context is MainActivity) {
            (context as MainActivity).onListBecameEmpty()
        }
    }

    // BUG FIX: use ViewModel.deleteAll() instead of DatabaseHandler
    fun deleteAll() {
        list.forEach { viewModel?.delete(it) }
        list.clear()
        notifyDataSetChanged()
    }

    fun notifyEditItem(activity: Activity, position: Int, requestCode: Int) {
        val intent = Intent(context, AddDestinationPlacesActivity::class.java)
        intent.putExtra(MainActivity.EXTRA_PLACE_DETAILS, list[position])
        activity.startActivityForResult(intent, requestCode)
        notifyItemChanged(position)
    }

    override fun getItemCount(): Int = list.size

    interface OnClickListener {
        fun onClick(position: Int, model: TravelDestinationModel)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val tvDistance: TextView = view.findViewById(R.id.tv_distance)
        val tvBearing: TextView = view.findViewById(R.id.tv_bearing)
        val btnDelete: ImageButton = view.findViewById(R.id.btn_delete_item)
    }
}
