package com.example.weatherapplication_sergio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring variables and connecting frontend elements to backend code
        val navigate_MainScreen = findViewById<Button>(R.id.navigate_MainScreen)
        val navigate_Exit_App = findViewById<Button>(R.id.navigate_MainScreen)

        // Set click listener for the start button
        navigate_MainScreen.setOnClickListener {
            // Create an intent to start the MainScreen activity
            val intent = Intent(this, MainScreen::class.java)
            Log.d("SplashScreen", "Starting MainScreen activity with intent: $intent")
            // Start the MainScreen activity
            startActivity(intent)
            // Closing the current activity to free up resources
            Log.d("SplashScreen", "Closing current activity")
            finish()
        }

        // Set click listener for the exit button
        navigate_Exit_App.setOnClickListener {
            Log.d("SplashScreen", "Exiting the app by closing the current activity")
            // Finish the current activity to close the app
            finish()

        }
    }
}