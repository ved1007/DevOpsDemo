package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubebeSearchPage {

	WebDriver driver;

	public YoutubebeSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "search")
	public WebElement SearchTextbox;

	@FindBy(how = How.CSS, using = "#search-icon-legacy")
	public WebElement SearchButton;

	public void NavigateToResultPage() {

		SearchTextbox.sendKeys("selenium by ballappa n");
		SearchButton.click();

	}

}
