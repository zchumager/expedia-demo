package com.expedia.testing.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.expedia.testing.bases.BaseTest;
import com.expedia.testing.steps.FlightCheckoutSteps;
import com.expedia.testing.steps.FlightsSearchSteps;
import com.expedia.testing.steps.HomeSteps;
import com.expedia.testing.steps.TripReviewSteps;
import com.expedia.testing.utils.Utils;

public class RoundTripTest extends BaseTest {
	
	private HomeSteps homeSteps;
	private FlightsSearchSteps flightsSearchSteps;
	private TripReviewSteps tripReviewSteps;
	private FlightCheckoutSteps flightCheckoutSteps;
	
	public RoundTripTest() {
		this.driver = new ChromeDriver();
	}
	
	@Before
	public void setup() {
		this.driver.manage().window().maximize();
		this.driver.get(this.config.homeUrl());
		this.homeSteps = new HomeSteps(this.driver, this.config);
		this.flightsSearchSteps = new FlightsSearchSteps(this.driver, this.config);
		this.tripReviewSteps = new TripReviewSteps(this.driver, this.config);
		this.flightCheckoutSteps = new FlightCheckoutSteps(this.driver, this.config);
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
		
		//this.flightsSearchSteps.selectEarliestDeparture();
		List<WebElement> liList = this.flightsSearchSteps.getLiElements();
		
		String firstLi = Utils.getFirstLiHour(liList);
		String lastLi = Utils.getLastLiHour(liList);
		
		Map<String, String> firstLiMap = Utils.getTimeMap(firstLi);
		Map<String, String> lastLiMap = Utils.getTimeMap(lastLi);
		
		int firstDepartureHour = Utils.convertAmPm(firstLiMap.get("departureTime"));
		int lastDepartureHour = Utils.convertAmPm(lastLiMap.get("departureTime"));
		
		//Assert.assertEquals( true , firstDepartureHour < lastDepartureHour);
		
		this.flightsSearchSteps.clickDepartureAndReturnButtons();
		
		this.flightsSearchSteps.clickNoThanksButton();
		
		
		List<String> tabs = new ArrayList<>(this.driver.getWindowHandles());
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		this.driver.switchTo().window(tabs.get(1));
			
		this.tripReviewSteps.continueBooking();
		
		this.flightCheckoutSteps.fillForm();
		
		System.out.println();
	}
}