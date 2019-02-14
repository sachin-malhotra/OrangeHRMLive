package com.orangehrmlive_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive_common_library.SuperTestScript;

public class LoginPage
{
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement usernameTextbox;
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passwordTextbox;
	
	public LoginPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterUsername(String un)
	{
		usernameTextbox.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		passwordTextbox.sendKeys(pwd);
	}
	public void submitLoginCredentials()
	{
		passwordTextbox.submit();
	}
}

