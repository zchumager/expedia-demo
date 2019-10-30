package com.expedia.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.expedia.testing.bases.BasePage;
import com.expedia.testing.config.Configuration;

public class FlightCheckout extends BasePage {
	
	private By 
		titleDropdown
		,firstNameInput
		, middleNameInput
		, lastNameInput
		, phoneNumberInput
		, countryCodeDropdown
		, monthOfBirdDropdown
		, dayOfBirdDropdown
		, yearOfBirdDropdown
		, yesFlightProtectionRadio;

	public FlightCheckout(WebDriver driver, Configuration config) {
		super(driver, config);
		this.titleDropdown = By.id(config.titleDropdown());
		this.firstNameInput = By.id(config.firstNameInput());
		this.middleNameInput = By.id(config.middleNameInput());
		this.lastNameInput = By.id(config.lastNameInput());
		this.countryCodeDropdown = By.name(config.countryCodeDropdown());
		this.phoneNumberInput = By.id(config.phoneNumberInput());
		this.monthOfBirdDropdown = By.id(config.monthOfBirdDropdown());
		this.dayOfBirdDropdown = By.id(config.dayOfBirdDropdown());
		this.yearOfBirdDropdown = By.id(config.yearOfBirdDropdown());
		this.yesFlightProtectionRadio = By.xpath(config.yesFlightProtectionRadio());
	}
	
	public void selectTitle() {
		new Select(new WebDriverWait(this.driver, config.explicitWaitSeconds())
				.until(ExpectedConditions.visibilityOfElementLocated(this.titleDropdown)))
				.selectByValue(config.title());	
	}
	
	public void setFirstName() {
		new WebDriverWait(this.driver, config.explicitWaitSeconds())
		.until(ExpectedConditions.visibilityOfElementLocated(this.firstNameInput))
		.sendKeys(config.firstname());
	}
	
	public void setMiddleName() {
		new WebDriverWait(this.driver, config.explicitWaitSeconds())
		.until(ExpectedConditions.visibilityOfElementLocated(this.middleNameInput))
		.sendKeys(config.middlename());
	}
	
	
	public void setLastName() {
		new WebDriverWait(this.driver, config.explicitWaitSeconds())
		.until(ExpectedConditions.visibilityOfElementLocated(this.lastNameInput))
		.sendKeys(config.lastname());
	}
	
	public void selectCountryCode() {
		new Select(new WebDriverWait(this.driver, config.explicitWaitSeconds())
				.until(ExpectedConditions.visibilityOfElementLocated(this.countryCodeDropdown)))
				.selectByValue(config.countryCode());
	}
	
	public void setPhoneNumber() {
		new WebDriverWait(this.driver, config.explicitWaitSeconds())
		.until(ExpectedConditions.visibilityOfElementLocated(this.phoneNumberInput))
		.sendKeys(config.phoneNumber());
	}
	
	public void setBirthday() {
		new Select(new WebDriverWait(this.driver, config.explicitWaitSeconds())
				.until(ExpectedConditions.visibilityOfElementLocated(this.monthOfBirdDropdown)))
				.selectByValue(config.month());
		
		new Select(new WebDriverWait(this.driver, config.explicitWaitSeconds())
				.until(ExpectedConditions.visibilityOfElementLocated(this.dayOfBirdDropdown)))
				.selectByValue(config.day());
		
		new Select(new WebDriverWait(this.driver, config.explicitWaitSeconds())
				.until(ExpectedConditions.visibilityOfElementLocated(this.yearOfBirdDropdown)))
				.selectByValue(config.year());
	}
	
	public void chooseFlightProtection() {
		new WebDriverWait(this.driver, config.explicitWaitSeconds())
		.until(ExpectedConditions.elementToBeClickable(this.yesFlightProtectionRadio))
		.click();
	}

}
