package test_Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PageObjects.Leave.ApplyLeavePage;
import PageObjects.Leave.LeaveListPage;
import PageObjects.Login.LoginPage;
import Resources.PropertyReaderHelper;
import Utils.SetUpDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import test_Cases.Leave.ApplyLeaveTest;

public class Base_Class extends SetUpDriver

{
	public WebDriver driver;
	public LeaveListPage leaveListPage;
	public LoginPage loginPage;
	public ApplyLeavePage applyLeavePage;

	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException {
		driver = intializeBrowser(browserName);
		loginPage= new LoginPage(driver);
		 leaveListPage= new LeaveListPage(driver);
		 
		 applyLeavePage= new ApplyLeavePage(driver);

	}
	
	public void applyLeave() throws InterruptedException  {
		applyLeavePage.selectLeaveType();
		applyLeavePage.selectStartDate(PropertyReaderHelper.getConfigPropertyData("startDate"),PropertyReaderHelper.getConfigPropertyData("endDate"));
		
		applyLeavePage.clickApplyLeave();
	}
	
	//  @AfterMethod()
	//  public void tearDown() { driver.quit(); }
	 

}
