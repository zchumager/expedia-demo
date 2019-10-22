package com.expedia.testing.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.expedia.testing.bases.BaseTest;
import com.expedia.testing.steps.FlightsSearchSteps;
import com.expedia.testing.steps.HomeSteps;

public class RoundTripTest extends BaseTest {
	
	HomeSteps homeSteps;
	FlightsSearchSteps flightsSearchSteps;
	
	public RoundTripTest() {
		this.driver = new ChromeDriver();
	}
	
	@Before
	public void setup() {
		this.driver.manage().window().maximize();
		this.driver.get(this.config.homeUrl());
		this.homeSteps = new HomeSteps(this.driver, this.config);
		this.flightsSearchSteps = new FlightsSearchSteps(this.driver, this.config);
	}
	
	@Test
	public void positiveRoundTrip() {
		this.logger.info("positiveRoundTrip Test");
		this.homeSteps.clickFlightsButton();
		this.homeSteps.setDeparture();
		this.homeSteps.setDestination();
		this.homeSteps.setDepartingDate();
		this.homeSteps.setDestinationDate();
		this.homeSteps.clickSearchButton();
		
		this.flightsSearchSteps.selectEarliestDeparture();
		List<WebElement> liList = this.flightsSearchSteps.getLiElements();
	}
}