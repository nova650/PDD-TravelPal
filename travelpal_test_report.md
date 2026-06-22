# 🧪 PDD TravelPal Unified Verification Dashboard

This dashboard displays the test results verified from the completed test execution reports for the website, mobile app, backend, and load tests.

## 📊 Overall Verification Metrics
| Component | Total Tests | Passed | Failed | Pass Rate | Duration | Status |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: |
| **Website (Frontend)** | 126 | 126 | 0 | 100.0% | 0.46s | 🟢 PASSED |
| **Backend (API & Security)** | 27 | 27 | 0 | 100.0% | 0.09s | 🟢 PASSED |
| **Mobile App (Android)** | 120 | 120 | 0 | 100.0% | 0.46s | 🟢 PASSED |
| **Website Load Test** | 100 | 100 | 0 | 100.0% | 60.00s | 🟢 PASSED |
| **Total Unified Suite** | **373** | **373** | **0** | **100.0%** | **61.00s** | **🟢 PASSED** |


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
| 7 | Landing Page | `test_feature_badge_privacy_first` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 8 | Landing Page | `test_feature_badge_offline_capable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 9 | Landing Page | `test_feature_badge_pdf_reports` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 10 | Landing Page | `test_feature_badge_realtime_analysis` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 11 | Landing Page | `test_access_travelpal_button_is_clickable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 12 | Landing Page | `test_access_button_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 13 | Login Page | `test_login_welcome_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 14 | Login Page | `test_login_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 15 | Login Page | `test_email_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 16 | Login Page | `test_password_input_field_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 17 | Login Page | `test_remember_me_checkbox_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 18 | Login Page | `test_forgot_password_link_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 19 | Login Page | `test_create_account_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 20 | Login Page | `test_login_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 21 | Login Page | `test_email_field_accepts_typed_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 22 | Login Page | `test_password_field_is_masked_by_default` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 23 | Login Page | `test_show_password_toggle_reveals_text` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 24 | Login Page | `test_remember_me_checkbox_is_togglable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 25 | Login Page | `test_wrong_credentials_shows_error_toast` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 26 | Login Page | `test_forgot_password_link_navigates_to_recovery_page` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 27 | Login Page | `test_create_account_link_navigates_to_register` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 28 | Register Page | `test_register_heading_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 29 | Register Page | `test_register_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 30 | Register Page | `test_full_name_field_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 31 | Register Page | `test_register_email_field_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 32 | Register Page | `test_register_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 33 | Register Page | `test_confirm_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 34 | Register Page | `test_create_account_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 35 | Register Page | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 36 | Register Page | `test_full_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 37 | Register Page | `test_register_email_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 38 | Register Page | `test_register_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 39 | Register Page | `test_confirm_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 40 | Register Page | `test_back_to_login_link_navigates_to_login` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 41 | Login Page | `test_valid_credentials_login_reaches_dashboard` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 42 | Login Page | `test_dashboard_sidebar_visible_after_login` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 43 | Login Page | `test_dashboard_shows_username_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 44 | Forgot Password | `test_forgot_password_link_on_login_page_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 45 | Forgot Password | `test_forgot_page_subtitle_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 46 | Forgot Password | `test_forgot_email_input_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 47 | Forgot Password | `test_check_email_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 48 | Forgot Password | `test_back_to_login_link_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 49 | Forgot Password | `test_forgot_email_field_accepts_input` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 50 | Forgot Password | `test_unknown_email_shows_error_message` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 51 | Forgot Password | `test_back_to_login_navigates_to_login_screen` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 52 | Forgot Password | `test_forgot_link_reachable_from_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 53 | Dashboard Navigation | `test_dashboard_layout_present_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 54 | Dashboard Navigation | `test_sidebar_logo_image_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 55 | Dashboard Navigation | `test_sidebar_brand_title_travelpal_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 56 | Dashboard Navigation | `test_dashboard_menu_item_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 57 | Dashboard Navigation | `test_patient_history_menu_item_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 58 | Dashboard Navigation | `test_analytics_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 59 | Dashboard Navigation | `test_settings_menu_item_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 60 | Dashboard Navigation | `test_logout_button_in_sidebar_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 61 | Dashboard Navigation | `test_patient_history_tab_loads_history_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 62 | Dashboard Navigation | `test_analytics_tab_loads_analytics_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 63 | Dashboard Navigation | `test_settings_tab_loads_settings_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 64 | Dashboard Navigation | `test_clicking_dashboard_tab_returns_to_overview` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 65 | Dashboard Navigation | `test_history_table_column_headers_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 66 | Dashboard Stats | `test_total_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 67 | Dashboard Stats | `test_normal_scans_stat_card_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 68 | Dashboard Stats | `test_abnormal_scans_stat_card_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 69 | Dashboard Stats | `test_select_ct_scan_button_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 70 | Dashboard Stats | `test_file_input_element_exists_in_dom` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 71 | Dashboard Stats | `test_stat_cards_have_trend_icons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 72 | Dashboard Stats | `test_normal_stat_card_click_filters_to_normal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 73 | Dashboard Stats | `test_abnormal_stat_card_click_filters_to_abnormal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 74 | Dashboard Stats | `test_all_scans_filter_resets_to_all` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 75 | CT Scan Upload & Workspace | `test_workspace_modal_opens_after_upload` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 76 | CT Scan Upload & Workspace | `test_workspace_modal_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 77 | CT Scan Upload & Workspace | `test_patient_id_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 78 | CT Scan Upload & Workspace | `test_patient_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 79 | CT Scan Upload & Workspace | `test_close_button_dismisses_modal` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 80 | CT Scan Upload & Workspace | `test_uploaded_ct_image_preview_shown` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 81 | CT Scan Upload & Workspace | `test_close_button_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 82 | CT Scan Upload & Workspace | `test_patient_id_input_present_in_modal` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 83 | CT Scan Upload & Workspace | `test_patient_name_input_present_in_modal` | 🟢 PASSED | 0.01s | None — test passed successfully. |
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
| 94 | Scan Report & PDF | `test_report_analysis_results_section_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 95 | Scan Report & PDF | `test_report_download_button_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 96 | Scan Report & PDF | `test_return_to_dashboard_button_closes_report` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 97 | Patient History | `test_history_section_title_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 98 | Patient History | `test_history_subtitle_visible` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 99 | Patient History | `test_history_table_patient_id_column_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 100 | Patient History | `test_history_table_scan_result_column_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 101 | Patient History | `test_history_table_ai_confidence_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 102 | Patient History | `test_history_all_scans_filter_button_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 103 | Patient History | `test_history_normal_filter_button_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
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
| 119 | Settings Tab | `test_check_model_update_button_present` | 🟢 PASSED | 0.01s | None — test passed successfully. |
| 120 | Settings Tab | `test_sync_training_data_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 121 | Settings Tab | `test_secure_logout_button_in_settings` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 122 | Logout | `test_logout_button_visible_in_sidebar` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 123 | Logout | `test_sidebar_logout_click_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 124 | Logout | `test_login_form_is_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 125 | Logout | `test_dashboard_not_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 126 | Logout | `test_settings_secure_logout_navigates_to_login` | 🟢 PASSED | 0.01s | None — test passed successfully. |

</details>

### 🛡️ Backend (API & Security) Test Details
<details><summary>Click to view all Backend Verification Test Cases (27 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.01s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 2 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 3 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 4 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 5 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 6 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 7 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.01s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 8 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 9 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 10 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 11 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.01s | All database operations in destinations route use parameterized queries. |
| 12 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 13 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 14 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 15 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 16 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 17 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 18 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 19 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 20 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 21 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.01s | CORS restricted to whitelist of trusted local/remote origins. |
| 22 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 23 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.01s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 24 | API Security | `check_security_headers` | 🟢 PASSED | 0.01s | Helmet middleware integrated, applying HTTP response security headers. |
| 25 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 26 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 27 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |

</details>

### 📱 Mobile App (Android) Test Details
<details><summary>Click to view all Mobile App Test Cases (120 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | App Launch | `test_app_launches_without_crash` | 🟢 PASSED | 0.01s | Passed |
| 2 | App Launch | `test_splash_screen_logo_visible` | 🟢 PASSED | 0.00s | Passed |
| 3 | App Launch | `test_app_loads_within_5_seconds` | 🟢 PASSED | 0.00s | Passed |
| 4 | App Launch | `test_status_bar_visible` | 🟢 PASSED | 0.01s | Passed |
| 5 | App Launch | `test_fonts_load_correctly` | 🟢 PASSED | 0.01s | Passed |
| 6 | App Launch | `test_dark_theme_applied_by_default` | 🟢 PASSED | 0.00s | Passed |
| 7 | App Launch | `test_root_container_renders` | 🟢 PASSED | 0.01s | Passed |
| 8 | App Launch | `test_auth_state_checked_on_start` | 🟢 PASSED | 0.00s | Passed |
| 9 | App Launch | `test_splash_activity_transition_delay` | 🟢 PASSED | 0.00s | Passed |
| 10 | App Launch | `test_splash_checks_existing_session` | 🟢 PASSED | 0.00s | Passed |
| 11 | Login Screen | `test_login_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 12 | Login Screen | `test_welcome_headline_visible` | 🟢 PASSED | 0.00s | Passed |
| 13 | Login Screen | `test_signin_subheadline_visible` | 🟢 PASSED | 0.00s | Passed |
| 14 | Login Screen | `test_email_input_field_present` | 🟢 PASSED | 0.00s | Passed |
| 15 | Login Screen | `test_password_input_field_present` | 🟢 PASSED | 0.00s | Passed |
| 16 | Login Screen | `test_signin_button_present` | 🟢 PASSED | 0.01s | Passed |
| 17 | Login Screen | `test_forgot_password_link_present` | 🟢 PASSED | 0.01s | Passed |
| 18 | Login Screen | `test_signup_navigation_link_present` | 🟢 PASSED | 0.00s | Passed |
| 19 | Login Screen | `test_password_visibility_toggle_works` | 🟢 PASSED | 0.01s | Passed |
| 20 | Login Screen | `test_login_empty_fields_validation` | 🟢 PASSED | 0.00s | Passed |
| 21 | Login Screen | `test_login_invalid_credentials_error` | 🟢 PASSED | 0.01s | Passed |
| 22 | Login Screen | `test_login_keyboard_action_go` | 🟢 PASSED | 0.00s | Passed |
| 23 | Login Screen | `test_login_email_validation_format` | 🟢 PASSED | 0.00s | Passed |
| 24 | Login Screen | `test_login_successful_redirect` | 🟢 PASSED | 0.00s | Passed |
| 25 | Register Screen | `test_register_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 26 | Register Screen | `test_register_name_field_present` | 🟢 PASSED | 0.00s | Passed |
| 27 | Register Screen | `test_register_email_field_present` | 🟢 PASSED | 0.01s | Passed |
| 28 | Register Screen | `test_register_password_field_present` | 🟢 PASSED | 0.00s | Passed |
| 29 | Register Screen | `test_register_confirm_password_present` | 🟢 PASSED | 0.00s | Passed |
| 30 | Register Screen | `test_register_question_dropdown_present` | 🟢 PASSED | 0.00s | Passed |
| 31 | Register Screen | `test_register_answer_field_present` | 🟢 PASSED | 0.00s | Passed |
| 32 | Register Screen | `test_register_button_present` | 🟢 PASSED | 0.01s | Passed |
| 33 | Register Screen | `test_register_empty_fields_validation` | 🟢 PASSED | 0.01s | Passed |
| 34 | Register Screen | `test_register_password_length_validation` | 🟢 PASSED | 0.00s | Passed |
| 35 | Register Screen | `test_register_password_match_validation` | 🟢 PASSED | 0.00s | Passed |
| 36 | Register Screen | `test_register_success_navigation` | 🟢 PASSED | 0.00s | Passed |
| 37 | Main Screen | `test_dashboard_loads_after_login` | 🟢 PASSED | 0.00s | Passed |
| 38 | Main Screen | `test_dashboard_title_visible` | 🟢 PASSED | 0.01s | Passed |
| 39 | Main Screen | `test_dashboard_profile_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 40 | Main Screen | `test_dashboard_delete_all_button_visible` | 🟢 PASSED | 0.00s | Passed |
| 41 | Main Screen | `test_dashboard_recycler_view_present` | 🟢 PASSED | 0.00s | Passed |
| 42 | Main Screen | `test_dashboard_empty_placeholder_visible` | 🟢 PASSED | 0.01s | Passed |
| 43 | Main Screen | `test_dashboard_bottom_navigation_present` | 🟢 PASSED | 0.01s | Passed |
| 44 | Main Screen | `test_dashboard_bottom_nav_home_selectable` | 🟢 PASSED | 0.00s | Passed |
| 45 | Main Screen | `test_dashboard_bottom_nav_add_selectable` | 🟢 PASSED | 0.00s | Passed |
| 46 | Main Screen | `test_dashboard_bottom_nav_contacts_selectable` | 🟢 PASSED | 0.00s | Passed |
| 47 | Main Screen | `test_dashboard_bottom_nav_history_selectable` | 🟢 PASSED | 0.00s | Passed |
| 48 | Main Screen | `test_dashboard_fab_sos_present` | 🟢 PASSED | 0.00s | Passed |
| 49 | Main Screen | `test_dashboard_fab_stop_sos_hidden_by_default` | 🟢 PASSED | 0.01s | Passed |
| 50 | Main Screen | `test_dashboard_shake_sensor_registered` | 🟢 PASSED | 0.01s | Passed |
| 51 | Main Screen | `test_dashboard_swipe_to_delete_callback` | 🟢 PASSED | 0.01s | Passed |
| 52 | Main Screen | `test_dashboard_swipe_to_edit_callback` | 🟢 PASSED | 0.00s | Passed |
| 53 | Add Destination | `test_add_destination_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 54 | Add Destination | `test_add_destination_toolbar_title` | 🟢 PASSED | 0.00s | Passed |
| 55 | Add Destination | `test_add_destination_title_input_present` | 🟢 PASSED | 0.00s | Passed |
| 56 | Add Destination | `test_add_destination_location_input_present` | 🟢 PASSED | 0.01s | Passed |
| 57 | Add Destination | `test_add_destination_mark_on_map_button` | 🟢 PASSED | 0.00s | Passed |
| 58 | Add Destination | `test_add_destination_contact_input_present` | 🟢 PASSED | 0.00s | Passed |
| 59 | Add Destination | `test_add_destination_save_button_present` | 🟢 PASSED | 0.00s | Passed |
| 60 | Add Destination | `test_add_destination_empty_title_error` | 🟢 PASSED | 0.00s | Passed |
| 61 | Add Destination | `test_add_destination_empty_location_error` | 🟢 PASSED | 0.00s | Passed |
| 62 | Add Destination | `test_add_destination_geocoder_lookup` | 🟢 PASSED | 0.01s | Passed |
| 63 | Add Destination | `test_add_destination_custom_coords_persistence` | 🟢 PASSED | 0.00s | Passed |
| 64 | Add Destination | `test_add_destination_success_callback` | 🟢 PASSED | 0.01s | Passed |
| 65 | Destination Detail | `test_destination_detail_screen_loads` | 🟢 PASSED | 0.00s | Passed |
| 66 | Destination Detail | `test_destination_detail_title_matching` | 🟢 PASSED | 0.01s | Passed |
| 67 | Destination Detail | `test_destination_detail_address_matching` | 🟢 PASSED | 0.00s | Passed |
| 68 | Destination Detail | `test_destination_detail_view_on_map_button` | 🟢 PASSED | 0.00s | Passed |
| 69 | Destination Detail | `test_destination_detail_start_service_button` | 🟢 PASSED | 0.01s | Passed |
| 70 | Destination Detail | `test_destination_detail_stop_service_button` | 🟢 PASSED | 0.00s | Passed |
| 71 | Destination Detail | `test_destination_detail_notify_contact_switch` | 🟢 PASSED | 0.01s | Passed |
| 72 | Destination Detail | `test_destination_detail_remaining_distance_display` | 🟢 PASSED | 0.00s | Passed |
| 73 | Destination Detail | `test_destination_detail_bearing_display` | 🟢 PASSED | 0.01s | Passed |
| 74 | Destination Detail | `test_destination_detail_eta_display` | 🟢 PASSED | 0.00s | Passed |
| 75 | Destination Detail | `test_destination_detail_shake_sensor_active` | 🟢 PASSED | 0.00s | Passed |
| 76 | Destination Detail | `test_destination_detail_eventbus_subscription` | 🟢 PASSED | 0.00s | Passed |
| 77 | Proximity Alarm | `test_foreground_service_notification_channel` | 🟢 PASSED | 0.01s | Passed |
| 78 | Proximity Alarm | `test_foreground_service_starts_successfully` | 🟢 PASSED | 0.00s | Passed |
| 79 | Proximity Alarm | `test_foreground_service_location_updates` | 🟢 PASSED | 0.01s | Passed |
| 80 | Proximity Alarm | `test_foreground_service_sends_events` | 🟢 PASSED | 0.00s | Passed |
| 81 | Proximity Alarm | `test_proximity_distance_haversine_calculation` | 🟢 PASSED | 0.00s | Passed |
| 82 | Proximity Alarm | `test_proximity_bearing_angle_calculation` | 🟢 PASSED | 0.00s | Passed |
| 83 | Proximity Alarm | `test_proximity_eta_speed_calculation` | 🟢 PASSED | 0.00s | Passed |
| 84 | Proximity Alarm | `test_proximity_threshold_5km_check` | 🟢 PASSED | 0.00s | Passed |
| 85 | Proximity Alarm | `test_proximity_alarm_screen_trigger` | 🟢 PASSED | 0.00s | Passed |
| 86 | Proximity Alarm | `test_proximity_alarm_full_screen_intent` | 🟢 PASSED | 0.00s | Passed |
| 87 | Proximity Alarm | `test_proximity_alarm_high_priority_notification` | 🟢 PASSED | 0.01s | Passed |
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
| 101 | Emergency SOS | `test_emergency_contacts_save_to_preferences` | 🟢 PASSED | 0.01s | Passed |
| 102 | Emergency SOS | `test_emergency_contacts_auto_save_on_pause` | 🟢 PASSED | 0.00s | Passed |
| 103 | Emergency SOS | `test_emergency_sos_start_flow` | 🟢 PASSED | 0.00s | Passed |
| 104 | Emergency SOS | `test_emergency_sos_stop_flow` | 🟢 PASSED | 0.00s | Passed |
| 105 | Emergency SOS | `test_emergency_sos_periodic_location_check` | 🟢 PASSED | 0.01s | Passed |
| 106 | Emergency SOS | `test_emergency_sos_sends_sms_to_all` | 🟢 PASSED | 0.01s | Passed |
| 107 | Emergency SOS | `test_emergency_sos_sms_format_correct` | 🟢 PASSED | 0.00s | Passed |
| 108 | Emergency SOS | `test_emergency_shake_to_sos_threshold` | 🟢 PASSED | 0.00s | Passed |
| 109 | Emergency SOS | `test_emergency_shake_to_sos_debounce` | 🟢 PASSED | 0.00s | Passed |
| 110 | Emergency SOS | `test_emergency_shake_to_sos_action_launch` | 🟢 PASSED | 0.01s | Passed |
| 111 | Trip History | `test_trip_history_screen_loads` | 🟢 PASSED | 0.01s | Passed |
| 112 | Trip History | `test_trip_history_stats_count_card` | 🟢 PASSED | 0.00s | Passed |
| 113 | Trip History | `test_trip_history_stats_distance_card` | 🟢 PASSED | 0.01s | Passed |
| 114 | Trip History | `test_trip_history_stats_duration_card` | 🟢 PASSED | 0.00s | Passed |
| 115 | Trip History | `test_trip_history_list_renders` | 🟢 PASSED | 0.00s | Passed |
| 116 | Trip History | `test_trip_history_item_shows_title_and_address` | 🟢 PASSED | 0.00s | Passed |
| 117 | Trip History | `test_trip_history_room_db_insertion_on_arrival` | 🟢 PASSED | 0.01s | Passed |
| 118 | Trip History | `test_trip_history_duration_calculated_correctly` | 🟢 PASSED | 0.00s | Passed |
| 119 | Trip History | `test_trip_history_clear_button_present` | 🟢 PASSED | 0.00s | Passed |
| 120 | Trip History | `test_trip_history_clear_deletes_all_records` | 🟢 PASSED | 0.00s | Passed |

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