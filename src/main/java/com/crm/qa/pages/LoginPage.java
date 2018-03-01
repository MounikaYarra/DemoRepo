package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory or OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitbtn;
	
	@FindBy(xpath="//button[contains(text(), 'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmlogo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
	  return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
	return crmlogo.isDisplayed();
	}
	
	public HomePage Login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
	    submitbtn.click();
	    
	    return new HomePage();
	}
	
	
}
