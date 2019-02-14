package com.orangehrmlive_common_library;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(Listener.class)
public abstract class SuperTestScript 
{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentTest test;
	public static ExtentReports report;
	
	@BeforeMethod
	public void preConfig()
	{
		String browserType = "FF";
		if(browserType.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/thirdPartyExe/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/thirdPartyExe/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./src/test/resources/thirdPartyExe/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browserType.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./src/test/resources/thirdPartyExe/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		else if (browserType.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "./src/test/resources/thirdPartyExe/operadriver.exe");
			driver = new OperaDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getTitle().equals("OrangeHRM"))
			{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
				test.log(LogStatus.FAIL, "Test Failed");
			}

	}
	
	@AfterMethod
	public void postConfig()
	{
		driver.close();
	}
	@BeforeTest
	public void startTest()
	{
		report = new ExtentReports("./test-output/ExtentReportResults.html",true);
		report.loadConfig(new File("./extent-config.xml"));
		test = report.startTest("ExtentReportOutput");
		
	}
	@AfterTest
	public void endTest()
	{
		report.endTest(test);
		report.flush();
	}
}
