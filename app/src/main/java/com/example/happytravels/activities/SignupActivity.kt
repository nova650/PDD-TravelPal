package com.example.happytravels.activities

import android.os.Bundle
import android.util.Patterns
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.happytravels.database.UserDatabaseHelper
import com.example.happytravels.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var dbHelper: UserDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbHelper = UserDatabaseHelper(this)

        // Populate security questions dropdown
        val questions = arrayOf(
            "What is your mother's maiden name?",
            "What was the name of your first pet?",
            "In which city were you born?"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, questions)
        binding.actvSignupQuestion.setAdapter(adapter)

        // Click listeners
        binding.tvSignupLogin.setOnClickListener {
            finish()
        }

        binding.btnSignupRegister.setOnClickListener {
            val name = binding.etSignupName.text.toString().trim()
            val email = binding.etSignupEmail.text.toString().trim()
            val password = binding.etSignupPassword.text.toString()
            val confirmPassword = binding.etSignupConfirmPassword.text.toString()
            val question = binding.actvSignupQuestion.text.toString().trim()
            val answer = binding.etSignupAnswer.text.toString().trim()

            // Validation
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || question.isEmpty() || answer.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.length < 6) {
                Toast.makeText(this, "Password must be at least 6 characters long", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (dbHelper.checkUserExists(email)) {
                Toast.makeText(this, "Email is already registered", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Register
            val success = dbHelper.registerUser(name, email, password, question, answer)
            if (success) {
                Toast.makeText(this, "Account created successfully! Please log in.", Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Registration failed, please try again", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
