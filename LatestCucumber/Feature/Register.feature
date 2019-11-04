Feature: Registration
Register with a new account on the TestMeApp website

Scenario: Registration Successful
User should successfully register their account on the TestMeApp website

Given I have chosen to register on the website
When I enter the valid registration details and click on Register
Then I should be successfully registered on the TestMeApp website
And A confirmation message should be displayed to me