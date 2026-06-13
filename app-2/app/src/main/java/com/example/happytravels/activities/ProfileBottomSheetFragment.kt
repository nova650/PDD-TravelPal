package com.example.happytravels.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.happytravels.R
import com.example.happytravels.database.UserDatabaseHelper
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ProfileBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var dbHelper: UserDatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_profile_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        dbHelper = UserDatabaseHelper(requireContext())
        
        val sharedPrefs = requireContext().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val name = sharedPrefs.getString("logged_in_name", "") ?: ""
        val email = sharedPrefs.getString("logged_in_email", "") ?: ""
        
        // Bind UI elements
        val tvInitial = view.findViewById<TextView>(R.id.tv_profile_initial)
        val tvName = view.findViewById<TextView>(R.id.tv_profile_name)
        val tvEmail = view.findViewById<TextView>(R.id.tv_profile_email)
        
        val etCurrentPassword = view.findViewById<EditText>(R.id.et_profile_current_password)
        val etNewPassword = view.findViewById<EditText>(R.id.et_profile_new_password)
        val etConfirmPassword = view.findViewById<EditText>(R.id.et_profile_confirm_password)
        
        val btnUpdatePassword = view.findViewById<Button>(R.id.btn_profile_update_password)
        val btnLogout = view.findViewById<Button>(R.id.btn_profile_logout)
        
        // Populate profile views
        tvName.text = name
        tvEmail.text = email
        if (name.isNotEmpty()) {
            tvInitial.text = name[0].uppercaseChar().toString()
        } else {
            tvInitial.text = "U"
        }
        
        // Password update logic
        btnUpdatePassword.setOnClickListener {
            val currentPass = etCurrentPassword.text.toString()
            val newPass = etNewPassword.text.toString()
            val confirmPass = etConfirmPassword.text.toString()
            
            if (currentPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty()) {
                Toast.makeText(context, "Please fill all password fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            
            if (newPass != confirmPass) {
                Toast.makeText(context, "New passwords do not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            
            if (newPass.length < 6) {
                Toast.makeText(context, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            
            // Verify current password via DB
            val user = dbHelper.verifyCredentials(email, currentPass)
            if (user == null) {
                Toast.makeText(context, "Incorrect current password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            
            // Update password in DB
            val success = dbHelper.updatePassword(email, newPass)
            if (success) {
                Toast.makeText(context, "Password updated successfully!", Toast.LENGTH_SHORT).show()
                // Clear fields
                etCurrentPassword.text.clear()
                etNewPassword.text.clear()
                etConfirmPassword.text.clear()
                dismiss()
            } else {
                Toast.makeText(context, "Failed to update password. Try again.", Toast.LENGTH_SHORT).show()
            }
        }
        
        // Logout logic
        btnLogout.setOnClickListener {
            // Clear preferences
            sharedPrefs.edit().apply {
                putBoolean("is_logged_in", false)
                putString("logged_in_email", null)
                putString("logged_in_name", null)
                apply()
            }
            
            Toast.makeText(context, "Logged out successfully", Toast.LENGTH_SHORT).show()
            
            val intent = Intent(requireActivity(), LoginActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
            requireActivity().finish()
        }
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog as? com.google.android.material.bottomsheet.BottomSheetDialog
        val bottomSheet = dialog?.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
        if (bottomSheet != null) {
            val behavior = com.google.android.material.bottomsheet.BottomSheetBehavior.from(bottomSheet)
            behavior.state = com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_EXPANDED
            behavior.skipCollapsed = true
        }
    }
}
