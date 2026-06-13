# TravelPal E2E Testing Guide

## Overview
This project includes comprehensive Selenium E2E testing with 100+ test cases covering all major functionality of the TravelPal web application.

## Test Coverage
The test suite includes 100+ test cases across the following categories:

### 1. Landing Page (30+ tests)
- Page title and navigation elements
- Hero section components
- Features grid validation
- Timeline steps verification
- Reviews marquee functionality
- Footer links and branding
- Responsive layout testing

### 2. Authentication System (18+ tests)
- Modal open/close functionality
- Sign up validation (empty fields, invalid email, short password)
- Sign in functionality
- Session persistence
- Token storage verification
- Logout functionality

### 3. Destinations CRUD (21+ tests)
- Empty state display
- Add destination form validation
- Map picker integration
- Search autocomplete functionality
- Coordinate precision testing
- Contact number format validation
- Edit mode switching
- Delete confirmation
- Card display and interactions

### 4. Route Telemetry (18+ tests)
- Distance calculation accuracy
- Bearing compass directions
- ETA dynamic updates
- Map marker display
- Polyline rendering
- Map tile loading
- Bounds fitting
- Real-time updates

### 5. Geofencing Alarms (17+ tests)
- Boundary threshold testing
- GPS simulator functionality
- Alarm audio playback
- Visual indicators
- SMS notification toggle
- Trip logging on arrival
- Background tracking
- Multiple destinations handling

### 6. Trip Analytics (17+ tests)
- Total trips calculation
- Total distance calculation
- Average duration calculation
- Date formatting
- Empty state display
- History sorting
- Data persistence
- Clear logs functionality

### 7. SOS System (18+ tests)
- Contact validation
- Broadcast interval testing
- Log message formatting
- Coordinates accuracy
- Notification permissions
- Active state visualization
- Log clearing
- Multiple contacts handling

### 8. Navigation & UI/UX (16+ tests)
- Sidebar navigation responsiveness
- Tab switching animations
- Active tab highlighting
- Navigation state persistence
- Breadcrumb navigation
- Responsive design (mobile/tablet/desktop)
- Color contrast accessibility
- Button hover states
- Form input focus states
- Loading states
- Error/success message display
- Modal animations

### 9. Data Persistence (5+ tests)
- LocalStorage data integrity
- Database connection
- API error handling
- Network timeout handling
- Data backup/restore

## Prerequisites

### Python Dependencies
Install the required Python packages:
```bash
pip install -r requirements.txt
```

Required packages:
- selenium==4.15.2
- webdriver-manager==4.0.1
- openpyxl==3.1.2

### Node.js Dependencies
Ensure backend and frontend dependencies are installed:
```bash
cd webapp/backend
npm install

cd ../frontend
npm install
```

## Running the Tests

### Command to Run E2E Tests
```bash
python3 run_e2e_tests.py
```

### What the Test Script Does
1. **Cleans the database** - Removes existing SQLite database for fresh test run
2. **Starts Backend Server** - Launches Node.js backend on port 5001
3. **Starts Frontend Server** - Launches Vite dev server on port 5173
4. **Waits for servers** - Ensures both servers are ready before testing
5. **Initializes Selenium** - Sets up Chrome WebDriver in headless mode
6. **Executes 100+ test cases** - Runs all E2E tests across the application
7. **Generates Excel Report** - Creates detailed test report with pass/fail status
8. **Cleans up** - Stops servers and closes browser

## Test Report

After completion, the script generates an Excel report with the following sheets:
- **Summary** - Overall test statistics (total, passed, failed, pass rate, duration)
- **Passed Tests** - List of all passed test cases with execution time
- **Failed Tests** - List of failed tests with error details and timestamps
- **Execution Log** - Detailed log of all events during test execution
- **Test Details** - Complete list of all tests with status and error details

The report file is named: `E2E_Test_Report_TravelPal_YYYY-MM-DDTHH-MM-SS.xlsx`

## Test Execution Flow

1. **Landing Page Navigation**
   - Verifies page loads correctly
   - Tests all navigation elements
   - Validates hero section and features

2. **User Registration**
   - Opens auth modal
   - Tests validation rules
   - Creates new user account
   - Verifies successful registration

3. **Dashboard Navigation**
   - Tests sidebar navigation
   - Verifies user greeting
   - Tests tab switching

4. **Destination Management**
   - Tests empty state
   - Adds new destination with map picker
   - Validates form fields
   - Tests edit and delete functionality

5. **Route Tracking**
   - Starts tracking for destination
   - Tests GPS simulator
   - Verifies telemetry calculations
   - Tests map display and markers

6. **Geofencing Alarms**
   - Tests proximity boundary detection
   - Triggers alarm on arrival
   - Verifies alarm modal display
   - Tests SMS notification toggle

7. **Trip Analytics**
   - Views trip history
   - Tests analytics calculations
   - Verifies data display
   - Tests clear history functionality

8. **SOS System**
   - Configures emergency contacts
   - Tests SOS broadcast
   - Verifies log generation
   - Tests stop SOS functionality

9. **Logout**
   - Signs out user
   - Verifies return to landing page
   - Tests session cleanup

## Troubleshooting

### Port Already in Use
If you see "port already in use" errors:
```bash
# Kill processes on ports 5001 and 5173
lsof -ti:5001 | xargs kill -9
lsof -ti:5173 | xargs kill -9
```

### Chrome Driver Issues
The script uses webdriver-manager to automatically manage Chrome driver. If you encounter issues:
```bash
pip install --upgrade webdriver-manager
```

### Database Lock
If database is locked:
```bash
rm webapp/backend/db/database.sqlite
```

### Frontend Build Issues
If frontend fails to start:
```bash
cd webapp/frontend
rm -rf node_modules package-lock.json
npm install
```

## Customization

### Modify Test Timeout
Edit the wait duration in `run_e2e_tests.py`:
```python
wait = WebDriverWait(driver, 10)  # Change 10 to desired seconds
```

### Run Tests in Non-Headless Mode
Comment out the headless argument:
```python
options.add_argument("--headless=new")  # Comment this line
```

### Change Ports
Modify the port variables at the top of `run_e2e_tests.py`:
```python
BACKEND_PORT = 5001  # Change if needed
FRONTEND_PORT = 5173  # Change if needed
```

## Continuous Integration

To integrate with CI/CD pipelines:

```bash
# Install dependencies
pip install -r requirements.txt
cd webapp/backend && npm install
cd ../frontend && npm install

# Run tests
python3 run_e2e_tests.py

# Check exit code
if [ $? -eq 0 ]; then
  echo "Tests passed"
else
  echo "Tests failed"
  exit 1
fi
```

## Test Maintenance

When adding new features:
1. Add corresponding test cases in `run_e2e_tests.py`
2. Follow the existing pattern using `run_check()`
3. Use descriptive test names with category prefixes
4. Update this README with new test coverage

## Support

For issues or questions about the E2E testing suite, refer to:
- Selenium documentation: https://www.selenium.dev/documentation/
- WebDriver Manager: https://github.com/SergeyPirogov/webdriver_manager
- OpenPyXL documentation: https://openpyxl.readthedocs.io/
