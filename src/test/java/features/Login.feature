Feature: Application Login

@SmokeTest
Scenario: Home Page default login
Given User is on landing Page
When User Login into application with username and password
Then Home page is populated
And Cards are displayed


