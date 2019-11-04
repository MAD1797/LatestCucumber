package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver driver;
	
	public PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(partialLinkText="SignIn")
	public static WebElement signin;
	
	@FindBy(name="userName")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="Login")
	public static WebElement login;
	
	public void sign_in()
	{
		signin.click();
	}
	
	public void enter_Name(String name)
	{
		username.sendKeys(name);
	}
	
	public void enter_Password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void click_login()
	{
		login.click();
	}
	
	
}
