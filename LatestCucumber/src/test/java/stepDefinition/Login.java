package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public static WebDriver driver;
	PageObject po;
	
	@Given("I have chosen to login to the website")
	public void i_have_chosen_to_login_to_the_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Mark\\Drivers\\chromedriver.exe"); //Set the driver path
		driver=new ChromeDriver(); //Launch Chrome Browser
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#"); //Open the site in browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//    driver.findElement(By.partialLinkText("SignIn")).click(); 
		
		po = new PageObject(driver);
		
		po.sign_in();
		
	}

	@When("I enter a valid username and password and click on Login")
	public void i_enter_a_valid_username_and_password_and_click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	/*	driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click(); */
		
	//	po = new PageObject(driver);
		po.enter_Name("Lalitha");
		po.enter_Password("Password123");
		po.click_login();
	    
	}

	@Then("I should be logged in to my account")
	public void i_should_be_logged_in_to_my_account() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(),"Home");
		
		
	}

	@And("I should be redirected to the Home Page")
	public void i_should_be_redirected_to_the_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(),"Home");
	//    
	}

}
