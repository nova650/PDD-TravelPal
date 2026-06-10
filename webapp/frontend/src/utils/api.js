const API_BASE_URL = 'http://localhost:5001/api';

const getHeaders = () => {
  const token = localStorage.getItem('travelpal_token');
  const headers = {
    'Content-Type': 'application/json',
  };
  if (token) {
    headers['Authorization'] = `Bearer ${token}`;
  }
  return headers;
};

const request = async (endpoint, options = {}) => {
  const url = `${API_BASE_URL}${endpoint}`;
  const config = {
    ...options,
    headers: {
      ...getHeaders(),
      ...options.headers,
    },
  };

  try {
    const response = await fetch(url, config);
    const data = await response.json();
    if (!response.ok) {
      throw new Error(data.error || 'API Request failed');
    }
    return data;
  } catch (error) {
    console.error(`API Error in ${endpoint}:`, error.message);
    throw error;
  }
};

export const authAPI = {
  login: async (email, password) => {
    const data = await request('/auth/login', {
      method: 'POST',
      body: JSON.stringify({ email, password }),
    });
    if (data.token) {
      localStorage.setItem('travelpal_token', data.token);
      localStorage.setItem('travelpal_email', data.email);
    }
    return data;
  },

  signup: async (email, password) => {
    const data = await request('/auth/signup', {
      method: 'POST',
      body: JSON.stringify({ email, password }),
    });
    if (data.token) {
      localStorage.setItem('travelpal_token', data.token);
      localStorage.setItem('travelpal_email', data.email);
    }
    return data;
  },

  logout: () => {
    localStorage.removeItem('travelpal_token');
    localStorage.removeItem('travelpal_email');
  },

  isAuthenticated: () => {
    return !!localStorage.getItem('travelpal_token');
  },

  getEmail: () => {
    return localStorage.getItem('travelpal_email') || '';
  }
};

export const destinationsAPI = {
  getAll: () => request('/destinations'),
  create: (dest) => request('/destinations', {
    method: 'POST',
    body: JSON.stringify(dest),
  }),
  update: (id, dest) => request(`/destinations/${id}`, {
    method: 'PUT',
    body: JSON.stringify(dest),
  }),
  delete: (id) => request(`/destinations/${id}`, {
    method: 'DELETE',
  }),
  deleteAll: () => request('/destinations', {
    method: 'DELETE',
  }),
};

export const tripsAPI = {
  getAll: () => request('/trips'),
  create: (trip) => request('/trips', {
    method: 'POST',
    body: JSON.stringify(trip),
  }),
  deleteAll: () => request('/trips', {
    method: 'DELETE',
  }),
};

export const emergencyAPI = {
  get: () => request('/emergency'),
  save: (contacts) => request('/emergency', {
    method: 'POST',
    body: JSON.stringify(contacts),
  }),
};

export const configAPI = {
  getMapsKey: () => request('/config/maps-key'),
};
