package com.example.happytravels.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class UserDatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "TravelPalUserDatabase.db"
        private const val TABLE_USERS = "users"
        
        private const val KEY_ID = "_id"
        private const val KEY_NAME = "name"
        private const val KEY_EMAIL = "email"
        private const val KEY_PASSWORD = "password"
        private const val KEY_SECURITY_QUESTION = "security_question"
        private const val KEY_SECURITY_ANSWER = "security_answer"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableQuery = ("CREATE TABLE $TABLE_USERS ("
                + "$KEY_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "$KEY_NAME TEXT,"
                + "$KEY_EMAIL TEXT UNIQUE,"
                + "$KEY_PASSWORD TEXT,"
                + "$KEY_SECURITY_QUESTION TEXT,"
                + "$KEY_SECURITY_ANSWER TEXT)")
        db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_USERS")
        onCreate(db)
    }

    // Register a new user. Returns true if successful, false if email already exists or error.
    fun registerUser(name: String, email: String, password: String, question: String, answer: String): Boolean {
        val db = this.writableDatabase
        val contentValues = ContentValues().apply {
            put(KEY_NAME, name.trim())
            put(KEY_EMAIL, email.trim().lowercase())
            put(KEY_PASSWORD, password)
            put(KEY_SECURITY_QUESTION, question)
            put(KEY_SECURITY_ANSWER, answer.trim().lowercase())
        }
        val result = db.insert(TABLE_USERS, null, contentValues)
        db.close()
        return result != -1L
    }

    // Check if the user exists with specified email
    fun checkUserExists(email: String): Boolean {
        val db = this.readableDatabase
        val query = "SELECT $KEY_ID FROM $TABLE_USERS WHERE $KEY_EMAIL = ?"
        val cursor = db.rawQuery(query, arrayOf(email.trim().lowercase()))
        val exists = cursor.count > 0
        cursor.close()
        db.close()
        return exists
    }

    // Verify credentials for logging in. Returns User object (name, email) if correct, or null.
    fun verifyCredentials(email: String, password: String): UserProfile? {
        val db = this.readableDatabase
        val query = "SELECT $KEY_NAME, $KEY_EMAIL FROM $TABLE_USERS WHERE $KEY_EMAIL = ? AND $KEY_PASSWORD = ?"
        val cursor = db.rawQuery(query, arrayOf(email.trim().lowercase(), password))
        var user: UserProfile? = null
        if (cursor.moveToFirst()) {
            val name = cursor.getString(0)
            val userEmail = cursor.getString(1)
            user = UserProfile(name, userEmail)
        }
        cursor.close()
        db.close()
        return user
    }

    // Get security question for an email. Returns null if user not found.
    fun getSecurityQuestion(email: String): String? {
        val db = this.readableDatabase
        val query = "SELECT $KEY_SECURITY_QUESTION FROM $TABLE_USERS WHERE $KEY_EMAIL = ?"
        val cursor = db.rawQuery(query, arrayOf(email.trim().lowercase()))
        var question: String? = null
        if (cursor.moveToFirst()) {
            question = cursor.getString(0)
        }
        cursor.close()
        db.close()
        return question
    }

    // Verify the security answer. Returns true if correct, false otherwise.
    fun verifySecurityAnswer(email: String, answer: String): Boolean {
        val db = this.readableDatabase
        val query = "SELECT $KEY_ID FROM $TABLE_USERS WHERE $KEY_EMAIL = ? AND LOWER($KEY_SECURITY_ANSWER) = ?"
        val cursor = db.rawQuery(query, arrayOf(email.trim().lowercase(), answer.trim().lowercase()))
        val isCorrect = cursor.count > 0
        cursor.close()
        db.close()
        return isCorrect
    }

    // Update password for an email. Returns true if successful.
    fun updatePassword(email: String, newPassword: String): Boolean {
        val db = this.writableDatabase
        val contentValues = ContentValues().apply {
            put(KEY_PASSWORD, newPassword)
        }
        val rows = db.update(TABLE_USERS, contentValues, "$KEY_EMAIL = ?", arrayOf(email.trim().lowercase()))
        db.close()
        return rows > 0
    }

    data class UserProfile(val name: String, val email: String)
}
