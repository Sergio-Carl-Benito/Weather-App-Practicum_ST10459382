**Name:** Sergio Carl Benito  
**Student Number:** ST10459382  
**Repository link:** [Weather App Repository](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382.git)  

---

# Welcome to My Weather App Read.me File

![Splash Screen](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/a6c7c24e-1aaa-4829-9113-992e8be26369)

The above screenshot shows our app's Splash Screen (Homepage).

Below is the pseudocode used in planning the logic for this application.

## SplashScreen:
- Initialize navigation button
- Initialize exit app button
- Display Splash Screen with app name, my name, student number, and logo
- If Start button clicked:
  - Intent to start next activity
  - Log the action
  - Navigate to MainScreen
  - Finish function to close and free up resources
- If Exit button clicked:
  - Log action
  - Close the app

![Splash Screen Code](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/9ea27072-bb6e-4d66-b135-6cc1200948be)

A screenshot of the Splash Screen code is added for reference.

## MainScreen:
- Initialize mutable arrays
- Initialize Daily Temp button
- Initialize Average temp textview
- Loop through index of array
  - Add all min together
  - Add all max together
  - Calculate average based on min + max / amount of elements
- If Daily temperature button click
  - Navigate to Daily temperatures page 
  - Close previous activity
  - Console log action
- If clear clicked
  - Clear the mutable array
  - Display toast letting the user know what they did
  - Console log their action
- If Exit button clicked:
  - Close the app

![Main Screen Code](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/728697c3-c356-44d7-829d-9c3ec6a2c472)

A screenshot of the Main screen code is added for reference.

## DetailedViewActivity:
- Initialize detailsTextView
- Initialize back to home button
- Initialize arrays
- Initialize details as StringBuilder
- Retrieve arrays from Intent
- If arrays are empty
  - Prompt the user with an error message
  - Console log the error message
  - Show a toast telling the user the error message
- Else
  - Display weather forecast 
  - Append array values together and create new lines after each set of indices in the array
- Click listener for back to home button 
  - If clicked
    - Return the user to the splash screen
    - End previous activity
    - Start intent

![Detailed View Code](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/f6d46126-bdd2-4f05-9214-a08e121f4513)

A screenshot of the Detailed View code is added for reference.

---

# Why Did I Make This App

I recently joined a team of developers, and we've created a weather app for our local weather crew. You can check out the average temp for the week and get all the details on the upcoming weather.

Personally, I was very excited to design this app as it would be used by myself every day to check the weather for the rest of the week.

We have chosen a simple interface, used straightforward code, and designed our own logo with vibrant colors.

---

# Breaking Down the Application

![Home Screen Design](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/78c4b530-ef52-4019-8f91-4dc78df98632) 

This is the design we went for on the home screen, it's simple, the buttons are large and clickable. We picked contrasting colors to attract the user's attention, blue represents cold, and red represents warm. The background is a warm yellow, which is supposed to emulate the sun.

![Average Temperature Screen](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/f2a492c6-6a21-42aa-8721-bd1a5982d2e8)

This page shows the average temperature for the upcoming week already calculated! As this week is a cold one, you can see the snowflake to represent it. This is another design choice that we made so that the user can also refer to the image rather than the actual temperature.

![Detailed Weather Screen](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/1ed6cfc0-9e57-4c96-84a1-3e623bb29160)

This is what it would usually look like if the user chose not to clear the array. It gives a detailed breakdown of the min and max temp for the week, as well as what the weather condition is like.

![Empty Array Screen](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/00911d98-2fd0-4242-9ef3-1dd1e7c69648)

This is how it looks if the array is empty because the user cleared it. It also has error messages, console log, and toasts to let the user know what the issue is and the developers.

![Console Log](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/ff94bae3)

An app logo was added which encapsulates the weather app very well and entices users to open the app often below find image of the logo 

![Logo](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/95404ed4-9d39-40ec-b7e9-29a7550a3a0a)

Github is used because it allowed me and my team to collaborate on the project together, it allowed me to show them changes i made through commits with messages and to share the project no matter where we are in the world with each other 

![Commits](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST104
