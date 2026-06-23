### 📊 Overall Verification Metrics
| Metric | Value |
| :--- | :--- |
| **Application** | TravelPal |
| **Status** | 🟢 PASSED |
| **Total Verification Tests** | 800 |
| **Passed** | 800 |
| **Failed** | 0 |
| **Pass Rate** | 100.0% |
| **Overall Duration** | 1985.15 seconds |

### 💼 Verification Suites
| Suite Name | Total Tests | Passed | Failed | Duration (s) | Status |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **E2E Appium Suite** | 400 | 400 | 0 | 1967.98s | 🟢 PASSED |
| **Backend Security Suite** | 400 | 400 | 0 | 17.17s | 🟢 PASSED |

### 📱 E2E Appium Verification Breakdown
<details>
<summary><b>App Launch</b> (🟢 40/40 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_app_launches_without_crash` | 2.88s | 🟢 PASSED |
| 2 | `test_splash_screen_logo_visible` | 3.39s | 🟢 PASSED |
| 3 | `test_app_loads_within_5_seconds` | 1.58s | 🟢 PASSED |
| 4 | `test_status_bar_visible` | 3.06s | 🟢 PASSED |
| 5 | `test_fonts_load_correctly` | 2.13s | 🟢 PASSED |
| 6 | `test_dark_theme_applied_by_default` | 1.62s | 🟢 PASSED |
| 7 | `test_root_container_renders` | 3.11s | 🟢 PASSED |
| 8 | `test_auth_state_checked_on_start` | 3.43s | 🟢 PASSED |
| 9 | `test_splash_activity_transition_delay` | 2.14s | 🟢 PASSED |
| 10 | `test_splash_checks_existing_session` | 3.24s | 🟢 PASSED |
| 11 | `test_app_launch_splash_screen_logo_centered` | 2.42s | 🟢 PASSED |
| 12 | `test_app_launch_network_available_check` | 2.80s | 🟢 PASSED |
| 13 | `test_app_launch_location_permission_checked` | 1.46s | 🟢 PASSED |
| 14 | `test_app_launch_notification_permission_checked` | 2.23s | 🟢 PASSED |
| 15 | `test_app_launch_database_connection_initialized` | 2.61s | 🟢 PASSED |
| 16 | `test_app_launch_shared_preferences_accessible` | 2.25s | 🟢 PASSED |
| 17 | `test_app_launch_event_bus_registered` | 2.76s | 🟢 PASSED |
| 18 | `test_app_launch_main_activity_intent_resolved` | 3.04s | 🟢 PASSED |
| 19 | `test_app_launch_custom_fonts_rendering` | 2.06s | 🟢 PASSED |
| 20 | `test_app_launch_assets_copy_check` | 1.29s | 🟢 PASSED |
| 21 | `test_app_launch_device_compatibility_check` | 3.34s | 🟢 PASSED |
| 22 | `test_app_launch_safe_mode_not_triggered` | 3.43s | 🟢 PASSED |
| 23 | `test_app_launch_memory_usage_under_limit` | 2.49s | 🟢 PASSED |
| 24 | `test_app_launch_cpu_usage_stable` | 3.20s | 🟢 PASSED |
| 25 | `test_app_launch_background_services_started` | 3.28s | 🟢 PASSED |
| 26 | `test_app_launch_update_prompt_not_shown` | 1.65s | 🟢 PASSED |
| 27 | `test_app_launch_eula_accepted_check` | 2.53s | 🟢 PASSED |
| 28 | `test_app_launch_language_loaded_default` | 1.31s | 🟢 PASSED |
| 29 | `test_app_launch_screen_density_detected` | 2.56s | 🟢 PASSED |
| 30 | `test_app_launch_system_light_dark_theme` | 1.74s | 🟢 PASSED |
| 31 | `test_app_launch_analytics_session_started` | 1.40s | 🟢 PASSED |
| 32 | `test_app_launch_crashlytics_initialized` | 2.55s | 🟢 PASSED |
| 33 | `test_app_launch_dependency_injection_ready` | 2.31s | 🟢 PASSED |
| 34 | `test_app_launch_ssl_pinning_configured` | 3.07s | 🟢 PASSED |
| 35 | `test_app_launch_root_detection_passed` | 2.56s | 🟢 PASSED |
| 36 | `test_app_launch_emulator_detection_logged` | 3.32s | 🟢 PASSED |
| 37 | `test_app_launch_cache_directory_cleaned` | 3.32s | 🟢 PASSED |
| 38 | `test_app_launch_app_update_check_skipped` | 2.87s | 🟢 PASSED |
| 39 | `test_app_launch_migration_not_needed` | 1.71s | 🟢 PASSED |
| 40 | `test_app_launch_ui_thread_responsive` | 1.26s | 🟢 PASSED |

</details>

<details>
<summary><b>Login Screen</b> (🟢 39/39 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_login_screen_loads` | 4.69s | 🟢 PASSED |
| 2 | `test_welcome_headline_visible` | 4.25s | 🟢 PASSED |
| 3 | `test_signin_subheadline_visible` | 4.43s | 🟢 PASSED |
| 4 | `test_email_input_field_present` | 1.65s | 🟢 PASSED |
| 5 | `test_password_input_field_present` | 3.94s | 🟢 PASSED |
| 6 | `test_signin_button_present` | 4.16s | 🟢 PASSED |
| 7 | `test_forgot_password_link_present` | 2.54s | 🟢 PASSED |
| 8 | `test_signup_navigation_link_present` | 3.44s | 🟢 PASSED |
| 9 | `test_password_visibility_toggle_works` | 3.71s | 🟢 PASSED |
| 10 | `test_login_empty_fields_validation` | 2.08s | 🟢 PASSED |
| 11 | `test_login_invalid_credentials_error` | 1.84s | 🟢 PASSED |
| 12 | `test_login_keyboard_action_go` | 2.57s | 🟢 PASSED |
| 13 | `test_login_email_validation_format` | 2.45s | 🟢 PASSED |
| 14 | `test_login_successful_redirect` | 4.80s | 🟢 PASSED |
| 15 | `test_login_username_trim_whitespace` | 1.74s | 🟢 PASSED |
| 16 | `test_login_input_fields_borders_focused` | 2.28s | 🟢 PASSED |
| 17 | `test_login_submit_on_keyboard_enter` | 2.54s | 🟢 PASSED |
| 18 | `test_login_password_masking_by_default` | 2.72s | 🟢 PASSED |
| 19 | `test_login_copy_paste_disabled_for_password` | 3.20s | 🟢 PASSED |
| 20 | `test_login_autofill_hint_email_correct` | 3.64s | 🟢 PASSED |
| 21 | `test_login_autofill_hint_password_correct` | 2.57s | 🟢 PASSED |
| 22 | `test_login_error_message_color_red` | 3.16s | 🟢 PASSED |
| 23 | `test_login_error_message_accessibility_announcement` | 3.41s | 🟢 PASSED |
| 24 | `test_login_disabled_state_when_submitting` | 3.20s | 🟢 PASSED |
| 25 | `test_login_google_sign_in_button_visible` | 2.36s | 🟢 PASSED |
| 26 | `test_login_facebook_sign_in_button_visible` | 2.26s | 🟢 PASSED |
| 27 | `test_login_terms_link_clicks` | 4.46s | 🟢 PASSED |
| 28 | `test_login_privacy_policy_link_clicks` | 2.46s | 🟢 PASSED |
| 29 | `test_login_remember_me_checkbox_state_persisted` | 4.66s | 🟢 PASSED |
| 30 | `test_login_back_button_behavior` | 3.80s | 🟢 PASSED |
| 31 | `test_login_error_cleared_on_input_change` | 2.51s | 🟢 PASSED |
| 32 | `test_login_brute_force_lockout_warning_shown` | 2.99s | 🟢 PASSED |
| 33 | `test_login_session_token_stored_securely` | 4.24s | 🟢 PASSED |
| 34 | `test_login_biometric_prompt_visible_if_enabled` | 4.51s | 🟢 PASSED |
| 35 | `test_login_biometric_bypass_link_works` | 3.89s | 🟢 PASSED |
| 36 | `test_login_caps_lock_indicator_shown` | 3.37s | 🟢 PASSED |
| 37 | `test_login_network_failure_alert` | 4.20s | 🟢 PASSED |
| 38 | `test_login_slow_connection_spinner_shown` | 4.82s | 🟢 PASSED |
| 39 | `test_login_validation_on_focus_loss` | 4.45s | 🟢 PASSED |

</details>

<details>
<summary><b>Register Screen</b> (🟢 37/37 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_register_screen_loads` | 4.85s | 🟢 PASSED |
| 2 | `test_register_name_field_present` | 4.34s | 🟢 PASSED |
| 3 | `test_register_email_field_present` | 5.79s | 🟢 PASSED |
| 4 | `test_register_password_field_present` | 3.04s | 🟢 PASSED |
| 5 | `test_register_confirm_password_present` | 6.42s | 🟢 PASSED |
| 6 | `test_register_question_dropdown_present` | 3.54s | 🟢 PASSED |
| 7 | `test_register_answer_field_present` | 6.41s | 🟢 PASSED |
| 8 | `test_register_button_present` | 3.30s | 🟢 PASSED |
| 9 | `test_register_empty_fields_validation` | 3.14s | 🟢 PASSED |
| 10 | `test_register_password_length_validation` | 4.66s | 🟢 PASSED |
| 11 | `test_register_password_match_validation` | 4.40s | 🟢 PASSED |
| 12 | `test_register_success_navigation` | 3.00s | 🟢 PASSED |
| 13 | `test_register_name_min_length_validation` | 4.45s | 🟢 PASSED |
| 14 | `test_register_name_special_chars_validation` | 5.45s | 🟢 PASSED |
| 15 | `test_register_email_duplicate_error_shown` | 2.55s | 🟢 PASSED |
| 16 | `test_register_password_complexity_indicator_weak` | 3.78s | 🟢 PASSED |
| 17 | `test_register_password_complexity_indicator_strong` | 6.37s | 🟢 PASSED |
| 18 | `test_register_security_question_selection_persisted` | 4.37s | 🟢 PASSED |
| 19 | `test_register_security_answer_trim_whitespace` | 5.81s | 🟢 PASSED |
| 20 | `test_register_scroll_to_bottom_enabled` | 3.22s | 🟢 PASSED |
| 21 | `test_register_terms_checkbox_mandatory` | 3.72s | 🟢 PASSED |
| 22 | `test_register_marketing_checkbox_optional` | 3.00s | 🟢 PASSED |
| 23 | `test_register_validation_marks_visible` | 5.29s | 🟢 PASSED |
| 24 | `test_register_clear_fields_button_works` | 3.77s | 🟢 PASSED |
| 25 | `test_register_submit_disabled_until_form_valid` | 4.30s | 🟢 PASSED |
| 26 | `test_register_api_timeout_error_handling` | 3.46s | 🟢 PASSED |
| 27 | `test_register_spaces_in_password_supported` | 6.27s | 🟢 PASSED |
| 28 | `test_register_long_name_text_wrapping` | 5.05s | 🟢 PASSED |
| 29 | `test_register_back_to_login_navigation` | 3.35s | 🟢 PASSED |
| 30 | `test_register_password_match_realtime_check` | 4.94s | 🟢 PASSED |
| 31 | `test_register_email_invalid_tld_check` | 3.94s | 🟢 PASSED |
| 32 | `test_register_keyboard_next_focus_flow` | 6.72s | 🟢 PASSED |
| 33 | `test_register_form_data_loss_warning_on_back` | 6.83s | 🟢 PASSED |
| 34 | `test_register_input_cleared_on_success` | 4.05s | 🟢 PASSED |
| 35 | `test_register_phone_number_optional_field` | 6.94s | 🟢 PASSED |
| 36 | `test_register_country_code_dropdown` | 4.81s | 🟢 PASSED |
| 37 | `test_register_zip_code_auto_format` | 4.79s | 🟢 PASSED |

</details>

<details>
<summary><b>Main Screen</b> (🟢 46/46 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_dashboard_loads_after_login` | 2.05s | 🟢 PASSED |
| 2 | `test_dashboard_title_visible` | 2.91s | 🟢 PASSED |
| 3 | `test_dashboard_profile_button_visible` | 4.29s | 🟢 PASSED |
| 4 | `test_dashboard_delete_all_button_visible` | 3.37s | 🟢 PASSED |
| 5 | `test_dashboard_recycler_view_present` | 2.81s | 🟢 PASSED |
| 6 | `test_dashboard_empty_placeholder_visible` | 2.08s | 🟢 PASSED |
| 7 | `test_dashboard_bottom_navigation_present` | 2.42s | 🟢 PASSED |
| 8 | `test_dashboard_bottom_nav_home_selectable` | 2.87s | 🟢 PASSED |
| 9 | `test_dashboard_bottom_nav_add_selectable` | 4.78s | 🟢 PASSED |
| 10 | `test_dashboard_bottom_nav_contacts_selectable` | 2.53s | 🟢 PASSED |
| 11 | `test_dashboard_bottom_nav_history_selectable` | 2.55s | 🟢 PASSED |
| 12 | `test_dashboard_fab_sos_present` | 4.04s | 🟢 PASSED |
| 13 | `test_dashboard_fab_stop_sos_hidden_by_default` | 3.24s | 🟢 PASSED |
| 14 | `test_dashboard_shake_sensor_registered` | 3.96s | 🟢 PASSED |
| 15 | `test_dashboard_swipe_to_delete_callback` | 2.21s | 🟢 PASSED |
| 16 | `test_dashboard_swipe_to_edit_callback` | 5.43s | 🟢 PASSED |
| 17 | `test_dashboard_notification_badge_visible` | 3.24s | 🟢 PASSED |
| 18 | `test_dashboard_notification_list_loads` | 4.86s | 🟢 PASSED |
| 19 | `test_dashboard_weather_widget_visible` | 4.24s | 🟢 PASSED |
| 20 | `test_dashboard_weather_widget_data_loads` | 5.00s | 🟢 PASSED |
| 21 | `test_dashboard_currency_converter_widget_visible` | 4.54s | 🟢 PASSED |
| 22 | `test_dashboard_user_profile_name_correct` | 2.19s | 🟢 PASSED |
| 23 | `test_dashboard_sign_out_button_visible` | 2.16s | 🟢 PASSED |
| 24 | `test_dashboard_sign_out_confirmation_dialog` | 2.23s | 🟢 PASSED |
| 25 | `test_dashboard_sign_out_clears_credentials` | 2.07s | 🟢 PASSED |
| 26 | `test_dashboard_list_scrolling_smoothness` | 3.86s | 🟢 PASSED |
| 27 | `test_dashboard_refresh_layout_trigger` | 2.92s | 🟢 PASSED |
| 28 | `test_dashboard_sync_status_indicator_visible` | 3.79s | 🟢 PASSED |
| 29 | `test_dashboard_offline_mode_banner_visible` | 5.22s | 🟢 PASSED |
| 30 | `test_dashboard_quick_SOS_long_press_duration` | 3.59s | 🟢 PASSED |
| 31 | `test_dashboard_destination_search_bar_present` | 3.90s | 🟢 PASSED |
| 32 | `test_dashboard_search_suggestions_appear` | 3.17s | 🟢 PASSED |
| 33 | `test_dashboard_filter_chip_all_destinations` | 3.97s | 🟢 PASSED |
| 34 | `test_dashboard_filter_chip_active_alarms` | 5.42s | 🟢 PASSED |
| 35 | `test_dashboard_filter_chip_completed_trips` | 2.18s | 🟢 PASSED |
| 36 | `test_dashboard_empty_placeholder_illustration` | 3.89s | 🟢 PASSED |
| 37 | `test_dashboard_map_preview_loads` | 2.55s | 🟢 PASSED |
| 38 | `test_dashboard_map_zoom_controls_visible` | 5.34s | 🟢 PASSED |
| 39 | `test_dashboard_drawer_menu_opens` | 2.89s | 🟢 PASSED |
| 40 | `test_dashboard_drawer_navigation_items` | 5.02s | 🟢 PASSED |
| 41 | `test_dashboard_settings_navigation` | 4.21s | 🟢 PASSED |
| 42 | `test_dashboard_help_and_support_navigation` | 5.69s | 🟢 PASSED |
| 43 | `test_dashboard_about_screen_navigation` | 3.39s | 🟢 PASSED |
| 44 | `test_dashboard_app_version_string_matching` | 3.27s | 🟢 PASSED |
| 45 | `test_dashboard_location_status_card_visible` | 3.33s | 🟢 PASSED |
| 46 | `test_dashboard_current_coordinates_matching` | 5.27s | 🟢 PASSED |

</details>

<details>
<summary><b>Add Destination</b> (🟢 37/37 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_add_destination_screen_loads` | 7.50s | 🟢 PASSED |
| 2 | `test_add_destination_toolbar_title` | 3.31s | 🟢 PASSED |
| 3 | `test_add_destination_title_input_present` | 6.27s | 🟢 PASSED |
| 4 | `test_add_destination_location_input_present` | 8.10s | 🟢 PASSED |
| 5 | `test_add_destination_mark_on_map_button` | 7.88s | 🟢 PASSED |
| 6 | `test_add_destination_contact_input_present` | 8.93s | 🟢 PASSED |
| 7 | `test_add_destination_save_button_present` | 6.68s | 🟢 PASSED |
| 8 | `test_add_destination_empty_title_error` | 7.79s | 🟢 PASSED |
| 9 | `test_add_destination_empty_location_error` | 8.71s | 🟢 PASSED |
| 10 | `test_add_destination_geocoder_lookup` | 4.22s | 🟢 PASSED |
| 11 | `test_add_destination_custom_coords_persistence` | 3.57s | 🟢 PASSED |
| 12 | `test_add_destination_success_callback` | 7.81s | 🟢 PASSED |
| 13 | `test_add_destination_form_persistence_on_rotate` | 8.89s | 🟢 PASSED |
| 14 | `test_add_destination_map_picker_opens` | 6.03s | 🟢 PASSED |
| 15 | `test_add_destination_map_marker_drag_drop` | 6.90s | 🟢 PASSED |
| 16 | `test_add_destination_contact_search_button` | 4.39s | 🟢 PASSED |
| 17 | `test_add_destination_contact_picker_opens` | 5.15s | 🟢 PASSED |
| 18 | `test_add_destination_contact_auto_fill` | 4.47s | 🟢 PASSED |
| 19 | `test_add_destination_proximity_slider_values` | 3.88s | 🟢 PASSED |
| 20 | `test_add_destination_proximity_default_value` | 8.24s | 🟢 PASSED |
| 21 | `test_add_destination_custom_alarm_sound_picker` | 8.05s | 🟢 PASSED |
| 22 | `test_add_destination_notes_textarea_present` | 4.29s | 🟢 PASSED |
| 23 | `test_add_destination_notes_char_counter` | 4.32s | 🟢 PASSED |
| 24 | `test_add_destination_invalid_lat_lng_error` | 6.92s | 🟢 PASSED |
| 25 | `test_add_destination_duplicate_destination_warning` | 7.09s | 🟢 PASSED |
| 26 | `test_add_destination_save_fails_offline_persistence` | 3.89s | 🟢 PASSED |
| 27 | `test_add_destination_auto_capitalize_title` | 5.21s | 🟢 PASSED |
| 28 | `test_add_destination_paste_long_address_handled` | 7.27s | 🟢 PASSED |
| 29 | `test_add_destination_keyboard_hides_on_tap_outside` | 8.03s | 🟢 PASSED |
| 30 | `test_add_destination_suggested_places_click` | 6.20s | 🟢 PASSED |
| 31 | `test_add_destination_clear_inputs_button` | 6.51s | 🟢 PASSED |
| 32 | `test_add_destination_mandatory_fields_marked` | 5.18s | 🟢 PASSED |
| 33 | `test_add_destination_toolbar_back_button` | 7.93s | 🟢 PASSED |
| 34 | `test_add_destination_discard_changes_dialog` | 5.94s | 🟢 PASSED |
| 35 | `test_add_destination_valid_postal_code_lookup` | 3.80s | 🟢 PASSED |
| 36 | `test_add_destination_save_button_spinner_state` | 7.72s | 🟢 PASSED |
| 37 | `test_add_destination_ui_layout_overlapping_check` | 3.98s | 🟢 PASSED |

</details>

<details>
<summary><b>Destination Detail</b> (🟢 37/37 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_destination_detail_screen_loads` | 4.59s | 🟢 PASSED |
| 2 | `test_destination_detail_title_matching` | 2.30s | 🟢 PASSED |
| 3 | `test_destination_detail_address_matching` | 3.54s | 🟢 PASSED |
| 4 | `test_destination_detail_view_on_map_button` | 2.44s | 🟢 PASSED |
| 5 | `test_destination_detail_start_service_button` | 5.54s | 🟢 PASSED |
| 6 | `test_destination_detail_stop_service_button` | 4.65s | 🟢 PASSED |
| 7 | `test_destination_detail_notify_contact_switch` | 3.18s | 🟢 PASSED |
| 8 | `test_destination_detail_remaining_distance_display` | 3.75s | 🟢 PASSED |
| 9 | `test_destination_detail_bearing_display` | 4.77s | 🟢 PASSED |
| 10 | `test_destination_detail_eta_display` | 3.33s | 🟢 PASSED |
| 11 | `test_destination_detail_shake_sensor_active` | 2.30s | 🟢 PASSED |
| 12 | `test_destination_detail_eventbus_subscription` | 4.78s | 🟢 PASSED |
| 13 | `test_destination_detail_toolbar_menu_items` | 6.41s | 🟢 PASSED |
| 14 | `test_destination_detail_edit_navigation` | 5.91s | 🟢 PASSED |
| 15 | `test_destination_detail_delete_navigation` | 3.88s | 🟢 PASSED |
| 16 | `test_destination_detail_delete_confirmation_dialog` | 5.33s | 🟢 PASSED |
| 17 | `test_destination_detail_map_marker_rendered` | 3.10s | 🟢 PASSED |
| 18 | `test_destination_detail_contact_name_rendered` | 4.57s | 🟢 PASSED |
| 19 | `test_destination_detail_contact_phone_call_action` | 5.19s | 🟢 PASSED |
| 20 | `test_destination_detail_contact_sms_action` | 2.33s | 🟢 PASSED |
| 21 | `test_destination_detail_tracking_toggle_state` | 3.34s | 🟢 PASSED |
| 22 | `test_destination_detail_location_permissions_warning` | 3.74s | 🟢 PASSED |
| 23 | `test_destination_detail_low_battery_warning_message` | 2.93s | 🟢 PASSED |
| 24 | `test_destination_detail_screen_dim_prevention` | 3.45s | 🟢 PASSED |
| 25 | `test_destination_detail_compass_bearing_arrow_rotates` | 3.12s | 🟢 PASSED |
| 26 | `test_destination_detail_miles_kilometers_conversion` | 2.64s | 🟢 PASSED |
| 27 | `test_destination_detail_static_map_fallback_loads` | 4.21s | 🟢 PASSED |
| 28 | `test_destination_detail_event_bus_unsubscribe_on_stop` | 3.84s | 🟢 PASSED |
| 29 | `test_destination_detail_alarm_distance_display_color` | 3.85s | 🟢 PASSED |
| 30 | `test_destination_detail_voice_navigation_toggle` | 5.80s | 🟢 PASSED |
| 31 | `test_destination_detail_speedometer_card_present` | 6.57s | 🟢 PASSED |
| 32 | `test_destination_detail_historical_visit_count` | 5.88s | 🟢 PASSED |
| 33 | `test_destination_detail_share_location_link_button` | 4.55s | 🟢 PASSED |
| 34 | `test_destination_detail_open_in_external_google_maps` | 5.18s | 🟢 PASSED |
| 35 | `test_destination_detail_traffic_delay_warning` | 4.78s | 🟢 PASSED |
| 36 | `test_destination_detail_favorite_star_icon_toggle` | 6.36s | 🟢 PASSED |
| 37 | `test_destination_detail_bottom_sheet_drag_behavior` | 3.90s | 🟢 PASSED |

</details>

<details>
<summary><b>Proximity Alarm</b> (🟢 37/37 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_foreground_service_notification_channel` | 10.81s | 🟢 PASSED |
| 2 | `test_foreground_service_starts_successfully` | 6.15s | 🟢 PASSED |
| 3 | `test_foreground_service_location_updates` | 7.66s | 🟢 PASSED |
| 4 | `test_foreground_service_sends_events` | 4.53s | 🟢 PASSED |
| 5 | `test_proximity_distance_haversine_calculation` | 8.21s | 🟢 PASSED |
| 6 | `test_proximity_bearing_angle_calculation` | 10.94s | 🟢 PASSED |
| 7 | `test_proximity_eta_speed_calculation` | 8.46s | 🟢 PASSED |
| 8 | `test_proximity_threshold_5km_check` | 3.99s | 🟢 PASSED |
| 9 | `test_proximity_alarm_screen_trigger` | 9.87s | 🟢 PASSED |
| 10 | `test_proximity_alarm_full_screen_intent` | 6.55s | 🟢 PASSED |
| 11 | `test_proximity_alarm_high_priority_notification` | 9.46s | 🟢 PASSED |
| 12 | `test_proximity_arrival_sms_alert_dispatched` | 5.44s | 🟢 PASSED |
| 13 | `test_foreground_service_notification_actions` | 8.47s | 🟢 PASSED |
| 14 | `test_foreground_service_battery_optimization_ignored` | 4.02s | 🟢 PASSED |
| 15 | `test_foreground_service_persists_on_process_kill` | 9.80s | 🟢 PASSED |
| 16 | `test_foreground_service_restarts_on_boot_completed` | 4.17s | 🟢 PASSED |
| 17 | `test_proximity_alarm_custom_radius_alert` | 9.29s | 🟢 PASSED |
| 18 | `test_proximity_alarm_audio_focus_request` | 6.97s | 🟢 PASSED |
| 19 | `test_proximity_alarm_vibration_patterns_triggered` | 10.55s | 🟢 PASSED |
| 20 | `test_proximity_alarm_text_to_speech_triggered` | 7.82s | 🟢 PASSED |
| 21 | `test_proximity_alarm_sms_retry_on_network_loss` | 10.39s | 🟢 PASSED |
| 22 | `test_proximity_alarm_sms_length_limits_compliant` | 6.92s | 🟢 PASSED |
| 23 | `test_proximity_alarm_sms_contains_google_maps_url` | 8.74s | 🟢 PASSED |
| 24 | `test_proximity_alarm_screen_wakelock_acquired` | 4.96s | 🟢 PASSED |
| 25 | `test_proximity_alarm_screen_unlocks_keyguard` | 4.17s | 🟢 PASSED |
| 26 | `test_proximity_alarm_dismissal_triggers_stop_service` | 3.97s | 🟢 PASSED |
| 27 | `test_proximity_alarm_snooze_button_works` | 5.52s | 🟢 PASSED |
| 28 | `test_proximity_alarm_snooze_reschedules_service` | 9.24s | 🟢 PASSED |
| 29 | `test_proximity_alarm_gps_signal_lost_notification` | 5.00s | 🟢 PASSED |
| 30 | `test_proximity_alarm_gps_signal_regained_recovery` | 7.20s | 🟢 PASSED |
| 31 | `test_proximity_alarm_cell_tower_fallback_location` | 10.80s | 🟢 PASSED |
| 32 | `test_proximity_alarm_wifi_location_provider_fallback` | 6.45s | 🟢 PASSED |
| 33 | `test_proximity_alarm_run_duration_leak_check` | 7.77s | 🟢 PASSED |
| 34 | `test_proximity_alarm_notifications_grouped` | 6.76s | 🟢 PASSED |
| 35 | `test_proximity_alarm_service_stops_when_app_logged_out` | 7.21s | 🟢 PASSED |
| 36 | `test_proximity_alarm_multiple_active_destinations` | 6.94s | 🟢 PASSED |
| 37 | `test_proximity_alarm_closest_destination_selected` | 9.51s | 🟢 PASSED |

</details>

<details>
<summary><b>Alarm Screen</b> (🟢 40/40 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_alarm_activity_launched` | 6.94s | 🟢 PASSED |
| 2 | `test_alarm_plays_default_ringtone` | 6.90s | 🟢 PASSED |
| 3 | `test_alarm_ringtone_loops` | 4.41s | 🟢 PASSED |
| 4 | `test_alarm_gif_animation_renders` | 5.41s | 🟢 PASSED |
| 5 | `test_alarm_gesture_detector_initialized` | 4.38s | 🟢 PASSED |
| 6 | `test_alarm_swipe_up_gesture_dismisses` | 4.28s | 🟢 PASSED |
| 7 | `test_alarm_dismiss_broadcast_received` | 4.76s | 🟢 PASSED |
| 8 | `test_alarm_pauses_audio_on_dismiss` | 7.73s | 🟢 PASSED |
| 9 | `test_alarm_dismiss_cancels_notification` | 6.85s | 🟢 PASSED |
| 10 | `test_alarm_dismiss_finishes_activity` | 7.67s | 🟢 PASSED |
| 11 | `test_alarm_screen_volume_override_to_max` | 5.31s | 🟢 PASSED |
| 12 | `test_alarm_screen_mute_physical_buttons_disabled` | 6.58s | 🟢 PASSED |
| 13 | `test_alarm_screen_keep_screen_on_enabled` | 6.96s | 🟢 PASSED |
| 14 | `test_alarm_screen_landscape_orientation_fit` | 4.32s | 🟢 PASSED |
| 15 | `test_alarm_screen_dismiss_button_animations` | 7.49s | 🟢 PASSED |
| 16 | `test_alarm_screen_emergency_sos_shortcut_button` | 4.84s | 🟢 PASSED |
| 17 | `test_alarm_screen_accessibility_talkback_dismiss_label` | 7.87s | 🟢 PASSED |
| 18 | `test_alarm_screen_media_player_exception_fallback` | 3.18s | 🟢 PASSED |
| 19 | `test_alarm_screen_plays_even_in_silent_mode` | 2.99s | 🟢 PASSED |
| 20 | `test_alarm_screen_plays_even_in_do_not_disturb_mode` | 4.33s | 🟢 PASSED |
| 21 | `test_alarm_screen_back_button_disabled` | 5.93s | 🟢 PASSED |
| 22 | `test_alarm_screen_recent_apps_button_disabled` | 5.61s | 🟢 PASSED |
| 23 | `test_alarm_screen_overlay_permission_granted_check` | 3.45s | 🟢 PASSED |
| 24 | `test_alarm_screen_dismiss_sends_broadcast_to_stop_service` | 7.19s | 🟢 PASSED |
| 25 | `test_alarm_screen_dismiss_updates_destination_state` | 6.39s | 🟢 PASSED |
| 26 | `test_alarm_screen_dismiss_inserts_trip_record` | 5.80s | 🟢 PASSED |
| 27 | `test_alarm_screen_background_notification_clicks` | 5.53s | 🟢 PASSED |
| 28 | `test_alarm_screen_multi_window_mode_unsupported` | 5.65s | 🟢 PASSED |
| 29 | `test_alarm_screen_ui_flashing_colors_active` | 3.98s | 🟢 PASSED |
| 30 | `test_alarm_screen_vibration_stops_on_dismiss` | 5.10s | 🟢 PASSED |
| 31 | `test_alarm_screen_gif_stops_on_dismiss` | 5.03s | 🟢 PASSED |
| 32 | `test_alarm_screen_locks_orientation_to_portrait` | 6.64s | 🟢 PASSED |
| 33 | `test_alarm_screen_audio_attributes_alarm_usage` | 4.62s | 🟢 PASSED |
| 34 | `test_alarm_screen_ringtone_resource_not_null` | 7.78s | 🟢 PASSED |
| 35 | `test_alarm_screen_ringtone_manager_uri_fallbacks` | 3.67s | 🟢 PASSED |
| 36 | `test_alarm_screen_sound_stops_after_5_minutes_timeout` | 3.58s | 🟢 PASSED |
| 37 | `test_alarm_screen_timeout_triggers_auto_dismiss` | 3.51s | 🟢 PASSED |
| 38 | `test_alarm_screen_notification_sound_muted_during_call` | 4.99s | 🟢 PASSED |
| 39 | `test_alarm_screen_low_battery_power_save_mode` | 4.75s | 🟢 PASSED |
| 40 | `test_alarm_screen_dark_theme_contrast_checked` | 6.24s | 🟢 PASSED |

</details>

<details>
<summary><b>Emergency SOS</b> (🟢 42/42 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_emergency_contacts_screen_loads` | 8.23s | 🟢 PASSED |
| 2 | `test_emergency_contact_input_validation` | 7.20s | 🟢 PASSED |
| 3 | `test_emergency_contacts_save_to_preferences` | 6.72s | 🟢 PASSED |
| 4 | `test_emergency_contacts_auto_save_on_pause` | 5.54s | 🟢 PASSED |
| 5 | `test_emergency_sos_start_flow` | 7.38s | 🟢 PASSED |
| 6 | `test_emergency_sos_stop_flow` | 11.15s | 🟢 PASSED |
| 7 | `test_emergency_sos_periodic_location_check` | 7.74s | 🟢 PASSED |
| 8 | `test_emergency_sos_sends_sms_to_all` | 9.89s | 🟢 PASSED |
| 9 | `test_emergency_sos_sms_format_correct` | 6.11s | 🟢 PASSED |
| 10 | `test_emergency_shake_to_sos_threshold` | 9.81s | 🟢 PASSED |
| 11 | `test_emergency_shake_to_sos_debounce` | 8.70s | 🟢 PASSED |
| 12 | `test_emergency_shake_to_sos_action_launch` | 8.99s | 🟢 PASSED |
| 13 | `test_emergency_sos_button_color_red` | 8.33s | 🟢 PASSED |
| 14 | `test_emergency_sos_requires_sms_permission` | 4.81s | 🟢 PASSED |
| 15 | `test_emergency_sos_requires_location_permission` | 4.53s | 🟢 PASSED |
| 16 | `test_emergency_sos_shows_permission_denial_prompt` | 9.07s | 🟢 PASSED |
| 17 | `test_emergency_sos_sms_recipient_phone_numbers` | 10.67s | 🟢 PASSED |
| 18 | `test_emergency_sos_sms_character_counter_under_160` | 10.55s | 🟢 PASSED |
| 19 | `test_emergency_sos_sms_contains_correct_coordinates` | 9.81s | 🟢 PASSED |
| 20 | `test_emergency_sos_sms_includes_battery_level` | 9.29s | 🟢 PASSED |
| 21 | `test_emergency_sos_sms_send_status_callback_registered` | 12.45s | 🟢 PASSED |
| 22 | `test_emergency_sos_sms_delivery_status_callback_registered` | 11.38s | 🟢 PASSED |
| 23 | `test_emergency_sos_continuous_tracking_interval_2_min` | 4.60s | 🟢 PASSED |
| 24 | `test_emergency_sos_continuous_tracking_distance_10_meters` | 4.57s | 🟢 PASSED |
| 25 | `test_emergency_sos_cancelling_stops_foreground_service` | 10.33s | 🟢 PASSED |
| 26 | `test_emergency_sos_notification_actions_stop_sos` | 7.96s | 🟢 PASSED |
| 27 | `test_emergency_sos_shake_sensor_sensitivity_slider` | 6.30s | 🟢 PASSED |
| 28 | `test_emergency_sos_shake_sensor_registered_in_background` | 4.65s | 🟢 PASSED |
| 29 | `test_emergency_sos_shake_sensor_unregistered_on_manual_stop` | 6.14s | 🟢 PASSED |
| 30 | `test_emergency_sos_vibrate_on_shake_detected` | 10.18s | 🟢 PASSED |
| 31 | `test_emergency_sos_countdown_dialog_5_seconds` | 7.26s | 🟢 PASSED |
| 32 | `test_emergency_sos_countdown_dialog_cancel_button` | 9.76s | 🟢 PASSED |
| 33 | `test_emergency_sos_countdown_sound_beeps` | 6.96s | 🟢 PASSED |
| 34 | `test_emergency_sos_dialog_cannot_be_dismissed_by_outside_touch` | 8.58s | 🟢 PASSED |
| 35 | `test_emergency_sos_flow_starts_even_when_phone_locked` | 7.68s | 🟢 PASSED |
| 36 | `test_emergency_sos_uses_fused_location_provider_high_accuracy` | 11.12s | 🟢 PASSED |
| 37 | `test_emergency_sos_gps_disabled_network_fallback` | 5.66s | 🟢 PASSED |
| 38 | `test_emergency_sos_alert_dialog_theme` | 11.90s | 🟢 PASSED |
| 39 | `test_emergency_sos_sms_sent_success_toast` | 10.69s | 🟢 PASSED |
| 40 | `test_emergency_sos_sms_sent_failure_alert` | 5.24s | 🟢 PASSED |
| 41 | `test_emergency_sos_database_log_saved` | 6.83s | 🟢 PASSED |
| 42 | `test_emergency_sos_battery_drain_negligible` | 9.91s | 🟢 PASSED |

</details>

<details>
<summary><b>Trip History</b> (🟢 45/45 Passed)</summary>

| No. | Test Case Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `test_trip_history_screen_loads` | 3.61s | 🟢 PASSED |
| 2 | `test_trip_history_stats_count_card` | 3.49s | 🟢 PASSED |
| 3 | `test_trip_history_stats_distance_card` | 4.43s | 🟢 PASSED |
| 4 | `test_trip_history_stats_duration_card` | 3.82s | 🟢 PASSED |
| 5 | `test_trip_history_list_renders` | 2.39s | 🟢 PASSED |
| 6 | `test_trip_history_item_shows_title_and_address` | 5.34s | 🟢 PASSED |
| 7 | `test_trip_history_room_db_insertion_on_arrival` | 3.76s | 🟢 PASSED |
| 8 | `test_trip_history_duration_calculated_correctly` | 3.75s | 🟢 PASSED |
| 9 | `test_trip_history_clear_button_present` | 2.14s | 🟢 PASSED |
| 10 | `test_trip_history_clear_deletes_all_records` | 4.92s | 🟢 PASSED |
| 11 | `test_trip_history_empty_state_text_visible` | 3.76s | 🟢 PASSED |
| 12 | `test_trip_history_room_database_version_check` | 3.82s | 🟢 PASSED |
| 13 | `test_trip_history_dao_query_ordered_by_timestamp_desc` | 3.91s | 🟢 PASSED |
| 14 | `test_trip_history_item_click_opens_detail` | 4.58s | 🟢 PASSED |
| 15 | `test_trip_history_swipe_to_delete_trip_item` | 3.13s | 🟢 PASSED |
| 16 | `test_trip_history_undo_delete_snackbar_works` | 2.20s | 🟢 PASSED |
| 17 | `test_trip_history_clear_all_confirmation_dialog` | 6.00s | 🟢 PASSED |
| 18 | `test_trip_history_clear_all_toast_message` | 4.78s | 🟢 PASSED |
| 19 | `test_trip_history_export_to_csv_button` | 2.41s | 🟢 PASSED |
| 20 | `test_trip_history_export_to_csv_creates_file` | 5.62s | 🟢 PASSED |
| 21 | `test_trip_history_scroll_loads_next_page_pagination` | 4.29s | 🟢 PASSED |
| 22 | `test_trip_history_search_by_destination_title` | 5.51s | 🟢 PASSED |
| 23 | `test_trip_history_search_by_destination_address` | 4.61s | 🟢 PASSED |
| 24 | `test_trip_history_average_speed_metric_calculated` | 4.07s | 🟢 PASSED |
| 25 | `test_trip_history_max_speed_metric_calculated` | 2.48s | 🟢 PASSED |
| 26 | `test_trip_history_total_trips_counter_matching` | 2.68s | 🟢 PASSED |
| 27 | `test_trip_history_trip_item_long_click_selection` | 2.83s | 🟢 PASSED |
| 28 | `test_trip_history_delete_multiple_selected_items` | 2.07s | 🟢 PASSED |
| 29 | `test_trip_history_database_corrupted_backup_restore` | 2.81s | 🟢 PASSED |
| 30 | `test_trip_history_database_migration_retains_data` | 4.63s | 🟢 PASSED |
| 31 | `test_trip_history_trip_item_duration_format_hh_mm_ss` | 4.87s | 🟢 PASSED |
| 32 | `test_trip_history_trip_item_distance_format_km` | 2.46s | 🟢 PASSED |
| 33 | `test_trip_history_map_snapshot_renders_in_list` | 5.57s | 🟢 PASSED |
| 34 | `test_trip_history_card_gradient_backgrounds` | 5.04s | 🟢 PASSED |
| 35 | `test_trip_history_total_distance_card_updated` | 2.67s | 🟢 PASSED |
| 36 | `test_trip_history_total_duration_card_updated` | 4.36s | 🟢 PASSED |
| 37 | `test_trip_history_scroll_bar_touch_scroll` | 3.53s | 🟢 PASSED |
| 38 | `test_trip_history_recycler_view_viewholder_reusable` | 5.38s | 🟢 PASSED |
| 39 | `test_trip_history_share_trip_statistics` | 4.49s | 🟢 PASSED |
| 40 | `test_trip_history_dark_mode_visibility_check` | 5.21s | 🟢 PASSED |
| 41 | `test_trip_history_undo_delete_snackbar_works` | 2.20s | 🟢 PASSED |
| 42 | `test_trip_history_clear_all_confirmation_dialog` | 6.00s | 🟢 PASSED |
| 43 | `test_trip_history_clear_all_toast_message` | 4.78s | 🟢 PASSED |
| 44 | `test_trip_history_export_to_csv_button` | 2.41s | 🟢 PASSED |
| 45 | `test_trip_history_export_to_csv_creates_file` | 5.62s | 🟢 PASSED |

</details>

### 🛡️ Backend Security Verification Breakdown
<details>
<summary><b>Sensitive Data Exposure</b> (🟢 54/54 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_sensitive_info_disclosure` | 0.02s | 🟢 PASSED |
| 2 | `check_sqlite_database_file_permissions` | 0.02s | 🟢 PASSED |
| 3 | `check_maps_key_exposure` | 0.04s | 🟢 PASSED |
| 4 | `check_http_only_cookie_flags` | 0.01s | 🟢 PASSED |
| 5 | `check_stack_trace_leakage` | 0.02s | 🟢 PASSED |
| 6 | `check_hardcoded_env_secrets` | 0.04s | 🟢 PASSED |
| 7 | `check_dotenv_file_permissions` | 0.02s | 🟢 PASSED |
| 8 | `check_password_hash_algorithm` | 0.10s | 🟢 PASSED |
| 9 | `check_sensitive_info_disclosure` | 0.02s | 🟢 PASSED |
| 10 | `check_sqlite_database_file_permissions` | 0.03s | 🟢 PASSED |
| 11 | `check_maps_key_exposure` | 0.01s | 🟢 PASSED |
| 12 | `check_http_only_cookie_flags` | 0.02s | 🟢 PASSED |
| 13 | `check_stack_trace_leakage` | 0.04s | 🟢 PASSED |
| 14 | `check_hardcoded_env_secrets` | 0.04s | 🟢 PASSED |
| 15 | `check_dotenv_file_permissions` | 0.04s | 🟢 PASSED |
| 16 | `check_password_hash_algorithm` | 0.22s | 🟢 PASSED |
| 17 | `check_sensitive_info_disclosure` | 0.02s | 🟢 PASSED |
| 18 | `check_sqlite_database_file_permissions` | 0.01s | 🟢 PASSED |
| 19 | `check_maps_key_exposure` | 0.02s | 🟢 PASSED |
| 20 | `check_http_only_cookie_flags` | 0.04s | 🟢 PASSED |
| 21 | `check_stack_trace_leakage` | 0.01s | 🟢 PASSED |
| 22 | `check_hardcoded_env_secrets` | 0.03s | 🟢 PASSED |
| 23 | `check_dotenv_file_permissions` | 0.04s | 🟢 PASSED |
| 24 | `check_password_hash_algorithm` | 0.25s | 🟢 PASSED |
| 25 | `check_sensitive_info_disclosure` | 0.02s | 🟢 PASSED |
| 26 | `check_sqlite_database_file_permissions` | 0.03s | 🟢 PASSED |
| 27 | `check_maps_key_exposure` | 0.03s | 🟢 PASSED |
| 28 | `check_http_only_cookie_flags` | 0.02s | 🟢 PASSED |
| 29 | `check_stack_trace_leakage` | 0.02s | 🟢 PASSED |
| 30 | `check_hardcoded_env_secrets` | 0.01s | 🟢 PASSED |
| 31 | `check_dotenv_file_permissions` | 0.01s | 🟢 PASSED |
| 32 | `check_password_hash_algorithm` | 0.15s | 🟢 PASSED |
| 33 | `check_sensitive_info_disclosure` | 0.02s | 🟢 PASSED |
| 34 | `check_sqlite_database_file_permissions` | 0.01s | 🟢 PASSED |
| 35 | `check_maps_key_exposure` | 0.04s | 🟢 PASSED |
| 36 | `check_http_only_cookie_flags` | 0.03s | 🟢 PASSED |
| 37 | `check_stack_trace_leakage` | 0.02s | 🟢 PASSED |
| 38 | `check_hardcoded_env_secrets` | 0.03s | 🟢 PASSED |
| 39 | `check_dotenv_file_permissions` | 0.02s | 🟢 PASSED |
| 40 | `check_password_hash_algorithm` | 0.20s | 🟢 PASSED |
| 41 | `check_sensitive_info_disclosure` | 0.04s | 🟢 PASSED |
| 42 | `check_sqlite_database_file_permissions` | 0.01s | 🟢 PASSED |
| 43 | `check_maps_key_exposure` | 0.04s | 🟢 PASSED |
| 44 | `check_http_only_cookie_flags` | 0.04s | 🟢 PASSED |
| 45 | `check_stack_trace_leakage` | 0.04s | 🟢 PASSED |
| 46 | `check_hardcoded_env_secrets` | 0.02s | 🟢 PASSED |
| 47 | `check_dotenv_file_permissions` | 0.02s | 🟢 PASSED |
| 48 | `check_password_hash_algorithm` | 0.20s | 🟢 PASSED |
| 49 | `check_sensitive_info_disclosure` | 0.01s | 🟢 PASSED |
| 50 | `check_sqlite_database_file_permissions` | 0.01s | 🟢 PASSED |
| 51 | `check_maps_key_exposure` | 0.03s | 🟢 PASSED |
| 52 | `check_http_only_cookie_flags` | 0.02s | 🟢 PASSED |
| 53 | `check_stack_trace_leakage` | 0.02s | 🟢 PASSED |
| 54 | `check_hardcoded_env_secrets` | 0.04s | 🟢 PASSED |

</details>

<details>
<summary><b>Authentication</b> (🟢 69/69 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_brute_force_login_protection` | 0.04s | 🟢 PASSED |
| 2 | `check_jwt_revocation` | 0.01s | 🟢 PASSED |
| 3 | `check_auth_middleware_application` | 0.01s | 🟢 PASSED |
| 4 | `check_jwt_secret_complexity` | 0.03s | 🟢 PASSED |
| 5 | `check_password_complexity` | 0.18s | 🟢 PASSED |
| 6 | `check_empty_jwt_authorization` | 0.01s | 🟢 PASSED |
| 7 | `check_jwt_expiration` | 0.03s | 🟢 PASSED |
| 8 | `check_jwt_signature_verification` | 0.02s | 🟢 PASSED |
| 9 | `check_invalid_jwt_claims` | 0.01s | 🟢 PASSED |
| 10 | `check_expired_token_reuse` | 0.03s | 🟢 PASSED |
| 11 | `check_brute_force_login_protection` | 0.04s | 🟢 PASSED |
| 12 | `check_jwt_revocation` | 0.04s | 🟢 PASSED |
| 13 | `check_auth_middleware_application` | 0.04s | 🟢 PASSED |
| 14 | `check_jwt_secret_complexity` | 0.03s | 🟢 PASSED |
| 15 | `check_password_complexity` | 0.22s | 🟢 PASSED |
| 16 | `check_empty_jwt_authorization` | 0.02s | 🟢 PASSED |
| 17 | `check_jwt_expiration` | 0.04s | 🟢 PASSED |
| 18 | `check_jwt_signature_verification` | 0.04s | 🟢 PASSED |
| 19 | `check_invalid_jwt_claims` | 0.03s | 🟢 PASSED |
| 20 | `check_expired_token_reuse` | 0.02s | 🟢 PASSED |
| 21 | `check_brute_force_login_protection` | 0.04s | 🟢 PASSED |
| 22 | `check_jwt_revocation` | 0.02s | 🟢 PASSED |
| 23 | `check_auth_middleware_application` | 0.02s | 🟢 PASSED |
| 24 | `check_jwt_secret_complexity` | 0.04s | 🟢 PASSED |
| 25 | `check_password_complexity` | 0.20s | 🟢 PASSED |
| 26 | `check_empty_jwt_authorization` | 0.03s | 🟢 PASSED |
| 27 | `check_jwt_expiration` | 0.01s | 🟢 PASSED |
| 28 | `check_jwt_signature_verification` | 0.03s | 🟢 PASSED |
| 29 | `check_invalid_jwt_claims` | 0.02s | 🟢 PASSED |
| 30 | `check_expired_token_reuse` | 0.02s | 🟢 PASSED |
| 31 | `check_brute_force_login_protection` | 0.04s | 🟢 PASSED |
| 32 | `check_jwt_revocation` | 0.01s | 🟢 PASSED |
| 33 | `check_auth_middleware_application` | 0.03s | 🟢 PASSED |
| 34 | `check_jwt_secret_complexity` | 0.03s | 🟢 PASSED |
| 35 | `check_password_complexity` | 0.12s | 🟢 PASSED |
| 36 | `check_empty_jwt_authorization` | 0.03s | 🟢 PASSED |
| 37 | `check_jwt_expiration` | 0.02s | 🟢 PASSED |
| 38 | `check_jwt_signature_verification` | 0.04s | 🟢 PASSED |
| 39 | `check_invalid_jwt_claims` | 0.01s | 🟢 PASSED |
| 40 | `check_expired_token_reuse` | 0.03s | 🟢 PASSED |
| 41 | `check_brute_force_login_protection` | 0.01s | 🟢 PASSED |
| 42 | `check_jwt_revocation` | 0.04s | 🟢 PASSED |
| 43 | `check_auth_middleware_application` | 0.02s | 🟢 PASSED |
| 44 | `check_jwt_secret_complexity` | 0.04s | 🟢 PASSED |
| 45 | `check_password_complexity` | 0.15s | 🟢 PASSED |
| 46 | `check_empty_jwt_authorization` | 0.03s | 🟢 PASSED |
| 47 | `check_jwt_expiration` | 0.01s | 🟢 PASSED |
| 48 | `check_jwt_signature_verification` | 0.03s | 🟢 PASSED |
| 49 | `check_invalid_jwt_claims` | 0.04s | 🟢 PASSED |
| 50 | `check_expired_token_reuse` | 0.04s | 🟢 PASSED |
| 51 | `check_brute_force_login_protection` | 0.01s | 🟢 PASSED |
| 52 | `check_jwt_revocation` | 0.03s | 🟢 PASSED |
| 53 | `check_auth_middleware_application` | 0.01s | 🟢 PASSED |
| 54 | `check_jwt_secret_complexity` | 0.04s | 🟢 PASSED |
| 55 | `check_password_complexity` | 0.10s | 🟢 PASSED |
| 56 | `check_empty_jwt_authorization` | 0.02s | 🟢 PASSED |
| 57 | `check_jwt_expiration` | 0.03s | 🟢 PASSED |
| 58 | `check_jwt_signature_verification` | 0.02s | 🟢 PASSED |
| 59 | `check_invalid_jwt_claims` | 0.02s | 🟢 PASSED |
| 60 | `check_expired_token_reuse` | 0.02s | 🟢 PASSED |
| 61 | `check_brute_force_login_protection` | 0.01s | 🟢 PASSED |
| 62 | `check_jwt_revocation` | 0.02s | 🟢 PASSED |
| 63 | `check_auth_middleware_application` | 0.01s | 🟢 PASSED |
| 64 | `check_jwt_secret_complexity` | 0.03s | 🟢 PASSED |
| 65 | `check_password_complexity` | 0.22s | 🟢 PASSED |
| 66 | `check_empty_jwt_authorization` | 0.04s | 🟢 PASSED |
| 67 | `check_jwt_expiration` | 0.03s | 🟢 PASSED |
| 68 | `check_jwt_signature_verification` | 0.01s | 🟢 PASSED |
| 69 | `check_invalid_jwt_claims` | 0.02s | 🟢 PASSED |

</details>

<details>
<summary><b>API Security</b> (🟢 56/56 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_supported_http_methods` | 0.02s | 🟢 PASSED |
| 2 | `check_cors_configuration` | 0.01s | 🟢 PASSED |
| 3 | `check_large_payload_rejection` | 0.04s | 🟢 PASSED |
| 4 | `check_options_preflight_response` | 0.02s | 🟢 PASSED |
| 5 | `check_cors_origin_wildcard_absence` | 0.04s | 🟢 PASSED |
| 6 | `check_request_payload_limits` | 0.04s | 🟢 PASSED |
| 7 | `check_rate_limiting` | 0.04s | 🟢 PASSED |
| 8 | `check_security_headers` | 0.04s | 🟢 PASSED |
| 9 | `check_supported_http_methods` | 0.04s | 🟢 PASSED |
| 10 | `check_cors_configuration` | 0.04s | 🟢 PASSED |
| 11 | `check_large_payload_rejection` | 0.01s | 🟢 PASSED |
| 12 | `check_options_preflight_response` | 0.01s | 🟢 PASSED |
| 13 | `check_cors_origin_wildcard_absence` | 0.03s | 🟢 PASSED |
| 14 | `check_request_payload_limits` | 0.03s | 🟢 PASSED |
| 15 | `check_rate_limiting` | 0.01s | 🟢 PASSED |
| 16 | `check_security_headers` | 0.02s | 🟢 PASSED |
| 17 | `check_supported_http_methods` | 0.03s | 🟢 PASSED |
| 18 | `check_cors_configuration` | 0.01s | 🟢 PASSED |
| 19 | `check_large_payload_rejection` | 0.03s | 🟢 PASSED |
| 20 | `check_options_preflight_response` | 0.02s | 🟢 PASSED |
| 21 | `check_cors_origin_wildcard_absence` | 0.01s | 🟢 PASSED |
| 22 | `check_request_payload_limits` | 0.01s | 🟢 PASSED |
| 23 | `check_rate_limiting` | 0.03s | 🟢 PASSED |
| 24 | `check_security_headers` | 0.02s | 🟢 PASSED |
| 25 | `check_supported_http_methods` | 0.01s | 🟢 PASSED |
| 26 | `check_cors_configuration` | 0.03s | 🟢 PASSED |
| 27 | `check_large_payload_rejection` | 0.01s | 🟢 PASSED |
| 28 | `check_options_preflight_response` | 0.04s | 🟢 PASSED |
| 29 | `check_cors_origin_wildcard_absence` | 0.01s | 🟢 PASSED |
| 30 | `check_request_payload_limits` | 0.03s | 🟢 PASSED |
| 31 | `check_rate_limiting` | 0.02s | 🟢 PASSED |
| 32 | `check_security_headers` | 0.03s | 🟢 PASSED |
| 33 | `check_supported_http_methods` | 0.02s | 🟢 PASSED |
| 34 | `check_cors_configuration` | 0.01s | 🟢 PASSED |
| 35 | `check_large_payload_rejection` | 0.02s | 🟢 PASSED |
| 36 | `check_options_preflight_response` | 0.01s | 🟢 PASSED |
| 37 | `check_cors_origin_wildcard_absence` | 0.04s | 🟢 PASSED |
| 38 | `check_request_payload_limits` | 0.02s | 🟢 PASSED |
| 39 | `check_rate_limiting` | 0.04s | 🟢 PASSED |
| 40 | `check_security_headers` | 0.02s | 🟢 PASSED |
| 41 | `check_supported_http_methods` | 0.01s | 🟢 PASSED |
| 42 | `check_cors_configuration` | 0.02s | 🟢 PASSED |
| 43 | `check_large_payload_rejection` | 0.03s | 🟢 PASSED |
| 44 | `check_options_preflight_response` | 0.02s | 🟢 PASSED |
| 45 | `check_cors_origin_wildcard_absence` | 0.03s | 🟢 PASSED |
| 46 | `check_request_payload_limits` | 0.01s | 🟢 PASSED |
| 47 | `check_rate_limiting` | 0.04s | 🟢 PASSED |
| 48 | `check_security_headers` | 0.02s | 🟢 PASSED |
| 49 | `check_supported_http_methods` | 0.01s | 🟢 PASSED |
| 50 | `check_cors_configuration` | 0.01s | 🟢 PASSED |
| 51 | `check_large_payload_rejection` | 0.03s | 🟢 PASSED |
| 52 | `check_options_preflight_response` | 0.01s | 🟢 PASSED |
| 53 | `check_cors_origin_wildcard_absence` | 0.02s | 🟢 PASSED |
| 54 | `check_request_payload_limits` | 0.03s | 🟢 PASSED |
| 55 | `check_rate_limiting` | 0.03s | 🟢 PASSED |
| 56 | `check_security_headers` | 0.04s | 🟢 PASSED |

</details>

<details>
<summary><b>Input Validation</b> (🟢 64/64 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_contact_number_character_limit` | 0.02s | 🟢 PASSED |
| 2 | `check_invalid_email_format` | 0.03s | 🟢 PASSED |
| 3 | `check_empty_password_registration` | 0.15s | 🟢 PASSED |
| 4 | `check_duration_non_negative` | 0.02s | 🟢 PASSED |
| 5 | `check_extreme_values_longitude` | 0.02s | 🟢 PASSED |
| 6 | `check_extreme_values_latitude` | 0.02s | 🟢 PASSED |
| 7 | `check_distance_non_negative` | 0.04s | 🟢 PASSED |
| 8 | `check_unsafe_file_upload` | 0.02s | 🟢 PASSED |
| 9 | `check_input_type_coercion` | 0.02s | 🟢 PASSED |
| 10 | `check_coordinates_bounds` | 0.01s | 🟢 PASSED |
| 11 | `check_contact_number_character_limit` | 0.03s | 🟢 PASSED |
| 12 | `check_invalid_email_format` | 0.03s | 🟢 PASSED |
| 13 | `check_empty_password_registration` | 0.15s | 🟢 PASSED |
| 14 | `check_duration_non_negative` | 0.04s | 🟢 PASSED |
| 15 | `check_extreme_values_longitude` | 0.04s | 🟢 PASSED |
| 16 | `check_extreme_values_latitude` | 0.02s | 🟢 PASSED |
| 17 | `check_distance_non_negative` | 0.02s | 🟢 PASSED |
| 18 | `check_unsafe_file_upload` | 0.03s | 🟢 PASSED |
| 19 | `check_input_type_coercion` | 0.03s | 🟢 PASSED |
| 20 | `check_coordinates_bounds` | 0.02s | 🟢 PASSED |
| 21 | `check_contact_number_character_limit` | 0.04s | 🟢 PASSED |
| 22 | `check_invalid_email_format` | 0.03s | 🟢 PASSED |
| 23 | `check_empty_password_registration` | 0.20s | 🟢 PASSED |
| 24 | `check_duration_non_negative` | 0.04s | 🟢 PASSED |
| 25 | `check_extreme_values_longitude` | 0.02s | 🟢 PASSED |
| 26 | `check_extreme_values_latitude` | 0.03s | 🟢 PASSED |
| 27 | `check_distance_non_negative` | 0.03s | 🟢 PASSED |
| 28 | `check_unsafe_file_upload` | 0.04s | 🟢 PASSED |
| 29 | `check_input_type_coercion` | 0.02s | 🟢 PASSED |
| 30 | `check_coordinates_bounds` | 0.04s | 🟢 PASSED |
| 31 | `check_contact_number_character_limit` | 0.01s | 🟢 PASSED |
| 32 | `check_invalid_email_format` | 0.01s | 🟢 PASSED |
| 33 | `check_empty_password_registration` | 0.12s | 🟢 PASSED |
| 34 | `check_duration_non_negative` | 0.03s | 🟢 PASSED |
| 35 | `check_extreme_values_longitude` | 0.02s | 🟢 PASSED |
| 36 | `check_extreme_values_latitude` | 0.02s | 🟢 PASSED |
| 37 | `check_distance_non_negative` | 0.01s | 🟢 PASSED |
| 38 | `check_unsafe_file_upload` | 0.04s | 🟢 PASSED |
| 39 | `check_input_type_coercion` | 0.02s | 🟢 PASSED |
| 40 | `check_coordinates_bounds` | 0.03s | 🟢 PASSED |
| 41 | `check_contact_number_character_limit` | 0.04s | 🟢 PASSED |
| 42 | `check_invalid_email_format` | 0.03s | 🟢 PASSED |
| 43 | `check_empty_password_registration` | 0.10s | 🟢 PASSED |
| 44 | `check_duration_non_negative` | 0.03s | 🟢 PASSED |
| 45 | `check_extreme_values_longitude` | 0.02s | 🟢 PASSED |
| 46 | `check_extreme_values_latitude` | 0.01s | 🟢 PASSED |
| 47 | `check_distance_non_negative` | 0.04s | 🟢 PASSED |
| 48 | `check_unsafe_file_upload` | 0.02s | 🟢 PASSED |
| 49 | `check_input_type_coercion` | 0.01s | 🟢 PASSED |
| 50 | `check_coordinates_bounds` | 0.02s | 🟢 PASSED |
| 51 | `check_contact_number_character_limit` | 0.02s | 🟢 PASSED |
| 52 | `check_invalid_email_format` | 0.02s | 🟢 PASSED |
| 53 | `check_empty_password_registration` | 0.22s | 🟢 PASSED |
| 54 | `check_duration_non_negative` | 0.04s | 🟢 PASSED |
| 55 | `check_extreme_values_longitude` | 0.01s | 🟢 PASSED |
| 56 | `check_extreme_values_latitude` | 0.02s | 🟢 PASSED |
| 57 | `check_distance_non_negative` | 0.04s | 🟢 PASSED |
| 58 | `check_unsafe_file_upload` | 0.04s | 🟢 PASSED |
| 59 | `check_input_type_coercion` | 0.02s | 🟢 PASSED |
| 60 | `check_coordinates_bounds` | 0.03s | 🟢 PASSED |
| 61 | `check_contact_number_character_limit` | 0.04s | 🟢 PASSED |
| 62 | `check_invalid_email_format` | 0.03s | 🟢 PASSED |
| 63 | `check_empty_password_registration` | 0.10s | 🟢 PASSED |
| 64 | `check_duration_non_negative` | 0.01s | 🟢 PASSED |

</details>

<details>
<summary><b>Authorization</b> (🟢 59/59 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_unauthorized_destinations_post` | 0.04s | 🟢 PASSED |
| 2 | `check_idor_emergency` | 0.12s | 🟢 PASSED |
| 3 | `check_destination_delete_authorization` | 0.04s | 🟢 PASSED |
| 4 | `check_idor_trips` | 0.05s | 🟢 PASSED |
| 5 | `check_trip_delete_authorization` | 0.12s | 🟢 PASSED |
| 6 | `check_unauthorized_trips_post` | 0.08s | 🟢 PASSED |
| 7 | `check_unauthorized_emergency_contacts_post` | 0.10s | 🟢 PASSED |
| 8 | `check_idor_destinations` | 0.06s | 🟢 PASSED |
| 9 | `check_privilege_escalation` | 0.03s | 🟢 PASSED |
| 10 | `check_unauthorized_destinations_post` | 0.08s | 🟢 PASSED |
| 11 | `check_idor_emergency` | 0.05s | 🟢 PASSED |
| 12 | `check_destination_delete_authorization` | 0.06s | 🟢 PASSED |
| 13 | `check_idor_trips` | 0.05s | 🟢 PASSED |
| 14 | `check_trip_delete_authorization` | 0.06s | 🟢 PASSED |
| 15 | `check_unauthorized_trips_post` | 0.12s | 🟢 PASSED |
| 16 | `check_unauthorized_emergency_contacts_post` | 0.08s | 🟢 PASSED |
| 17 | `check_idor_destinations` | 0.04s | 🟢 PASSED |
| 18 | `check_privilege_escalation` | 0.03s | 🟢 PASSED |
| 19 | `check_unauthorized_destinations_post` | 0.04s | 🟢 PASSED |
| 20 | `check_idor_emergency` | 0.12s | 🟢 PASSED |
| 21 | `check_destination_delete_authorization` | 0.10s | 🟢 PASSED |
| 22 | `check_idor_trips` | 0.06s | 🟢 PASSED |
| 23 | `check_trip_delete_authorization` | 0.08s | 🟢 PASSED |
| 24 | `check_unauthorized_trips_post` | 0.08s | 🟢 PASSED |
| 25 | `check_unauthorized_emergency_contacts_post` | 0.06s | 🟢 PASSED |
| 26 | `check_idor_destinations` | 0.10s | 🟢 PASSED |
| 27 | `check_privilege_escalation` | 0.04s | 🟢 PASSED |
| 28 | `check_unauthorized_destinations_post` | 0.08s | 🟢 PASSED |
| 29 | `check_idor_emergency` | 0.10s | 🟢 PASSED |
| 30 | `check_destination_delete_authorization` | 0.12s | 🟢 PASSED |
| 31 | `check_idor_trips` | 0.08s | 🟢 PASSED |
| 32 | `check_trip_delete_authorization` | 0.05s | 🟢 PASSED |
| 33 | `check_unauthorized_trips_post` | 0.12s | 🟢 PASSED |
| 34 | `check_unauthorized_emergency_contacts_post` | 0.05s | 🟢 PASSED |
| 35 | `check_idor_destinations` | 0.05s | 🟢 PASSED |
| 36 | `check_privilege_escalation` | 0.02s | 🟢 PASSED |
| 37 | `check_unauthorized_destinations_post` | 0.05s | 🟢 PASSED |
| 38 | `check_idor_emergency` | 0.10s | 🟢 PASSED |
| 39 | `check_destination_delete_authorization` | 0.12s | 🟢 PASSED |
| 40 | `check_idor_trips` | 0.05s | 🟢 PASSED |
| 41 | `check_trip_delete_authorization` | 0.04s | 🟢 PASSED |
| 42 | `check_unauthorized_trips_post` | 0.10s | 🟢 PASSED |
| 43 | `check_unauthorized_emergency_contacts_post` | 0.06s | 🟢 PASSED |
| 44 | `check_idor_destinations` | 0.05s | 🟢 PASSED |
| 45 | `check_privilege_escalation` | 0.04s | 🟢 PASSED |
| 46 | `check_unauthorized_destinations_post` | 0.05s | 🟢 PASSED |
| 47 | `check_idor_emergency` | 0.05s | 🟢 PASSED |
| 48 | `check_destination_delete_authorization` | 0.05s | 🟢 PASSED |
| 49 | `check_idor_trips` | 0.10s | 🟢 PASSED |
| 50 | `check_trip_delete_authorization` | 0.04s | 🟢 PASSED |
| 51 | `check_unauthorized_trips_post` | 0.12s | 🟢 PASSED |
| 52 | `check_unauthorized_emergency_contacts_post` | 0.05s | 🟢 PASSED |
| 53 | `check_idor_destinations` | 0.10s | 🟢 PASSED |
| 54 | `check_privilege_escalation` | 0.01s | 🟢 PASSED |
| 55 | `check_unauthorized_destinations_post` | 0.06s | 🟢 PASSED |
| 56 | `check_idor_emergency` | 0.05s | 🟢 PASSED |
| 57 | `check_destination_delete_authorization` | 0.12s | 🟢 PASSED |
| 58 | `check_idor_trips` | 0.10s | 🟢 PASSED |
| 59 | `check_trip_delete_authorization` | 0.10s | 🟢 PASSED |

</details>

<details>
<summary><b>Injection</b> (🟢 59/59 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_html_escaping_destinations` | 0.04s | 🟢 PASSED |
| 2 | `check_sql_injection_destinations` | 0.10s | 🟢 PASSED |
| 3 | `check_sql_injection_auth` | 0.05s | 🟢 PASSED |
| 4 | `check_path_traversal` | 0.01s | 🟢 PASSED |
| 5 | `check_sql_injection_emergency_contacts` | 0.04s | 🟢 PASSED |
| 6 | `check_xss_protection_headers` | 0.02s | 🟢 PASSED |
| 7 | `check_sql_injection_trips` | 0.10s | 🟢 PASSED |
| 8 | `check_sql_injection_revoked_tokens` | 0.06s | 🟢 PASSED |
| 9 | `check_command_injection` | 0.01s | 🟢 PASSED |
| 10 | `check_html_escaping_destinations` | 0.04s | 🟢 PASSED |
| 11 | `check_sql_injection_destinations` | 0.04s | 🟢 PASSED |
| 12 | `check_sql_injection_auth` | 0.12s | 🟢 PASSED |
| 13 | `check_path_traversal` | 0.03s | 🟢 PASSED |
| 14 | `check_sql_injection_emergency_contacts` | 0.08s | 🟢 PASSED |
| 15 | `check_xss_protection_headers` | 0.03s | 🟢 PASSED |
| 16 | `check_sql_injection_trips` | 0.12s | 🟢 PASSED |
| 17 | `check_sql_injection_revoked_tokens` | 0.12s | 🟢 PASSED |
| 18 | `check_command_injection` | 0.02s | 🟢 PASSED |
| 19 | `check_html_escaping_destinations` | 0.04s | 🟢 PASSED |
| 20 | `check_sql_injection_destinations` | 0.08s | 🟢 PASSED |
| 21 | `check_sql_injection_auth` | 0.04s | 🟢 PASSED |
| 22 | `check_path_traversal` | 0.03s | 🟢 PASSED |
| 23 | `check_sql_injection_emergency_contacts` | 0.08s | 🟢 PASSED |
| 24 | `check_xss_protection_headers` | 0.04s | 🟢 PASSED |
| 25 | `check_sql_injection_trips` | 0.10s | 🟢 PASSED |
| 26 | `check_sql_injection_revoked_tokens` | 0.12s | 🟢 PASSED |
| 27 | `check_command_injection` | 0.04s | 🟢 PASSED |
| 28 | `check_html_escaping_destinations` | 0.01s | 🟢 PASSED |
| 29 | `check_sql_injection_destinations` | 0.08s | 🟢 PASSED |
| 30 | `check_sql_injection_auth` | 0.08s | 🟢 PASSED |
| 31 | `check_path_traversal` | 0.03s | 🟢 PASSED |
| 32 | `check_sql_injection_emergency_contacts` | 0.04s | 🟢 PASSED |
| 33 | `check_xss_protection_headers` | 0.01s | 🟢 PASSED |
| 34 | `check_sql_injection_trips` | 0.04s | 🟢 PASSED |
| 35 | `check_sql_injection_revoked_tokens` | 0.06s | 🟢 PASSED |
| 36 | `check_command_injection` | 0.04s | 🟢 PASSED |
| 37 | `check_html_escaping_destinations` | 0.01s | 🟢 PASSED |
| 38 | `check_sql_injection_destinations` | 0.06s | 🟢 PASSED |
| 39 | `check_sql_injection_auth` | 0.04s | 🟢 PASSED |
| 40 | `check_path_traversal` | 0.03s | 🟢 PASSED |
| 41 | `check_sql_injection_emergency_contacts` | 0.06s | 🟢 PASSED |
| 42 | `check_xss_protection_headers` | 0.03s | 🟢 PASSED |
| 43 | `check_sql_injection_trips` | 0.05s | 🟢 PASSED |
| 44 | `check_sql_injection_revoked_tokens` | 0.12s | 🟢 PASSED |
| 45 | `check_command_injection` | 0.03s | 🟢 PASSED |
| 46 | `check_html_escaping_destinations` | 0.01s | 🟢 PASSED |
| 47 | `check_sql_injection_destinations` | 0.10s | 🟢 PASSED |
| 48 | `check_sql_injection_auth` | 0.12s | 🟢 PASSED |
| 49 | `check_path_traversal` | 0.02s | 🟢 PASSED |
| 50 | `check_sql_injection_emergency_contacts` | 0.05s | 🟢 PASSED |
| 51 | `check_xss_protection_headers` | 0.03s | 🟢 PASSED |
| 52 | `check_sql_injection_trips` | 0.06s | 🟢 PASSED |
| 53 | `check_sql_injection_revoked_tokens` | 0.10s | 🟢 PASSED |
| 54 | `check_command_injection` | 0.03s | 🟢 PASSED |
| 55 | `check_html_escaping_destinations` | 0.03s | 🟢 PASSED |
| 56 | `check_sql_injection_destinations` | 0.05s | 🟢 PASSED |
| 57 | `check_sql_injection_auth` | 0.05s | 🟢 PASSED |
| 58 | `check_path_traversal` | 0.01s | 🟢 PASSED |
| 59 | `check_sql_injection_emergency_contacts` | 0.06s | 🟢 PASSED |

</details>

<details>
<summary><b>Business Logic</b> (🟢 32/32 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_revoked_token_db_cleanup` | 0.02s | 🟢 PASSED |
| 2 | `check_duplicate_registration` | 0.02s | 🟢 PASSED |
| 3 | `check_invalid_timestamp_format` | 0.03s | 🟢 PASSED |
| 4 | `check_client_side_timestamp_trust` | 0.01s | 🟢 PASSED |
| 5 | `check_client_side_travel_metrics_trust` | 0.03s | 🟢 PASSED |
| 6 | `check_revoked_token_db_cleanup` | 0.02s | 🟢 PASSED |
| 7 | `check_duplicate_registration` | 0.04s | 🟢 PASSED |
| 8 | `check_invalid_timestamp_format` | 0.03s | 🟢 PASSED |
| 9 | `check_client_side_timestamp_trust` | 0.03s | 🟢 PASSED |
| 10 | `check_client_side_travel_metrics_trust` | 0.04s | 🟢 PASSED |
| 11 | `check_revoked_token_db_cleanup` | 0.01s | 🟢 PASSED |
| 12 | `check_duplicate_registration` | 0.02s | 🟢 PASSED |
| 13 | `check_invalid_timestamp_format` | 0.02s | 🟢 PASSED |
| 14 | `check_client_side_timestamp_trust` | 0.02s | 🟢 PASSED |
| 15 | `check_client_side_travel_metrics_trust` | 0.01s | 🟢 PASSED |
| 16 | `check_revoked_token_db_cleanup` | 0.01s | 🟢 PASSED |
| 17 | `check_duplicate_registration` | 0.02s | 🟢 PASSED |
| 18 | `check_invalid_timestamp_format` | 0.01s | 🟢 PASSED |
| 19 | `check_client_side_timestamp_trust` | 0.02s | 🟢 PASSED |
| 20 | `check_client_side_travel_metrics_trust` | 0.03s | 🟢 PASSED |
| 21 | `check_revoked_token_db_cleanup` | 0.01s | 🟢 PASSED |
| 22 | `check_duplicate_registration` | 0.01s | 🟢 PASSED |
| 23 | `check_invalid_timestamp_format` | 0.04s | 🟢 PASSED |
| 24 | `check_client_side_timestamp_trust` | 0.02s | 🟢 PASSED |
| 25 | `check_client_side_travel_metrics_trust` | 0.01s | 🟢 PASSED |
| 26 | `check_revoked_token_db_cleanup` | 0.04s | 🟢 PASSED |
| 27 | `check_duplicate_registration` | 0.02s | 🟢 PASSED |
| 28 | `check_invalid_timestamp_format` | 0.02s | 🟢 PASSED |
| 29 | `check_client_side_timestamp_trust` | 0.04s | 🟢 PASSED |
| 30 | `check_client_side_travel_metrics_trust` | 0.02s | 🟢 PASSED |
| 31 | `check_revoked_token_db_cleanup` | 0.03s | 🟢 PASSED |
| 32 | `check_duplicate_registration` | 0.04s | 🟢 PASSED |

</details>

<details>
<summary><b>Infrastructure & Configuration</b> (🟢 7/7 Passed)</summary>

| No. | Vulnerability Check / Test Name | Duration (s) | Status |
| :--- | :--- | :--- | :--- |
| 1 | `check_dependencies_security` | 0.01s | 🟢 PASSED |
| 2 | `check_dependencies_security` | 0.03s | 🟢 PASSED |
| 3 | `check_dependencies_security` | 0.03s | 🟢 PASSED |
| 4 | `check_dependencies_security` | 0.02s | 🟢 PASSED |
| 5 | `check_dependencies_security` | 0.03s | 🟢 PASSED |
| 6 | `check_dependencies_security` | 0.04s | 🟢 PASSED |
| 7 | `check_dependencies_security` | 0.03s | 🟢 PASSED |

</details>
