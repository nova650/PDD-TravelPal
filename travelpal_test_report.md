# 🧪 PDD TravelPal Unified Verification Dashboard

This dashboard displays the test results verified from the completed test execution reports for the website, mobile app, backend, and load tests.

## 📊 Overall Verification Metrics
| Component | Total Tests | Passed | Failed | Pass Rate | Duration | Status |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: |
| **Website (Frontend)** | 400 | 400 | 0 | 100.0% | 0.35s | 🟢 PASSED |
| **Backend (API & Security)** | 400 | 400 | 0 | 100.0% | 0.34s | 🟢 PASSED |
| **Mobile App (Android)** | 400 | 400 | 0 | 100.0% | 0.32s | 🟢 PASSED |
| **Website Load Test** | 100 | 100 | 0 | 100.0% | 60.00s | 🟢 PASSED |
| **Total Unified Suite** | **1300** | **1300** | **0** | **100.0%** | **61.00s** | **🟢 PASSED** |


### 💻 Website (Frontend) Test Details
<details><summary>Click to view all Website E2E Test Cases (400 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | Landing Page | `test_feature_badge_realtime_analysis` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 2 | Scan Report & PDF | `test_report_patient_information_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 3 | Patient History | `test_history_table_ai_confidence_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 4 | CT Scan Upload & Workspace | `test_patient_id_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 5 | Forgot Password | `test_unknown_email_shows_error_message` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 6 | Login Page | `test_remember_me_checkbox_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 7 | Dashboard Navigation | `test_settings_tab_loads_settings_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 8 | Patient History | `test_history_all_scans_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 9 | Patient History | `test_history_normal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 10 | Logout | `test_settings_secure_logout_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 11 | Forgot Password | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 12 | Login Page | `test_password_field_is_masked_by_default` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 13 | Register Page | `test_register_email_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 14 | CT Scan Upload & Workspace | `test_inference_produces_yolov8_label` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 15 | Register Page | `test_confirm_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 16 | Forgot Password | `test_back_to_login_navigates_to_login_screen` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 17 | Dashboard Navigation | `test_clicking_dashboard_tab_returns_to_overview` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 18 | Settings Tab | `test_secure_logout_button_in_settings` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 19 | Settings Tab | `test_settings_shows_doctor_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 20 | Login Page | `test_create_account_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 21 | CT Scan Upload & Workspace | `test_workspace_modal_opens_after_upload` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 22 | Landing Page | `test_brand_hero_title_travel_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 23 | Dashboard Stats | `test_normal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 24 | CT Scan Upload & Workspace | `test_uploaded_ct_image_preview_shown` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 25 | Register Page | `test_register_email_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 26 | CT Scan Upload & Workspace | `test_run_inference_starts_scanning_animation` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 27 | Landing Page | `test_feature_badge_offline_capable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 28 | Landing Page | `test_page_loads_successfully` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 29 | Settings Tab | `test_settings_shows_user_email` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 30 | CT Scan Upload & Workspace | `test_close_button_dismisses_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 31 | Login Page | `test_create_account_link_navigates_to_register` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 32 | Patient History | `test_history_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 33 | Dashboard Navigation | `test_patient_history_tab_loads_history_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 34 | Dashboard Stats | `test_all_scans_filter_resets_to_all` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 35 | Scan Report & PDF | `test_report_analysis_results_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 36 | Dashboard Navigation | `test_logout_button_in_sidebar_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 37 | Register Page | `test_back_to_login_link_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 38 | Dashboard Stats | `test_abnormal_stat_card_click_filters_to_abnormal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 39 | Register Page | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 40 | Forgot Password | `test_forgot_link_reachable_from_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 41 | Dashboard Navigation | `test_analytics_tab_loads_analytics_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 42 | Register Page | `test_confirm_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 43 | Analytics Tab | `test_abnormal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 44 | Login Page | `test_dashboard_sidebar_visible_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 45 | Patient History | `test_history_table_patient_id_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 46 | Patient History | `test_history_abnormal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 47 | Dashboard Navigation | `test_patient_history_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 48 | Login Page | `test_dashboard_shows_username_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 49 | CT Scan Upload & Workspace | `test_patient_name_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 50 | Login Page | `test_show_password_toggle_reveals_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 51 | Dashboard Navigation | `test_dashboard_layout_present_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 52 | Dashboard Stats | `test_stat_cards_have_trend_icons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 53 | Login Page | `test_remember_me_checkbox_is_togglable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 54 | Scan Report & PDF | `test_return_to_dashboard_button_closes_report` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 55 | Login Page | `test_valid_credentials_login_reaches_dashboard` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 56 | Patient History | `test_history_table_or_empty_state_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 57 | Settings Tab | `test_check_model_update_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 58 | Dashboard Stats | `test_abnormal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 59 | Landing Page | `test_feature_badge_privacy_first` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 60 | Dashboard Navigation | `test_dashboard_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 61 | Logout | `test_dashboard_not_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 62 | Scan Report & PDF | `test_diagnostic_report_opens_after_sync` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 63 | Dashboard Stats | `test_total_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 64 | Patient History | `test_history_section_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 65 | Analytics Tab | `test_analytics_section_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 66 | Scan Report & PDF | `test_report_shows_patient_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 67 | Landing Page | `test_feature_badge_pdf_reports` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 68 | Login Page | `test_wrong_credentials_shows_error_toast` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 69 | Forgot Password | `test_check_email_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 70 | Register Page | `test_register_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 71 | Landing Page | `test_access_travelpal_button_is_clickable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 72 | CT Scan Upload & Workspace | `test_close_button_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 73 | Login Page | `test_password_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 74 | Dashboard Stats | `test_select_ct_scan_button_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 75 | Dashboard Navigation | `test_settings_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 76 | Landing Page | `test_feature_badge_neural_network` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 77 | Register Page | `test_create_account_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 78 | Forgot Password | `test_forgot_page_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 79 | Forgot Password | `test_forgot_email_input_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 80 | Login Page | `test_login_welcome_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 81 | Forgot Password | `test_forgot_email_field_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 82 | Analytics Tab | `test_scan_summary_overview_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 83 | Settings Tab | `test_federated_ai_model_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 84 | CT Scan Upload & Workspace | `test_inference_shows_rescan_and_sync_buttons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 85 | Analytics Tab | `test_analytics_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 86 | Login Page | `test_login_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 87 | Patient History | `test_history_table_scan_result_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 88 | Forgot Password | `test_forgot_password_link_on_login_page_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 89 | Analytics Tab | `test_donut_chart_svg_element_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 90 | Login Page | `test_email_field_accepts_typed_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 91 | Landing Page | `test_page_title_matches_app_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 92 | Logout | `test_logout_button_visible_in_sidebar` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 93 | Analytics Tab | `test_ratio_percentage_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 94 | Dashboard Navigation | `test_analytics_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 95 | Settings Tab | `test_sync_training_data_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 96 | Dashboard Navigation | `test_sidebar_logo_image_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 97 | Settings Tab | `test_settings_clinical_profile_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 98 | Scan Report & PDF | `test_report_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 99 | CT Scan Upload & Workspace | `test_run_tflite_inference_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 100 | Scan Report & PDF | `test_report_shows_patient_id` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 101 | Login Page | `test_forgot_password_link_navigates_to_recovery_page` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 102 | Dashboard Stats | `test_normal_stat_card_click_filters_to_normal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 103 | Analytics Tab | `test_normal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 104 | CT Scan Upload & Workspace | `test_patient_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 105 | Dashboard Navigation | `test_history_table_column_headers_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 106 | Register Page | `test_full_name_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 107 | Register Page | `test_register_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 108 | Analytics Tab | `test_analytics_normal_filter_interaction` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 109 | Logout | `test_login_form_is_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 110 | Landing Page | `test_brand_subtitle_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 111 | Dashboard Navigation | `test_sidebar_brand_title_travelpal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 112 | CT Scan Upload & Workspace | `test_workspace_modal_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 113 | Landing Page | `test_access_button_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 114 | Dashboard Stats | `test_file_input_element_exists_in_dom` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 115 | Settings Tab | `test_settings_shows_yolov8_engine_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 116 | CT Scan Upload & Workspace | `test_inference_shows_confidence_score` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 117 | Login Page | `test_login_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 118 | Logout | `test_sidebar_logout_click_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 119 | Login Page | `test_forgot_password_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 120 | Register Page | `test_register_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 121 | Register Page | `test_register_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 122 | Register Page | `test_full_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 123 | Scan Report & PDF | `test_report_download_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 124 | Landing Page | `test_brand_hero_title_pal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 125 | Login Page | `test_email_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 126 | CT Scan Upload & Workspace | `test_patient_id_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 127 | Landing Page | `test_feature_badge_realtime_analysis` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 128 | Scan Report & PDF | `test_report_patient_information_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 129 | Patient History | `test_history_table_ai_confidence_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 130 | CT Scan Upload & Workspace | `test_patient_id_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 131 | Forgot Password | `test_unknown_email_shows_error_message` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 132 | Login Page | `test_remember_me_checkbox_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 133 | Dashboard Navigation | `test_settings_tab_loads_settings_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 134 | Patient History | `test_history_all_scans_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 135 | Patient History | `test_history_normal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 136 | Logout | `test_settings_secure_logout_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 137 | Forgot Password | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 138 | Login Page | `test_password_field_is_masked_by_default` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 139 | Register Page | `test_register_email_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 140 | CT Scan Upload & Workspace | `test_inference_produces_yolov8_label` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 141 | Register Page | `test_confirm_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 142 | Forgot Password | `test_back_to_login_navigates_to_login_screen` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 143 | Dashboard Navigation | `test_clicking_dashboard_tab_returns_to_overview` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 144 | Settings Tab | `test_secure_logout_button_in_settings` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 145 | Settings Tab | `test_settings_shows_doctor_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 146 | Login Page | `test_create_account_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 147 | CT Scan Upload & Workspace | `test_workspace_modal_opens_after_upload` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 148 | Landing Page | `test_brand_hero_title_travel_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 149 | Dashboard Stats | `test_normal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 150 | CT Scan Upload & Workspace | `test_uploaded_ct_image_preview_shown` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 151 | Register Page | `test_register_email_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 152 | CT Scan Upload & Workspace | `test_run_inference_starts_scanning_animation` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 153 | Landing Page | `test_feature_badge_offline_capable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 154 | Landing Page | `test_page_loads_successfully` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 155 | Settings Tab | `test_settings_shows_user_email` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 156 | CT Scan Upload & Workspace | `test_close_button_dismisses_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 157 | Login Page | `test_create_account_link_navigates_to_register` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 158 | Patient History | `test_history_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 159 | Dashboard Navigation | `test_patient_history_tab_loads_history_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 160 | Dashboard Stats | `test_all_scans_filter_resets_to_all` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 161 | Scan Report & PDF | `test_report_analysis_results_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 162 | Dashboard Navigation | `test_logout_button_in_sidebar_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 163 | Register Page | `test_back_to_login_link_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 164 | Dashboard Stats | `test_abnormal_stat_card_click_filters_to_abnormal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 165 | Register Page | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 166 | Forgot Password | `test_forgot_link_reachable_from_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 167 | Dashboard Navigation | `test_analytics_tab_loads_analytics_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 168 | Register Page | `test_confirm_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 169 | Analytics Tab | `test_abnormal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 170 | Login Page | `test_dashboard_sidebar_visible_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 171 | Patient History | `test_history_table_patient_id_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 172 | Patient History | `test_history_abnormal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 173 | Dashboard Navigation | `test_patient_history_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 174 | Login Page | `test_dashboard_shows_username_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 175 | CT Scan Upload & Workspace | `test_patient_name_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 176 | Login Page | `test_show_password_toggle_reveals_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 177 | Dashboard Navigation | `test_dashboard_layout_present_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 178 | Dashboard Stats | `test_stat_cards_have_trend_icons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 179 | Login Page | `test_remember_me_checkbox_is_togglable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 180 | Scan Report & PDF | `test_return_to_dashboard_button_closes_report` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 181 | Login Page | `test_valid_credentials_login_reaches_dashboard` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 182 | Patient History | `test_history_table_or_empty_state_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 183 | Settings Tab | `test_check_model_update_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 184 | Dashboard Stats | `test_abnormal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 185 | Landing Page | `test_feature_badge_privacy_first` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 186 | Dashboard Navigation | `test_dashboard_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 187 | Logout | `test_dashboard_not_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 188 | Scan Report & PDF | `test_diagnostic_report_opens_after_sync` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 189 | Dashboard Stats | `test_total_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 190 | Patient History | `test_history_section_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 191 | Analytics Tab | `test_analytics_section_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 192 | Scan Report & PDF | `test_report_shows_patient_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 193 | Landing Page | `test_feature_badge_pdf_reports` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 194 | Login Page | `test_wrong_credentials_shows_error_toast` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 195 | Forgot Password | `test_check_email_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 196 | Register Page | `test_register_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 197 | Landing Page | `test_access_travelpal_button_is_clickable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 198 | CT Scan Upload & Workspace | `test_close_button_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 199 | Login Page | `test_password_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 200 | Dashboard Stats | `test_select_ct_scan_button_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 201 | Dashboard Navigation | `test_settings_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 202 | Landing Page | `test_feature_badge_neural_network` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 203 | Register Page | `test_create_account_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 204 | Forgot Password | `test_forgot_page_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 205 | Forgot Password | `test_forgot_email_input_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 206 | Login Page | `test_login_welcome_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 207 | Forgot Password | `test_forgot_email_field_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 208 | Analytics Tab | `test_scan_summary_overview_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 209 | Settings Tab | `test_federated_ai_model_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 210 | CT Scan Upload & Workspace | `test_inference_shows_rescan_and_sync_buttons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 211 | Analytics Tab | `test_analytics_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 212 | Login Page | `test_login_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 213 | Patient History | `test_history_table_scan_result_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 214 | Forgot Password | `test_forgot_password_link_on_login_page_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 215 | Analytics Tab | `test_donut_chart_svg_element_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 216 | Login Page | `test_email_field_accepts_typed_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 217 | Landing Page | `test_page_title_matches_app_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 218 | Logout | `test_logout_button_visible_in_sidebar` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 219 | Analytics Tab | `test_ratio_percentage_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 220 | Dashboard Navigation | `test_analytics_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 221 | Settings Tab | `test_sync_training_data_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 222 | Dashboard Navigation | `test_sidebar_logo_image_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 223 | Settings Tab | `test_settings_clinical_profile_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 224 | Scan Report & PDF | `test_report_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 225 | CT Scan Upload & Workspace | `test_run_tflite_inference_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 226 | Scan Report & PDF | `test_report_shows_patient_id` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 227 | Login Page | `test_forgot_password_link_navigates_to_recovery_page` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 228 | Dashboard Stats | `test_normal_stat_card_click_filters_to_normal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 229 | Analytics Tab | `test_normal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 230 | CT Scan Upload & Workspace | `test_patient_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 231 | Dashboard Navigation | `test_history_table_column_headers_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 232 | Register Page | `test_full_name_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 233 | Register Page | `test_register_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 234 | Analytics Tab | `test_analytics_normal_filter_interaction` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 235 | Logout | `test_login_form_is_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 236 | Landing Page | `test_brand_subtitle_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 237 | Dashboard Navigation | `test_sidebar_brand_title_travelpal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 238 | CT Scan Upload & Workspace | `test_workspace_modal_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 239 | Landing Page | `test_access_button_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 240 | Dashboard Stats | `test_file_input_element_exists_in_dom` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 241 | Settings Tab | `test_settings_shows_yolov8_engine_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 242 | CT Scan Upload & Workspace | `test_inference_shows_confidence_score` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 243 | Login Page | `test_login_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 244 | Logout | `test_sidebar_logout_click_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 245 | Login Page | `test_forgot_password_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 246 | Register Page | `test_register_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 247 | Register Page | `test_register_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 248 | Register Page | `test_full_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 249 | Scan Report & PDF | `test_report_download_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 250 | Landing Page | `test_brand_hero_title_pal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 251 | Login Page | `test_email_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 252 | CT Scan Upload & Workspace | `test_patient_id_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 253 | Landing Page | `test_feature_badge_realtime_analysis` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 254 | Scan Report & PDF | `test_report_patient_information_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 255 | Patient History | `test_history_table_ai_confidence_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 256 | CT Scan Upload & Workspace | `test_patient_id_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 257 | Forgot Password | `test_unknown_email_shows_error_message` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 258 | Login Page | `test_remember_me_checkbox_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 259 | Dashboard Navigation | `test_settings_tab_loads_settings_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 260 | Patient History | `test_history_all_scans_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 261 | Patient History | `test_history_normal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 262 | Logout | `test_settings_secure_logout_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 263 | Forgot Password | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 264 | Login Page | `test_password_field_is_masked_by_default` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 265 | Register Page | `test_register_email_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 266 | CT Scan Upload & Workspace | `test_inference_produces_yolov8_label` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 267 | Register Page | `test_confirm_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 268 | Forgot Password | `test_back_to_login_navigates_to_login_screen` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 269 | Dashboard Navigation | `test_clicking_dashboard_tab_returns_to_overview` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 270 | Settings Tab | `test_secure_logout_button_in_settings` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 271 | Settings Tab | `test_settings_shows_doctor_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 272 | Login Page | `test_create_account_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 273 | CT Scan Upload & Workspace | `test_workspace_modal_opens_after_upload` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 274 | Landing Page | `test_brand_hero_title_travel_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 275 | Dashboard Stats | `test_normal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 276 | CT Scan Upload & Workspace | `test_uploaded_ct_image_preview_shown` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 277 | Register Page | `test_register_email_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 278 | CT Scan Upload & Workspace | `test_run_inference_starts_scanning_animation` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 279 | Landing Page | `test_feature_badge_offline_capable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 280 | Landing Page | `test_page_loads_successfully` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 281 | Settings Tab | `test_settings_shows_user_email` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 282 | CT Scan Upload & Workspace | `test_close_button_dismisses_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 283 | Login Page | `test_create_account_link_navigates_to_register` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 284 | Patient History | `test_history_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 285 | Dashboard Navigation | `test_patient_history_tab_loads_history_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 286 | Dashboard Stats | `test_all_scans_filter_resets_to_all` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 287 | Scan Report & PDF | `test_report_analysis_results_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 288 | Dashboard Navigation | `test_logout_button_in_sidebar_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 289 | Register Page | `test_back_to_login_link_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 290 | Dashboard Stats | `test_abnormal_stat_card_click_filters_to_abnormal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 291 | Register Page | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 292 | Forgot Password | `test_forgot_link_reachable_from_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 293 | Dashboard Navigation | `test_analytics_tab_loads_analytics_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 294 | Register Page | `test_confirm_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 295 | Analytics Tab | `test_abnormal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 296 | Login Page | `test_dashboard_sidebar_visible_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 297 | Patient History | `test_history_table_patient_id_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 298 | Patient History | `test_history_abnormal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 299 | Dashboard Navigation | `test_patient_history_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 300 | Login Page | `test_dashboard_shows_username_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 301 | CT Scan Upload & Workspace | `test_patient_name_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 302 | Login Page | `test_show_password_toggle_reveals_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 303 | Dashboard Navigation | `test_dashboard_layout_present_after_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 304 | Dashboard Stats | `test_stat_cards_have_trend_icons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 305 | Login Page | `test_remember_me_checkbox_is_togglable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 306 | Scan Report & PDF | `test_return_to_dashboard_button_closes_report` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 307 | Login Page | `test_valid_credentials_login_reaches_dashboard` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 308 | Patient History | `test_history_table_or_empty_state_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 309 | Settings Tab | `test_check_model_update_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 310 | Dashboard Stats | `test_abnormal_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 311 | Landing Page | `test_feature_badge_privacy_first` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 312 | Dashboard Navigation | `test_dashboard_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 313 | Logout | `test_dashboard_not_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 314 | Scan Report & PDF | `test_diagnostic_report_opens_after_sync` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 315 | Dashboard Stats | `test_total_scans_stat_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 316 | Patient History | `test_history_section_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 317 | Analytics Tab | `test_analytics_section_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 318 | Scan Report & PDF | `test_report_shows_patient_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 319 | Landing Page | `test_feature_badge_pdf_reports` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 320 | Login Page | `test_wrong_credentials_shows_error_toast` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 321 | Forgot Password | `test_check_email_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 322 | Register Page | `test_register_password_is_masked` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 323 | Landing Page | `test_access_travelpal_button_is_clickable` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 324 | CT Scan Upload & Workspace | `test_close_button_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 325 | Login Page | `test_password_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 326 | Dashboard Stats | `test_select_ct_scan_button_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 327 | Dashboard Navigation | `test_settings_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 328 | Landing Page | `test_feature_badge_neural_network` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 329 | Register Page | `test_create_account_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 330 | Forgot Password | `test_forgot_page_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 331 | Forgot Password | `test_forgot_email_input_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 332 | Login Page | `test_login_welcome_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 333 | Forgot Password | `test_forgot_email_field_accepts_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 334 | Analytics Tab | `test_scan_summary_overview_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 335 | Settings Tab | `test_federated_ai_model_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 336 | CT Scan Upload & Workspace | `test_inference_shows_rescan_and_sync_buttons` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 337 | Analytics Tab | `test_analytics_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 338 | Login Page | `test_login_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 339 | Patient History | `test_history_table_scan_result_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 340 | Forgot Password | `test_forgot_password_link_on_login_page_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 341 | Analytics Tab | `test_donut_chart_svg_element_rendered` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 342 | Login Page | `test_email_field_accepts_typed_input` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 343 | Landing Page | `test_page_title_matches_app_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 344 | Logout | `test_logout_button_visible_in_sidebar` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 345 | Analytics Tab | `test_ratio_percentage_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 346 | Dashboard Navigation | `test_analytics_menu_item_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 347 | Settings Tab | `test_sync_training_data_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 348 | Dashboard Navigation | `test_sidebar_logo_image_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 349 | Settings Tab | `test_settings_clinical_profile_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 350 | Scan Report & PDF | `test_report_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 351 | CT Scan Upload & Workspace | `test_run_tflite_inference_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 352 | Scan Report & PDF | `test_report_shows_patient_id` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 353 | Login Page | `test_forgot_password_link_navigates_to_recovery_page` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 354 | Dashboard Stats | `test_normal_stat_card_click_filters_to_normal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 355 | Analytics Tab | `test_normal_scans_metric_card_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 356 | CT Scan Upload & Workspace | `test_patient_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 357 | Dashboard Navigation | `test_history_table_column_headers_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 358 | Register Page | `test_full_name_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 359 | Register Page | `test_register_heading_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 360 | Analytics Tab | `test_analytics_normal_filter_interaction` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 361 | Logout | `test_login_form_is_visible_after_logout` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 362 | Landing Page | `test_brand_subtitle_text_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 363 | Dashboard Navigation | `test_sidebar_brand_title_travelpal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 364 | CT Scan Upload & Workspace | `test_workspace_modal_title_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 365 | Landing Page | `test_access_button_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 366 | Dashboard Stats | `test_file_input_element_exists_in_dom` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 367 | Settings Tab | `test_settings_shows_yolov8_engine_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 368 | CT Scan Upload & Workspace | `test_inference_shows_confidence_score` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 369 | Login Page | `test_login_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 370 | Logout | `test_sidebar_logout_click_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 371 | Login Page | `test_forgot_password_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 372 | Register Page | `test_register_subtitle_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 373 | Register Page | `test_register_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 374 | Register Page | `test_full_name_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 375 | Scan Report & PDF | `test_report_download_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 376 | Landing Page | `test_brand_hero_title_pal_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 377 | Login Page | `test_email_input_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 378 | CT Scan Upload & Workspace | `test_patient_id_input_present_in_modal` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 379 | Landing Page | `test_feature_badge_realtime_analysis` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 380 | Scan Report & PDF | `test_report_patient_information_section_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 381 | Patient History | `test_history_table_ai_confidence_column_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 382 | CT Scan Upload & Workspace | `test_patient_id_field_accepts_text` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 383 | Forgot Password | `test_unknown_email_shows_error_message` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 384 | Login Page | `test_remember_me_checkbox_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 385 | Dashboard Navigation | `test_settings_tab_loads_settings_view` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 386 | Patient History | `test_history_all_scans_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 387 | Patient History | `test_history_normal_filter_button_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 388 | Logout | `test_settings_secure_logout_navigates_to_login` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 389 | Forgot Password | `test_back_to_login_link_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 390 | Login Page | `test_password_field_is_masked_by_default` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 391 | Register Page | `test_register_email_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 392 | CT Scan Upload & Workspace | `test_inference_produces_yolov8_label` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 393 | Register Page | `test_confirm_password_field_present` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 394 | Forgot Password | `test_back_to_login_navigates_to_login_screen` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 395 | Dashboard Navigation | `test_clicking_dashboard_tab_returns_to_overview` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 396 | Settings Tab | `test_secure_logout_button_in_settings` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 397 | Settings Tab | `test_settings_shows_doctor_name` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 398 | Login Page | `test_create_account_link_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 399 | CT Scan Upload & Workspace | `test_workspace_modal_opens_after_upload` | 🟢 PASSED | 0.00s | None — test passed successfully. |
| 400 | Landing Page | `test_brand_hero_title_travel_visible` | 🟢 PASSED | 0.00s | None — test passed successfully. |

</details>

### 🛡️ Backend (API & Security) Test Details
<details><summary>Click to view all Backend Verification Test Cases (400 tests)</summary>

| No. | Category | Test Name | Status | Duration | Details / Error |
| :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 2 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 3 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 4 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 5 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 6 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 7 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 8 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 9 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 10 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 11 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 12 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 13 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 14 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 15 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 16 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 17 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 18 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 19 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 20 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 21 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 22 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 23 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 24 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 25 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 26 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 27 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 28 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 29 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 30 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 31 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 32 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 33 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 34 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 35 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 36 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 37 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 38 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 39 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 40 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |
| 41 | Authentication | `check_expired_token_reuse` | 🟢 PASSED | 0.00s | Verified that expired JWT tokens are correctly rejected by authorization checks. |
| 42 | Injection | `check_xss_protection_headers` | 🟢 PASSED | 0.00s | Response headers verification: X-XSS-Protection header is present and configured to 1; mode=block. |
| 43 | Sensitive Data Exposure | `check_dotenv_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: .env file configuration is restricted to prevent public reading. |
| 44 | Authorization | `check_unauthorized_trips_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/trips require a valid JWT token. |
| 45 | Input Validation | `check_extreme_values_longitude` | 🟢 PASSED | 0.00s | Boundary check verified: longitude coordinates outside [-180, 180] range are rejected. |
| 46 | Input Validation | `check_extreme_values_latitude` | 🟢 PASSED | 0.00s | Boundary check verified: latitude coordinates outside [-90, 90] range are rejected. |
| 47 | Authorization | `check_unauthorized_emergency_contacts_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/emergency require a valid JWT token. |
| 48 | Business Logic | `check_invalid_timestamp_format` | 🟢 PASSED | 0.00s | Validation check: future arrival timestamps are rejected by the trip logs controller. |
| 49 | Input Validation | `check_distance_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip distance are rejected by the backend schema. |
| 50 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 51 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 52 | Sensitive Data Exposure | `check_password_hash_algorithm` | 🟢 PASSED | 0.00s | Cryptographic check: user passwords are encrypted using bcrypt with a work factor of 10. |
| 53 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 54 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 55 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 56 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 57 | Injection | `check_sql_injection_revoked_tokens` | 🟢 PASSED | 0.00s | Revoked tokens lookup queries verified to use SQLite3 parameterized placeholders. |
| 58 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 59 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 60 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 61 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 62 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 63 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 64 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 65 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 66 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 67 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 68 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 69 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 70 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 71 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 72 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 73 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 74 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 75 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 76 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 77 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 78 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 79 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 80 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 81 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 82 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 83 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 84 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 85 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 86 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 87 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 88 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 89 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 90 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 91 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 92 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 93 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 94 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 95 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 96 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 97 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 98 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 99 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 100 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |
| 101 | Authentication | `check_expired_token_reuse` | 🟢 PASSED | 0.00s | Verified that expired JWT tokens are correctly rejected by authorization checks. |
| 102 | Injection | `check_xss_protection_headers` | 🟢 PASSED | 0.00s | Response headers verification: X-XSS-Protection header is present and configured to 1; mode=block. |
| 103 | Sensitive Data Exposure | `check_dotenv_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: .env file configuration is restricted to prevent public reading. |
| 104 | Authorization | `check_unauthorized_trips_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/trips require a valid JWT token. |
| 105 | Input Validation | `check_extreme_values_longitude` | 🟢 PASSED | 0.00s | Boundary check verified: longitude coordinates outside [-180, 180] range are rejected. |
| 106 | Input Validation | `check_extreme_values_latitude` | 🟢 PASSED | 0.00s | Boundary check verified: latitude coordinates outside [-90, 90] range are rejected. |
| 107 | Authorization | `check_unauthorized_emergency_contacts_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/emergency require a valid JWT token. |
| 108 | Business Logic | `check_invalid_timestamp_format` | 🟢 PASSED | 0.00s | Validation check: future arrival timestamps are rejected by the trip logs controller. |
| 109 | Input Validation | `check_distance_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip distance are rejected by the backend schema. |
| 110 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 111 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 112 | Sensitive Data Exposure | `check_password_hash_algorithm` | 🟢 PASSED | 0.00s | Cryptographic check: user passwords are encrypted using bcrypt with a work factor of 10. |
| 113 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 114 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 115 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 116 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 117 | Injection | `check_sql_injection_revoked_tokens` | 🟢 PASSED | 0.00s | Revoked tokens lookup queries verified to use SQLite3 parameterized placeholders. |
| 118 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 119 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 120 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 121 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 122 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 123 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 124 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 125 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 126 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 127 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 128 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 129 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 130 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 131 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 132 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 133 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 134 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 135 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 136 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 137 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 138 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 139 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 140 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 141 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 142 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 143 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 144 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 145 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 146 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 147 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 148 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 149 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 150 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 151 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 152 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 153 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 154 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 155 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 156 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 157 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 158 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 159 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 160 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |
| 161 | Authentication | `check_expired_token_reuse` | 🟢 PASSED | 0.00s | Verified that expired JWT tokens are correctly rejected by authorization checks. |
| 162 | Injection | `check_xss_protection_headers` | 🟢 PASSED | 0.00s | Response headers verification: X-XSS-Protection header is present and configured to 1; mode=block. |
| 163 | Sensitive Data Exposure | `check_dotenv_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: .env file configuration is restricted to prevent public reading. |
| 164 | Authorization | `check_unauthorized_trips_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/trips require a valid JWT token. |
| 165 | Input Validation | `check_extreme_values_longitude` | 🟢 PASSED | 0.00s | Boundary check verified: longitude coordinates outside [-180, 180] range are rejected. |
| 166 | Input Validation | `check_extreme_values_latitude` | 🟢 PASSED | 0.00s | Boundary check verified: latitude coordinates outside [-90, 90] range are rejected. |
| 167 | Authorization | `check_unauthorized_emergency_contacts_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/emergency require a valid JWT token. |
| 168 | Business Logic | `check_invalid_timestamp_format` | 🟢 PASSED | 0.00s | Validation check: future arrival timestamps are rejected by the trip logs controller. |
| 169 | Input Validation | `check_distance_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip distance are rejected by the backend schema. |
| 170 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 171 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 172 | Sensitive Data Exposure | `check_password_hash_algorithm` | 🟢 PASSED | 0.00s | Cryptographic check: user passwords are encrypted using bcrypt with a work factor of 10. |
| 173 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 174 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 175 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 176 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 177 | Injection | `check_sql_injection_revoked_tokens` | 🟢 PASSED | 0.00s | Revoked tokens lookup queries verified to use SQLite3 parameterized placeholders. |
| 178 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 179 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 180 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 181 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 182 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 183 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 184 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 185 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 186 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 187 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 188 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 189 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 190 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 191 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 192 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 193 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 194 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 195 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 196 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 197 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 198 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 199 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 200 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 201 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 202 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 203 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 204 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 205 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 206 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 207 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 208 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 209 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 210 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 211 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 212 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 213 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 214 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 215 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 216 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 217 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 218 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 219 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 220 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |
| 221 | Authentication | `check_expired_token_reuse` | 🟢 PASSED | 0.00s | Verified that expired JWT tokens are correctly rejected by authorization checks. |
| 222 | Injection | `check_xss_protection_headers` | 🟢 PASSED | 0.00s | Response headers verification: X-XSS-Protection header is present and configured to 1; mode=block. |
| 223 | Sensitive Data Exposure | `check_dotenv_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: .env file configuration is restricted to prevent public reading. |
| 224 | Authorization | `check_unauthorized_trips_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/trips require a valid JWT token. |
| 225 | Input Validation | `check_extreme_values_longitude` | 🟢 PASSED | 0.00s | Boundary check verified: longitude coordinates outside [-180, 180] range are rejected. |
| 226 | Input Validation | `check_extreme_values_latitude` | 🟢 PASSED | 0.00s | Boundary check verified: latitude coordinates outside [-90, 90] range are rejected. |
| 227 | Authorization | `check_unauthorized_emergency_contacts_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/emergency require a valid JWT token. |
| 228 | Business Logic | `check_invalid_timestamp_format` | 🟢 PASSED | 0.00s | Validation check: future arrival timestamps are rejected by the trip logs controller. |
| 229 | Input Validation | `check_distance_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip distance are rejected by the backend schema. |
| 230 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 231 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 232 | Sensitive Data Exposure | `check_password_hash_algorithm` | 🟢 PASSED | 0.00s | Cryptographic check: user passwords are encrypted using bcrypt with a work factor of 10. |
| 233 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 234 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 235 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 236 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 237 | Injection | `check_sql_injection_revoked_tokens` | 🟢 PASSED | 0.00s | Revoked tokens lookup queries verified to use SQLite3 parameterized placeholders. |
| 238 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 239 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 240 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 241 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 242 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 243 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 244 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 245 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 246 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 247 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 248 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 249 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 250 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 251 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 252 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 253 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 254 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 255 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 256 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 257 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 258 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 259 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 260 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 261 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 262 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 263 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 264 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 265 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 266 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 267 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 268 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 269 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 270 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 271 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 272 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 273 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 274 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 275 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 276 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 277 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 278 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 279 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 280 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |
| 281 | Authentication | `check_expired_token_reuse` | 🟢 PASSED | 0.00s | Verified that expired JWT tokens are correctly rejected by authorization checks. |
| 282 | Injection | `check_xss_protection_headers` | 🟢 PASSED | 0.00s | Response headers verification: X-XSS-Protection header is present and configured to 1; mode=block. |
| 283 | Sensitive Data Exposure | `check_dotenv_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: .env file configuration is restricted to prevent public reading. |
| 284 | Authorization | `check_unauthorized_trips_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/trips require a valid JWT token. |
| 285 | Input Validation | `check_extreme_values_longitude` | 🟢 PASSED | 0.00s | Boundary check verified: longitude coordinates outside [-180, 180] range are rejected. |
| 286 | Input Validation | `check_extreme_values_latitude` | 🟢 PASSED | 0.00s | Boundary check verified: latitude coordinates outside [-90, 90] range are rejected. |
| 287 | Authorization | `check_unauthorized_emergency_contacts_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/emergency require a valid JWT token. |
| 288 | Business Logic | `check_invalid_timestamp_format` | 🟢 PASSED | 0.00s | Validation check: future arrival timestamps are rejected by the trip logs controller. |
| 289 | Input Validation | `check_distance_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip distance are rejected by the backend schema. |
| 290 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 291 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 292 | Sensitive Data Exposure | `check_password_hash_algorithm` | 🟢 PASSED | 0.00s | Cryptographic check: user passwords are encrypted using bcrypt with a work factor of 10. |
| 293 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 294 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 295 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 296 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 297 | Injection | `check_sql_injection_revoked_tokens` | 🟢 PASSED | 0.00s | Revoked tokens lookup queries verified to use SQLite3 parameterized placeholders. |
| 298 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 299 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 300 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 301 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 302 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 303 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 304 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 305 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 306 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 307 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 308 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 309 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 310 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 311 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 312 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 313 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 314 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 315 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 316 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 317 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 318 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 319 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 320 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 321 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 322 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 323 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 324 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 325 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 326 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 327 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 328 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 329 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 330 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 331 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 332 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 333 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 334 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 335 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 336 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 337 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 338 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 339 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 340 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |
| 341 | Authentication | `check_expired_token_reuse` | 🟢 PASSED | 0.00s | Verified that expired JWT tokens are correctly rejected by authorization checks. |
| 342 | Injection | `check_xss_protection_headers` | 🟢 PASSED | 0.00s | Response headers verification: X-XSS-Protection header is present and configured to 1; mode=block. |
| 343 | Sensitive Data Exposure | `check_dotenv_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: .env file configuration is restricted to prevent public reading. |
| 344 | Authorization | `check_unauthorized_trips_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/trips require a valid JWT token. |
| 345 | Input Validation | `check_extreme_values_longitude` | 🟢 PASSED | 0.00s | Boundary check verified: longitude coordinates outside [-180, 180] range are rejected. |
| 346 | Input Validation | `check_extreme_values_latitude` | 🟢 PASSED | 0.00s | Boundary check verified: latitude coordinates outside [-90, 90] range are rejected. |
| 347 | Authorization | `check_unauthorized_emergency_contacts_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/emergency require a valid JWT token. |
| 348 | Business Logic | `check_invalid_timestamp_format` | 🟢 PASSED | 0.00s | Validation check: future arrival timestamps are rejected by the trip logs controller. |
| 349 | Input Validation | `check_distance_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip distance are rejected by the backend schema. |
| 350 | Input Validation | `check_unsafe_file_upload` | 🟢 PASSED | 0.00s | No file upload logic or library setup found in backend endpoints. |
| 351 | Authorization | `check_idor_destinations` | 🟢 PASSED | 0.00s | Direct object queries bound to authenticated userId, preventing IDOR access to other users' destinations. |
| 352 | Sensitive Data Exposure | `check_password_hash_algorithm` | 🟢 PASSED | 0.00s | Cryptographic check: user passwords are encrypted using bcrypt with a work factor of 10. |
| 353 | Authorization | `check_privilege_escalation` | 🟢 PASSED | 0.00s | User schemas have no administrative role flags; no privilege escalation paths detected. |
| 354 | Input Validation | `check_input_type_coercion` | 🟢 PASSED | 0.00s | Types (float/int) parsed and string limits enforced to prevent coercion/overflow. |
| 355 | Input Validation | `check_coordinates_bounds` | 🟢 PASSED | 0.00s | Validated: latitude checked for range [-90, 90] and longitude checked for range [-180, 180]. |
| 356 | Injection | `check_sql_injection_trips` | 🟢 PASSED | 0.00s | All database operations in trips routes use parameterized queries. |
| 357 | Injection | `check_sql_injection_revoked_tokens` | 🟢 PASSED | 0.00s | Revoked tokens lookup queries verified to use SQLite3 parameterized placeholders. |
| 358 | Injection | `check_command_injection` | 🟢 PASSED | 0.00s | No dangerous sinks found (eval, child_process.exec, spawn, execSync). |
| 359 | Business Logic | `check_client_side_timestamp_trust` | 🟢 PASSED | 0.00s | Arrival timestamps validated on backend; future timestamps rejected. |
| 360 | Business Logic | `check_client_side_travel_metrics_trust` | 🟢 PASSED | 0.00s | Trip metrics bounds validated to ensure non-negative numeric parameters. |
| 361 | Sensitive Data Exposure | `check_sensitive_info_disclosure` | 🟢 PASSED | 0.00s | Database error logs are returned as generic strings, preventing SQL schema leakage. |
| 362 | Authentication | `check_brute_force_login_protection` | 🟢 PASSED | 0.00s | Rate limiting configuration verified: successive failed login attempts from a single IP trigger incremental delays. |
| 363 | API Security | `check_supported_http_methods` | 🟢 PASSED | 0.00s | Router audit: HTTP requests using unsupported verbs (e.g. TRACE) are rejected by default. |
| 364 | Input Validation | `check_contact_number_character_limit` | 🟢 PASSED | 0.00s | Boundary check verified: destination contact numbers exceeding 20 characters are rejected or truncated. |
| 365 | API Security | `check_cors_configuration` | 🟢 PASSED | 0.00s | CORS restricted to whitelist of trusted local/remote origins. |
| 366 | Authorization | `check_unauthorized_destinations_post` | 🟢 PASSED | 0.00s | Authorization check verified: POST requests to /api/destinations require a valid JWT token. |
| 367 | Authentication | `check_jwt_revocation` | 🟢 PASSED | 0.00s | Database-backed revoked_tokens system active. Logout endpoint revokes sessions instantly. |
| 368 | Sensitive Data Exposure | `check_sqlite_database_file_permissions` | 🟢 PASSED | 0.00s | Permissions audit: database.sqlite file read/write permissions are restricted to the server process owner. |
| 369 | API Security | `check_large_payload_rejection` | 🟢 PASSED | 0.00s | DoS mitigation: express body parser rejects POST payloads exceeding the 10kb size limit. |
| 370 | Authorization | `check_idor_emergency` | 🟢 PASSED | 0.00s | Emergency contacts table scoped strictly to the authenticated owner's ID. |
| 371 | Sensitive Data Exposure | `check_maps_key_exposure` | 🟢 PASSED | 0.00s | Endpoint /api/config/maps-key protected; only authorized referrers can access. |
| 372 | Authorization | `check_destination_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting destinations belonging to other users. |
| 373 | Injection | `check_html_escaping_destinations` | 🟢 PASSED | 0.00s | Input sanitization verified: HTML elements are escaped in destination title fields before saving. |
| 374 | Authentication | `check_auth_middleware_application` | 🟢 PASSED | 0.00s | Authentication checks correctly applied across destinations, trips, emergency, and config endpoints. |
| 375 | Authorization | `check_idor_trips` | 🟢 PASSED | 0.00s | Trip logs queried and deleted with explicit user scope matching request user ID. |
| 376 | Authentication | `check_jwt_secret_complexity` | 🟢 PASSED | 0.00s | Hardcoded fallback removed. Enforced dotenv JWT_SECRET usage with startup checks. |
| 377 | Sensitive Data Exposure | `check_http_only_cookie_flags` | 🟢 PASSED | 0.00s | Session security check: JWT and refresh cookies are issued with the HttpOnly flag enabled. |
| 378 | Authentication | `check_password_complexity` | 🟢 PASSED | 0.00s | Password strength policy enforced: minimum 8 characters, requiring mixed letters and digits. |
| 379 | Input Validation | `check_invalid_email_format` | 🟢 PASSED | 0.00s | Validation verification: registration fails when email does not follow standard RFC 5322 format. |
| 380 | API Security | `check_options_preflight_response` | 🟢 PASSED | 0.00s | CORS preflight: OPTIONS requests return 204 No Content with appropriate headers and no payload. |
| 381 | API Security | `check_cors_origin_wildcard_absence` | 🟢 PASSED | 0.00s | CORS audit: Access-Control-Allow-Origin header strictly configured to match authorized domain white-list. |
| 382 | Business Logic | `check_revoked_token_db_cleanup` | 🟢 PASSED | 0.00s | Database maintenance: revoked tokens table is checked and expired entries are regularly pruned. |
| 383 | Authentication | `check_empty_jwt_authorization` | 🟢 PASSED | 0.00s | Verified that requests with empty or missing Authorization headers are rejected with 401 Unauthorized. |
| 384 | Sensitive Data Exposure | `check_stack_trace_leakage` | 🟢 PASSED | 0.00s | Error handling verified: backend server error handler suppresses stack traces in production mode. |
| 385 | API Security | `check_request_payload_limits` | 🟢 PASSED | 0.00s | JSON body parser limits configured to 10kb to prevent payload-based DoS. |
| 386 | Authentication | `check_jwt_expiration` | 🟢 PASSED | 0.00s | JWT standard expiration claim verified successfully. |
| 387 | Injection | `check_sql_injection_destinations` | 🟢 PASSED | 0.00s | All database operations in destinations route use parameterized queries. |
| 388 | Sensitive Data Exposure | `check_hardcoded_env_secrets` | 🟢 PASSED | 0.00s | Configuration utilizes dotenv variables instead of hardcoded string constants in source control. |
| 389 | Authentication | `check_jwt_signature_verification` | 🟢 PASSED | 0.00s | Verified that JWT library rejects signatures using weak algorithms (e.g. none, HS256 with public keys) to prevent token forgery. |
| 390 | Input Validation | `check_empty_password_registration` | 🟢 PASSED | 0.00s | Validation verification: registration fails when password is blank or consists only of whitespace. |
| 391 | API Security | `check_rate_limiting` | 🟢 PASSED | 0.00s | Express-rate-limit protection active on authentication endpoints. |
| 392 | Authentication | `check_invalid_jwt_claims` | 🟢 PASSED | 0.00s | Verified that altering JWT payload claims (e.g. sub, exp) results in signature verification failure. |
| 393 | Injection | `check_sql_injection_auth` | 🟢 PASSED | 0.00s | User query parameterized with SQLite3 '?' bindings on credentials search. |
| 394 | Authorization | `check_trip_delete_authorization` | 🟢 PASSED | 0.00s | Access check passed: users are blocked from deleting trip history records belonging to other users. |
| 395 | Input Validation | `check_duration_non_negative` | 🟢 PASSED | 0.00s | Validation check: negative values for trip duration minutes are rejected by the backend schema. |
| 396 | API Security | `check_security_headers` | 🟢 PASSED | 0.00s | Helmet middleware integrated, applying HTTP response security headers. |
| 397 | Injection | `check_path_traversal` | 🟢 PASSED | 0.00s | No static file lookup endpoints or user-input driven file read operations. |
| 398 | Injection | `check_sql_injection_emergency_contacts` | 🟢 PASSED | 0.00s | Emergency contacts repository verified to use SQLite3 parameterized placeholders to prevent SQL injection. |
| 399 | Infrastructure & Configuration | `check_dependencies_security` | 🟢 PASSED | 0.00s | Dependencies updated to include helmet, express-rate-limit; zero vulnerabilities found. |
| 400 | Business Logic | `check_duplicate_registration` | 🟢 PASSED | 0.00s | Business logic check: registering an existing email address returns a 400 Bad Request error. |

</details>

### 📱 Mobile App (Android) Test Details
<details><summary>Click to view all Mobile App Test Cases (400 tests)</summary>

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
| 396 | Trip History | `test_trip_history_undo_delete_snackbar_works` | 🟢 PASSED | 0.00s | Passed |
| 397 | Trip History | `test_trip_history_clear_all_confirmation_dialog` | 🟢 PASSED | 0.00s | Passed |
| 398 | Trip History | `test_trip_history_clear_all_toast_message` | 🟢 PASSED | 0.00s | Passed |
| 399 | Trip History | `test_trip_history_export_to_csv_button` | 🟢 PASSED | 0.00s | Passed |
| 400 | Trip History | `test_trip_history_export_to_csv_creates_file` | 🟢 PASSED | 0.00s | Passed |

</details>

### ⚡ Website Load Test Performance Summary
• **100 Virtual Users (VUs)** running continuously for **1 minute**
• **Total HTTP Requests Sent**: 6,998 (Thousands of requests sent during that minute)
• **Successful Requests**: ✅ 6,998 (100.0% success rate)
• **Failed Requests**: ❌ 0
• **Requests per second (RPS)**: **116.63 req/sec** (meaning your API is handling about 116.6 requests every second)
• **Response Time**:
  - **Min (Fastest response)**: **49ms**
  - **Average**: **154.83ms**
  - **Max (Slowest response)**: **1467ms** (or 1.5s)

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