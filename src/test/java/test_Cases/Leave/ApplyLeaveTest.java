package test_Cases.Leave;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Dashboard.DashboardPage;
import Resources.PropertyReaderHelper;
import test_Base.Base_Class;

public class ApplyLeaveTest extends Base_Class {

	@Test(priority=0)
	public void applyLeaveWithMandatoryFields() throws InterruptedException {
		loginPage.loadLoginPage();
		DashboardPage dashboardPage = loginPage.loginToAdmin(PropertyReaderHelper.getConfigPropertyData("username"),
				PropertyReaderHelper.getConfigPropertyData("password"));
		Assert.assertEquals(dashboardPage.dashboardLoaded(), "Dashboard");
		dashboardPage.clickOnLeaveTab();
		System.out.println(applyLeavePage.applyleavePageLoaded());
		Assert.assertEquals(applyLeavePage.applyleavePageLoaded(), "Apply Leave");
		applyLeave();
		
		
	}

}
