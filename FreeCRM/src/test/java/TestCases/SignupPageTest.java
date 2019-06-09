package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.qa.base.TestBase;

public class SignupPageTest extends TestBase{
	
	@BeforeClass
	public void set()
	{
		extentReportSetup();
	}
	
	@Test
	public void exTest() throws IOException {
		
		extentLogger=extent.createTest("tetetetet");
		extentLogger.pass("TEST IS PASSED", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/Arshad/Desktop/POM.JPG").build());
		extent.flush();
	}

}
