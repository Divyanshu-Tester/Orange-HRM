package PageObjects.Leave;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;

public class ApplyLeavePage extends CommonUtils{
	public WebDriver driver;

	public ApplyLeavePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		// driver argument means that this driver will be used to lok yp elements and
		// second
		// argument is passed to tell pagefactory that this class weblements need to be
		// intiated

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="h6[class*='orangehrm-main-title']")
	WebElement applyLeaveTitle;
	
	@FindBy(css="div[class*='oxd-select-text--active']")
	WebElement clickLeaveTypeField;
	
	@FindBy(xpath="//div[@class='oxd-select-option']/span")
	WebElement leaveTypeDropdown;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	WebElement getSelectedLeaveType;
	
	
	
	@FindBy(xpath="(//div[contains(@class, 'oxd-date-wrapper')])[1]//input")
	WebElement clickOnStartDate;
	
	
	
	@FindBy(xpath="(//div[contains(@class, 'oxd-date-wrapper')])[2]//input")
	WebElement clickOnEndDate;
	
	
	

	
	//@FindBy(xpath="//i[contains(@class,'bi-chevron-right')]")
	//WebElement nextButtonElement;
	
	@FindBy(xpath="//div[@class='oxd-calendar-date']")
	List<WebElement > listOfDates;
	
	@FindBy(css="button[class*='oxd-button--secondary']")
	WebElement submitBtn;
	
	public String applyleavePageLoaded() {
		explicitWaitElementToVisible(driver, 2, applyLeaveTitle);
		return applyLeaveTitle.getText();
	}
	
	public String selectLeaveType() {
		clickLeaveTypeField.click();
		leaveTypeDropdown.click();
	return 	getSelectedLeaveType.getText();
	
	}
	
	public void selectStartDate(String startDate,String endDate) {
		clickOnStartDate.sendKeys(startDate);
	//	clickOnEndDate.clear();	
	//	clickOnEndDate.sendKeys(endDate);
		}
	public void clickApplyLeave() throws InterruptedException {
		scrollPage(0,400,driver);
		Thread.sleep(3000);
		submitBtn.click();
	}
}
