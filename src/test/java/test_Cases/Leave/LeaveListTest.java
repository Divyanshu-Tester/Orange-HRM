package test_Cases.Leave;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Dashboard.DashboardPage;
import test_Base.Base_Class;
import Resources.PropertyReaderHelper;

public class LeaveListTest extends Base_Class {

	@Test(priority = 0, enabled=false,description = "verify that leave list page loads successfully with no records")
	public void testLeaveListPageWithNoRecords() throws InterruptedException {
		loginPage.loadLoginPage();
		DashboardPage dashboardPage = loginPage.loginToAdmin(PropertyReaderHelper.getConfigPropertyData("username"),
				PropertyReaderHelper.getConfigPropertyData("password"));
		Assert.assertEquals(dashboardPage.dashboardLoaded(), "Dashboard");
		dashboardPage.clickOnLeaveTab();
		Assert.assertEquals(leaveListPage.leavePageLoaded(), "Leave");
		Assert.assertEquals(leaveListPage.leaveListPageNoRecordMessage().trim(), "No Records Found");

	}
	
	@Test(priority = 1, description = "verify that leave list page loads successfully with records")
	public void testLeaveListPageWithRecords() throws InterruptedException {
		loginPage.loadLoginPage();
		DashboardPage dashboardPage = loginPage.loginToAdmin(PropertyReaderHelper.getConfigPropertyData("username"),
				PropertyReaderHelper.getConfigPropertyData("password"));
		Assert.assertEquals(dashboardPage.dashboardLoaded(), "Dashboard");
		dashboardPage.clickOnLeaveTab();
		Assert.assertEquals(leaveListPage.leavePageLoaded(), "Leave");
		leaveListPage.clickOnApplyTab();
		Assert.assertEquals(applyLeavePage.applyleavePageLoaded(), "Apply Leave");
		applyLeave();
	}
	
	

}
