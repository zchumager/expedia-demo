package com.expedia.testing.steps;

import org.openqa.selenium.WebDriver;

import com.expedia.testing.bases.BaseSteps;
import com.expedia.testing.config.Configuration;
import com.expedia.testing.pages.HomePage;

public class HomeSteps extends BaseSteps<HomePage> {

	public HomeSteps(WebDriver driver, Configuration config) {
		super(driver, config);
		this.page = new HomePage(this.driver, this.config);
	}
	
	public void fillForm() {
		this.page.clickFlightsButton();
		this.page.setFlyingFromInput();
		this.page.setFlyingToInput();
		this.page.setDepartingDate();
		this.page.setDestinationDate();
		this.page.clickSearchButton();
	}
}