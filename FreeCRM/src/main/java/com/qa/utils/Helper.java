package com.qa.utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.qa.base.TestBase;

public class Helper extends TestBase {
	
	public static String getCurrentDateTime() {
		
		SimpleDateFormat sd=new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
		return sd.format(new Date());
		 
	}
	
	public static String captureScreenshot(WebDriver driver,String testName) {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath =".\\Screenshot\\"+testName+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return screenshotPath;
	}

}
