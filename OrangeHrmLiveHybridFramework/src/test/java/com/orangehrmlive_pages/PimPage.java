package com.orangehrmlive_pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive_common_library.SuperTestScript;

public class PimPage extends SuperPage
{
	@FindBy(linkText="Add Employee")
	private WebElement addEmployeelink;
	@FindBy(id="firstName")
	private WebElement firstNameTextbox;
	@FindBy(id="lastName")
	private WebElement lastNameTextbox;
	@FindBy(id="employeeId")
	private WebElement empIdTextbox;
	@FindBy(xpath="//input[@type='file']")
	private WebElement uploadFileBox;
	@FindBy(id="btnSave")
	private WebElement saveButton;
	
	public PimPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void clickOnAddEmployeeLink()
	{
		addEmployeelink.click();
	}
	public void enterFirstName(String firstName)
	{
		firstNameTextbox.sendKeys(firstName);
	}
	public void enterLastName(String lastName)
	{
		lastNameTextbox.sendKeys(lastName);
	}
	public void enterEmployeeId(String empId)
	{
		empIdTextbox.clear();
		empIdTextbox.sendKeys(empId);
	}
	public void uploadPhoto(String filePath) throws AWTException, InterruptedException
	{
		Actions mouse = new Actions(SuperTestScript.driver);
		mouse.moveToElement(uploadFileBox).perform();
		mouse.click(uploadFileBox).perform();
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		StringSelection file = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
	}
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
}
