package com.qa.utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.qa.base.TestBase;

public class ExtentListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		extentLogger=extent.createTest(result.getName());
		System.out.println("Test starts");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//extentLogger.log(Status.PASS, "Test Pass", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver, result.getName()), result.getName()));
//		try {
//			extentLogger.pass(result.getName()+"IS PASS",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver, result.getName())).build());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Test pass");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		try {
//			extentLogger.fail(result.getName()+"IS FAILED",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver, result.getName())).build());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Test fail");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
