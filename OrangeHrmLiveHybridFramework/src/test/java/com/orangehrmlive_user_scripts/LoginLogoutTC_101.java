package com.orangehrmlive_user_scripts;

import org.testng.annotations.Test;

import com.orangehrmlive_common_library.ExcelLibrary;
import com.orangehrmlive_common_library.SuperTestScript;
import com.orangehrmlive_pages.DashboardPage;
import com.orangehrmlive_pages.LoginPage;

public class LoginLogoutTC_101 extends SuperTestScript
{
	@Test
	public void testLoginLogoutTC_101() throws InterruptedException
	{
		String un = ExcelLibrary.readData("TC_101", 1, 0);
		String pwd = ExcelLibrary.readData("TC_101", 1, 1);
		LoginPage lp = new LoginPage();
		DashboardPage dbp = new DashboardPage();
		lp.enterUsername(un);
		lp.enterPassword(pwd);
		lp.submitLoginCredentials();
		dbp.clickOnWelcomeAdminLink();
		dbp.clickOnLogoutLink();
		
	}
}
