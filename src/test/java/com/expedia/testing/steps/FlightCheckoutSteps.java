package com.expedia.testing.steps;

import org.openqa.selenium.WebDriver;

import com.expedia.testing.bases.BaseSteps;
import com.expedia.testing.config.Configuration;
import com.expedia.testing.pages.FlightCheckout;

public class FlightCheckoutSteps extends BaseSteps<FlightCheckout> {

	public FlightCheckoutSteps(WebDriver driver, Configuration config) {
		super(driver, config);
		this.page = new FlightCheckout(driver, config);
	}
	
	public void fillForm() {
		this.page.selectTitle();
		this.page.setFirstName();
		this.page.setMiddleName();
		this.page.setLastName();
		this.page.selectCountryCode();
		this.page.setPhoneNumber();
		this.page.setBirthday();
		this.page.chooseFlightProtection();
	}
}
