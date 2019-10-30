package com.expedia.testing.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
	private By noThanksButton;

	public FlightsSearch(WebDriver driver, Configuration config) {
		super(driver, config);
		this.sortDropdown = By.id(config.sortDropdown());
		this.flightsLiList = By.xpath(config.flightsLiList());
		this.firstFlightButton = By.xpath(config.firstFlightButton());
		this.noThanksButton = By.xpath(config.noThanksButton());
	}
	
	public void selectEarliestDeparture() {
		WebDriverWait wait = new WebDriverWait(this.driver, config.explicitWaitSeconds());
		new Select(
			wait.until(ExpectedConditions.elementToBeClickable(this.sortDropdown))
		).selectByVisibleText(config.departureEarliest());
	}
	
	public List<WebElement> getLiElements() {
		return Utils.getLiElements(this.driver, this.flightsLiList, config.explicitWaitSeconds());
	}
	
	public void clickDepartureAndReturnButtons() {
		for(int i=0; i<2; i++) {
			new WebDriverWait(this.driver, config.explicitWaitSeconds())
			.until(ExpectedConditions.elementToBeClickable(this.firstFlightButton))
			.click();
			
			this.driver.manage().timeouts().implicitlyWait(config.implicitWaitSeconds(), TimeUnit.SECONDS);
		}
	}
	
	public void clickNoThanksButton() {
		try {
			WebDriverWait wait = new WebDriverWait(this.driver, config.explicitWaitSeconds());
			wait.until(ExpectedConditions.elementToBeClickable(this.noThanksButton)).click();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
