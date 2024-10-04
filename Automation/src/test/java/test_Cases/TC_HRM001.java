package test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import test_Base.Base_Class;

public class TC_HRM001 extends Base_Class

{
  @Test
  public void login() 
  
  {
	  driver.findElement(By.xpath("TC_HRM001")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
