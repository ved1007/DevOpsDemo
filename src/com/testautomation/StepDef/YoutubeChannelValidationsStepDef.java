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
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.YoutubeChannelPage;
import com.testautomation.PageObjects.YoutubebeResultsPage;
import com.testautomation.PageObjects.YoutubebeSearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YoutubeChannelValidationsStepDef extends ExtentReportListener {

	PropertiesFileReader obj = new PropertiesFileReader();
	private WebDriver driver;

	@Given("^OPen chrome browser with URL$")
	public void open_chrome_browser_with_URL() throws Throwable {

		ExtentTest logInfo = null;
		try {
			test=extent.createTest(Feature.class, "YouTube channel name validation");
			test=test.createNode(Scenario.class, "YouTube channel name validations");
			logInfo=test.createNode(new GherkinKeyword("Given"), "open_chrome_browser_with_URL");
			Properties properties = obj.getProperty();
			driver=BrowserUtility.OpenBrowser(driver,properties.getProperty("browser.name"),properties.getProperty("browser.baseURL"));

			logInfo.pass("Opened browser and entered url");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@When("^Search selenium tutorial$")
	public void search_selenium_tutorial() throws Throwable {

		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "search_selenium_tutorial");
			new YoutubebeSearchPage(driver).NavigateToResultPage();
			logInfo.pass("Searching selenium tutorial");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}
	
	@When("^CLick on channel name$")
	public void click_on_channel_name() throws Throwable {

		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "click_on_channel_name");
			new YoutubebeResultsPage(driver).NavigateToChannelName();
			logInfo.pass("Clicked on channel name");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Then("^Validate channel name$")
	public void validate_channel_name() throws Throwable {

		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"), "validate_channel_name");
			String expectedChannelName = "Selenium Java TestNG";
			String actualChannelName = new YoutubeChannelPage(driver).getTitle();
			Assert.assertEquals(actualChannelName, expectedChannelName);
			logInfo.pass("validated channel title");
			driver.quit();

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

}
