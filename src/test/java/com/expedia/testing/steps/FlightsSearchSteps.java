package com.expedia.testing.steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.expedia.testing.bases.BaseSteps;
import com.expedia.testing.config.Configuration;
import com.expedia.testing.pages.FlightsSearch;

public class FlightsSearchSteps extends BaseSteps<FlightsSearch>{

	public FlightsSearchSteps(WebDriver driver, Configuration config) {
		super(driver, config);
		this.page = new FlightsSearch(this.driver, this.config);
	}
	
	public void selectEarliestDeparture() {
		this.page.selectEarliestDeparture();
	}
	
	public List<WebElement> getLiElements() {
		return this.page.getLiElements();
	}
}
