package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubebeResultsPage 
{

	WebDriver driver;

	public YoutubebeResultsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(how = How.LINK_TEXT,using = "Selenium Java TestNG Tutorials - Bakkappa N")
	public WebElement SearchTextbox;

	public void NavigateToChannelName() throws InterruptedException {

		Thread.sleep(2000);	
		SearchTextbox.click();

	}

}
