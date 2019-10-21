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
	
	public void clickFlightsButton() {
		this.page.clickFlightsButton();
	}
	
	public void setDeparture() {
		this.page.setFlyingFromInput();
	}
	
	public void setDestination(){
		this.page.setFlyingToInput();
	}
	
	public void setDepartingDate() {
		this.page.setDepartingDate();
	}
	
	public void setDestinationDate() {
		this.page.setDestinationDate();
	}
	
	public void clickSearchButton() {
		this.page.clickSearchButton();
	}
}