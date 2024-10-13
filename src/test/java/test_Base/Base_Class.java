package test_Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Base.SetUpDriver;
import PageObjects.Login.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class extends SetUpDriver

{
	public WebDriver driver;
	public LoginPage loginPage;

	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException {
		driver = intializeBrowser(browserName);
		loginPage= new LoginPage(driver);

	}
	
	
	
	  @AfterMethod()
	  public void tearDown() { driver.quit(); }
	 

}
