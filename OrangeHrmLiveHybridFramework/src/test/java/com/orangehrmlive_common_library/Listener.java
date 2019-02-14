package com.orangehrmlive_common_library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void takeScreenShot(String methodName)
	{
		EventFiringWebDriver efwd = new EventFiringWebDriver(SuperTestScript.driver);
		File f1 = efwd.getScreenshotAs(OutputType.FILE);
		File f2 = new File("./src/test/resources/failureScreenShots/"+methodName+".png");
		try
		{
			FileUtils.moveFile(f1, f2);
		}
		catch (IOException io)
		{
			
		}
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getName();
		takeScreenShot(methodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
				
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
