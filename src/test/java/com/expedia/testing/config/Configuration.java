package com.expedia.testing.config;

import org.aeonbits.owner.Config;

public interface Configuration extends Config{
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
}
