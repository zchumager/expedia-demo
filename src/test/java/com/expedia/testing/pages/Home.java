package com.expedia.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.expedia.testing.bases.BasePage;

public class Home extends BasePage {
	
	private By flightsButton, flyingFromInput;
	
	public Home(WebDriver driver) {
		super(driver);
		this.flightsButton = By.id("tab-flight-tab-hp");
		this.flyingFromInput = By.id("flight-origin-hp-flight");
	}
	
	public void clickFlightsButton() {
		new WebDriverWait(this.driver, 5)
		.until(ExpectedConditions.elementToBeClickable(this.flightsButton))
		.click();
	}
	
	public void setFlyingFromInput(String departure) {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(this.flyingFromInput))
		.sendKeys(this.config.departure());
	}
}