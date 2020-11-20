package com.testautomation.StepDef;

import java.util.Map;

import com.automation.Utility.ExcelHandler;
import com.automation.Utility.PropertiesFileReader;
import com.automation.Utility.TestDataHandler;
import com.codoid.products.exception.FilloException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDataReadingStepDef {
	
	PropertiesFileReader obj = new PropertiesFileReader();

	TestDataHandler testdata = new TestDataHandler();

	@Given("^Read test data for testcase_(\\d+)$")
	public void read_test_data_for_testcase_(int arg1) throws Throwable {
		String filepath = System.getProperty("user.dir") + "/resources-testdata/TestData.xlsx";
		Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap(filepath, "TestData01", "TestCase_001");
		System.out.println(TestDataInMap.get("Skill_5"));

		testdata.setTestDataInMap(TestDataInMap);
	}

	@When("^Read test data for skill two$")
	public void read_test_data_for_skill_two() throws Throwable {
		Map<String, String> testDataInMap = testdata.getTestDataInMap();
		System.out.println(testDataInMap.get("Skill_2"));
	}

	@Then("^Read test data for skill three$")
	public void read_test_data_for_skill_three() throws Throwable {
		Map<String, String> testDataInMap = testdata.getTestDataInMap();
		System.out.println(testDataInMap.get("Skill_3"));
	}

}
