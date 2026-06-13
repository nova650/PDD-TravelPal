package com.example.happytravels.activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.happytravels.database.UserDatabaseHelper
import com.example.happytravels.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding
    private lateinit var dbHelper: UserDatabaseHelper
    private var verifiedEmail: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbHelper = UserDatabaseHelper(this)

        // Navigation back
        binding.tvForgotBackToLogin.setOnClickListener {
            finish()
        }

        // STATE 1: Verify Email
        binding.btnForgotVerifyEmail.setOnClickListener {
            val email = binding.etForgotEmail.text.toString().trim()
            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email address", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val question = dbHelper.getSecurityQuestion(email)
            if (question != null) {
                verifiedEmail = email
                
                // Set question and move to State 2
                binding.tvForgotQuestionDisplay.text = "Question: $question"
                binding.tvForgotSubtitle.text = "Answer the recovery question to verify identity."
                
                binding.layoutForgotStateEmail.visibility = View.GONE
                binding.layoutForgotStateQuestion.visibility = View.VISIBLE
            } else {
                Toast.makeText(this, "Email address not found", Toast.LENGTH_SHORT).show()
            }
        }

        // STATE 2: Verify Answer
        binding.btnForgotVerifyAnswer.setOnClickListener {
            val answer = binding.etForgotAnswer.text.toString().trim()
            if (answer.isEmpty()) {
                Toast.makeText(this, "Please enter your answer", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val isCorrect = dbHelper.verifySecurityAnswer(verifiedEmail, answer)
            if (isCorrect) {
                // Move to State 3
                binding.tvForgotSubtitle.text = "Choose your new password."
                binding.layoutForgotStateQuestion.visibility = View.GONE
                binding.layoutForgotStateReset.visibility = View.VISIBLE
            } else {
                Toast.makeText(this, "Incorrect answer. Please try again.", Toast.LENGTH_SHORT).show()
            }
        }

        // STATE 3: Reset Password
        binding.btnForgotResetPassword.setOnClickListener {
            val newPassword = binding.etForgotNewPassword.text.toString()
            val confirmNewPassword = binding.etForgotConfirmNewPassword.text.toString()

            if (newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (newPassword.length < 6) {
                Toast.makeText(this, "Password must be at least 6 characters long", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (newPassword != confirmNewPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val success = dbHelper.updatePassword(verifiedEmail, newPassword)
            if (success) {
                Toast.makeText(this, "Password reset successfully! Please log in.", Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Failed to update password. Please try again.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
