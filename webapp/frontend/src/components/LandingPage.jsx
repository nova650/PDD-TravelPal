import React, { useState, useEffect, useRef } from 'react';
import { 
  Navigation, 
  UserCheck, 
  Play, 
  ArrowRight, 
  Shield, 
  Bell, 
  Compass, 
  MapPin, 
  Activity, 
  ShieldAlert, 
  VolumeX, 
  CheckCircle2, 
  Star 
} from 'lucide-react';
import gsap from 'gsap';
import { ScrollTrigger } from 'gsap/ScrollTrigger';
import '../styles/landing.css';
import AuthModal from './AuthModal';

// Register ScrollTrigger plugin with GSAP
gsap.registerPlugin(ScrollTrigger);

export default function LandingPage({ isAuthenticated, email, onLoginSuccess, onLogout, onEnterApp }) {
  const [showAuthModal, setShowAuthModal] = useState(false);
  
  // Refs for GSAP
  const subtitleRef = useRef(null);
  const titleRef = useRef(null);
  const descRef = useRef(null);
  const ctasRef = useRef(null);
  
  const timelineRef = useRef(null);
  const reviewsRef = useRef(null);

  useEffect(() => {
    // ── Hero Section Timeline reveal ──
    const tl = gsap.timeline({ defaults: { ease: 'power4.out', duration: 1.2 } });
    
    gsap.set([subtitleRef.current, titleRef.current, descRef.current, ctasRef.current], { opacity: 0 });
    
    tl.fromTo(subtitleRef.current, 
      { y: 30, opacity: 0 }, 
      { y: 0, opacity: 1, delay: 0.2 }
    )
    .fromTo(titleRef.current, 
      { y: 60, opacity: 0, scale: 0.95 }, 
      { y: 0, opacity: 1, scale: 1, duration: 1.4 },
      '-=0.8'
    )
    .fromTo(descRef.current, 
      { y: 30, opacity: 0 }, 
      { y: 0, opacity: 1 },
      '-=1.0'
    )
    .fromTo(ctasRef.current, 
      { y: 20, opacity: 0 }, 
      { y: 0, opacity: 1 },
      '-=0.8'
    );

    // ── How It Works Vertical Timeline GSAP ──
    const timelineItems = timelineRef.current?.querySelectorAll('.timeline-item');
    if (timelineItems) {
      timelineItems.forEach((item) => {
        const stepNum = item.querySelector('.timeline-step-number');
        const content = item.querySelector('.timeline-content');
        
        gsap.fromTo([stepNum, content],
          { y: 40, opacity: 0 },
          {
            y: 0,
            opacity: 1,
            duration: 1.0,
            stagger: 0.15,
            ease: 'power2.out',
            scrollTrigger: {
              trigger: item,
              start: 'top 80%',
            }
          }
        );
      });
    }

    // ── Reviews Section Title GSAP ──
    const reviewsTitle = reviewsRef.current?.querySelector('.section-title');
    if (reviewsTitle) {
      gsap.fromTo(reviewsTitle,
        { y: 30, opacity: 0 },
        {
          y: 0,
          opacity: 1,
          duration: 1.0,
          ease: 'power2.out',
          scrollTrigger: {
            trigger: reviewsRef.current,
            start: 'top 85%'
          }
        }
      );
    }
  }, []);

  const handleStartClick = () => {
    if (isAuthenticated) {
      onEnterApp();
    } else {
      setShowAuthModal(true);
    }
  };

  // Split email to greet user
  const userGreeting = email ? email.split('@')[0] : '';

  const reviewsListRow1 = [
    { name: "Sarah L.", role: "Daily Commuter", review: "Saved me from missing my train stop three times already! Best travel helper I've used.", rating: 5 },
    { name: "David K.", role: "Night Shift Worker", review: "The shake-to-SOS feature gives my family immense peace of mind during late rides home.", rating: 5 },
    { name: "Anita P.", role: "Backpacker", review: "Loud offline synthesizer alarm sirens are super reliable. Doesn't drain my battery either.", rating: 5 },
    { name: "Marcus G.", role: "Business Traveler", review: "Excellent telemetry data tracking. The bearing coordinates and speed calculations are top tier.", rating: 5 },
  ];

  const reviewsListRow2 = [
    { name: "Rachel T.", role: "Student", review: "Perfect Leaflet maps coordinates integration. Click to select address is highly intuitive.", rating: 5 },
    { name: "Oliver S.", role: "Metro Commuter", review: "I sleep soundly knowing the alarm boundary alert is active. Absolute game changer.", rating: 5 },
    { name: "Emilio R.", role: "Frequent Flyer", review: "Saved emergency numbers synchronizes instantly with the Express backend server.", rating: 5 },
    { name: "Clara H.", role: "Late Commuter", review: "The simulated SMS coordinates updates are incredible. Highly recommend this safety tool.", rating: 5 },
  ];

  return (
    <div className="landing-container">
      
      {/* Navbar */}
      <header className="landing-nav">
        <div className="landing-nav-logo" onClick={() => window.scrollTo({ top: 0, behavior: 'smooth' })}>
          <div className="logo-icon" style={{ width: '32px', height: '32px', borderRadius: '8px' }}>
            <Navigation size={16} fill="white" />
          </div>
          <span style={{ fontFamily: 'var(--font-heading)', fontWeight: 800 }}>TravelPal</span>
        </div>

        <nav className="landing-nav-links">
          <a href="#features" className="landing-nav-link">Features</a>
          <a href="#how-it-works" className="landing-nav-link">How It Works</a>
          <a href="#reviews" className="landing-nav-link">Reviews</a>
        </nav>

        <div style={{ display: 'flex', gap: '1rem', alignItems: 'center' }}>
          {isAuthenticated ? (
            <>
              <div style={{ display: 'flex', alignItems: 'center', gap: '0.4rem', fontSize: '0.9rem', color: 'var(--text-secondary)' }}>
                <UserCheck size={16} color="var(--success)" />
                <span>Hi, <strong>{userGreeting || email}</strong></span>
              </div>
              <button className="btn btn-primary" onClick={onEnterApp} style={{ padding: '0.5rem 1rem', fontSize: '0.85rem' }}>
                Go to Dashboard <ArrowRight size={14} />
              </button>
              <button className="btn btn-secondary" onClick={onLogout} style={{ padding: '0.5rem 1rem', fontSize: '0.85rem' }}>
                Logout
              </button>
            </>
          ) : (
            <>
              <button className="btn btn-secondary" onClick={() => setShowAuthModal(true)} style={{ padding: '0.5rem 1rem', fontSize: '0.85rem' }}>
                Log In
              </button>
              <button className="btn btn-primary" onClick={() => setShowAuthModal(true)} style={{ padding: '0.5rem 1rem', fontSize: '0.85rem' }}>
                Get Started
              </button>
            </>
          )}
        </div>
      </header>

      {/* Hero Section */}
      <section className="hero-section">
        <span className="hero-subtitle" ref={subtitleRef}>Next-Gen Proximity Safety</span>
        <div className="hero-title-container">
          <h1 className="hero-title" ref={titleRef}>
            Sleep Soundly.<br />Travel Safely.
          </h1>
        </div>
        <p className="hero-description" ref={descRef}>
          A web interface replicating your favorite native travel assistant. Set destination alert fences, monitor live bearing metrics, and keep contacts informed with coordinates beacons.
        </p>
        <div className="hero-buttons" ref={ctasRef}>
          <button className="btn btn-primary" onClick={handleStartClick} style={{ padding: '1rem 2rem', fontSize: '1.05rem', gap: '0.75rem' }}>
            {isAuthenticated ? 'Enter Application' : 'Launch TravelPal'} <Play size={16} fill="white" />
          </button>
          {!isAuthenticated && (
            <button className="btn btn-secondary" onClick={() => setShowAuthModal(true)} style={{ padding: '1rem 2rem', fontSize: '1.05rem' }}>
              Create Free Account
            </button>
          )}
        </div>
      </section>

      {/* Features Grid */}
      <section id="features" className="features-section">
        <h2 className="section-title">
          Engineered for <span>Real-Time</span> Protection
        </h2>
        
        <div className="features-grid">
          <div className="feature-card">
            <div className="feature-icon-wrapper">
              <Bell size={24} />
            </div>
            <h3 className="feature-title">Geofence Alarm</h3>
            <p className="feature-desc">
              Define a 5km warning parameter. Upon entering the threshold, TravelPal triggers an offline synthesizer alarm siren and wakes you immediately.
            </p>
          </div>

          <div className="feature-card">
            <div className="feature-icon-wrapper">
              <Compass size={24} />
            </div>
            <h3 className="feature-title">Live Telemetry</h3>
            <p className="feature-desc">
              Tracks real-time speed, dynamic compass bearing, remaining distances, and calibrates ETAs continuously based on movement frequencies.
            </p>
          </div>

          <div className="feature-card">
            <div className="feature-icon-wrapper">
              <Shield size={24} />
            </div>
            <h3 className="feature-title">SOS Broadcasts</h3>
            <p className="feature-desc">
              Active users or physical shake loops automatically dispatch coordinates SMS updates to up to 3 safety contacts to maintain tracking logs.
            </p>
          </div>
        </div>
      </section>

      {/* How It Works - Elegant Vertical Timeline Section (No Cards) */}
      <section id="how-it-works" className="how-it-works-section" ref={timelineRef}>
        <div style={{ maxWidth: '1000px', margin: '0 auto', padding: '0 2rem' }}>
          <h2 className="section-title" style={{ marginBottom: '6rem' }}>
            How <span>TravelPal</span> Works
          </h2>

          <div className="timeline-container">
            <div className="timeline-line"></div>
            
            <div className="timeline-item">
              <div className="timeline-step-number">01</div>
              <div className="timeline-content">
                <h3 className="timeline-heading">
                  <MapPin size={22} color="var(--primary)" style={{ flexShrink: 0 }} /> Set Your Destination
                </h3>
                <p className="timeline-description">
                  Search for coordinates or click anywhere directly on the interactive Leaflet map. TravelPal resolves the geolocated address details automatically and secures it to the database.
                </p>
              </div>
            </div>

            <div className="timeline-item">
              <div className="timeline-step-number">02</div>
              <div className="timeline-content">
                <h3 className="timeline-heading">
                  <Activity size={22} color="var(--secondary)" style={{ flexShrink: 0 }} /> Calibrate Real-time Telemetry
                </h3>
                <p className="timeline-description">
                  Start tracking. TravelPal initiates web location watchdogs to monitor coordinates changes, computing speed variables, compass headings, and dynamic ETAs.
                </p>
              </div>
            </div>

            <div className="timeline-item">
              <div className="timeline-step-number">03</div>
              <div className="timeline-content">
                <h3 className="timeline-heading">
                  <VolumeX size={22} color="var(--accent)" style={{ flexShrink: 0 }} /> Safe Arrival Alarm
                </h3>
                <p className="timeline-description">
                  As soon as you enter the 5km boundary zone, TravelPal starts our custom synthesizer alarm siren and displays the danger alert popup to prevent you from sleeping past your stop.
                </p>
              </div>
            </div>

            <div className="timeline-item">
              <div className="timeline-step-number">04</div>
              <div className="timeline-content">
                <h3 className="timeline-heading">
                  <ShieldAlert size={22} color="var(--danger)" style={{ flexShrink: 0 }} /> Emergency Beacons
                </h3>
                <p className="timeline-description">
                  In case of unexpected emergencies, physical devices trigger automatic SOS coordinate updates, sending simulated safety logs to your contacts every 60 seconds.
                </p>
              </div>
            </div>
          </div>
        </div>
      </section>

      {/* Infinite Scrolling Marquee Reviews Section */}
      <section id="reviews" className="reviews-section" ref={reviewsRef}>
        <h2 className="section-title" style={{ marginBottom: '5rem' }}>
          Trusted By <span>Commuters</span> Worldwide
        </h2>

        <div className="marquee-wrapper">
          {/* Marquee Row 1 - Left direction */}
          <div className="marquee-row marquee-row-left">
            <div className="marquee-track">
              {reviewsListRow1.concat(reviewsListRow1).map((rev, index) => (
                <div key={index} className="glass-card marquee-card-item">
                  <div style={{ display: 'flex', color: '#f59e0b', gap: '0.2rem', marginBottom: '0.75rem' }}>
                    {[...Array(rev.rating)].map((_, i) => <Star key={i} size={14} fill="#f59e0b" stroke="none" />)}
                  </div>
                  <p className="marquee-card-text">"{rev.review}"</p>
                  <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginTop: '1.25rem' }}>
                    <span style={{ fontSize: '0.85rem', fontWeight: 700, color: 'white' }}>{rev.name}</span>
                    <span style={{ fontSize: '0.75rem', color: 'var(--text-muted)' }}>{rev.role}</span>
                  </div>
                </div>
              ))}
            </div>
          </div>

          {/* Marquee Row 2 - Right direction */}
          <div className="marquee-row marquee-row-right" style={{ marginTop: '1.5rem' }}>
            <div className="marquee-track">
              {reviewsListRow2.concat(reviewsListRow2).map((rev, index) => (
                <div key={index} className="glass-card marquee-card-item">
                  <div style={{ display: 'flex', color: '#f59e0b', gap: '0.2rem', marginBottom: '0.75rem' }}>
                    {[...Array(rev.rating)].map((_, i) => <Star key={i} size={14} fill="#f59e0b" stroke="none" />)}
                  </div>
                  <p className="marquee-card-text">"{rev.review}"</p>
                  <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginTop: '1.25rem' }}>
                    <span style={{ fontSize: '0.85rem', fontWeight: 700, color: 'white' }}>{rev.name}</span>
                    <span style={{ fontSize: '0.75rem', color: 'var(--text-muted)' }}>{rev.role}</span>
                  </div>
                </div>
              ))}
            </div>
          </div>
        </div>
      </section>

      {/* Styled Multi-column Footer */}
      <footer className="landing-footer">
        <div className="footer-grid">
          <div className="footer-col-brand">
            <div className="sidebar-logo" style={{ marginBottom: '1.25rem' }}>
              <div className="logo-icon" style={{ width: '32px', height: '32px', borderRadius: '8px' }}>
                <Navigation size={16} fill="white" />
              </div>
              <span className="logo-text" style={{ fontSize: '1.25rem' }}>TravelPal</span>
            </div>
            <p className="footer-brand-desc">
              Your intelligent travel geofencing companion. Keeping commutes safe and families connected with automated alert beacons.
            </p>
          </div>

          <div className="footer-col-links">
            <h4 className="footer-heading">Features</h4>
            <a href="#features" className="footer-link">Geofencing Alarms</a>
            <a href="#features" className="footer-link">Live Telemetry</a>
            <a href="#features" className="footer-link">SOS Broadcast Console</a>
          </div>

          <div className="footer-col-links">
            <h4 className="footer-heading">Resources</h4>
            <a href="#how-it-works" className="footer-link">How it Works</a>
            <a href="#reviews" className="footer-link">Customer Reviews</a>
            <a href="https://leafletjs.com/" target="_blank" className="footer-link">Leaflet Docs</a>
          </div>

          <div className="footer-col-links">
            <h4 className="footer-heading">Developers</h4>
            <a href="https://github.com" target="_blank" className="footer-link">GitHub Repository</a>
            <span className="footer-link" style={{ cursor: 'default' }}>v1.0.0 Express Server</span>
          </div>
        </div>

        <div className="footer-bottom">
          <p>&copy; {new Date().getFullYear()} TravelPal Web Interface. Built for security-first commuters. SQLite & Node.js backend integration.</p>
        </div>
      </footer>

      {/* Auth Modal */}
      {showAuthModal && (
        <AuthModal
          onClose={() => setShowAuthModal(false)}
          onSuccess={onLoginSuccess}
        />
      )}
    </div>
  );
}
