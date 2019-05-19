package TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.LoginPage;
import com.qa.base.TestBase;

public class LoginPageTest extends TestBase{
		
	LoginPage loginPage;
	

	
	@BeforeMethod
	public void init() throws IOException
	{
		log.info("***************Initializing browser************");
		initialization();
		loginPage=new LoginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyPageTitle()
	{
		String title=loginPage.pageTitle();
		
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void verifyCRMLogoIsPresent()
	{
		boolean flag=loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginCRM()
	{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}


}
