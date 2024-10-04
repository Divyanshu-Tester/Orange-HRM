package test_Cases;

import org.testng.annotations.Test;
import page_Objects.Create_Employee;
import page_Objects.Successfull_Login_Page;
import test_Base.Base_Class;

public class TC_HRM009 extends Base_Class
{
  
  @Test
  public void Create_Employee_Test() throws InterruptedException 
  
  {
	  //INITIALIZING THE PAGE OBJECTS FOR CREATE EMPLOYEE
	  Create_Employee create_Employee = new Create_Employee(driver);
	  
	  //INITIALIZING PAGE OBJECTS FOR THE LOGIN PAGE 
	  Successfull_Login_Page Login_Page = new Successfull_Login_Page(driver);

	  
	  //PERFORMING LOGIN
	  Login_Page.Enter_Username("Admin");
	  Login_Page.Enter_Password("admin123");
	  Login_Page.Enter_Login();
	  
	  //NAVIGATING BACK TO CLOSE THE ADD 
	  Thread.sleep(17000);
	  //Login_Page.Back_Button();
	  
	  //PERFORMING EMPLOYEE CREATING PAGE
	  create_Employee.Click_PIM();
	  create_Employee.Click_Add_Button();
	  create_Employee.Select_Profile_Photo(null);
	  create_Employee.Enter_Employee_First_Name("Divyanshu");
	  create_Employee.Enter_Last_name("Priyadarshi");
	  create_Employee.Enter_Employee_ID("0438");
	  
  }
  
}
