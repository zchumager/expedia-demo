package com.expedia.testing.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.expedia.testing.bases.BaseTest;
import com.expedia.testing.steps.HomeSteps;

public class RoundTrip extends BaseTest<HomeSteps>{
	public RoundTrip() {
		this.driver = new ChromeDriver();
	}
	
	@Before
	public void setup() {
		this.driver.manage().window().maximize();
		this.driver.get("https://www.expedia.com");
		this.steps = new HomeSteps(this.driver);
	}
	
	@Test
	public void positiveRoundTrip() {
		this.steps.clickFlightsButton();
		this.steps.setDeparture("Mexico");
	}
}
