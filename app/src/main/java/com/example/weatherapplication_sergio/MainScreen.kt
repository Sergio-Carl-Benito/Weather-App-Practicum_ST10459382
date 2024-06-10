package com.example.weatherapplication_sergio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Declaring variables and connecting frontend elements to backend code
        val navigate_DailyTemperatures = findViewById<Button>(R.id.navigate_MainScreen)
        val navigate_Exit_App = findViewById<Button>(R.id.navigate_Exit_App)

        // Array of Max temperatures
        val Temp_Max = arrayOf(5,6,4,5,7,6,5)
        // Array of Min temperatures
        val Temp_Min = arrayOf(17,18,16,19,20,18,17)
        // Array of Strings (first set)
        val Days_Of_Week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        // Array of Strings (second set)
        val Weather_Condition = arrayOf("Foggy", "Overcast", "Heavy Rain", "Sunny", "Sunny", "Overcast", "Light Rain")

        // Calculate the total of max and min temperatures
        val totalTempMax = Temp_Max.sum()
        val totalTempMin = Temp_Min.sum()

        // Calculate the average temperature
        val averageTemp = (totalTempMax + totalTempMin) / (Temp_Max.size + Temp_Min.size)

        val Text_AverageTemp = findViewById<EditText>(R.id.Text_AverageTemp)

        // Display the average temperature in the EditText
        Text_AverageTemp.setText("$averageTemp°C")

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