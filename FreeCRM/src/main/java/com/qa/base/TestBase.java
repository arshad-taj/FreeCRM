package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	public Logger log=Logger.getLogger(this.getClass());
	
	public void initialization() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Workplace\\FreeCRM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "d:\\microsofrwebdriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	

}
