package com.orangehrmlive_Rough_Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.orangehrmlive_common_library.SuperTestScript;

public class ScrollPage extends SuperTestScript
{
	@Test
	public void scrollDown() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		
	}
}
