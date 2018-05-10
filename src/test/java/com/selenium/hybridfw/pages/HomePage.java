package com.selenium.hybridfw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver; 
	
	@FindBy(xpath="//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[4]/a")
	private WebElement _carsTab;

	
	public HomePage(WebDriver driver) {
		super(driver);		
	}

	public CarsPage clickOnCars() {
		System.out.println("in clickOnCars() Method");
		_carsTab.click();
		
		System.out.println("Executed");
		
		return new CarsPage(getDriver());
		
	}

	
}
