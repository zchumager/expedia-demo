package com.expedia.testing.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.expedia.testing.bases.BaseTest;
import com.expedia.testing.steps.HomeSteps;

public class RoundTripTest extends BaseTest<HomeSteps>{
	public RoundTripTest() {
		this.driver = new ChromeDriver();
	}
	
	@Before
	public void setup() {
		this.driver.manage().window().maximize();
		this.driver.get(this.config.homeUrl());
		this.steps = new HomeSteps(this.driver, this.config);
	}
	
	@Test
	public void positiveRoundTrip() {
		this.logger.info("positiveRoundTrip Test");
		this.steps.clickFlightsButton();
		this.steps.setDeparture();
		this.steps.setDestination();
		this.steps.setDepartingDate();
		this.steps.setDestinationDate();
		this.steps.clickSearchButton();
		
		
	}
}
