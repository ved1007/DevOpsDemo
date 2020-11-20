package com.testautomation.StepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.Utility.BrowserUtility;
import com.automation.Utility.PropertiesFileReader;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.PageObjects.YoutubeChannelPage;
import com.testautomation.PageObjects.YoutubebeResultsPage;
import com.testautomation.PageObjects.YoutubebeSearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YoutubeChannelValidations {

	PropertiesFileReader obj = new PropertiesFileReader();
	private WebDriver driver;

	@Given("^Open chrome browser with URL$")
	public void open_chrome_browser_with_URL() throws Throwable {

		Properties properties = obj.getProperty();
		driver=BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"),
				properties.getProperty("browser.baseURL"));

	}

	@When("^Search selenium tutorial$")
	public void search_selenium_tutorial() throws Throwable {

		new YoutubebeSearchPage(driver).NavigateToResultPage();

	}

	@And("^Click on channel name$")
	public void click_on_channel_name() throws Throwable {
		
		new YoutubebeResultsPage(driver).NavigateToChannelName();

	}

	@Then("^Validate channel name$")
	public void validate_channel_name() throws Throwable {
		String expectedChannelName="Selenium Java TestNG Tutorials - Bakkappa N - Youtube";
		String actualChannelName=new YoutubeChannelPage(driver).getTitle();
		Assert.assertEquals(actualChannelName, expectedChannelName, "Channel names are not matching");

	}

}
