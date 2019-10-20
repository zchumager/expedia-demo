package com.expedia.testing.steps;

import org.openqa.selenium.WebDriver;

import com.expedia.testing.bases.BaseSteps;
import com.expedia.testing.pages.Home;

public class HomeSteps extends BaseSteps<Home> {

	public HomeSteps(WebDriver driver) {
		super(driver);
		this.page = new Home(this.driver);
	}
	
	public void setDeparture(String departure) {
		this.page.setFlyingFromInput(departure);
	}
	
	public void clickFlightsButton() {
		this.page.clickFlightsButton();
	}

}
