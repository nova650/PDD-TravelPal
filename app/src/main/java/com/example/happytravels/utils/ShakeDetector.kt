package com.example.happytravels.utils

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import kotlin.math.sqrt

/**
 * Detects shake gestures using the accelerometer.
 * Fires onShakeDetected() when acceleration exceeds threshold 3 times within 500ms.
 */
class ShakeDetector(private val onShakeDetected: () -> Unit) : SensorEventListener {

    private var lastShakeTime = 0L
    private var shakeCount = 0

    companion object {
        private const val SHAKE_THRESHOLD_GRAVITY = 2.7f   // G-force threshold
        private const val SHAKE_SLOP_TIME_MS = 500          // min ms between shakes
        private const val SHAKE_COUNT_RESET_TIME_MS = 3000  // reset count after 3s
        private const val REQUIRED_SHAKES = 3               // shakes needed to trigger
    }

    override fun onSensorChanged(event: SensorEvent) {
        if (event.sensor.type != Sensor.TYPE_ACCELEROMETER) return

        val gX = event.values[0] / SensorManager.GRAVITY_EARTH
        val gY = event.values[1] / SensorManager.GRAVITY_EARTH
        val gZ = event.values[2] / SensorManager.GRAVITY_EARTH
        val gForce = sqrt(gX * gX + gY * gY + gZ * gZ)

        if (gForce > SHAKE_THRESHOLD_GRAVITY) {
            val now = System.currentTimeMillis()

            // Reset count if too much time has passed
            if (now - lastShakeTime > SHAKE_COUNT_RESET_TIME_MS) shakeCount = 0

            // Ignore if within slop time (debounce)
            if (now - lastShakeTime < SHAKE_SLOP_TIME_MS) return

            lastShakeTime = now
            shakeCount++

            if (shakeCount >= REQUIRED_SHAKES) {
                shakeCount = 0
                onShakeDetected()
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}
