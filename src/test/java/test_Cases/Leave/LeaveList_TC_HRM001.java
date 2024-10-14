package test_Cases.Leave;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Dashboard.DashboardPage;
import test_Base.Base_Class;
import Resources.PropertyReaderHelper;

public class LeaveList_TC_HRM001 extends Base_Class {

	@Test(priority = 0, description = "verify that leave list page loads successfully with no records")
	public void testLeaveListPageWithNoRecords() throws InterruptedException {
		loginPage.loadLoginPage();
		DashboardPage dashboardPage = loginPage.loginToAdmin(PropertyReaderHelper.getConfigPropertyData("username"),
				PropertyReaderHelper.getConfigPropertyData("password"));
		Assert.assertEquals(dashboardPage.dashboardLoaded(), "Dashboard");
		dashboardPage.clickOnLeaveBtn();
		Assert.assertEquals(leaveListPage.leavePageLoaded(), "Leave");
		Assert.assertEquals(leaveListPage.getNoRecordMessage().trim(), "No Records Found");

	}

}
