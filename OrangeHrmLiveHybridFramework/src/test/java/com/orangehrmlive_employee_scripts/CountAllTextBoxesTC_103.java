package com.orangehrmlive_employee_scripts;

import org.testng.annotations.Test;

import com.orangehrmlive_common_library.ExcelLibrary;
import com.orangehrmlive_common_library.SuperTestScript;
import com.orangehrmlive_pages.DashboardPage;
import com.orangehrmlive_pages.EmployeeListPage;
import com.orangehrmlive_pages.LoginPage;

public class CountAllTextBoxesTC_103 extends SuperTestScript
{
	@Test
	public void testCountAllTextBoxesTC_103()
	{
		String un =ExcelLibrary.readData("TC_103", 1, 0);
		String pwd = ExcelLibrary.readData("TC_103", 1, 1);
		LoginPage lp = new LoginPage();
		DashboardPage dbp = new DashboardPage();
		EmployeeListPage elp = new EmployeeListPage();
		lp.enterUsername(un);
		lp.enterPassword(pwd);
		lp.submitLoginCredentials();
		dbp.clickOnPimButton();
		elp.clickOnBollywood();
		elp.clickOnEditButton();
		System.out.println("Total count of textboxes is "+elp.checkTextboxCount());
		elp.clickOnWelcomeAdminLink();
		elp.clickOnLogoutLink();
		
		
	}
}
