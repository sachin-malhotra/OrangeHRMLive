package com.orangehrmlive_pages;

import org.openqa.selenium.support.PageFactory;

import com.orangehrmlive_common_library.SuperTestScript;

public class DashboardPage extends SuperPage
{
	public DashboardPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}

}
