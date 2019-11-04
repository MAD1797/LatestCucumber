Feature: Login
Login to the TestMeApp in a browser

Scenario: Login Successful
User should successfully Login to be TestMeApp website

Scenario Outline: The one where the user logs in with different user data
User should successfully Login to be TestMeApp website
Given Larry has registered in to TestMeApp
When Larry login with below set of "<username>" and "<password>"
Then Larry login successful to TestMeApp
Examples: 
      | username  | password |
      | Larry29 |     Password123 |
      | Sean20 |     TestMe@123 |
      