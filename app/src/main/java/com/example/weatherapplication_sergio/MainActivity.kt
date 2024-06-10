package com.example.weatherapplication_sergio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connecting frontend elements to backend code
        val navigateMainScreen = findViewById<Button>(R.id.navigate_MainScreen)
        val navigateExitApp = findViewById<Button>(R.id.navigate_Exit_App)

        // Set click listener for the start button
        navigateMainScreen.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            Log.d("MainActivity", "Starting MainScreen activity with intent: $intent")
            startActivity(intent)
            Log.d("MainScreen", "Closing current activity")
            finish()
        }

        // Set click listener for the exit button
        navigateExitApp.setOnClickListener {
            Log.d("MainActivity", "Exiting the app by closing the current activity")
            finish()
        }
    }
}
