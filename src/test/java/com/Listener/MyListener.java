package com.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
	System.out.println("All Test cases Execution Started");
	}

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Case Execution  started "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Execution  pass "+ result.getName());	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Execution  fail "+ result.getName());
		}
		@Override
	public void onTestSkipped(ITestResult result) {
			System.out.println("Test Case Execution  skipped "+ result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Case Execution completed "+ context.getName());
	}

	
}
