import React, { useState, useEffect, useRef } from 'react';
import { 
  Navigation, 
  MapPin, 
  History, 
  ShieldAlert, 
  Plus, 
  Settings, 
  VolumeX,
  CheckCircle,
  Zap,
  ArrowLeft,
  LogOut
} from 'lucide-react';

import { 
  destinationsAPI,
  tripsAPI,
  emergencyAPI,
  configAPI
} from '../utils/api';

import {
  getSosLogs,
  addSosLog,
  clearSosLogs
} from '../utils/db'; // Keep SOS logs simulated locally

import DestinationCard from './DestinationCard';
import AddDestination from './AddDestination';
import DestinationDetail from './DestinationDetail';
import EmergencyContacts from './EmergencyContacts';
import TripHistory from './TripHistory';
import { calculateDistance } from '../utils/navigation';

// Web Audio API Synthesizer for offline alarm sirens
let audioCtx = null;
let alarmBeepInterval = null;

const startWebAlarmSiren = () => {
  if (alarmBeepInterval) return;
  const AudioContext = window.AudioContext || window.webkitAudioContext;
  if (!AudioContext) return;
  audioCtx = new AudioContext();

  const playBeep = () => {
    if (!audioCtx || audioCtx.state === 'suspended') return;
    const osc1 = audioCtx.createOscillator();
    const osc2 = audioCtx.createOscillator();
    const gainNode = audioCtx.createGain();

    osc1.type = 'sawtooth';
    osc1.frequency.setValueAtTime(900, audioCtx.currentTime);

    osc2.type = 'sine';
    osc2.frequency.setValueAtTime(910, audioCtx.currentTime);

    gainNode.gain.setValueAtTime(0.25, audioCtx.currentTime);
    gainNode.gain.exponentialRampToValueAtTime(0.01, audioCtx.currentTime + 0.35);

    osc1.connect(gainNode);
    osc2.connect(gainNode);
    gainNode.connect(audioCtx.destination);

    osc1.start();
    osc2.start();
    osc1.stop(audioCtx.currentTime + 0.4);
    osc2.stop(audioCtx.currentTime + 0.4);
  };

  alarmBeepInterval = setInterval(playBeep, 600);
};

const stopWebAlarmSiren = () => {
  if (alarmBeepInterval) {
    clearInterval(alarmBeepInterval);
    alarmBeepInterval = null;
  }
  if (audioCtx) {
    audioCtx.close();
    audioCtx = null;
  }
};

export default function Dashboard({ onLogout, onBackToLanding }) {
  // Navigation tabs: 'destinations' | 'add-place' | 'history' | 'emergency' | 'detail'
  const [activeTab, setActiveTab] = useState('destinations');
  
  // App States
  const [destinations, setDestinations] = useState([]);
  const [tripHistory, setTripHistory] = useState([]);
  const [sosLogs, setSosLogs] = useState([]);
  const [mapsApiKey, setMapsApiKey] = useState('');
  
  // Navigation details
  const [selectedDest, setSelectedDest] = useState(null);
  const [editingDest, setEditingDest] = useState(null);
  
  // Tracking & Location
  const [activeTrackingDest, setActiveTrackingDest] = useState(null);
  const [userLocation, setUserLocation] = useState({ lat: 37.7749, lon: -122.4194 }); // SF Default
  const [initialDistance, setInitialDistance] = useState(0);
  const [tripStartTime, setTripStartTime] = useState(0);
  const [notifyContact, setNotifyContact] = useState(false);
  const [watchId, setWatchId] = useState(null);
  
  // Simulated GPS Coordinates controls
  const [isSimulatedGps, setIsSimulatedGps] = useState(false);
  const [simLat, setSimLat] = useState(37.7749);
  const [simLon, setSimLon] = useState(-122.4194);
  
  // Alert Modals
  const [alarmTriggered, setAlarmTriggered] = useState(false);
  const [arrivalDetails, setArrivalDetails] = useState(null);

  // SOS state
  const [isSosActive, setIsSosActive] = useState(false);
  const [emergencyContacts, setEmergencyContacts] = useState({ contact1: '', contact2: '', contact3: '' });
  const sosIntervalRef = useRef(null);

  // Load Initial DB records from APIs
  useEffect(() => {
    fetchDestinations();
    fetchTripHistory();
    fetchEmergencyContacts();
    setSosLogs(getSosLogs());

    // Fetch Google Maps API Key from config backend route
    configAPI.getMapsKey()
      .then(data => {
        setMapsApiKey(data.mapsApiKey);
        console.log("Maps API Key fetched successfully:", data.mapsApiKey ? "Loaded" : "Empty");
      })
      .catch(err => console.error("Could not fetch maps key config:", err));

    if (Notification.permission === 'default') {
      Notification.requestPermission();
    }
  }, []);

  const fetchDestinations = () => {
    destinationsAPI.getAll()
      .then(setDestinations)
      .catch(err => console.error("Error fetching destinations API:", err));
  };

  const fetchTripHistory = () => {
    tripsAPI.getAll()
      .then(setTripHistory)
      .catch(err => console.error("Error fetching trips API:", err));
  };

  const fetchEmergencyContacts = () => {
    emergencyAPI.get()
      .then(setEmergencyContacts)
      .catch(err => console.error("Error fetching emergency API:", err));
  };

  // Sync simulated/real GPS locations
  useEffect(() => {
    if (isSimulatedGps) {
      if (watchId) {
        navigator.geolocation.clearWatch(watchId);
        setWatchId(null);
      }
      setUserLocation({ lat: parseFloat(simLat), lon: parseFloat(simLon) });
    } else {
      if (navigator.geolocation) {
        const id = navigator.geolocation.watchPosition(
          (pos) => {
            const currentLat = pos.coords.latitude;
            const currentLon = pos.coords.longitude;
            setUserLocation({ lat: currentLat, lon: currentLon });
            setSimLat(currentLat);
            setSimLon(currentLon);
          },
          (err) => console.error("Geolocation error", err),
          { enableHighAccuracy: true }
        );
        setWatchId(id);
      } else {
        alert("Geolocation not supported. Reverting to Simulation.");
        setIsSimulatedGps(true);
      }
    }
  }, [isSimulatedGps, simLat, simLon]);

  // Proximity Alert Boundary Check Loop
  useEffect(() => {
    if (!activeTrackingDest || alarmTriggered) return;

    const dist = calculateDistance(
      userLocation.lat,
      userLocation.lon,
      activeTrackingDest.latitude,
      activeTrackingDest.longitude
    );

    if (dist < 5.0) {
      triggerArrivalAlert();
    }
  }, [userLocation, activeTrackingDest, alarmTriggered]);

  // SOS Dispatch timer loop
  useEffect(() => {
    if (isSosActive) {
      dispatchSosSMS();
      sosIntervalRef.current = setInterval(() => {
        dispatchSosSMS();
      }, 60000);
    } else {
      if (sosIntervalRef.current) {
        clearInterval(sosIntervalRef.current);
        sosIntervalRef.current = null;
      }
    }
    return () => {
      if (sosIntervalRef.current) clearInterval(sosIntervalRef.current);
    };
  }, [isSosActive, userLocation, emergencyContacts]);

  // --- Core Handlers ---

  const triggerSosAlert = () => {
    const activeContacts = [emergencyContacts.contact1, emergencyContacts.contact2, emergencyContacts.contact3].filter(Boolean);

    if (activeContacts.length === 0) {
      alert("Please configure and save emergency contacts first inside the SOS Center tab.");
      setActiveTab('emergency');
      return;
    }

    setIsSosActive(true);
    if (Notification.permission === 'granted') {
      new Notification("SOS Active", { body: "SOS has been triggered. Broadcast coordinates active." });
    }
  };

  const stopSosAlert = () => {
    setIsSosActive(false);
  };

  const dispatchSosSMS = () => {
    const activeContacts = [emergencyContacts.contact1, emergencyContacts.contact2, emergencyContacts.contact3].filter(Boolean);
    if (activeContacts.length === 0) return;

    const message = `SOS! I need help. My location: http://maps.google.com/maps?q=${userLocation.lat.toFixed(5)},${userLocation.lon.toFixed(5)}`;
    addSosLog(message, activeContacts);
    setSosLogs(getSosLogs());
  };

  const startTracking = (dest) => {
    const dist = calculateDistance(userLocation.lat, userLocation.lon, dest.latitude, dest.longitude);
    setActiveTrackingDest(dest);
    setInitialDistance(dist);
    setTripStartTime(Date.now());
    setAlarmTriggered(false);
  };

  const stopTracking = () => {
    setActiveTrackingDest(null);
    setInitialDistance(0);
    setTripStartTime(0);
  };

  const triggerArrivalAlert = () => {
    setAlarmTriggered(true);
    startWebAlarmSiren();

    const durationMin = Math.max(1, Math.round((Date.now() - tripStartTime) / 60000));
    
    // Log trip to Backend DB
    const completedTrip = {
      destinationTitle: activeTrackingDest.title,
      destinationLocation: activeTrackingDest.location,
      distanceTravelled: initialDistance,
      durationMinutes: durationMin,
      arrivedAt: Date.now()
    };

    tripsAPI.create(completedTrip)
      .then(() => fetchTripHistory())
      .catch(err => console.error("Failed to log trip to backend API:", err));

    setArrivalDetails({
      destName: activeTrackingDest.title,
      distance: initialDistance,
      duration: durationMin
    });

    if (notifyContact && activeTrackingDest.contactNumber) {
      const smsMessage = `${activeTrackingDest.title} has arrived at ${activeTrackingDest.location}`;
      addSosLog(smsMessage, [activeTrackingDest.contactNumber]);
      setSosLogs(getSosLogs());
    }

    if (Notification.permission === 'granted') {
      new Notification("Destination Reached", { 
        body: `You are near your destination: ${activeTrackingDest.title}!` 
      });
    }

    stopTracking();
  };

  const dismissAlarm = () => {
    stopWebAlarmSiren();
    setAlarmTriggered(false);
    setArrivalDetails(null);
  };

  const handleSaveDestination = (payload) => {
    const apiCall = payload.id 
      ? destinationsAPI.update(payload.id, payload)
      : destinationsAPI.create(payload);

    apiCall
      .then(() => {
        fetchDestinations();
        setActiveTab('destinations');
        setEditingDest(null);
      })
      .catch(err => alert("Error saving destination API: " + err.message));
  };

  const handleDeleteDestination = (id) => {
    if (window.confirm("Are you sure you want to delete this destination?")) {
      destinationsAPI.delete(id)
        .then(() => {
          fetchDestinations();
          if (activeTrackingDest && activeTrackingDest.id === id) {
            stopTracking();
          }
        })
        .catch(err => alert("Error deleting destination API: " + err.message));
    }
  };

  const handleDeleteAll = () => {
    if (window.confirm("Are you sure you want to delete all destinations?")) {
      destinationsAPI.deleteAll()
        .then(() => {
          setDestinations([]);
          stopTracking();
        })
        .catch(err => alert("Error clearing destinations API: " + err.message));
    }
  };

  const handleClearHistory = () => {
    tripsAPI.deleteAll()
      .then(() => {
        setTripHistory([]);
      })
      .catch(err => alert("Error clearing trip history API: " + err.message));
  };

  const handleClearSosLogs = () => {
    clearSosLogs();
    setSosLogs([]);
  };

  const handleSaveEmergencyContacts = (contacts) => {
    return emergencyAPI.save(contacts)
      .then(() => {
        fetchEmergencyContacts();
      });
  };

  const handleEditClick = (dest) => {
    setEditingDest(dest);
    setActiveTab('add-place');
  };

  const handleTrackClick = (dest) => {
    setSelectedDest(dest);
    setActiveTab('detail');
  };


  return (
    <div className="app-container">
      {/* Sidebar Navigation */}
      <aside className="sidebar">
        <div>
          <div className="sidebar-logo" onClick={onBackToLanding} style={{ cursor: 'pointer' }}>
            <div className="logo-icon" style={{ width: '32px', height: '32px', borderRadius: '8px' }}>
              <Navigation size={16} fill="white" />
            </div>
            <span className="logo-text" style={{ fontSize: '1.25rem' }}>TravelPal</span>
          </div>

          <nav className="sidebar-nav">
            <div 
              className={`nav-item ${activeTab === 'destinations' ? 'active' : ''}`}
              onClick={() => { setActiveTab('destinations'); setSelectedDest(null); setEditingDest(null); }}
            >
              <MapPin size={18} className="nav-item-icon" />
              <span>Destinations</span>
            </div>

            <div 
              className={`nav-item ${activeTab === 'add-place' && !editingDest ? 'active' : ''}`}
              onClick={() => { setActiveTab('add-place'); setEditingDest(null); }}
            >
              <Plus size={18} className="nav-item-icon" />
              <span>Add Destination</span>
            </div>

            <div 
              className={`nav-item ${activeTab === 'history' ? 'active' : ''}`}
              onClick={() => setActiveTab('history')}
            >
              <History size={18} className="nav-item-icon" />
              <span>Trip Analytics</span>
            </div>

            <div 
              className={`nav-item ${activeTab === 'emergency' ? 'active' : ''}`}
              onClick={() => setActiveTab('emergency')}
            >
              <ShieldAlert size={18} className="nav-item-icon" />
              <span>SOS Center</span>
            </div>
          </nav>
        </div>

        <div className="sidebar-nav" style={{ marginTop: 'auto', gap: '0.25rem' }}>
          <div className="nav-item" onClick={onBackToLanding}>
            <ArrowLeft size={16} className="nav-item-icon" />
            <span>Landing Page</span>
          </div>
          <div className="nav-item" onClick={onLogout} style={{ color: 'var(--danger)' }}>
            <LogOut size={16} className="nav-item-icon" />
            <span>Sign Out</span>
          </div>
        </div>
      </aside>

      {/* Main Content Area */}
      <main className="main-content">
        
        {activeTrackingDest && (
          <div 
            style={{ 
              display: 'flex', 
              justifyContent: 'space-between', 
              alignItems: 'center', 
              background: 'rgba(99, 102, 241, 0.15)', 
              border: '1px solid var(--primary)', 
              color: 'white', 
              padding: '0.75rem 1.25rem', 
              borderRadius: 'var(--radius-md)', 
              marginBottom: '2rem',
              fontSize: '0.85rem'
            }}
          >
            <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem' }}>
              <Zap size={16} className="nav-item-icon" style={{ color: 'var(--accent)' }} />
              <span>
                Location Service Active: Tracking distance to <strong>{activeTrackingDest.title}</strong>
              </span>
            </div>
            <button 
              className="btn btn-secondary" 
              onClick={() => handleTrackClick(activeTrackingDest)} 
              style={{ padding: '0.25rem 0.6rem', fontSize: '0.75rem' }}
            >
              Telemetry Dashboard
            </button>
          </div>
        )}

        {activeTab === 'destinations' && (
          <div>
            <div className="page-header">
              <div>
                <h2 className="page-title">Saved Destinations</h2>
                <p className="page-subtitle">Track coordinates, calculate speeds, and trigger alarms.</p>
              </div>
              {destinations.length > 0 && (
                <button className="btn btn-secondary text-danger" onClick={handleDeleteAll}>
                  Delete All
                </button>
              )}
            </div>

            {destinations.length === 0 ? (
              <div className="glass-card empty-state">
                <MapPin className="empty-icon" />
                <h3>No Destinations Found</h3>
                <p>Click "Add Destination" to configure your first geofence alert.</p>
                <button className="btn btn-primary" onClick={() => setActiveTab('add-place')} style={{ marginTop: '1.5rem' }}>
                  Add Destination
                </button>
              </div>
            ) : (
              <div className="destinations-grid">
                {destinations.map((dest) => (
                  <DestinationCard
                    key={dest.id}
                    dest={dest}
                    userLocation={userLocation}
                    onTrack={handleTrackClick}
                    onEdit={handleEditClick}
                    onDelete={handleDeleteDestination}
                  />
                ))}
              </div>
            )}
          </div>
        )}

        {activeTab === 'add-place' && (
          <AddDestination
            editingDest={editingDest}
            onSave={handleSaveDestination}
            onCancel={() => { setActiveTab('destinations'); setEditingDest(null); }}
          />
        )}

        {activeTab === 'detail' && selectedDest && (
          <DestinationDetail
            dest={selectedDest}
            userLocation={userLocation}
            activeTrackingDest={activeTrackingDest}
            notifyContact={notifyContact}
            onToggleNotifyContact={() => setNotifyContact(!notifyContact)}
            onStartTracking={startTracking}
            onStopTracking={stopTracking}
            tripStartTime={tripStartTime}
            initialDistance={initialDistance}
            onBack={() => setActiveTab('destinations')}
          />
        )}

        {activeTab === 'history' && (
          <TripHistory
            history={tripHistory}
            onClearHistory={handleClearHistory}
          />
        )}

        {activeTab === 'emergency' && (
          <EmergencyContacts
            isSosActive={isSosActive}
            onToggleSos={isSosActive ? stopSosAlert : triggerSosAlert}
            sosLogs={sosLogs}
            onClearLogs={handleClearSosLogs}
            emergencyContacts={emergencyContacts}
            onSaveContacts={handleSaveEmergencyContacts}
          />
        )}
      </main>



      {/* Alarm Fullscreen Modal */}
      {alarmTriggered && arrivalDetails && (
        <div className="alarm-overlay">
          <div className="alarm-content">
            <ShieldAlert className="alarm-icon-pulse" />
            <h1 style={{ fontSize: '2rem', fontWeight: 800, marginBottom: '0.5rem' }}>DANGER BOUNDARY MET</h1>
            <h3 style={{ fontSize: '1.25rem', color: '#fca5a5', fontWeight: 600, marginBottom: '1.5rem' }}>
              Arrived near: {arrivalDetails.destName}
            </h3>

            <div style={{ display: 'flex', flexDirection: 'column', gap: '0.5rem', marginBottom: '2rem', fontSize: '0.9rem', color: '#e2e8f0', textAlign: 'left', width: '100%', padding: '1rem', background: 'rgba(255,255,255,0.05)', borderRadius: '8px' }}>
              <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem' }}>
                <CheckCircle size={16} color="var(--success)" />
                <span>Boundary Limit: &lt; 5.0 km</span>
              </div>
              <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem' }}>
                <CheckCircle size={16} color="var(--success)" />
                <span>Distance Recorded: {arrivalDetails.distance.toFixed(1)} km</span>
              </div>
              <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem' }}>
                <CheckCircle size={16} color="var(--success)" />
                <span>Elapsed Journey Time: {arrivalDetails.duration} min</span>
              </div>
              {notifyContact && (
                <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem', color: '#6ee7b7' }}>
                  <CheckCircle size={16} color="var(--success)" />
                  <span>Simulated SOS SMS Dispatched!</span>
                </div>
              )}
            </div>

            <button className="btn btn-danger" onClick={dismissAlarm} style={{ width: '100%', gap: '0.5rem' }}>
              <VolumeX size={18} /> DISMISS ALARM
            </button>
          </div>
        </div>
      )}
    </div>
  );
}
