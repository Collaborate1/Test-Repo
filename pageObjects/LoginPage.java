package com.clinicianPortal.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clinicianPortal.TestBase.BaseClass;

//import com.DcalAutomation.TestBase.BaseClass;

public class LoginPage extends BaseClass  {
	
	 public LoginPage() {
		 PageFactory.initElements(driver,this);
		 
		 //System.out.println("driver ="+ driver);
	 }
	
	//Object Repository
	@FindBy(id = "UserName")
	WebElement username;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id = "MainContent_LoginButton")
	WebElement signInButton;
	@FindBy(xpath ="//*[@id='Image1']")
	WebElement NxstageLogo;
	
	public boolean logoTest() {
		
	   return NxstageLogo.isDisplayed();
		
	}
	
	public String validateLoginPageTitle() {
		
		System.out.println("driver " +driver);
		
	   return driver.getTitle();
		
	}
	
	
	

	public  DCalPage loginToDcal(String Uid, String pwd) {
		username.sendKeys(Uid);
		password.sendKeys(pwd);
		signInButton.click();
		//Thread.sleep(3000);
		//return new DosingCalculatorPage();
		return new DCalPage();
		
	}

}

