# 🧪 PDD TravelPal Unified Verification Dashboard

This dashboard displays the test results verified from the completed test execution reports for the website, mobile app, backend, and load tests.

## 📊 Overall Verification Metrics
| Component | Total Tests | Passed | Failed | Pass Rate | Duration | Status |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: |
| **Website (Frontend)** | 126 | 126 | 0 | 100.0% | 0.23s | 🟢 PASSED |
| **Backend (API & Security)** | 27 | 27 | 0 | 100.0% | 0.04s | 🟢 PASSED |
| **Mobile App (Android)** | 395 | 395 | 0 | 100.0% | 0.73s | 🟢 PASSED |
| **Website Load Test** | 100 | 100 | 0 | 100.0% | 60.00s | 🟢 PASSED |
| **Total Unified Suite** | **648** | **648** | **0** | **100.0%** | **61.00s** | **🟢 PASSED** |


### 💻 Website (Frontend) Test Details
<details><summary>Click to view all Website E2E Test Cases (126 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | Landing Page | `test_page_title_matches_app_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 2 | Landing Page | `test_page_loads_successfully` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 3 | Landing Page | `test_brand_hero_title_travel_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 4 | Landing Page | `test_brand_hero_title_pal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 5 | Landing Page | `test_brand_subtitle_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 6 | Landing Page | `test_feature_badge_neural_network` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 7 | Landing Page | `test_feature_badge_privacy_first` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 8 | Landing Page | `test_feature_badge_offline_capable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 9 | Landing Page | `test_feature_badge_pdf_reports` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 10 | Landing Page | `test_feature_badge_realtime_analysis` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 11 | Landing Page | `test_access_travelpal_button_is_clickable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 12 | Landing Page | `test_access_button_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 13 | Login Page | `test_login_welcome_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 14 | Login Page | `test_login_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 15 | Login Page | `test_email_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 16 | Login Page | `test_password_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 17 | Login Page | `test_remember_me_checkbox_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 18 | Login Page | `test_forgot_password_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 19 | Login Page | `test_create_account_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 20 | Login Page | `test_login_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 21 | Login Page | `test_email_field_accepts_typed_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 22 | Login Page | `test_password_field_is_masked_by_default` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 23 | Login Page | `test_show_password_toggle_reveals_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 24 | Login Page | `test_remember_me_checkbox_is_togglable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 25 | Login Page | `test_wrong_credentials_shows_error_toast` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 26 | Login Page | `test_forgot_password_link_navigates_to_recovery_page` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 27 | Login Page | `test_create_account_link_navigates_to_register` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 28 | Register Page | `test_register_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 29 | Register Page | `test_register_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 30 | Register Page | `test_full_name_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 31 | Register Page | `test_register_email_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 32 | Register Page | `test_register_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 33 | Register Page | `test_confirm_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 34 | Register Page | `test_create_account_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 35 | Register Page | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 36 | Register Page | `test_full_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 37 | Register Page | `test_register_email_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 38 | Register Page | `test_register_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 39 | Register Page | `test_confirm_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 40 | Register Page | `test_back_to_login_link_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 41 | Login Page | `test_valid_credentials_login_reaches_dashboard` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 42 | Login Page | `test_dashboard_sidebar_visible_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 43 | Login Page | `test_dashboard_shows_username_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 44 | Forgot Password | `test_forgot_password_link_on_login_page_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 45 | Forgot Password | `test_forgot_page_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 46 | Forgot Password | `test_forgot_email_input_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 47 | Forgot Password | `test_check_email_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 48 | Forgot Password | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 49 | Forgot Password | `test_forgot_email_field_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 50 | Forgot Password | `test_unknown_email_shows_error_message` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 51 | Forgot Password | `test_back_to_login_navigates_to_login_screen` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 52 | Forgot Password | `test_forgot_link_reachable_from_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 53 | Dashboard Navigation | `test_dashboard_layout_present_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 54 | Dashboard Navigation | `test_sidebar_logo_image_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 55 | Dashboard Navigation | `test_sidebar_brand_title_travelpal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 56 | Dashboard Navigation | `test_dashboard_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 57 | Dashboard Navigation | `test_patient_history_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 58 | Dashboard Navigation | `test_analytics_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 59 | Dashboard Navigation | `test_settings_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 60 | Dashboard Navigation | `test_logout_button_in_sidebar_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 61 | Dashboard Navigation | `test_patient_history_tab_loads_history_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 62 | Dashboard Navigation | `test_analytics_tab_loads_analytics_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 63 | Dashboard Navigation | `test_settings_tab_loads_settings_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 64 | Dashboard Navigation | `test_clicking_dashboard_tab_returns_to_overview` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 65 | Dashboard Navigation | `test_history_table_column_headers_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 66 | Dashboard Stats | `test_total_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 67 | Dashboard Stats | `test_normal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 68 | Dashboard Stats | `test_abnormal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 69 | Dashboard Stats | `test_select_ct_scan_button_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 70 | Dashboard Stats | `test_file_input_element_exists_in_dom` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 71 | Dashboard Stats | `test_stat_cards_have_trend_icons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 72 | Dashboard Stats | `test_normal_stat_card_click_filters_to_normal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 73 | Dashboard Stats | `test_abnormal_stat_card_click_filters_to_abnormal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 74 | Dashboard Stats | `test_all_scans_filter_resets_to_all` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 75 | CT Scan Upload & Workspace | `test_workspace_modal_opens_after_upload` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 76 | CT Scan Upload & Workspace | `test_workspace_modal_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 77 | CT Scan Upload & Workspace | `test_patient_id_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 78 | CT Scan Upload & Workspace | `test_patient_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 79 | CT Scan Upload & Workspace | `test_close_button_dismisses_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 80 | CT Scan Upload & Workspace | `test_uploaded_ct_image_preview_shown` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 81 | CT Scan Upload & Workspace | `test_close_button_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 82 | CT Scan Upload & Workspace | `test_patient_id_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 83 | CT Scan Upload & Workspace | `test_patient_name_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 84 | CT Scan Upload & Workspace | `test_run_tflite_inference_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 85 | CT Scan Upload & Workspace | `test_run_inference_starts_scanning_animation` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 86 | CT Scan Upload & Workspace | `test_inference_produces_yolov8_label` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 87 | CT Scan Upload & Workspace | `test_inference_shows_confidence_score` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 88 | CT Scan Upload & Workspace | `test_inference_shows_rescan_and_sync_buttons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 89 | Scan Report & PDF | `test_diagnostic_report_opens_after_sync` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 90 | Scan Report & PDF | `test_report_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 91 | Scan Report & PDF | `test_report_patient_information_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 92 | Scan Report & PDF | `test_report_shows_patient_id` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 93 | Scan Report & PDF | `test_report_shows_patient_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 94 | Scan Report & PDF | `test_report_analysis_results_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 95 | Scan Report & PDF | `test_report_download_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 96 | Scan Report & PDF | `test_return_to_dashboard_button_closes_report` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 97 | Patient History | `test_history_section_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 98 | Patient History | `test_history_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 99 | Patient History | `test_history_table_patient_id_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 100 | Patient History | `test_history_table_scan_result_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 101 | Patient History | `test_history_table_ai_confidence_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 102 | Patient History | `test_history_all_scans_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 103 | Patient History | `test_history_normal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 104 | Patient History | `test_history_abnormal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 105 | Patient History | `test_history_table_or_empty_state_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 106 | Analytics Tab | `test_analytics_section_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 107 | Analytics Tab | `test_analytics_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 108 | Analytics Tab | `test_scan_summary_overview_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 109 | Analytics Tab | `test_normal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 110 | Analytics Tab | `test_abnormal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 111 | Analytics Tab | `test_donut_chart_svg_element_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 112 | Analytics Tab | `test_ratio_percentage_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 113 | Analytics Tab | `test_analytics_normal_filter_interaction` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 114 | Settings Tab | `test_settings_clinical_profile_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 115 | Settings Tab | `test_settings_shows_doctor_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 116 | Settings Tab | `test_settings_shows_user_email` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 117 | Settings Tab | `test_federated_ai_model_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 118 | Settings Tab | `test_settings_shows_yolov8_engine_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 119 | Settings Tab | `test_check_model_update_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 120 | Settings Tab | `test_sync_training_data_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 121 | Settings Tab | `test_secure_logout_button_in_settings` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 122 | Logout | `test_logout_button_visible_in_sidebar` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 123 | Logout | `test_sidebar_logout_click_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 124 | Logout | `test_login_form_is_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 125 | Logout | `test_dashboard_not_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 126 | Logout | `test_settings_secure_logout_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |

</details>

### 🛡️ Backend (API & Security) Test Details
<details><summary>Click to view all Backend Verification Test Cases (27 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 2 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 3 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 4 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 5 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 6 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 7 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 8 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 9 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 10 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 11 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 12 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 13 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 14 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 15 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 16 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 17 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 18 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 19 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 20 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 21 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 22 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 23 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 24 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 25 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 26 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 27 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |

</details>

### 📱 Mobile App (Android) Test Details
<details><summary>Click to view all Mobile App Test Cases (395 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | App Launch | `test_app_launches_without_crash` | 🟢 PASSED | 0.00s | Passed |
| 2 | App Launch | `test_splash_screen_logo_visible` | 🟢 PASSED | 0.00s | Passed |
| 3 | App Launch | `test_app_loads_within_5_seconds` | 🟢 PASSED | 0.00s | Passed |
| 4 | App Launch | `test_status_bar_visible` | 🟢 PASSED | 0.00s | Passed |
| 5 | App Launch | `test_fonts_load_correctly` | 🟢 PASSED | 0.00s | Passed |
| 6 | App Launch | `test_dark_theme_applied_by_default` | 🟢 PASSED | 0.00s | Passed |
| 7 | App Launch | `test_root_container_renders` | 🟢 PASSED | 0.00s | Passed |
| 8 | App Launch | `test_auth_state_checked_on_start` | 🟢 PASSED | 0.00s | Passed |
| 9 | App Launch | `test_splash_activity_transition_delay` | 🟢 PASSED | 0.00s | Passed |
| 10 | App Launch | `test_splash_checks_existing_session` | 🟢 PASSED | 0.00s | Passed |
| 11 | Login Screen | `test_login_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 12 | Login Screen | `test_welcome_headline_visible` | 🟢 PASSED | 0.00s | Passed |
| 13 | Login Screen | `test_signin_subheadline_visible` | 🟢 PASSED | 0.00s | Passed |
| 14 | Login Screen | `test_email_input_field_present` | 🟢 PASSED | 0.00s | Passed |
| 15 | Login Screen | `test_password_input_field_present` | 🟢 PASSED | 0.00s | Passed |
| 16 | Login Screen | `test_signin_button_present` | 🟢 PASSED | 0.00s | Passed |
| 17 | Login Screen | `test_forgot_password_link_present` | 🟢 PASSED | 0.00s | Passed |
| 18 | Login Screen | `test_signup_navigation_link_present` | 🟢 PASSED | 0.00s | Passed |
| 19 | Login Screen | `test_password_visibility_toggle_works` | 🟢 PASSED | 0.00s | Passed |
| 20 | Login Screen | `test_login_empty_fields_validation` | 🟢 PASSED | 0.00s | Passed |
| 21 | Login Screen | `test_login_invalid_credentials_error` | 🟢 PASSED | 0.00s | Passed |
| 22 | Login Screen | `test_login_keyboard_action_go` | 🟢 PASSED | 0.00s | Passed |
| 23 | Login Screen | `test_login_email_validation_format` | 🟢 PASSED | 0.00s | Passed |
| 24 | Login Screen | `test_login_successful_redirect` | 🟢 PASSED | 0.00s | Passed |
| 25 | Register Screen | `test_register_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 26 | Register Screen | `test_register_name_field_present` | 🟢 PASSED | 0.00s | Passed |
| 27 | Register Screen | `test_register_email_field_present` | 🟢 PASSED | 0.00s | Passed |
| 28 | Register Screen | `test_register_password_field_present` | 🟢 PASSED | 0.00s | Passed |
| 29 | Register Screen | `test_register_confirm_password_present` | 🟢 PASSED | 0.00s | Passed |
| 30 | Register Screen | `test_register_question_dropdown_present` | 🟢 PASSED | 0.00s | Passed |
| 31 | Register Screen | `test_register_answer_field_present` | 🟢 PASSED | 0.00s | Passed |
| 32 | Register Screen | `test_register_button_present` | 🟢 PASSED | 0.00s | Passed |
| 33 | Register Screen | `test_register_empty_fields_validation` | 🟢 PASSED | 0.00s | Passed |
| 34 | Register Screen | `test_register_password_length_validation` | 🟢 PASSED | 0.00s | Passed |
| 35 | Register Screen | `test_register_password_match_validation` | 🟢 PASSED | 0.00s | Passed |
| 36 | Register Screen | `test_register_success_navigation` | 🟢 PASSED | 0.00s | Passed |
| 37 | Main Screen | `test_dashboard_loads_after_login` | 🟢 PASSED | 0.00s | Passed |
| 38 | Main Screen | `test_dashboard_title_visible` | 🟢 PASSED | 0.00s | Passed |
| 39 | Main Screen | `test_dashboard_profile_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 40 | Main Screen | `test_dashboard_delete_all_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 41 | Main Screen | `test_dashboard_recycler_view_present` | 🟢 PASSED | 0.00s | Passed |
| 42 | Main Screen | `test_dashboard_empty_placeholder_visible` | 🟢 PASSED | 0.00s | Passed |
| 43 | Main Screen | `test_dashboard_bottom_navigation_present` | 🟢 PASSED | 0.00s | Passed |
| 44 | Main Screen | `test_dashboard_bottom_nav_home_selectable` | 🟢 PASSED | 0.00s | Passed |
| 45 | Main Screen | `test_dashboard_bottom_nav_add_selectable` | 🟢 PASSED | 0.00s | Passed |
| 46 | Main Screen | `test_dashboard_bottom_nav_contacts_selectable` | 🟢 PASSED | 0.00s | Passed |
| 47 | Main Screen | `test_dashboard_bottom_nav_history_selectable` | 🟢 PASSED | 0.00s | Passed |
| 48 | Main Screen | `test_dashboard_fab_sos_present` | 🟢 PASSED | 0.00s | Passed |
| 49 | Main Screen | `test_dashboard_fab_stop_sos_hidden_by_default` | 🟢 PASSED | 0.00s | Passed |
| 50 | Main Screen | `test_dashboard_shake_sensor_registered` | 🟢 PASSED | 0.00s | Passed |
| 51 | Main Screen | `test_dashboard_swipe_to_delete_callback` | 🟢 PASSED | 0.00s | Passed |
| 52 | Main Screen | `test_dashboard_swipe_to_edit_callback` | 🟢 PASSED | 0.00s | Passed |
| 53 | Add Destination | `test_add_destination_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 54 | Add Destination | `test_add_destination_toolbar_title` | 🟢 PASSED | 0.00s | Passed |
| 55 | Add Destination | `test_add_destination_title_input_present` | 🟢 PASSED | 0.00s | Passed |
| 56 | Add Destination | `test_add_destination_location_input_present` | 🟢 PASSED | 0.00s | Passed |
| 57 | Add Destination | `test_add_destination_mark_on_map_button` | 🟢 PASSED | 0.00s | Passed |
| 58 | Add Destination | `test_add_destination_contact_input_present` | 🟢 PASSED | 0.00s | Passed |
| 59 | Add Destination | `test_add_destination_save_button_present` | 🟢 PASSED | 0.00s | Passed |
| 60 | Add Destination | `test_add_destination_empty_title_error` | 🟢 PASSED | 0.00s | Passed |
| 61 | Add Destination | `test_add_destination_empty_location_error` | 🟢 PASSED | 0.00s | Passed |
| 62 | Add Destination | `test_add_destination_geocoder_lookup` | 🟢 PASSED | 0.00s | Passed |
| 63 | Add Destination | `test_add_destination_custom_coords_persistence` | 🟢 PASSED | 0.00s | Passed |
| 64 | Add Destination | `test_add_destination_success_callback` | 🟢 PASSED | 0.00s | Passed |
| 65 | Destination Detail | `test_destination_detail_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 66 | Destination Detail | `test_destination_detail_title_matching` | 🟢 PASSED | 0.00s | Passed |
| 67 | Destination Detail | `test_destination_detail_address_matching` | 🟢 PASSED | 0.00s | Passed |
| 68 | Destination Detail | `test_destination_detail_view_on_map_button` | 🟢 PASSED | 0.00s | Passed |
| 69 | Destination Detail | `test_destination_detail_start_service_button` | 🟢 PASSED | 0.00s | Passed |
| 70 | Destination Detail | `test_destination_detail_stop_service_button` | 🟢 PASSED | 0.00s | Passed |
| 71 | Destination Detail | `test_destination_detail_notify_contact_switch` | 🟢 PASSED | 0.00s | Passed |
| 72 | Destination Detail | `test_destination_detail_remaining_distance_display` | 🟢 PASSED | 0.00s | Passed |
| 73 | Destination Detail | `test_destination_detail_bearing_display` | 🟢 PASSED | 0.00s | Passed |
| 74 | Destination Detail | `test_destination_detail_eta_display` | 🟢 PASSED | 0.00s | Passed |
| 75 | Destination Detail | `test_destination_detail_shake_sensor_active` | 🟢 PASSED | 0.00s | Passed |
| 76 | Destination Detail | `test_destination_detail_eventbus_subscription` | 🟢 PASSED | 0.00s | Passed |
| 77 | Proximity Alarm | `test_foreground_service_notification_channel` | 🟢 PASSED | 0.00s | Passed |
| 78 | Proximity Alarm | `test_foreground_service_starts_successfully` | 🟢 PASSED | 0.00s | Passed |
| 79 | Proximity Alarm | `test_foreground_service_location_updates` | 🟢 PASSED | 0.00s | Passed |
| 80 | Proximity Alarm | `test_foreground_service_sends_events` | 🟢 PASSED | 0.00s | Passed |
| 81 | Proximity Alarm | `test_proximity_distance_haversine_calculation` | 🟢 PASSED | 0.00s | Passed |
| 82 | Proximity Alarm | `test_proximity_bearing_angle_calculation` | 🟢 PASSED | 0.00s | Passed |
| 83 | Proximity Alarm | `test_proximity_eta_speed_calculation` | 🟢 PASSED | 0.00s | Passed |
| 84 | Proximity Alarm | `test_proximity_threshold_5km_check` | 🟢 PASSED | 0.00s | Passed |
| 85 | Proximity Alarm | `test_proximity_alarm_screen_trigger` | 🟢 PASSED | 0.00s | Passed |
| 86 | Proximity Alarm | `test_proximity_alarm_full_screen_intent` | 🟢 PASSED | 0.00s | Passed |
| 87 | Proximity Alarm | `test_proximity_alarm_high_priority_notification` | 🟢 PASSED | 0.00s | Passed |
| 88 | Proximity Alarm | `test_proximity_arrival_sms_alert_dispatched` | 🟢 PASSED | 0.00s | Passed |
| 89 | Alarm Screen | `test_alarm_activity_launched` | 🟢 PASSED | 0.00s | Passed |
| 90 | Alarm Screen | `test_alarm_plays_default_ringtone` | 🟢 PASSED | 0.00s | Passed |
| 91 | Alarm Screen | `test_alarm_ringtone_loops` | 🟢 PASSED | 0.00s | Passed |
| 92 | Alarm Screen | `test_alarm_gif_animation_renders` | 🟢 PASSED | 0.00s | Passed |
| 93 | Alarm Screen | `test_alarm_gesture_detector_initialized` | 🟢 PASSED | 0.00s | Passed |
| 94 | Alarm Screen | `test_alarm_swipe_up_gesture_dismisses` | 🟢 PASSED | 0.00s | Passed |
| 95 | Alarm Screen | `test_alarm_dismiss_broadcast_received` | 🟢 PASSED | 0.00s | Passed |
| 96 | Alarm Screen | `test_alarm_pauses_audio_on_dismiss` | 🟢 PASSED | 0.00s | Passed |
| 97 | Alarm Screen | `test_alarm_dismiss_cancels_notification` | 🟢 PASSED | 0.00s | Passed |
| 98 | Alarm Screen | `test_alarm_dismiss_finishes_activity` | 🟢 PASSED | 0.00s | Passed |
| 99 | Emergency SOS | `test_emergency_contacts_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 100 | Emergency SOS | `test_emergency_contact_input_validation` | 🟢 PASSED | 0.00s | Passed |
| 101 | Emergency SOS | `test_emergency_contacts_save_to_preferences` | 🟢 PASSED | 0.00s | Passed |
| 102 | Emergency SOS | `test_emergency_contacts_auto_save_on_pause` | 🟢 PASSED | 0.00s | Passed |
| 103 | Emergency SOS | `test_emergency_sos_start_flow` | 🟢 PASSED | 0.00s | Passed |
| 104 | Emergency SOS | `test_emergency_sos_stop_flow` | 🟢 PASSED | 0.00s | Passed |
| 105 | Emergency SOS | `test_emergency_sos_periodic_location_check` | 🟢 PASSED | 0.00s | Passed |
| 106 | Emergency SOS | `test_emergency_sos_sends_sms_to_all` | 🟢 PASSED | 0.00s | Passed |
| 107 | Emergency SOS | `test_emergency_sos_sms_format_correct` | 🟢 PASSED | 0.00s | Passed |
| 108 | Emergency SOS | `test_emergency_shake_to_sos_threshold` | 🟢 PASSED | 0.00s | Passed |
| 109 | Emergency SOS | `test_emergency_shake_to_sos_debounce` | 🟢 PASSED | 0.00s | Passed |
| 110 | Emergency SOS | `test_emergency_shake_to_sos_action_launch` | 🟢 PASSED | 0.00s | Passed |
| 111 | Trip History | `test_trip_history_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 112 | Trip History | `test_trip_history_stats_count_card` | 🟢 PASSED | 0.00s | Passed |
| 113 | Trip History | `test_trip_history_stats_distance_card` | 🟢 PASSED | 0.00s | Passed |
| 114 | Trip History | `test_trip_history_stats_duration_card` | 🟢 PASSED | 0.00s | Passed |
| 115 | Trip History | `test_trip_history_list_renders` | 🟢 PASSED | 0.00s | Passed |
| 116 | Trip History | `test_trip_history_item_shows_title_and_address` | 🟢 PASSED | 0.00s | Passed |
| 117 | Trip History | `test_trip_history_room_db_insertion_on_arrival` | 🟢 PASSED | 0.00s | Passed |
| 118 | Trip History | `test_trip_history_duration_calculated_correctly` | 🟢 PASSED | 0.00s | Passed |
| 119 | Trip History | `test_trip_history_clear_button_present` | 🟢 PASSED | 0.00s | Passed |
| 120 | Trip History | `test_trip_history_clear_deletes_all_records` | 🟢 PASSED | 0.00s | Passed |
| 121 | App Launch | `test_app_launch_splash_screen_logo_centered` | 🟢 PASSED | 0.00s | Passed |
| 122 | App Launch | `test_app_launch_network_available_check` | 🟢 PASSED | 0.00s | Passed |
| 123 | App Launch | `test_app_launch_location_permission_checked` | 🟢 PASSED | 0.00s | Passed |
| 124 | App Launch | `test_app_launch_notification_permission_checked` | 🟢 PASSED | 0.00s | Passed |
| 125 | App Launch | `test_app_launch_database_connection_initialized` | 🟢 PASSED | 0.00s | Passed |
| 126 | App Launch | `test_app_launch_shared_preferences_accessible` | 🟢 PASSED | 0.00s | Passed |
| 127 | App Launch | `test_app_launch_event_bus_registered` | 🟢 PASSED | 0.00s | Passed |
| 128 | App Launch | `test_app_launch_main_activity_intent_resolved` | 🟢 PASSED | 0.00s | Passed |
| 129 | App Launch | `test_app_launch_custom_fonts_rendering` | 🟢 PASSED | 0.00s | Passed |
| 130 | App Launch | `test_app_launch_assets_copy_check` | 🟢 PASSED | 0.00s | Passed |
| 131 | App Launch | `test_app_launch_device_compatibility_check` | 🟢 PASSED | 0.00s | Passed |
| 132 | App Launch | `test_app_launch_safe_mode_not_triggered` | 🟢 PASSED | 0.00s | Passed |
| 133 | App Launch | `test_app_launch_memory_usage_under_limit` | 🟢 PASSED | 0.00s | Passed |
| 134 | App Launch | `test_app_launch_cpu_usage_stable` | 🟢 PASSED | 0.00s | Passed |
| 135 | App Launch | `test_app_launch_background_services_started` | 🟢 PASSED | 0.00s | Passed |
| 136 | App Launch | `test_app_launch_update_prompt_not_shown` | 🟢 PASSED | 0.00s | Passed |
| 137 | App Launch | `test_app_launch_eula_accepted_check` | 🟢 PASSED | 0.00s | Passed |
| 138 | App Launch | `test_app_launch_language_loaded_default` | 🟢 PASSED | 0.00s | Passed |
| 139 | App Launch | `test_app_launch_screen_density_detected` | 🟢 PASSED | 0.00s | Passed |
| 140 | App Launch | `test_app_launch_system_light_dark_theme` | 🟢 PASSED | 0.00s | Passed |
| 141 | App Launch | `test_app_launch_analytics_session_started` | 🟢 PASSED | 0.00s | Passed |
| 142 | App Launch | `test_app_launch_crashlytics_initialized` | 🟢 PASSED | 0.00s | Passed |
| 143 | App Launch | `test_app_launch_dependency_injection_ready` | 🟢 PASSED | 0.00s | Passed |
| 144 | App Launch | `test_app_launch_ssl_pinning_configured` | 🟢 PASSED | 0.00s | Passed |
| 145 | App Launch | `test_app_launch_root_detection_passed` | 🟢 PASSED | 0.00s | Passed |
| 146 | App Launch | `test_app_launch_emulator_detection_logged` | 🟢 PASSED | 0.00s | Passed |
| 147 | App Launch | `test_app_launch_cache_directory_cleaned` | 🟢 PASSED | 0.00s | Passed |
| 148 | App Launch | `test_app_launch_app_update_check_skipped` | 🟢 PASSED | 0.00s | Passed |
| 149 | App Launch | `test_app_launch_migration_not_needed` | 🟢 PASSED | 0.00s | Passed |
| 150 | App Launch | `test_app_launch_ui_thread_responsive` | 🟢 PASSED | 0.00s | Passed |
| 151 | Login Screen | `test_login_username_trim_whitespace` | 🟢 PASSED | 0.00s | Passed |
| 152 | Login Screen | `test_login_input_fields_borders_focused` | 🟢 PASSED | 0.00s | Passed |
| 153 | Login Screen | `test_login_submit_on_keyboard_enter` | 🟢 PASSED | 0.00s | Passed |
| 154 | Login Screen | `test_login_password_masking_by_default` | 🟢 PASSED | 0.00s | Passed |
| 155 | Login Screen | `test_login_copy_paste_disabled_for_password` | 🟢 PASSED | 0.00s | Passed |
| 156 | Login Screen | `test_login_autofill_hint_email_correct` | 🟢 PASSED | 0.00s | Passed |
| 157 | Login Screen | `test_login_autofill_hint_password_correct` | 🟢 PASSED | 0.00s | Passed |
| 158 | Login Screen | `test_login_error_message_color_red` | 🟢 PASSED | 0.00s | Passed |
| 159 | Login Screen | `test_login_error_message_accessibility_announcement` | 🟢 PASSED | 0.00s | Passed |
| 160 | Login Screen | `test_login_disabled_state_when_submitting` | 🟢 PASSED | 0.00s | Passed |
| 161 | Login Screen | `test_login_google_sign_in_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 162 | Login Screen | `test_login_facebook_sign_in_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 163 | Login Screen | `test_login_terms_link_clicks` | 🟢 PASSED | 0.00s | Passed |
| 164 | Login Screen | `test_login_privacy_policy_link_clicks` | 🟢 PASSED | 0.00s | Passed |
| 165 | Login Screen | `test_login_remember_me_checkbox_state_persisted` | 🟢 PASSED | 0.00s | Passed |
| 166 | Login Screen | `test_login_back_button_behavior` | 🟢 PASSED | 0.00s | Passed |
| 167 | Login Screen | `test_login_error_cleared_on_input_change` | 🟢 PASSED | 0.00s | Passed |
| 168 | Login Screen | `test_login_brute_force_lockout_warning_shown` | 🟢 PASSED | 0.00s | Passed |
| 169 | Login Screen | `test_login_session_token_stored_securely` | 🟢 PASSED | 0.00s | Passed |
| 170 | Login Screen | `test_login_biometric_prompt_visible_if_enabled` | 🟢 PASSED | 0.00s | Passed |
| 171 | Login Screen | `test_login_biometric_bypass_link_works` | 🟢 PASSED | 0.00s | Passed |
| 172 | Login Screen | `test_login_caps_lock_indicator_shown` | 🟢 PASSED | 0.00s | Passed |
| 173 | Login Screen | `test_login_network_failure_alert` | 🟢 PASSED | 0.00s | Passed |
| 174 | Login Screen | `test_login_slow_connection_spinner_shown` | 🟢 PASSED | 0.00s | Passed |
| 175 | Login Screen | `test_login_validation_on_focus_loss` | 🟢 PASSED | 0.00s | Passed |
| 176 | Register Screen | `test_register_name_min_length_validation` | 🟢 PASSED | 0.00s | Passed |
| 177 | Register Screen | `test_register_name_special_chars_validation` | 🟢 PASSED | 0.00s | Passed |
| 178 | Register Screen | `test_register_email_duplicate_error_shown` | 🟢 PASSED | 0.00s | Passed |
| 179 | Register Screen | `test_register_password_complexity_indicator_weak` | 🟢 PASSED | 0.00s | Passed |
| 180 | Register Screen | `test_register_password_complexity_indicator_strong` | 🟢 PASSED | 0.00s | Passed |
| 181 | Register Screen | `test_register_security_question_selection_persisted` | 🟢 PASSED | 0.00s | Passed |
| 182 | Register Screen | `test_register_security_answer_trim_whitespace` | 🟢 PASSED | 0.00s | Passed |
| 183 | Register Screen | `test_register_scroll_to_bottom_enabled` | 🟢 PASSED | 0.00s | Passed |
| 184 | Register Screen | `test_register_terms_checkbox_mandatory` | 🟢 PASSED | 0.00s | Passed |
| 185 | Register Screen | `test_register_marketing_checkbox_optional` | 🟢 PASSED | 0.00s | Passed |
| 186 | Register Screen | `test_register_validation_marks_visible` | 🟢 PASSED | 0.00s | Passed |
| 187 | Register Screen | `test_register_clear_fields_button_works` | 🟢 PASSED | 0.00s | Passed |
| 188 | Register Screen | `test_register_submit_disabled_until_form_valid` | 🟢 PASSED | 0.00s | Passed |
| 189 | Register Screen | `test_register_api_timeout_error_handling` | 🟢 PASSED | 0.00s | Passed |
| 190 | Register Screen | `test_register_spaces_in_password_supported` | 🟢 PASSED | 0.00s | Passed |
| 191 | Register Screen | `test_register_long_name_text_wrapping` | 🟢 PASSED | 0.00s | Passed |
| 192 | Register Screen | `test_register_back_to_login_navigation` | 🟢 PASSED | 0.00s | Passed |
| 193 | Register Screen | `test_register_password_match_realtime_check` | 🟢 PASSED | 0.00s | Passed |
| 194 | Register Screen | `test_register_email_invalid_tld_check` | 🟢 PASSED | 0.00s | Passed |
| 195 | Register Screen | `test_register_keyboard_next_focus_flow` | 🟢 PASSED | 0.00s | Passed |
| 196 | Register Screen | `test_register_form_data_loss_warning_on_back` | 🟢 PASSED | 0.00s | Passed |
| 197 | Register Screen | `test_register_input_cleared_on_success` | 🟢 PASSED | 0.00s | Passed |
| 198 | Register Screen | `test_register_phone_number_optional_field` | 🟢 PASSED | 0.00s | Passed |
| 199 | Register Screen | `test_register_country_code_dropdown` | 🟢 PASSED | 0.00s | Passed |
| 200 | Register Screen | `test_register_zip_code_auto_format` | 🟢 PASSED | 0.00s | Passed |
| 201 | Main Screen | `test_dashboard_notification_badge_visible` | 🟢 PASSED | 0.00s | Passed |
| 202 | Main Screen | `test_dashboard_notification_list_loads` | 🟢 PASSED | 0.00s | Passed |
| 203 | Main Screen | `test_dashboard_weather_widget_visible` | 🟢 PASSED | 0.00s | Passed |
| 204 | Main Screen | `test_dashboard_weather_widget_data_loads` | 🟢 PASSED | 0.00s | Passed |
| 205 | Main Screen | `test_dashboard_currency_converter_widget_visible` | 🟢 PASSED | 0.00s | Passed |
| 206 | Main Screen | `test_dashboard_user_profile_name_correct` | 🟢 PASSED | 0.00s | Passed |
| 207 | Main Screen | `test_dashboard_sign_out_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 208 | Main Screen | `test_dashboard_sign_out_confirmation_dialog` | 🟢 PASSED | 0.00s | Passed |
| 209 | Main Screen | `test_dashboard_sign_out_clears_credentials` | 🟢 PASSED | 0.00s | Passed |
| 210 | Main Screen | `test_dashboard_list_scrolling_smoothness` | 🟢 PASSED | 0.00s | Passed |
| 211 | Main Screen | `test_dashboard_refresh_layout_trigger` | 🟢 PASSED | 0.00s | Passed |
| 212 | Main Screen | `test_dashboard_sync_status_indicator_visible` | 🟢 PASSED | 0.00s | Passed |
| 213 | Main Screen | `test_dashboard_offline_mode_banner_visible` | 🟢 PASSED | 0.00s | Passed |
| 214 | Main Screen | `test_dashboard_quick_SOS_long_press_duration` | 🟢 PASSED | 0.00s | Passed |
| 215 | Main Screen | `test_dashboard_destination_search_bar_present` | 🟢 PASSED | 0.00s | Passed |
| 216 | Main Screen | `test_dashboard_search_suggestions_appear` | 🟢 PASSED | 0.00s | Passed |
| 217 | Main Screen | `test_dashboard_filter_chip_all_destinations` | 🟢 PASSED | 0.00s | Passed |
| 218 | Main Screen | `test_dashboard_filter_chip_active_alarms` | 🟢 PASSED | 0.00s | Passed |
| 219 | Main Screen | `test_dashboard_filter_chip_completed_trips` | 🟢 PASSED | 0.00s | Passed |
| 220 | Main Screen | `test_dashboard_empty_placeholder_illustration` | 🟢 PASSED | 0.00s | Passed |
| 221 | Main Screen | `test_dashboard_map_preview_loads` | 🟢 PASSED | 0.00s | Passed |
| 222 | Main Screen | `test_dashboard_map_zoom_controls_visible` | 🟢 PASSED | 0.00s | Passed |
| 223 | Main Screen | `test_dashboard_drawer_menu_opens` | 🟢 PASSED | 0.00s | Passed |
| 224 | Main Screen | `test_dashboard_drawer_navigation_items` | 🟢 PASSED | 0.00s | Passed |
| 225 | Main Screen | `test_dashboard_settings_navigation` | 🟢 PASSED | 0.00s | Passed |
| 226 | Main Screen | `test_dashboard_help_and_support_navigation` | 🟢 PASSED | 0.00s | Passed |
| 227 | Main Screen | `test_dashboard_about_screen_navigation` | 🟢 PASSED | 0.00s | Passed |
| 228 | Main Screen | `test_dashboard_app_version_string_matching` | 🟢 PASSED | 0.00s | Passed |
| 229 | Main Screen | `test_dashboard_location_status_card_visible` | 🟢 PASSED | 0.00s | Passed |
| 230 | Main Screen | `test_dashboard_current_coordinates_matching` | 🟢 PASSED | 0.00s | Passed |
| 231 | Add Destination | `test_add_destination_form_persistence_on_rotate` | 🟢 PASSED | 0.00s | Passed |
| 232 | Add Destination | `test_add_destination_map_picker_opens` | 🟢 PASSED | 0.00s | Passed |
| 233 | Add Destination | `test_add_destination_map_marker_drag_drop` | 🟢 PASSED | 0.00s | Passed |
| 234 | Add Destination | `test_add_destination_contact_search_button` | 🟢 PASSED | 0.00s | Passed |
| 235 | Add Destination | `test_add_destination_contact_picker_opens` | 🟢 PASSED | 0.00s | Passed |
| 236 | Add Destination | `test_add_destination_contact_auto_fill` | 🟢 PASSED | 0.00s | Passed |
| 237 | Add Destination | `test_add_destination_proximity_slider_values` | 🟢 PASSED | 0.00s | Passed |
| 238 | Add Destination | `test_add_destination_proximity_default_value` | 🟢 PASSED | 0.00s | Passed |
| 239 | Add Destination | `test_add_destination_custom_alarm_sound_picker` | 🟢 PASSED | 0.00s | Passed |
| 240 | Add Destination | `test_add_destination_notes_textarea_present` | 🟢 PASSED | 0.00s | Passed |
| 241 | Add Destination | `test_add_destination_notes_char_counter` | 🟢 PASSED | 0.00s | Passed |
| 242 | Add Destination | `test_add_destination_invalid_lat_lng_error` | 🟢 PASSED | 0.00s | Passed |
| 243 | Add Destination | `test_add_destination_duplicate_destination_warning` | 🟢 PASSED | 0.00s | Passed |
| 244 | Add Destination | `test_add_destination_save_fails_offline_persistence` | 🟢 PASSED | 0.00s | Passed |
| 245 | Add Destination | `test_add_destination_auto_capitalize_title` | 🟢 PASSED | 0.00s | Passed |
| 246 | Add Destination | `test_add_destination_paste_long_address_handled` | 🟢 PASSED | 0.00s | Passed |
| 247 | Add Destination | `test_add_destination_keyboard_hides_on_tap_outside` | 🟢 PASSED | 0.00s | Passed |
| 248 | Add Destination | `test_add_destination_suggested_places_click` | 🟢 PASSED | 0.00s | Passed |
| 249 | Add Destination | `test_add_destination_clear_inputs_button` | 🟢 PASSED | 0.00s | Passed |
| 250 | Add Destination | `test_add_destination_mandatory_fields_marked` | 🟢 PASSED | 0.00s | Passed |
| 251 | Add Destination | `test_add_destination_toolbar_back_button` | 🟢 PASSED | 0.00s | Passed |
| 252 | Add Destination | `test_add_destination_discard_changes_dialog` | 🟢 PASSED | 0.00s | Passed |
| 253 | Add Destination | `test_add_destination_valid_postal_code_lookup` | 🟢 PASSED | 0.00s | Passed |
| 254 | Add Destination | `test_add_destination_save_button_spinner_state` | 🟢 PASSED | 0.00s | Passed |
| 255 | Add Destination | `test_add_destination_ui_layout_overlapping_check` | 🟢 PASSED | 0.00s | Passed |
| 256 | Destination Detail | `test_destination_detail_toolbar_menu_items` | 🟢 PASSED | 0.00s | Passed |
| 257 | Destination Detail | `test_destination_detail_edit_navigation` | 🟢 PASSED | 0.00s | Passed |
| 258 | Destination Detail | `test_destination_detail_delete_navigation` | 🟢 PASSED | 0.00s | Passed |
| 259 | Destination Detail | `test_destination_detail_delete_confirmation_dialog` | 🟢 PASSED | 0.00s | Passed |
| 260 | Destination Detail | `test_destination_detail_map_marker_rendered` | 🟢 PASSED | 0.00s | Passed |
| 261 | Destination Detail | `test_destination_detail_contact_name_rendered` | 🟢 PASSED | 0.00s | Passed |
| 262 | Destination Detail | `test_destination_detail_contact_phone_call_action` | 🟢 PASSED | 0.00s | Passed |
| 263 | Destination Detail | `test_destination_detail_contact_sms_action` | 🟢 PASSED | 0.00s | Passed |
| 264 | Destination Detail | `test_destination_detail_tracking_toggle_state` | 🟢 PASSED | 0.00s | Passed |
| 265 | Destination Detail | `test_destination_detail_location_permissions_warning` | 🟢 PASSED | 0.00s | Passed |
| 266 | Destination Detail | `test_destination_detail_low_battery_warning_message` | 🟢 PASSED | 0.00s | Passed |
| 267 | Destination Detail | `test_destination_detail_screen_dim_prevention` | 🟢 PASSED | 0.00s | Passed |
| 268 | Destination Detail | `test_destination_detail_compass_bearing_arrow_rotates` | 🟢 PASSED | 0.00s | Passed |
| 269 | Destination Detail | `test_destination_detail_miles_kilometers_conversion` | 🟢 PASSED | 0.00s | Passed |
| 270 | Destination Detail | `test_destination_detail_static_map_fallback_loads` | 🟢 PASSED | 0.00s | Passed |
| 271 | Destination Detail | `test_destination_detail_event_bus_unsubscribe_on_stop` | 🟢 PASSED | 0.00s | Passed |
| 272 | Destination Detail | `test_destination_detail_alarm_distance_display_color` | 🟢 PASSED | 0.00s | Passed |
| 273 | Destination Detail | `test_destination_detail_voice_navigation_toggle` | 🟢 PASSED | 0.00s | Passed |
| 274 | Destination Detail | `test_destination_detail_speedometer_card_present` | 🟢 PASSED | 0.00s | Passed |
| 275 | Destination Detail | `test_destination_detail_historical_visit_count` | 🟢 PASSED | 0.00s | Passed |
| 276 | Destination Detail | `test_destination_detail_share_location_link_button` | 🟢 PASSED | 0.00s | Passed |
| 277 | Destination Detail | `test_destination_detail_open_in_external_google_maps` | 🟢 PASSED | 0.00s | Passed |
| 278 | Destination Detail | `test_destination_detail_traffic_delay_warning` | 🟢 PASSED | 0.00s | Passed |
| 279 | Destination Detail | `test_destination_detail_favorite_star_icon_toggle` | 🟢 PASSED | 0.00s | Passed |
| 280 | Destination Detail | `test_destination_detail_bottom_sheet_drag_behavior` | 🟢 PASSED | 0.00s | Passed |
| 281 | Proximity Alarm | `test_foreground_service_notification_actions` | 🟢 PASSED | 0.00s | Passed |
| 282 | Proximity Alarm | `test_foreground_service_battery_optimization_ignored` | 🟢 PASSED | 0.00s | Passed |
| 283 | Proximity Alarm | `test_foreground_service_persists_on_process_kill` | 🟢 PASSED | 0.00s | Passed |
| 284 | Proximity Alarm | `test_foreground_service_restarts_on_boot_completed` | 🟢 PASSED | 0.00s | Passed |
| 285 | Proximity Alarm | `test_proximity_alarm_custom_radius_alert` | 🟢 PASSED | 0.00s | Passed |
| 286 | Proximity Alarm | `test_proximity_alarm_audio_focus_request` | 🟢 PASSED | 0.00s | Passed |
| 287 | Proximity Alarm | `test_proximity_alarm_vibration_patterns_triggered` | 🟢 PASSED | 0.00s | Passed |
| 288 | Proximity Alarm | `test_proximity_alarm_text_to_speech_triggered` | 🟢 PASSED | 0.00s | Passed |
| 289 | Proximity Alarm | `test_proximity_alarm_sms_retry_on_network_loss` | 🟢 PASSED | 0.00s | Passed |
| 290 | Proximity Alarm | `test_proximity_alarm_sms_length_limits_compliant` | 🟢 PASSED | 0.00s | Passed |
| 291 | Proximity Alarm | `test_proximity_alarm_sms_contains_google_maps_url` | 🟢 PASSED | 0.00s | Passed |
| 292 | Proximity Alarm | `test_proximity_alarm_screen_wakelock_acquired` | 🟢 PASSED | 0.00s | Passed |
| 293 | Proximity Alarm | `test_proximity_alarm_screen_unlocks_keyguard` | 🟢 PASSED | 0.00s | Passed |
| 294 | Proximity Alarm | `test_proximity_alarm_dismissal_triggers_stop_service` | 🟢 PASSED | 0.00s | Passed |
| 295 | Proximity Alarm | `test_proximity_alarm_snooze_button_works` | 🟢 PASSED | 0.00s | Passed |
| 296 | Proximity Alarm | `test_proximity_alarm_snooze_reschedules_service` | 🟢 PASSED | 0.00s | Passed |
| 297 | Proximity Alarm | `test_proximity_alarm_gps_signal_lost_notification` | 🟢 PASSED | 0.00s | Passed |
| 298 | Proximity Alarm | `test_proximity_alarm_gps_signal_regained_recovery` | 🟢 PASSED | 0.00s | Passed |
| 299 | Proximity Alarm | `test_proximity_alarm_cell_tower_fallback_location` | 🟢 PASSED | 0.00s | Passed |
| 300 | Proximity Alarm | `test_proximity_alarm_wifi_location_provider_fallback` | 🟢 PASSED | 0.00s | Passed |
| 301 | Proximity Alarm | `test_proximity_alarm_run_duration_leak_check` | 🟢 PASSED | 0.00s | Passed |
| 302 | Proximity Alarm | `test_proximity_alarm_notifications_grouped` | 🟢 PASSED | 0.00s | Passed |
| 303 | Proximity Alarm | `test_proximity_alarm_service_stops_when_app_logged_out` | 🟢 PASSED | 0.00s | Passed |
| 304 | Proximity Alarm | `test_proximity_alarm_multiple_active_destinations` | 🟢 PASSED | 0.00s | Passed |
| 305 | Proximity Alarm | `test_proximity_alarm_closest_destination_selected` | 🟢 PASSED | 0.00s | Passed |
| 306 | Alarm Screen | `test_alarm_screen_volume_override_to_max` | 🟢 PASSED | 0.00s | Passed |
| 307 | Alarm Screen | `test_alarm_screen_mute_physical_buttons_disabled` | 🟢 PASSED | 0.00s | Passed |
| 308 | Alarm Screen | `test_alarm_screen_keep_screen_on_enabled` | 🟢 PASSED | 0.00s | Passed |
| 309 | Alarm Screen | `test_alarm_screen_landscape_orientation_fit` | 🟢 PASSED | 0.00s | Passed |
| 310 | Alarm Screen | `test_alarm_screen_dismiss_button_animations` | 🟢 PASSED | 0.00s | Passed |
| 311 | Alarm Screen | `test_alarm_screen_emergency_sos_shortcut_button` | 🟢 PASSED | 0.00s | Passed |
| 312 | Alarm Screen | `test_alarm_screen_accessibility_talkback_dismiss_label` | 🟢 PASSED | 0.00s | Passed |
| 313 | Alarm Screen | `test_alarm_screen_media_player_exception_fallback` | 🟢 PASSED | 0.00s | Passed |
| 314 | Alarm Screen | `test_alarm_screen_plays_even_in_silent_mode` | 🟢 PASSED | 0.00s | Passed |
| 315 | Alarm Screen | `test_alarm_screen_plays_even_in_do_not_disturb_mode` | 🟢 PASSED | 0.00s | Passed |
| 316 | Alarm Screen | `test_alarm_screen_back_button_disabled` | 🟢 PASSED | 0.00s | Passed |
| 317 | Alarm Screen | `test_alarm_screen_recent_apps_button_disabled` | 🟢 PASSED | 0.00s | Passed |
| 318 | Alarm Screen | `test_alarm_screen_overlay_permission_granted_check` | 🟢 PASSED | 0.00s | Passed |
| 319 | Alarm Screen | `test_alarm_screen_dismiss_sends_broadcast_to_stop_service` | 🟢 PASSED | 0.00s | Passed |
| 320 | Alarm Screen | `test_alarm_screen_dismiss_updates_destination_state` | 🟢 PASSED | 0.00s | Passed |
| 321 | Alarm Screen | `test_alarm_screen_dismiss_inserts_trip_record` | 🟢 PASSED | 0.00s | Passed |
| 322 | Alarm Screen | `test_alarm_screen_background_notification_clicks` | 🟢 PASSED | 0.00s | Passed |
| 323 | Alarm Screen | `test_alarm_screen_multi_window_mode_unsupported` | 🟢 PASSED | 0.00s | Passed |
| 324 | Alarm Screen | `test_alarm_screen_ui_flashing_colors_active` | 🟢 PASSED | 0.00s | Passed |
| 325 | Alarm Screen | `test_alarm_screen_vibration_stops_on_dismiss` | 🟢 PASSED | 0.00s | Passed |
| 326 | Alarm Screen | `test_alarm_screen_gif_stops_on_dismiss` | 🟢 PASSED | 0.00s | Passed |
| 327 | Alarm Screen | `test_alarm_screen_locks_orientation_to_portrait` | 🟢 PASSED | 0.00s | Passed |
| 328 | Alarm Screen | `test_alarm_screen_audio_attributes_alarm_usage` | 🟢 PASSED | 0.00s | Passed |
| 329 | Alarm Screen | `test_alarm_screen_ringtone_resource_not_null` | 🟢 PASSED | 0.00s | Passed |
| 330 | Alarm Screen | `test_alarm_screen_ringtone_manager_uri_fallbacks` | 🟢 PASSED | 0.00s | Passed |
| 331 | Alarm Screen | `test_alarm_screen_sound_stops_after_5_minutes_timeout` | 🟢 PASSED | 0.00s | Passed |
| 332 | Alarm Screen | `test_alarm_screen_timeout_triggers_auto_dismiss` | 🟢 PASSED | 0.00s | Passed |
| 333 | Alarm Screen | `test_alarm_screen_notification_sound_muted_during_call` | 🟢 PASSED | 0.00s | Passed |
| 334 | Alarm Screen | `test_alarm_screen_low_battery_power_save_mode` | 🟢 PASSED | 0.00s | Passed |
| 335 | Alarm Screen | `test_alarm_screen_dark_theme_contrast_checked` | 🟢 PASSED | 0.00s | Passed |
| 336 | Emergency SOS | `test_emergency_sos_button_color_red` | 🟢 PASSED | 0.00s | Passed |
| 337 | Emergency SOS | `test_emergency_sos_requires_sms_permission` | 🟢 PASSED | 0.00s | Passed |
| 338 | Emergency SOS | `test_emergency_sos_requires_location_permission` | 🟢 PASSED | 0.00s | Passed |
| 339 | Emergency SOS | `test_emergency_sos_shows_permission_denial_prompt` | 🟢 PASSED | 0.00s | Passed |
| 340 | Emergency SOS | `test_emergency_sos_sms_recipient_phone_numbers` | 🟢 PASSED | 0.00s | Passed |
| 341 | Emergency SOS | `test_emergency_sos_sms_character_counter_under_160` | 🟢 PASSED | 0.00s | Passed |
| 342 | Emergency SOS | `test_emergency_sos_sms_contains_correct_coordinates` | 🟢 PASSED | 0.00s | Passed |
| 343 | Emergency SOS | `test_emergency_sos_sms_includes_battery_level` | 🟢 PASSED | 0.00s | Passed |
| 344 | Emergency SOS | `test_emergency_sos_sms_send_status_callback_registered` | 🟢 PASSED | 0.00s | Passed |
| 345 | Emergency SOS | `test_emergency_sos_sms_delivery_status_callback_registered` | 🟢 PASSED | 0.00s | Passed |
| 346 | Emergency SOS | `test_emergency_sos_continuous_tracking_interval_2_min` | 🟢 PASSED | 0.00s | Passed |
| 347 | Emergency SOS | `test_emergency_sos_continuous_tracking_distance_10_meters` | 🟢 PASSED | 0.00s | Passed |
| 348 | Emergency SOS | `test_emergency_sos_cancelling_stops_foreground_service` | 🟢 PASSED | 0.00s | Passed |
| 349 | Emergency SOS | `test_emergency_sos_notification_actions_stop_sos` | 🟢 PASSED | 0.00s | Passed |
| 350 | Emergency SOS | `test_emergency_sos_shake_sensor_sensitivity_slider` | 🟢 PASSED | 0.00s | Passed |
| 351 | Emergency SOS | `test_emergency_sos_shake_sensor_registered_in_background` | 🟢 PASSED | 0.00s | Passed |
| 352 | Emergency SOS | `test_emergency_sos_shake_sensor_unregistered_on_manual_stop` | 🟢 PASSED | 0.00s | Passed |
| 353 | Emergency SOS | `test_emergency_sos_vibrate_on_shake_detected` | 🟢 PASSED | 0.00s | Passed |
| 354 | Emergency SOS | `test_emergency_sos_countdown_dialog_5_seconds` | 🟢 PASSED | 0.00s | Passed |
| 355 | Emergency SOS | `test_emergency_sos_countdown_dialog_cancel_button` | 🟢 PASSED | 0.00s | Passed |
| 356 | Emergency SOS | `test_emergency_sos_countdown_sound_beeps` | 🟢 PASSED | 0.00s | Passed |
| 357 | Emergency SOS | `test_emergency_sos_dialog_cannot_be_dismissed_by_outside_touch` | 🟢 PASSED | 0.00s | Passed |
| 358 | Emergency SOS | `test_emergency_sos_flow_starts_even_when_phone_locked` | 🟢 PASSED | 0.00s | Passed |
| 359 | Emergency SOS | `test_emergency_sos_uses_fused_location_provider_high_accuracy` | 🟢 PASSED | 0.00s | Passed |
| 360 | Emergency SOS | `test_emergency_sos_gps_disabled_network_fallback` | 🟢 PASSED | 0.00s | Passed |
| 361 | Emergency SOS | `test_emergency_sos_alert_dialog_theme` | 🟢 PASSED | 0.00s | Passed |
| 362 | Emergency SOS | `test_emergency_sos_sms_sent_success_toast` | 🟢 PASSED | 0.00s | Passed |
| 363 | Emergency SOS | `test_emergency_sos_sms_sent_failure_alert` | 🟢 PASSED | 0.00s | Passed |
| 364 | Emergency SOS | `test_emergency_sos_database_log_saved` | 🟢 PASSED | 0.00s | Passed |
| 365 | Emergency SOS | `test_emergency_sos_battery_drain_negligible` | 🟢 PASSED | 0.00s | Passed |
| 366 | Trip History | `test_trip_history_empty_state_text_visible` | 🟢 PASSED | 0.00s | Passed |
| 367 | Trip History | `test_trip_history_room_database_version_check` | 🟢 PASSED | 0.00s | Passed |
| 368 | Trip History | `test_trip_history_dao_query_ordered_by_timestamp_desc` | 🟢 PASSED | 0.00s | Passed |
| 369 | Trip History | `test_trip_history_item_click_opens_detail` | 🟢 PASSED | 0.00s | Passed |
| 370 | Trip History | `test_trip_history_swipe_to_delete_trip_item` | 🟢 PASSED | 0.00s | Passed |
| 371 | Trip History | `test_trip_history_undo_delete_snackbar_works` | 🟢 PASSED | 0.00s | Passed |
| 372 | Trip History | `test_trip_history_clear_all_confirmation_dialog` | 🟢 PASSED | 0.00s | Passed |
| 373 | Trip History | `test_trip_history_clear_all_toast_message` | 🟢 PASSED | 0.00s | Passed |
| 374 | Trip History | `test_trip_history_export_to_csv_button` | 🟢 PASSED | 0.00s | Passed |
| 375 | Trip History | `test_trip_history_export_to_csv_creates_file` | 🟢 PASSED | 0.00s | Passed |
| 376 | Trip History | `test_trip_history_scroll_loads_next_page_pagination` | 🟢 PASSED | 0.00s | Passed |
| 377 | Trip History | `test_trip_history_search_by_destination_title` | 🟢 PASSED | 0.00s | Passed |
| 378 | Trip History | `test_trip_history_search_by_destination_address` | 🟢 PASSED | 0.00s | Passed |
| 379 | Trip History | `test_trip_history_average_speed_metric_calculated` | 🟢 PASSED | 0.00s | Passed |
| 380 | Trip History | `test_trip_history_max_speed_metric_calculated` | 🟢 PASSED | 0.00s | Passed |
| 381 | Trip History | `test_trip_history_total_trips_counter_matching` | 🟢 PASSED | 0.00s | Passed |
| 382 | Trip History | `test_trip_history_trip_item_long_click_selection` | 🟢 PASSED | 0.00s | Passed |
| 383 | Trip History | `test_trip_history_delete_multiple_selected_items` | 🟢 PASSED | 0.00s | Passed |
| 384 | Trip History | `test_trip_history_database_corrupted_backup_restore` | 🟢 PASSED | 0.00s | Passed |
| 385 | Trip History | `test_trip_history_database_migration_retains_data` | 🟢 PASSED | 0.00s | Passed |
| 386 | Trip History | `test_trip_history_trip_item_duration_format_hh_mm_ss` | 🟢 PASSED | 0.00s | Passed |
| 387 | Trip History | `test_trip_history_trip_item_distance_format_km` | 🟢 PASSED | 0.00s | Passed |
| 388 | Trip History | `test_trip_history_map_snapshot_renders_in_list` | 🟢 PASSED | 0.00s | Passed |
| 389 | Trip History | `test_trip_history_card_gradient_backgrounds` | 🟢 PASSED | 0.00s | Passed |
| 390 | Trip History | `test_trip_history_total_distance_card_updated` | 🟢 PASSED | 0.00s | Passed |
| 391 | Trip History | `test_trip_history_total_duration_card_updated` | 🟢 PASSED | 0.00s | Passed |
| 392 | Trip History | `test_trip_history_scroll_bar_touch_scroll` | 🟢 PASSED | 0.00s | Passed |
| 393 | Trip History | `test_trip_history_recycler_view_viewholder_reusable` | 🟢 PASSED | 0.00s | Passed |
| 394 | Trip History | `test_trip_history_share_trip_statistics` | 🟢 PASSED | 0.00s | Passed |
| 395 | Trip History | `test_trip_history_dark_mode_visibility_check` | 🟢 PASSED | 0.00s | Passed |

</details>

### ⚡ Website Load Test Performance Summary
- **Simulated Workload**: 100 Virtual Users (VUs) ramp-up over 60 seconds
- **Total HTTP Requests Sent**: 6,998
- **Successful Requests**: ✅ 6,998 (100.0% success rate)
- **Failed Requests**: ❌ 0
- **Average Throughput**: 116.63 RPS

<details><summary>Click to view Endpoint Performance breakdown</summary>

| Endpoint | Method | Total Requests | Successes | Failures | Min (ms) | Avg (ms) | Max (ms) |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| `GET /` | `GET` | 1049 | 1049 | 0 | 55ms | 123ms | 230ms |
| `POST /api/auth/register` | `POST` | 279 | 279 | 0 | 181ms | 272ms | 1467ms |
| `POST /api/auth/login` | `POST` | 559 | 559 | 0 | 173ms | 266ms | 969ms |
| `GET /api/destinations` | `GET` | 1539 | 1539 | 0 | 74ms | 137ms | 356ms |
| `POST /api/destinations` | `POST` | 419 | 419 | 0 | 109ms | 220ms | 643ms |
| `DELETE /api/destinations/:id` | `DELETE` | 209 | 209 | 0 | 99ms | 173ms | 512ms |
| `GET /api/trips` | `GET` | 1259 | 1259 | 0 | 58ms | 118ms | 434ms |
| `POST /api/trips` | `POST` | 349 | 349 | 0 | 112ms | 211ms | 656ms |
| `GET /api/emergency` | `GET` | 699 | 699 | 0 | 73ms | 101ms | 312ms |
| `POST /api/emergency` | `POST` | 279 | 279 | 0 | 110ms | 220ms | 637ms |
| `GET /api/config/maps-key` | `GET` | 358 | 358 | 0 | 49ms | 102ms | 344ms |

</details>

## 📦 Downloadable Test Report Artifacts
The full Excel spreadsheets (`.xlsx`) containing detailed worksheets (passed tests, failed tests, execution logs, and tracebacks) are uploaded as artifacts for this workflow run and can be downloaded from the **Artifacts** section at the top of the page.