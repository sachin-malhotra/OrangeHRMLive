package com.orangehrmlive_Rough_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.orangehrmlive_common_library.SuperTestScript;

public class LocationAndSize extends SuperTestScript
{
	@Test
	public void testLocationAndSize()
	{
		WebElement userNameTextbox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Point p1 = userNameTextbox.getLocation();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		Dimension d1 = userNameTextbox.getSize();
		System.out.println(d1.getHeight());
		System.out.println(d1.getWidth());
	}
	
}
