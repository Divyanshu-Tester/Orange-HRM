package PageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.CustomWaits;
import Base.SetUpDriver;
import PageObjects.Dashboard.DashboardPage;
import Resources.PropertyReaderHelper;

public class LoginPage  extends CustomWaits{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=	driver;
		//driver argument means that this driver will be used to lok yp elements and second 
		//argument is passed to tell pagefactory that this class weblements need to be intiated
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickLoginBtn;
	
	public void loadLoginPage() {
		driver.get(PropertyReaderHelper.getConfigPropertyData("url"));
	}
	public DashboardPage loginToAdmin(String username, String password) throws InterruptedException {
		System.out.println(username);
		System.out.println(password);
		staticWait(1);
		UserName.sendKeys(username);
		Password.sendKeys(password);
		clickLoginBtn.click();
		DashboardPage dashboardPage=new DashboardPage(driver);
		return dashboardPage;
	}

	
	
}
