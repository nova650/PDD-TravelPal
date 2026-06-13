package com.example.happytravels.activities

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.happytravels.R

class Alarm : AppCompatActivity(), GestureDetector.OnGestureListener {

    private lateinit var gestureDetector: GestureDetector
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        playAudio()
        showGIF()

        gestureDetector = GestureDetector(this, this)

    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return gestureDetector.onTouchEvent(event)
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        if (e1 != null && e1.y > e2.y) {
            // swipe from bottom to top
            pauseAudio()
            
            // Cancel the notification with ID 0
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as android.app.NotificationManager
            notificationManager.cancel(0)
            
            // Tell DestinationDetailActivity to cancel the notification too
            sendBroadcast(Intent("com.example.happytravels.ALARM_DISMISSED"))
            finish()
            return true
        }
        return false
    }

    // other gesture detection callbacks
    override fun onShowPress(e: MotionEvent) {}
    override fun onSingleTapUp(e: MotionEvent): Boolean { return false }
    override fun onDown(e: MotionEvent): Boolean { return true }
    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean { return false }
    override fun onLongPress(e: MotionEvent) {}

    private fun playAudio(){
       mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
       mediaPlayer.isLooping = true
       mediaPlayer.start()
        Toast.makeText(this,"Audio started playing",Toast.LENGTH_SHORT).show()
    }

    private fun pauseAudio(){
        try {
            if (::mediaPlayer.isInitialized) {
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.stop()
                }
                mediaPlayer.reset()
                mediaPlayer.release()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun showGIF(){
        val imageView: ImageView = findViewById(R.id.imageView2)
        Glide.with(this).load(R.raw.duck_walk).into(imageView)
    }

    override fun onDestroy() {
        super.onDestroy()
        pauseAudio()
        try {
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as android.app.NotificationManager
            notificationManager.cancel(0)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
