package com.expedia.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.expedia.testing.bases.BasePage;
import com.expedia.testing.config.Configuration;
import com.expedia.testing.utils.Utils;

public class HomePage extends BasePage {
	
	private By 
	flightsButton
	, flyingFromInput
	, firstCoincidenceLi
	, flyingToInput
	, departingDateInput
	, departingDateButton
	, destinationDateInput
	, destinationDateButton
	, searchButton;
	
	public HomePage(WebDriver driver, Configuration config) {
		super(driver, config);
		this.flightsButton = By.id(this.config.flightsButton());
		this.flyingFromInput = By.id(this.config.flyingFromInput());
		this.firstCoincidenceLi = By.xpath(this.config.firstCoincidenceLi());
		this.flyingToInput = By.id(this.config.flyingToInput());
		
		this.departingDateInput = By.id(this.config.departingDateInput());
		this.departingDateButton = By.xpath(this.config.departingDateButton());
		this.destinationDateInput = By.id(this.config.destinationDateInput());
		this.destinationDateButton = By.xpath(this.config.destinationDateButton());
		
		this.searchButton = By.xpath(this.config.searchButton());
	}
	
	public void clickFlightsButton() {
		new WebDriverWait(this.driver, config.lowExplicitWaitSeconds())
		.until(ExpectedConditions.elementToBeClickable(this.flightsButton))
		.click();
	}
	
	public void setFlyingFromInput() {		
		Utils.setInput(this.driver, this.flyingFromInput, this.config.departure(), this.firstCoincidenceLi, config.explicitWaitSeconds());
	}
	
	public void setFlyingToInput() {
		Utils.setInput(this.driver, this.flyingToInput, this.config.destination(), this.firstCoincidenceLi, config.explicitWaitSeconds());
	}
	
	public void setDepartingDate() {
		Utils.setDate(this.driver, this.departingDateInput, this.departingDateButton, config.lowExplicitWaitSeconds());
	}
	
	public void setDestinationDate() {
		Utils.setDate(this.driver, this.destinationDateInput, this.destinationDateButton, config.lowExplicitWaitSeconds());
	}
	
	public void clickSearchButton() {
		new WebDriverWait(this.driver, config.lowExplicitWaitSeconds())
		.until(ExpectedConditions.elementToBeClickable(this.searchButton))
		.click();
	}
}