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
		this.titleDropdown = By.id("title[0]");
		this.firstNameInput = By.id("firstname[0]");
		this.middleNameInput = By.id("middlename[0]");
		this.lastNameInput = By.id("lastname[0]");
		this.countryCodeDropdown = By.name("tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].phoneCountryCode");
		this.phoneNumberInput = By.id("phone-number[0]");
		this.monthOfBirdDropdown = By.id("date_of_birth_month0");
		this.dayOfBirdDropdown = By.id("date_of_birth_day[0]");
		this.yearOfBirdDropdown = By.id("date_of_birth_year[0]");
		this.yesFlightProtectionRadio = By.xpath("//div[@class='one-plan-CTA']");
	}
	
	public void selectTitle() {
		new Select(new WebDriverWait(this.driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(this.titleDropdown))).selectByValue("1_Mr.");	
	}
	
	public void setFirstName() {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(this.firstNameInput))
		.sendKeys("Pedro");
	}
	
	public void setMiddleName() {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(this.middleNameInput))
		.sendKeys("Arnoldo");
	}
	
	
	public void setLastName() {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(this.lastNameInput))
		.sendKeys("Machado Duran");
	}
	
	public void selectCountryCode() {
		new Select(new WebDriverWait(this.driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(this.countryCodeDropdown))).selectByValue("52");
	}
	
	public void setPhoneNumber() {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(this.phoneNumberInput))
		.sendKeys("6691663733");
	}
	
	public void setBirthday() {
		new Select(new WebDriverWait(this.driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(this.monthOfBirdDropdown))).selectByValue("11");
		
		new Select(new WebDriverWait(this.driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(this.dayOfBirdDropdown))).selectByValue("06");
		
		new Select(new WebDriverWait(this.driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(this.yearOfBirdDropdown))).selectByValue("1987");
	}
	
	public void chooseFlightProtection() {
		new WebDriverWait(this.driver, 10)
		.until(ExpectedConditions.elementToBeClickable(this.yesFlightProtectionRadio))
		.click();
	}

}
