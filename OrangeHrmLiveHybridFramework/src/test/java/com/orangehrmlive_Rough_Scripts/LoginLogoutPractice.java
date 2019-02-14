package com.orangehrmlive_Rough_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.orangehrmlive_common_library.ExcelLibrary;
import com.orangehrmlive_common_library.SuperTestScript;
import com.orangehrmlive_pages.LoginPage;

public class LoginLogoutPractice extends SuperTestScript
{
	@Test
	public void testLoginLogoutPractice() throws InterruptedException
	{
		String un = ExcelLibrary.readData("TC_101", 1, 0);
		String pwd = ExcelLibrary.readData("TC_101", 1, 1);
		LoginPage lp = new LoginPage();
		lp.enterUsername(un);
		lp.enterPassword(pwd);
		lp.submitLoginCredentials();
		Actions mouse = new Actions(driver);
		WebElement welcomeAdminLink = driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		Thread.sleep(3000);
		mouse.moveToElement(welcomeAdminLink).perform();
		mouse.click(welcomeAdminLink).perform();
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();	
	}
}
