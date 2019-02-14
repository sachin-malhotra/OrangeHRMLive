package com.orangehrmlive_employee_scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.orangehrmlive_common_library.ExcelLibrary;
import com.orangehrmlive_common_library.SuperTestScript;
import com.orangehrmlive_pages.DashboardPage;
import com.orangehrmlive_pages.LoginPage;
import com.orangehrmlive_pages.PimPage;

public class AddEmployeeTC_102 extends SuperTestScript
{
	@Test
	public void testAddEmployeeTC_102() throws InterruptedException 
	{
		String un = ExcelLibrary.readData("TC_102", 1, 0);
		String pwd = ExcelLibrary.readData("TC_102", 1, 1);
		String firstName = ExcelLibrary.readData("TC_102", 1, 2);
		String lastName = ExcelLibrary.readData("TC_102", 1, 3);
		String empId = ExcelLibrary.readData("TC_102", 1, 4);
		String filePath = ExcelLibrary.readData("TC_102", 1, 5);
		LoginPage lp = new LoginPage();
		DashboardPage dbp = new DashboardPage();
		PimPage pip = new PimPage();
		lp.enterUsername(un);
		lp.enterPassword(pwd);
		lp.submitLoginCredentials();
		dbp.clickOnPimButton();
		pip.clickOnAddEmployeeLink();
		pip.enterFirstName(firstName);
		pip.enterLastName(lastName);
		pip.enterEmployeeId(empId);
		try 
		{
			pip.uploadPhoto(filePath);
		} 
		catch (AWTException e) 
		{
			
		}
		pip.clickOnSaveButton();
		dbp.clickOnWelcomeAdminLink();
		dbp.clickOnLogoutLink();
	}
}
