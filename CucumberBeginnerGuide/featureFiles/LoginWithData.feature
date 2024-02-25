Feature: This is the login feature for Pratice Test Automation
Scenario: this is login scenario
Given user is on the login page
When the user enters the valid credentials "student" and "Password123"
And clicks the login button
Then the user should see the home page