@ForJenkins
Feature: Login
Login to the TestMeApp in a browser

Scenario: Login Successful
User should successfully Login to be TestMeApp website

Given I have chosen to login to the website
When I enter a valid username and password and click on Login
Then I should be logged in to my account
And I should be redirected to the Home Page