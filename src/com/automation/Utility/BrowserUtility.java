package com.automation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility

{
	public static WebDriver OpenBrowser(WebDriver driver, String browserName, String url) throws InterruptedException
	
	  {

		if (browserName.equals("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver",
					"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;

		} else if (browserName.equals("Firefox"))

		{
			System.setProperty("webdriver.gecko.driver",
					"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/geckodriver");

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;

		}
		return null;
	}
}