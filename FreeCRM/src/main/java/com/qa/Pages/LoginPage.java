package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@href='https://classic.crmpro.com/index.html']")
	public WebElement crmLogo;// making webElement public inorder to access it in test class
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public boolean validateLogo() {
		return crmLogo.isDisplayed();
	}
	
	public String pageTitle()
	{
		return driver.getTitle();
	}
	
	public void login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		loginButton.submit();
	}
	

}
