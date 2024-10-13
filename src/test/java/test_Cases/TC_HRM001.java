package test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Resources.PropertyReaderHelper;
import test_Base.Base_Class;

public class TC_HRM001 extends Base_Class

{
  @Test
  public void login() throws InterruptedException 
  
  {
	  loginPage.loadLoginPage();
	  loginPage.loginToAdmin(PropertyReaderHelper.getConfigPropertyData("username"), PropertyReaderHelper.getConfigPropertyData("password"));
	  
  }
}
