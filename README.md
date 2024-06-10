Name: Sergio Carl Benito
Student Number: ST10459382
Repository link: https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382.git

                                                                                    WELCOME TO MY WEATHER APP READ.ME FILE 
                                                                        ![Screenshot_20240610_123946](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/a6c7c24e-1aaa-4829-9113-992e8be26369)

                                                                           The above screenshot is of our apps Splash Screen (Homepage) 
         
Below Find my Pseudocode used in planning the logic for this application.

SplashScreen:
 Initialize navigation button
 Initialize exit app button
 Display Splash Screen with app name, my name, student number, and logo
 If Start button clicked:
 intent to start next activity
 log the action
 Navigate to MainScreen
 finish function to close and free up resources
 If Exit button clicked:
 log action
 Close the app
 ![splash](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/9ea27072-bb6e-4d66-b135-6cc1200948be)
screen shot of splash screen code added for reference
 
MainScreen:
 Initialize mutable arrays
 Initialize Daily Temp button
 Initialize Average temp textview
 loop through index of array
   add all min together
   add all max together
    calculate average based on min + max / amount of elements
 If Daily temperature button click
   navigate to Daily temperatures page 
    close previous activity
    console log action
  if clear clicked
    clear the mutable array
    display toast letting user know what they did
    console log their action
 If Exit button clicked:
 Close the app
![main](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/728697c3-c356-44d7-829d-9c3ec6a2c472)
screen shot of Main screen code added for reference

DetailedViewActivity:
 Initialize detailsTextView
 Initialize back to home button
 Initialize arrays
 Initialize details as StringBuilder
 Retrieve arrays from Intent
 if arrays are empty
   prompt user with error message
    console log error message
      show a toast telling user error message
  else
    display weather forecast 
      append array values together and create new lines after each set of indices in array\\
  click listener for back to home button 
    if clicked
      return user to splash screen
        end previous activity
          start intent

![detailed](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/f6d46126-bdd2-4f05-9214-a08e121f4513)
screen shot of Detailed code added for reference


 

                                                                                WHY DID I MAKE THIS APP
I recently joined a team of developers, and we've created a weather app for our local weather crew. You can check out the average temp for the week and get all the details on the upcoming weather.

Personally, I was very excited to design this app as it would be used by myself everyday to check the weather for the rest of the week.

We have chosen a simple interface, used straight forward code and designed our own logo with vibrant colours.

                                                                   BREAKING DOWN THE APPLICATION
                                                                   
                                                            ![Screenshot 2024-06-10 125137](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/78c4b530-ef52-4019-8f91-4dc78df98632) 
                                                    this is the design we went for on the home screen, its simple, the buttons are large and clickable. we picked contrasting colours to attract the users attention, blue represents cold and red represents warm
                                                    the background is a warm yellow which is supposed to emmulate the sun 

                                                                ![Screenshot_20240610_141502](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/f2a492c6-6a21-42aa-8721-bd1a5982d2e8)
                                                                this page is where you see the average temperature for the upcoming week already calculated!
                                                                As this week is a cold one, you can see the snowflake to represent it this is another design choice that we made so that the user can also refer to the image rather than the actual temperature 

                                                                
                                                              ![Screenshot_20240610_123907](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/1ed6cfc0-9e57-4c96-84a1-3e623bb29160)
                                                              this is what it would usually look like, if the user choice not to clear the array, it gives a detailed break down of the min and max temp for the week, as well as what the weather condition is like,

                                                              ![Screenshot_20240610_134424](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/00911d98-2fd0-4242-9ef3-1dd1e7c69648)
                                                              this is how it looks if the array is empty because the user cleared it, it also has error messages, console log, and toasts to let the user know what the issue is and the developers

                                                              ![Screenshot 2024-06-10 124316](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/ff94bae3-cd11-446b-aa01-ae53bc407ee4)
                                                              here is an example of some values being logged to console 
                                                              ![Screenshot 2024-06-10 124341](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/55c39480-af89-4d51-9baf-8e99eaa544cf)
                                                            ![Screenshot 2024-06-10 124451](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/afcfef45-262f-41c5-827b-e07fe556f287)

                                                        An app logo was added which encapuslates the weather app very well and entices users to open the app often
                                                        below find image of logo 
                                                        ![logo](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/95404ed4-9d39-40ec-b7e9-29a7550a3a0a)


Github is used because it allowed me and my team to collaborate on the project together, it allowed me to show them changes i made through commits with messages and to share the project no matter where we are in the world with eachother
![commits](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/c8d5e823-02c5-464e-a3a2-17d13671f16b)
above is an image of my most recent commits


I have implement Github Automated testing through AndroidCI to ensure that my code runs flawlessy and on any mobile device 
![image](https://github.com/Sergio-Carl-Benito/Weather-App-Practicum_ST10459382/assets/163974756/3ee5b962-211d-488c-bbc2-f1f77e04c4c3)
above is an image showcasing my AndroidCI automated testing 





            
