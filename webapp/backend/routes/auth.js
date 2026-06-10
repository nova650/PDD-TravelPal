const express = require('express');
const router = express.Router();
const bcrypt = require('bcryptjs');
const jwt = require('jsonwebtoken');

// POST /signup
router.post('/signup', async (req, res) => {
  const { email, password } = req.body;
  const db = req.db;

  if (!email || !password) {
    return res.status(400).json({ error: 'Email and password are required.' });
  }

  // Check if email already exists
  db.get('SELECT * FROM users WHERE email = ?', [email], async (err, row) => {
    if (err) {
      return res.status(500).json({ error: 'Database error.' });
    }
    if (row) {
      return res.status(400).json({ error: 'An account with this email already exists.' });
    }

    try {
      // Hash password
      const salt = await bcrypt.genSalt(10);
      const hashedPassword = await bcrypt.hash(password, salt);

      // Insert user
      db.run('INSERT INTO users (email, password) VALUES (?, ?)', [email, hashedPassword], function (err) {
        if (err) {
          return res.status(500).json({ error: 'Failed to create user.' });
        }

        const userId = this.lastID;
        
        // Auto-create blank emergency contacts record for user
        db.run('INSERT INTO emergency_contacts (userId, contact1, contact2, contact3) VALUES (?, "", "", "")', [userId]);

        // Generate JWT
        const token = jwt.sign(
          { id: userId, email },
          process.env.JWT_SECRET || 'travelpal_secret_key',
          { expiresIn: '7d' }
        );

        res.status(201).json({ token, userId, email });
      });
    } catch (e) {
      res.status(500).json({ error: 'Server error processing registration.' });
    }
  });
});

// POST /login
router.post('/login', (req, res) => {
  const { email, password } = req.body;
  const db = req.db;

  if (!email || !password) {
    return res.status(400).json({ error: 'Email and password are required.' });
  }

  db.get('SELECT * FROM users WHERE email = ?', [email], async (err, user) => {
    if (err) {
      return res.status(500).json({ error: 'Database error.' });
    }
    if (!user) {
      return res.status(400).json({ error: 'Invalid email or password.' });
    }

    const validPassword = await bcrypt.compare(password, user.password);
    if (!validPassword) {
      return res.status(400).json({ error: 'Invalid email or password.' });
    }

    // Generate JWT
    const token = jwt.sign(
      { id: user.id, email: user.email },
      process.env.JWT_SECRET || 'travelpal_secret_key',
      { expiresIn: '7d' }
    );

    res.json({ token, userId: user.id, email: user.email });
  });
});

module.exports = router;
