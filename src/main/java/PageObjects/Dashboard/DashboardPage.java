package PageObjects.Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;

public class DashboardPage extends CommonUtils{

	public WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		// driver argument means that this driver will be used to lok yp elements and
		// second
		// argument is passed to tell pagefactory that this class weblements need to be
		// intiated
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h6[contains(@class,'breadcrumb-module')]")
	WebElement dashboard;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li[3]/a")
	WebElement leaveBtn;
	
	public String dashboardLoaded() {
		explicitWaitElementToVisible(driver,2,dashboard);
		return	dashboard.getText();
	}
	
	public void clickOnLeaveTab() {
		staticWait(1);
		leaveBtn.click();
	}

}

