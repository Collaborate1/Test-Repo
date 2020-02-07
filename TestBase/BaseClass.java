package com.clinicianPortal.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
       public static Properties prop = new Properties();
	   public static WebDriver driver;
	   
	  public BaseClass() {
		  try {
		FileInputStream fs = new  FileInputStream("./Configuration/config.properties");
		prop.load(fs);
		  }catch (FileNotFoundException e) {
			  e.printStackTrace();
		  }catch (IOException e) {
			  e.printStackTrace();
		  }
		}
	   
	  @BeforeClass
	   public static void initialization() {
		   String browserName=prop.getProperty("BrowserName");
		 
		   if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:\\Automation2020\\clinicianPortal\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				//System.out.println("driver ="+ driver);
		   }
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("baseUrl"));
			driver.findElement(By.id("MainContent_Continue")).click();
	   }
	  
	@AfterClass
	     public void teardown() {
	    	 driver.quit();
	     }
		
	
	
	
	

	
}


