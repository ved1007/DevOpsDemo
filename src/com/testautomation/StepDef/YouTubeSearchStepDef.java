package com.testautomation.StepDef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.automation.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubeSearchStepDef {

	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^OPen chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable {
		
		Properties properties = obj.getProperty();

		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get(properties.getProperty("browser.baseURL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^Enter search creteria$")
	public void enter_search_creteria() throws Throwable {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium");
		Thread.sleep(2000);

	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		driver.quit();

	}
}