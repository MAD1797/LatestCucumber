$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "Login to the TestMeApp in a browser",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Successful",
  "description": "User should successfully Login to be TestMeApp website",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have chosen to login to the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.Login.i_have_chosen_to_login_to_the_website() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/CucumberNew/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid username and password and click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Login.i_enter_a_valid_username_and_password_and_click_on_Login() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/CucumberNew/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in to my account",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Login.i_should_be_logged_in_to_my_account() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/CucumberNew/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Login.i_should_be_redirected_to_the_Home_Page() in file:/C:/Users/A07216trng_M7A.05.19/eclipse-workspace/CucumberNew/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
});