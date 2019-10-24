package com.expedia.testing.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.expedia.testing.bases.BasePage;
import com.expedia.testing.config.Configuration;
import com.expedia.testing.utils.Utils;

public class FlightsSearch extends BasePage {
	
	private By sortDropdown;
	private By flightsLiList;
	private By firstFlightButton;

	public FlightsSearch(WebDriver driver, Configuration config) {
		super(driver, config);
		this.sortDropdown = By.id("sortDropdown");
		this.flightsLiList = By.xpath("//li[@class='flight-module segment offer-listing']//div[@class='grid-container standard-padding ']");
		this.firstFlightButton = By.xpath("(//li[@class='flight-module segment offer-listing']//button)[1]");
	}
	
	public void selectEarliestDeparture() {
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		new Select(
			wait.until(ExpectedConditions.elementToBeClickable(this.sortDropdown))
		).selectByVisibleText("Departure (Earliest)");
	}
	
	public List<WebElement> getLiElements() {
		return Utils.getLiElements(this.driver, this.flightsLiList, 10);
	}
	
	public void clickFirstFlightButton() {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.elementToBeClickable(this.firstFlightButton))
		.click();
	}
}
