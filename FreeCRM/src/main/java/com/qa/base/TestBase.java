package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.utils.BrowserSelection;
import com.qa.utils.Helper;

public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	public Logger log = Logger.getLogger(this.getClass());

	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public ExtentTest extentLogger;
	
	
	public static void initialization() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
		
		driver=BrowserSelection.browserSelection(prop.getProperty("browser"));
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	public void extentReportSetup() {
		
		reporter=new ExtentHtmlReporter(new File(".\\Reports\\extent.html"));
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
	
		
		
	}
	

}
