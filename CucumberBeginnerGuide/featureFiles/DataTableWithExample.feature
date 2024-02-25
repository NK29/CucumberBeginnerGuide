Feature: This is the login feature for Pratice Test Automation
Scenario Outline: this is login scenario
Given proceed login page
When user enters "<userName>" and password "<passWord>"
And clicked button
Examples:
|userName|passWord|
|student |Password123|
|student|Password12|