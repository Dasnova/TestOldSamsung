 Feature: To test that Users can log into Automation Practice Application
 Background: Users must aleady have a login credentials
 @Chrome
 Scenario: Users can log in with correct username and password

 Given that User is on the Home page
 When the User enters the correct username and password
 And the User clicks on shirt and search
 Then the user should be logged in successfully