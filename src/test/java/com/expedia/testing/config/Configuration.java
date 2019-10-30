package com.expedia.testing.config;

import org.aeonbits.owner.Config;

public interface Configuration extends Config{
	int implicitWaitSeconds();
	int explicitWaitSeconds();
	int lowExplicitWaitSeconds();
	
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
	
	String departureEarliest();
	
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
	
	String title();
	String firstname();
	String middlename();
	String lastname();
	String countryCode();
	String phoneNumber();
	String month();
	String day();
	String year();
}
