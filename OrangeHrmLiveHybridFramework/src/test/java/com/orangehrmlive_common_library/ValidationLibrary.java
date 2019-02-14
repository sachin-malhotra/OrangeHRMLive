package com.orangehrmlive_common_library;

import org.testng.Assert;

public class ValidationLibrary 
{
	public static String verifyTitle(String expectedTitle,String actualTitle)
	{
		try
		{
			Assert.assertEquals(expectedTitle, actualTitle);
			return "Pass";
		}
		catch(AssertionError ae)
		{
			return "Fail";
		}
		
	}
	public static String verifySucessMessage(String expectedSucessMsg,String actualSucessMsg)
	{
		try
		{
			Assert.assertEquals(expectedSucessMsg, actualSucessMsg);
			return "Pass";
		}
		catch(AssertionError ae)
		{
			return "Fail";
		}
		
	}
	public static String verifyErrorMessage(String expectedErrMsg,String actualErrMsg)
	{
		try
		{
			Assert.assertEquals(expectedErrMsg, actualErrMsg);
			return "Pass";
		}
		catch(AssertionError ae)
		{
			return "Fail";
		}
		
	}
}
