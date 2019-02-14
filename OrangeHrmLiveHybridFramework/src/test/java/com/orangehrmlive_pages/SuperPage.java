package com.orangehrmlive_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrmlive_common_library.SuperTestScript;

public class SuperPage 
{
	@FindBy(xpath="//b[text()='PIM']")
	private WebElement pimButton;
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcomeAdminLink;
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	
	public SuperPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void clickOnPimButton()
	{
		pimButton.click();
	}
	public void clickOnWelcomeAdminLink()
	{
		Actions mouse = new Actions(SuperTestScript.driver);
		WebDriverWait wait = new WebDriverWait(SuperTestScript.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(welcomeAdminLink));
		mouse.moveToElement(welcomeAdminLink).perform();
		mouse.click(welcomeAdminLink).perform();
	}
	public void clickOnLogoutLink()
	{
		logoutLink.click();
	}
}
