package com.testautomation.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestListenerImpl extends ExtentReportListener implements ITestListener {
	
	private static ExtentReports extent;

	public void onTestSart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("PASS");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");
	}

	public void OnTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestResult result) {
		System.out.println("Execution started...");
		extent=setUp();

	}
	public void onFinish(ITestResult result) {
		System.out.println("Execution finished...");
		extent.flush();
		System.out.println("Generated Report....");

	}
}
