package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.qa.Pages.LoginPage;
import com.qa.base.TestBase;
import com.qa.utils.Helper;

public class LoginPageTest extends TestBase{
		
	LoginPage loginPage;
	
	@BeforeTest
	public void extentReport() {
		extentReportSetup();
		
	}
	
	@BeforeMethod
	public void init(ITestResult result) throws IOException
	{
		
		log.info("***************Initializing browser************");
		initialization();
		loginPage=new LoginPage();
//		extentLogger=extent.createTest(result.getMethod().getMethodName());
	}
	
	
	
	@Test(priority=1)
	public void verifyPageTitle()
	{
		
		String title=loginPage.pageTitle();
		
		extentLogger.info("verifying title");
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		extentLogger.info("Test Pass");
	}
	
	@Test(priority=2)
	public void verifyCRMLogoIsPresent()
	{
		
		extentLogger.info("verifying Logo");
		boolean flag=loginPage.validateLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginCRM()
	{
		extentLogger.info("trying to login into CRM");
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if (result.getStatus()==ITestResult.SUCCESS) {
			extentLogger.log(Status.PASS, "TEST is PASS");
			extentLogger.addScreenCaptureFromPath("D:\\GIT\\FreeCRM\\FreeCRM\\Screenshot\\loginCRM06_10_2019_01_15_59.png");
			System.out.println("susususususuccesss");
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
			extentLogger.fail("test is pass",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver, result.getMethod().getMethodName())).build());
		}
		extent.flush();
		driver.quit();
		
		
	}
	


}
