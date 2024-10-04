package page_Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Employee 

{
	WebDriver driver;
	WebDriverWait wait;
	
	//Constructor to initialize the driver
	
	public Create_Employee(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	

	//Locators of all the fields
	
	By Click_PIM = By.xpath("//a[normalize-space()='']");
	By Click_Add = By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
	By Profile_Photo = By.xpath("//i[@class='oxd-icon bi-plus']");
	By Employee_First_Name = By.xpath("//input[@placeholder='First Name']");
	By Employee_Middle_Name = By.xpath("//input[@placeholder='Middle Name']");
	By Employee_Last_name = By.xpath("//input[@placeholder='Last Name']");
	By Employee_ID = By.xpath("//input[@class='oxd-input oxd-input--focus']");
	By Create_Login_Details = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
	By User_name = By.xpath("//input[@class='oxd-input oxd-input--focus']");
	By Status_Enabled = By.xpath("//label[normalize-space()='Enabled']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']");
	By Status_Disabled = By.xpath("//label[normalize-space()='Disabled']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']");
	By Password = By.xpath("//input[@class='oxd-input oxd-input--focus']");
	By Confirm_Password = By.xpath("//input[@class='oxd-input oxd-input--focus']");
	By Save_Button = By.xpath("//button[@type='submit']");
	By Cancel_Button = By.xpath("//button[normalize-space()='Cancel']");
	
	//Methods to interact with all the fields
	
	public void Click_PIM()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Click_PIM));
		driver.findElement(this.Click_PIM).click();
	}
	
	public void Click_Add_Button()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Click_Add));
		driver.findElement(this.Click_Add).click();
	}
	public void Select_Profile_Photo(String filePath)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Profile_Photo));
		driver.findElement(Profile_Photo).sendKeys("/Users/divyanshupriyadarshi/Downloads/Divyanshu Resume");
	}
	
	public void Enter_Employee_First_Name(String First_Name)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Employee_First_Name));
		driver.findElement(Employee_First_Name).sendKeys("First Name");
	}
	
	public void Enter_Middle_Name(String Middle_Name)
	{
		driver.findElement(Employee_Middle_Name).sendKeys("Middle Name");
	}
	
	public void Enter_Last_name(String Last_Name)
	{
		driver.findElement(Employee_Last_name).sendKeys("Last Name");
	}
	
	public void Enter_Employee_ID(String Employee_ID)
	{
		driver.findElement(this.Employee_ID).sendKeys("Employee ID");
	}
	
	public void Click_Login_Details()
	{
		driver.findElement(Create_Login_Details).click();
	}
		
	public void Enter_User_Name(String Username)
	{
		driver.findElement(User_name ).sendKeys("Username");
	}


	public void Select_Status_Enabled()

	{
		driver.findElement(Status_Enabled).click();
	}

	public void Select_Status_Disabled()
	{
		driver.findElement(Status_Disabled).click();
	}
	
	public void Enter_Password(String Password)
	{
		driver.findElement(this.Password).sendKeys("Password");
	}

	public void Confirm_Password(String Confirm_Password)
	{
		driver.findElement(this.Confirm_Password).sendKeys("Confirm_Password");
	}
	
	public void Click_Cancel_Button()
	{
		driver.findElement(Cancel_Button).click();
	}
	
	public void Click_Save_Button()
	{
		driver.findElement(Save_Button).click();
	}

}


































