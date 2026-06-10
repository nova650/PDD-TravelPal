import React, { useState, useEffect } from 'react';
import LandingPage from './components/LandingPage';
import Dashboard from './components/Dashboard';
import { authAPI } from './utils/api';
import './App.css';

function App() {
  const [view, setView] = useState('landing'); // 'landing' | 'app'
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [email, setEmail] = useState('');

  // Check auth session on load
  useEffect(() => {
    const authStatus = authAPI.isAuthenticated();
    setIsAuthenticated(authStatus);
    if (authStatus) {
      setEmail(authAPI.getEmail());
    }
  }, []);

  const handleLoginSuccess = (userEmail) => {
    setIsAuthenticated(true);
    setEmail(userEmail);
    setView('app'); // Automatically take user to app on login
  };

  const handleLogout = () => {
    authAPI.logout();
    setIsAuthenticated(false);
    setEmail('');
    setView('landing');
  };

  const handleEnterApp = () => {
    setView('app');
  };

  const handleBackToLanding = () => {
    setView('landing');
  };

  if (view === 'app' && isAuthenticated) {
    return <Dashboard onLogout={handleLogout} onBackToLanding={handleBackToLanding} email={email} />;
  }

  return (
    <LandingPage
      isAuthenticated={isAuthenticated}
      email={email}
      onLoginSuccess={handleLoginSuccess}
      onLogout={handleLogout}
      onEnterApp={handleEnterApp}
    />
  );
}

export default App;
