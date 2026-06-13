package com.example.happytravels

import org.junit.Assert.*
import org.junit.Test
import kotlin.math.*

/**
 * JUnit tests for TravelPal core algorithms:
 * 1. Haversine Distance
 * 2. Bearing / Direction
 * 3. KNN Sort
 * 4. ETA Calculation
 * 5. Distance Formatting
 */
class AlgorithmTests {

    // ── Shared helpers (mirrors production code) ──────────────────────────────

    private fun haversineDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val r = 6371.0
        val dLat = Math.toRadians(lat2 - lat1)
        val dLon = Math.toRadians(lon2 - lon1)
        val a = sin(dLat / 2).pow(2) +
                cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) * sin(dLon / 2).pow(2)
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))
        return r * c
    }

    private fun calculateBearing(lat1: Double, lon1: Double, lat2: Double, lon2: Double): String {
        val dLon = Math.toRadians(lon2 - lon1)
        val lat1R = Math.toRadians(lat1)
        val lat2R = Math.toRadians(lat2)
        val x = sin(dLon) * cos(lat2R)
        val y = cos(lat1R) * sin(lat2R) - sin(lat1R) * cos(lat2R) * cos(dLon)
        val deg = (Math.toDegrees(atan2(x, y)) + 360) % 360
        return when {
            deg < 22.5  -> "↑ N"
            deg < 67.5  -> "↗ NE"
            deg < 112.5 -> "→ E"
            deg < 157.5 -> "↘ SE"
            deg < 202.5 -> "↓ S"
            deg < 247.5 -> "↙ SW"
            deg < 292.5 -> "← W"
            deg < 337.5 -> "↖ NW"
            else        -> "↑ N"
        }
    }

    private fun formatDistance(km: Double): String = when {
        km < 1.0  -> "${(km * 1000).toInt()} m"
        km < 10.0 -> String.format("%.1f km", km)
        else      -> "${km.toInt()} km"
    }

    private fun calculateETA(distanceKm: Double, speedKmPerMin: Double): Int {
        if (speedKmPerMin <= 0) return -1
        return (distanceKm / speedKmPerMin).toInt()
    }

    // ── Data class for KNN tests ──────────────────────────────────────────────
    data class SimpleDestination(val name: String, val lat: Double, val lon: Double)

    private fun knnSort(
        destinations: List<SimpleDestination>,
        userLat: Double, userLon: Double
    ): List<SimpleDestination> {
        return destinations.sortedBy { haversineDistance(userLat, userLon, it.lat, it.lon) }
    }

    // ═════════════════════════════════════════════════════════════════════════
    // 1. HAVERSINE DISTANCE TESTS
    // ═════════════════════════════════════════════════════════════════════════

    @Test
    fun `haversine - same point returns zero distance`() {
        val dist = haversineDistance(13.0827, 80.2707, 13.0827, 80.2707)
        assertEquals(0.0, dist, 0.001)
    }

    @Test
    fun `haversine - Chennai to Mumbai is approximately 1337 km`() {
        // Chennai: 13.0827° N, 80.2707° E
        // Mumbai:  19.0760° N, 72.8777° E
        val dist = haversineDistance(13.0827, 80.2707, 19.0760, 72.8777)
        assertTrue("Expected ~1337 km, got $dist", dist in 1300.0..1380.0)
    }

    @Test
    fun `haversine - distance is symmetric`() {
        val d1 = haversineDistance(13.0827, 80.2707, 28.6139, 77.2090)
        val d2 = haversineDistance(28.6139, 77.2090, 13.0827, 80.2707)
        assertEquals(d1, d2, 0.001)
    }

    @Test
    fun `haversine - Chennai to Delhi is approximately 2180 km`() {
        val dist = haversineDistance(13.0827, 80.2707, 28.6139, 77.2090)
        assertTrue("Expected ~2180 km, got $dist", dist in 2100.0..2250.0)
    }

    @Test
    fun `haversine - very close points return small distance`() {
        // ~111m apart (0.001 degree latitude)
        val dist = haversineDistance(13.0827, 80.2707, 13.0837, 80.2707)
        assertTrue("Expected < 0.2 km, got $dist", dist < 0.2)
    }

    // ═════════════════════════════════════════════════════════════════════════
    // 2. BEARING / DIRECTION TESTS
    // ═════════════════════════════════════════════════════════════════════════

    @Test
    fun `bearing - due North returns N`() {
        val result = calculateBearing(10.0, 80.0, 11.0, 80.0)
        assertEquals("↑ N", result)
    }

    @Test
    fun `bearing - due South returns S`() {
        val result = calculateBearing(11.0, 80.0, 10.0, 80.0)
        assertEquals("↓ S", result)
    }

    @Test
    fun `bearing - due East returns E`() {
        val result = calculateBearing(10.0, 80.0, 10.0, 81.0)
        assertEquals("→ E", result)
    }

    @Test
    fun `bearing - due West returns W`() {
        val result = calculateBearing(10.0, 81.0, 10.0, 80.0)
        assertEquals("← W", result)
    }

    @Test
    fun `bearing - northeast quadrant returns NE`() {
        val result = calculateBearing(10.0, 80.0, 11.0, 81.0)
        assertEquals("↗ NE", result)
    }

    @Test
    fun `bearing - southwest quadrant returns SW`() {
        val result = calculateBearing(11.0, 81.0, 10.0, 80.0)
        assertEquals("↙ SW", result)
    }

    // ═════════════════════════════════════════════════════════════════════════
    // 3. KNN SORT TESTS
    // ═════════════════════════════════════════════════════════════════════════

    @Test
    fun `knn - nearest destination appears first`() {
        val userLat = 13.0827; val userLon = 80.2707 // Chennai
        val destinations = listOf(
            SimpleDestination("Delhi", 28.6139, 77.2090),    // ~2180 km
            SimpleDestination("Nearby", 13.1000, 80.2800),  // ~2 km
            SimpleDestination("Mumbai", 19.0760, 72.8777)   // ~1337 km
        )
        val sorted = knnSort(destinations, userLat, userLon)
        assertEquals("Nearby", sorted.first().name)
    }

    @Test
    fun `knn - last destination is farthest`() {
        val userLat = 13.0827; val userLon = 80.2707
        val destinations = listOf(
            SimpleDestination("Delhi", 28.6139, 77.2090),
            SimpleDestination("Nearby", 13.1000, 80.2800),
            SimpleDestination("Mumbai", 19.0760, 72.8777)
        )
        val sorted = knnSort(destinations, userLat, userLon)
        assertEquals("Delhi", sorted.last().name)
    }

    @Test
    fun `knn - single destination stays first`() {
        val sorted = knnSort(
            listOf(SimpleDestination("Only", 13.0, 80.0)),
            13.0827, 80.2707
        )
        assertEquals(1, sorted.size)
        assertEquals("Only", sorted.first().name)
    }

    @Test
    fun `knn - empty list returns empty`() {
        val sorted = knnSort(emptyList(), 13.0827, 80.2707)
        assertTrue(sorted.isEmpty())
    }

    @Test
    fun `knn - sorted order is ascending by distance`() {
        val userLat = 13.0827; val userLon = 80.2707
        val destinations = listOf(
            SimpleDestination("Far", 28.6139, 77.2090),
            SimpleDestination("Near", 13.1000, 80.2800),
            SimpleDestination("Mid", 19.0760, 72.8777)
        )
        val sorted = knnSort(destinations, userLat, userLon)
        val distances = sorted.map { haversineDistance(userLat, userLon, it.lat, it.lon) }
        for (i in 0 until distances.size - 1) {
            assertTrue(distances[i] <= distances[i + 1])
        }
    }

    // ═════════════════════════════════════════════════════════════════════════
    // 4. ETA CALCULATION TESTS
    // ═════════════════════════════════════════════════════════════════════════

    @Test
    fun `eta - 10km at 1km per minute is 10 minutes`() {
        val eta = calculateETA(10.0, 1.0)
        assertEquals(10, eta)
    }

    @Test
    fun `eta - 5km at 0point5km per minute is 10 minutes`() {
        val eta = calculateETA(5.0, 0.5)
        assertEquals(10, eta)
    }

    @Test
    fun `eta - zero speed returns negative sentinel`() {
        val eta = calculateETA(10.0, 0.0)
        assertEquals(-1, eta)
    }

    @Test
    fun `eta - very small distance returns near zero minutes`() {
        val eta = calculateETA(0.1, 1.0)
        assertEquals(0, eta) // 0.1 / 1.0 = 0.1 → toInt() = 0
    }

    // ═════════════════════════════════════════════════════════════════════════
    // 5. DISTANCE FORMATTING TESTS
    // ═════════════════════════════════════════════════════════════════════════

    @Test
    fun `format - 0point5km shows as metres`() {
        assertEquals("500 m", formatDistance(0.5))
    }

    @Test
    fun `format - 0point85km shows as 850 m`() {
        assertEquals("850 m", formatDistance(0.85))
    }

    @Test
    fun `format - 2point3km shows one decimal`() {
        assertEquals("2.3 km", formatDistance(2.3))
    }

    @Test
    fun `format - 9point9km shows one decimal`() {
        assertEquals("9.9 km", formatDistance(9.9))
    }

    @Test
    fun `format - 15km shows as integer`() {
        assertEquals("15 km", formatDistance(15.0))
    }

    @Test
    fun `format - 1337km shows as integer`() {
        assertEquals("1337 km", formatDistance(1337.0))
    }
}
