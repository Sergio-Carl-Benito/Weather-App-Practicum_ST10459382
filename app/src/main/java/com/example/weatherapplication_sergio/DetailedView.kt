package com.example.weatherapplication_sergio

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailedView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        // Arrays needed for daily details
        val tempMax = arrayOf(17, 18, 16, 19, 20, 18, 17)
        val tempMin = arrayOf(5, 6, 4, 5, 7, 6, 5)
        val daysOfWeek =
            arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val weatherConditions =
            arrayOf("Foggy", "Overcast", "Heavy Rain", "Sunny", "Sunny", "Overcast", "Light Rain")

        // Connect front and backend elements
        val dailyDetailsTextView = findViewById<TextView>(R.id.Daily_details)
        val navigateMainScreen = findViewById<Button>(R.id.navigateMainScreen)

        // Functionality for button to return user to home screen
        navigateMainScreen.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Logging to console for debugging
            Log.d("DetailsScreen", "Starting DetailedView activity with intent: $intent")
            startActivity(intent)
            Log.d("DetailsScreen", "Closing current activity")
            finish()
        }

        // Check if any array is empty if user cleared
        if (tempMax.isEmpty() || tempMin.isEmpty() || daysOfWeek.isEmpty() || weatherConditions.isEmpty()) {
            // If any array is empty, display error message and return
            val errorMessage = "Error: Array is empty. Please restart the app."
            // Toast message to prompt user saying array is empty
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
            Log.d("WeatherReport", errorMessage)
            dailyDetailsTextView.text = errorMessage
            return
        }
        //if arrays arent empty then continue as normal
        else {
            // StringBuilder to construct the weather report string
            val builder = StringBuilder()

            // Loop through each day to construct the weather report
            for (i in daysOfWeek.indices) {
                // Append details for each day
                builder.append("Day: ${daysOfWeek[i]}")
                    .append("\nMin Temperature: ${tempMin[i]}°C")
                    .append("\nMax Temperature: ${tempMax[i]}°C")
                    .append("\nWeather Condition: ${weatherConditions[i]}")
                    .append("\n\n") // Add extra line break between days

                // Log details for each day
                Log.d(
                    "WeatherReport",
                    "Day: ${daysOfWeek[i]}, Min Temp: ${tempMin[i]}, Max Temp: ${tempMax[i]}, Weather: ${weatherConditions[i]}"
                )
            }

            // Convert StringBuilder to string
            val weatherReport = builder.toString()

            // Set the weather report string to the TextView
            dailyDetailsTextView.text = weatherReport

            // Log the complete weather report
            Log.d("WeatherReport", "Complete Weather Report:\n$weatherReport")
        }

    }
}
