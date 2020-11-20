@UATTesting2
Feature: YouTube channel name validation 
Scenario: YouTube channel name validations 
	Given Open chrome browser with URL 
	When Search selenium tutorial
	And Click on channel name
	Then Validate channel name
	
