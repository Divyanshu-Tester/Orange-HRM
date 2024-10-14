package PageObjects.Leave;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.CustomWaits;

public class LeaveListPage extends CustomWaits{
	
	public WebDriver driver;
	public LeaveListPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		// driver argument means that this driver will be used to lok yp elements and second
		// argument is passed to tell pagefactory that this class weblements need to be intiated
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h6[contains(@class,'breadcrumb-module')]")
	WebElement leave;
	
	@FindBy(xpath="//p[contains(@class,'text--toast-message')]")
	WebElement noRecordFoundMesz;
	
	
	
	public String leavePageLoaded() {
		staticWait(1);
		return leave.getText();
	}
	
	
	public String getNoRecordMessage() {
		explicitWaitElementToVisible(driver,1,noRecordFoundMesz);
		return noRecordFoundMesz.getText();
	}
	

}
