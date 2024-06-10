package com.example.weatherapplication_sergio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Declaring variables and connecting frontend elements to backend code
        val navigate_DailyTemperatures = findViewById<Button>(R.id.navigate_MainScreen)
        val navigate_Exit_App = findViewById<Button>(R.id.navigate_Exit_App)

        // Set click listener for the start button
        navigate_DailyTemperatures.setOnClickListener {
            // Create an intent to start the MainScreen activity
            val intent = Intent(this, MainScreen::class.java)
            Log.d("SplashScreen", "Starting Detailed View Screen activity with intent: $intent")
            // Start the MainScreen activity
            startActivity(intent)
            // Closing the current activity to free up resources
            Log.d("SplashScreen", "Closing current activity")
            finish()
        }


        // Set click listener for the exit button
        navigate_Exit_App.setOnClickListener {
            Log.d("MainScreen", "Exiting the app by closing the current activity")
            // Finish the current activity to close the app
            finish()
        }


    }
}