package com.selenium.hybridfw.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {
	
	static WebDriver driver = null;
	
	public static WebDriver createDriver(){
		if(driver==null){
		System.setProperty("webdriver.chrome.driver","C:/Users/Hp/Appium_Demo/hybridfw/src/test/java/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://phptravels.net");
		driver.manage().window().maximize();
		}
		return driver;
		
	}
	

}
