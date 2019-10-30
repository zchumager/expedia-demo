package com.expedia.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.expedia.testing.bases.BasePage;
import com.expedia.testing.config.Configuration;

public class TripReview extends BasePage{

	By continueBookingBtn;
	
	public TripReview(WebDriver driver, Configuration config) {
		super(driver, config);
		this.continueBookingBtn = By.id(config.continueBookingBtn());
	}
	
	public void continueBooking() {
		new WebDriverWait(this.driver, config.explicitWaitSeconds())
		.until(ExpectedConditions.elementToBeClickable(this.continueBookingBtn))
		.click(); 
	}
}