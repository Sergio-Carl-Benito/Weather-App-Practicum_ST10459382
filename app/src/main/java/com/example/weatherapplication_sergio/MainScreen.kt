package com.example.weatherapplication_sergio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainScreen : AppCompatActivity() {

    // Declare arrays for temps
    private val tempMax = mutableListOf(17, 18, 16, 19, 20, 18, 17)
    private val tempMin = mutableListOf(5, 6, 4, 5, 7, 6, 5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Connecting frontend elements to backend code
        val navigateDailyTemperatures = findViewById<Button>(R.id.navigate_DailyTemperatures)
        val navigateExitApp = findViewById<Button>(R.id.navigate_Exit_App)
        val averageTemp = findViewById<TextView>(R.id.averageTemp)

        // initializing variables needed for calculations
        var totalTempMax = 0
        var totalTempMin = 0

        // Set click listener for the daily temperatures button to navigate
        navigateDailyTemperatures.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            // logging to console for debugging
            Log.d("MainScreen", "Starting DetailedView activity with intent: $intent")
            startActivity(intent)
            Log.d("MainScreen", "Closing current activity")
            finish()
        }

        // Set click listener for the exit button
        navigateExitApp.setOnClickListener {
            // logging to console for debugging
            Log.d("MainScreen", "Exiting the app by closing the current activity")
            finish()
        }


        // Calculate total temperatures using a loop
        for (i in tempMax.indices) {
            totalTempMax += tempMax[i]
            totalTempMin += tempMin[i]
            Log.d("MainScreen", "Calculated Total temp max Temperature: $totalTempMax")
            Log.d("MainScreen", "Calculated Total temp min Temperature: $totalTempMin")
        }

        // Calculate average temp
        val averageTempValue = (totalTempMax + totalTempMin) / (tempMax.size + tempMin.size)
        Log.d("MainScreen", "Calculated Average Temperature: $averageTempValue°C")

        // updating average tempt textview
        averageTemp.setText("$averageTempValue°C")


        fun clearData() {
            // Clear the lists
            tempMax.clear()
            tempMin.clear()
            val cleared = "Data Cleared"
            // Show a message indicating the data has been cleared
            Toast.makeText(this, cleared, Toast.LENGTH_SHORT).show()
            Log.d("MainScreen", cleared)
        }

        // making a clear array button
        val Clearbtn: Button = findViewById(R.id.Clearbtn)
        Clearbtn.setOnClickListener {
            clearData()
        }


    }
}


