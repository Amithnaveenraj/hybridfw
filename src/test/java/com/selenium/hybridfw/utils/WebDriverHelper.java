package com.selenium.hybridfw.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {

	static WebDriver driver = null;

	public static WebDriver createDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Hp/Appium_Demo/hybridfw/src/test/java/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("http://phptravels.net");
			driver.manage().window().maximize();
		}
		return driver;

	}
	public static void getscreenshot() throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Hp\\Appium_Demo\\hybridfw\\screenshots\\failure"+System.currentTimeMillis()+".png"));
	}

	public static void getscreenshot(String MethodName) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Hp\\Appium_Demo\\hybridfw\\screenshots\\screenshot.png"));
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Hp\\Appium_Demo\\hybridfw\\screenshots\\"+MethodName+".png"));
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\Hp\\Appium_Demo\\hybridfw\\screenshots\\"+System.currentTimeMillis()+".png"));
		/* try {
			 	String filePath="C:\\Users\\Hp\\Appium_Demo\\hybridfw\\screenshots\\";
				FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
				System.out.println("***Placed screen shot in "+filePath+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
 }*/
	}

}
