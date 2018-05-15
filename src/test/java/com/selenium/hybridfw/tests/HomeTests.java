package com.selenium.hybridfw.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.selenium.hybridfw.pages.CarsPage;
import com.selenium.hybridfw.pages.HomePage;
import com.selenium.hybridfw.pages.HotelsPage;
import com.selenium.hybridfw.utils.BaseTest;
import com.selenium.hybridfw.utils.WebDriverHelper;
//@Listeners(com.selenium.hybridfw.utils.Listeners.class)	
public class HomeTests extends BaseTest {
	BaseTest test;
	HomePage homePage;
	CarsPage carsPage;
	WebDriver driver;
	HotelsPage hotelsPage;

	@DataProvider(name = "Locations")

	public static Object[][] Locations() {
		return new Object[][] { { "Bangalore" }, { "Chennai"}, { "New Delhi" }};
	}
	
	@Test
	@Parameters({ "hotelLocation" , "results"})
	public void verify_parameter(String Location, String ExpectedResult) throws Exception {
		homePage.enterLocation(Location);
		//hotelsPage = homePage.clickOnSearch();
		Assert.assertEquals(homePage.getResults(), ExpectedResult);
		homePage = hotelsPage.clickOnLogo();
		//WebDriverHelper.getscreenshot();
		System.out.println("executed");
	}

	@Test(dataProvider = "Locations")
	public void verify(String Location) throws InterruptedException {
		System.out.println("executed");
		homePage.enterLocation(Location);
		hotelsPage = homePage.clickOnSearch();
		Assert.assertEquals(homePage.getResults(), "No Results!!");
		homePage = hotelsPage.clickOnLogo();
	}

	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());
	}

}
