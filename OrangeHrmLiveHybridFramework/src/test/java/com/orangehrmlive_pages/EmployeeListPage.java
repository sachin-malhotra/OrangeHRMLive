package com.orangehrmlive_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive_common_library.SuperTestScript;

public class EmployeeListPage extends SuperPage
{
	@FindBys(@FindBy(xpath="//input[@type='text']"))
	private List<WebElement> allTextBoxes;
	@FindBy(id="btnSave")
	private WebElement editButton;
	
	public EmployeeListPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void clickOnBollywood()
	{
		SuperTestScript.driver.findElement(By.linkText("Bollywood")).click();
	}
	public void clickOnEditButton()
	{
		editButton.click();
	}
	public int checkTextboxCount()
	{
		int count = allTextBoxes.size();
		return count;
	}

}

