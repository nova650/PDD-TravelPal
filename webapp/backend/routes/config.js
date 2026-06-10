const express = require('express');
const router = express.Router();
const auth = require('../middleware/auth');

// GET /api/config/maps-key - Safely serve Google Maps API Key to frontend
router.get('/maps-key', auth, (req, res) => {
  res.json({
    mapsApiKey: process.env.MAPS_API_KEY || ''
  });
});

module.exports = router;
