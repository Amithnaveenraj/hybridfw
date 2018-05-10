package com.selenium.hybridfw.tests;

import org.apache.bcel.verifier.statics.Pass1Verifier;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.hybridfw.pages.CarsPage;
import com.selenium.hybridfw.pages.HomePage;
import com.selenium.hybridfw.utils.BaseTest;

public class HomeTests extends BaseTest {
	BaseTest test;
	HomePage homePage;
	CarsPage carsPage;
	
	@Test(priority=1,enabled=false)
	@DataProvider(name="Locations")
	public static Object[][] locations(){

		return new Object[][]{
			
			{"hotelLocation", "Bangalore"}
			
		};
		
	}
	
	public void browser_launch(){
	
		carsPage=homePage.clickOnCars();
		carsPage.selectItem();
		Assert.assertEquals("", "");		
	}
	
	 @Test (dataProvider ="Locations")
	 
	 // @Parameters({ "sUsername", "sPassword" })
	// @Parameters({ "hotelLocation" })
	 
	  public void test(String hotelLocation) {
		 
		 System.out.println("Data -" + hotelLocation);
		 
		 
		 
		 
		 
		 
	 
		  /*driver = new FirefoxDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.phptravels.net");
	 
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	 
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	      driver.quit();*/
	 
	  }
	 
	 @Test
	 public void validate_login(String username, String password){
		 /*
		 loginPage.enterUsername(username);
		 loginPage.enterPassword(password);
		 loginPage.clickOnSubmit();
		 
		// AssertTrue("","");
		 
		 if(homePage()){
			 Assert.assertEquals("", "");
		 }else{
			 Assert.assertEquals("enter valid username", "");
		 }*/
		 
	 }
	
	@BeforeClass
	public void setup(){
		homePage = new HomePage(getDriver());
	}
	

}
