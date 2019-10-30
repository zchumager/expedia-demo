package com.expedia.testing.config;

import org.aeonbits.owner.Config;

public interface Configuration extends Config{
	int implicitWaitSeconds();
	int explicitWaitSeconds();
	
	String homeUrl();
	
	String flightsButton();
	String flyingFromInput();
	String departure();
	String firstCoincidenceLi();
	
	String flyingToInput();
	String destination();
	
	String departingDateInput();
	String departingDateButton();
	String destinationDateInput();
	String destinationDateButton();
	
	String searchButton();
	
	String sortDropdown();
	String flightsLiList();
	String firstFlightButton();
	String noThanksButton();
	
	String continueBookingBtn();
	String titleDropdown();
	String firstNameInput();
	String middleNameInput();
	String lastNameInput();
	String countryCodeDropdown();
	String phoneNumberInput();
	String monthOfBirdDropdown();
	String dayOfBirdDropdown();
	String yearOfBirdDropdown();
	String yesFlightProtectionRadio();
}
