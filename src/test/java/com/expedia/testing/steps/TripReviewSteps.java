package com.expedia.testing.steps;

import org.openqa.selenium.WebDriver;

import com.expedia.testing.bases.BaseSteps;
import com.expedia.testing.config.Configuration;
import com.expedia.testing.pages.TripReview;

public class TripReviewSteps extends BaseSteps<TripReview> {

	public TripReviewSteps(WebDriver driver, Configuration config) {
		super(driver, config);
		this.page = new TripReview(this.driver, this.config);
	}
	
	public void continueBooking() {
		this.page.continueBooking();
	}

}
