@DataDrivenTesting
Feature: YouTube channel name validation 

Scenario Outline: YouTube channel name validations 
	Given OPen chrome browser with URL 
	When Search selenium tutorial "<SearchString>"
	And CLick on channel name
	Then Validate channel name
	
	Examples:
	|SearchString|
	|selenium by bakkappa n|
	|selenium webdriver by bakkappa n|	
