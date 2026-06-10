const express = require('express');
const cors = require('cors');
const sqlite3 = require('sqlite3').verbose();
const path = require('path');
require('dotenv').config();

const app = express();
const PORT = process.env.PORT || 5001;

// Middleware
app.use(cors());
app.use(express.json());

// Database connection
const dbPath = path.join(__dirname, 'db', 'database.sqlite');
// Ensure directory exists
const fs = require('fs');
const dbDir = path.dirname(dbPath);
if (!fs.existsSync(dbDir)) {
  fs.mkdirSync(dbDir, { recursive: true });
}

const db = new sqlite3.Database(dbPath, (err) => {
  if (err) {
    console.error('Error opening SQLite database', err.message);
  } else {
    console.log('Connected to the SQLite database.');
    initializeDatabase();
  }
});

// Create tables if they do not exist
function initializeDatabase() {
  db.serialize(() => {
    // Users table
    db.run(`
      CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        email TEXT UNIQUE NOT NULL,
        password TEXT NOT NULL
      )
    `);

    // Destinations table
    db.run(`
      CREATE TABLE IF NOT EXISTS destinations (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        userId INTEGER NOT NULL,
        title TEXT NOT NULL,
        location TEXT NOT NULL,
        latitude REAL NOT NULL,
        longitude REAL NOT NULL,
        contactNumber TEXT,
        FOREIGN KEY (userId) REFERENCES users(id) ON DELETE CASCADE
      )
    `);

    // Trip History table
    db.run(`
      CREATE TABLE IF NOT EXISTS trip_history (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        userId INTEGER NOT NULL,
        destinationTitle TEXT NOT NULL,
        destinationLocation TEXT NOT NULL,
        arrivedAt INTEGER NOT NULL,
        distanceTravelled REAL NOT NULL,
        durationMinutes INTEGER NOT NULL,
        FOREIGN KEY (userId) REFERENCES users(id) ON DELETE CASCADE
      )
    `);

    // Emergency Contacts table
    db.run(`
      CREATE TABLE IF NOT EXISTS emergency_contacts (
        userId INTEGER PRIMARY KEY,
        contact1 TEXT,
        contact2 TEXT,
        contact3 TEXT,
        FOREIGN KEY (userId) REFERENCES users(id) ON DELETE CASCADE
      )
    `);
  });
}

// Make db accessible to routes
app.use((req, res, next) => {
  req.db = db;
  next();
});

// Import Routes
const authRouter = require('./routes/auth');
const destinationsRouter = require('./routes/destinations');
const tripsRouter = require('./routes/trips');
const emergencyRouter = require('./routes/emergency');
const configRouter = require('./routes/config');

// Mount Routes
app.use('/api/auth', authRouter);
app.use('/api/destinations', destinationsRouter);
app.use('/api/trips', tripsRouter);
app.use('/api/emergency', emergencyRouter);
app.use('/api/config', configRouter);

// Start server
app.listen(PORT, () => {
  console.log(`Express server running on port ${PORT}`);
});

module.exports = app;
