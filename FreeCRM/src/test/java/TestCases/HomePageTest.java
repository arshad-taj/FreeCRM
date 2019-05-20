package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.base.TestBase;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void ini() throws IOException {
		
		initialization();
		
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		driver.switchTo().frame("mainpanel");
		
		homePage=new HomePage();
			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void verifyPageTitle()
	{
		String title=homePage.getTitle();
		
		Assert.assertEquals(title, "CRMPRO");
	}
	
	@Test(priority=1)
	public void verifyCRMLogoIsPresent()
	{
		boolean flag=homePage.CRMLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void verifyUserName() {
		Assert.assertEquals(prop.getProperty("user"),homePage.homePageUserName());
	}
	

}
