package com.selenium.hybridfw.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void beforeAllClasses(){
		driver= WebDriverHelper.createDriver();
	}
	

	public WebDriver getDriver(){
		return driver;
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	

}
