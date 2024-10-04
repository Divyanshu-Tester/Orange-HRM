package page_Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Successfull_Login_Page 

{

	WebDriver driver;
	WebDriverWait wait;
	
	//CONSTRUCTOR TO INITIALIZE THE WEBDRIVER
	public Successfull_Login_Page(WebDriver driver2) 
	{
		this.driver= driver2;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	
	
	//LOCATORS OF LOGIN FIELDS
	
	
	By Enter_Username = By.xpath("//input[@placeholder='Username']");
	By Enter_Password = By.xpath("//input[@placeholder='Password']");
	By Enter_Login = By.xpath("//button[@type='submit']");

	
	//CREATING RE- USABLE METHODS TO PERFORM LOGIN IN DIFFERENT CLASS
	
	public void Enter_Username(String Username)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Enter_Username));
		driver.findElement(Enter_Username).sendKeys(Username);
	}
	
	public void Enter_Password(String Password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Enter_Password));
		driver.findElement(Enter_Password).sendKeys(Password);
	}
	
	public void Enter_Login()
	{
		driver.findElement(Enter_Login).click();
	}
	
	public void Back_Button()
	{
		try
		{
			driver.navigate().back();
			System.out.print("Navigated Back to the Dashboard");
		}
		catch (Exception e)
		{
			System.out.println("Error while navigating back to the dashboard.");
		}
	}
}







