void1 void main message (Mounika) package com.clinicianPortal.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clinicianPortal.TestBase.BaseClass;

public class DCalPage extends BaseClass {
	
	@FindBy(id = "txtAge")
	WebElement Age;
	@FindBy(id = "txtWeight")
	WebElement Weight;
	@FindBy(id = "txtHeight")
	WebElement Height;
	@FindBy(id = "txtBloodFlowRate")
	WebElement BFR;
	@FindBy(id = "txtResidualRenal")
	WebElement ResidualRenal;
	@FindBy(id = "txtMaxUFRate")
	WebElement MaxUFRate;
	@FindBy(id = "txtWeeklyUFvolume")
	WebElement UFV;
	@FindBy(id = "txtMinHoursWeek")
	WebElement MinHoursWeek;
	@FindBy(id = "txtTargetWeeklystdKt")
	WebElement Stdkt;
	
	public DCalPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void testdata() {
		
		
		
		
	}
	


}
