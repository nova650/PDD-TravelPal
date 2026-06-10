const jwt = require('jsonwebtoken');

module.exports = (req, res, next) => {
  const authHeader = req.headers['authorization'];
  const token = authHeader && authHeader.split(' ')[1]; // Bearer <token>

  if (!token) {
    return res.status(401).json({ error: 'Access denied. No token provided.' });
  }

  try {
    const decoded = jwt.verify(token, process.env.JWT_SECRET || 'travelpal_secret_key');
    req.user = { id: decoded.id };
    next();
  } catch (ex) {
    res.status(400).json({ error: 'Invalid auth token.' });
  }
};
