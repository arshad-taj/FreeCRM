package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath=("//td[contains(text(),'CRMPRO')]"))
	WebElement logo;
	
	@FindBy(xpath=("//td[contains(text(),'User')]"))
	WebElement userName;
	
	@FindBy(xpath=("//td[contains(text(),'Home')]"))
	WebElement homeLink;
	
	@FindBy(xpath=("//td[contains(text(),'Calendar')]"))
	WebElement calendarLink;
	
	@FindBy(xpath=("//td[contains(text(),'Contacts')]"))
	WebElement contactsLink;
	
	@FindBy(xpath=("//td[contains(text(),'Deals')]"))
	WebElement dealsLink;
	
	@FindBy(xpath=("//td[contains(text(),'Tasks')]"))
	WebElement tasksLink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean CRMLogo() {
		return logo.isDisplayed();
	}
	
	public void clickHomeLink() {
		homeLink.click();
	}
	
	public void clickCalendarLink() {
		calendarLink.click();
	}
	
	public void clickContactsLink() {
		contactsLink.click();
	}
	
	public void clickDealsLink() {
		dealsLink.click();
	}
	
	public void clickTasksLink() {
		tasksLink.click();
	}
	
	public String homePageUserName() {
		String un=userName.getText().replaceAll("User: ", "").trim();
		return un;
	}
	

}
