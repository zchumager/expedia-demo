package com.expedia.testing.bases;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

import com.expedia.testing.config.Configuration;
import com.google.common.annotations.VisibleForTesting;

public abstract class BasePage {
	protected WebDriver driver;
	
	@VisibleForTesting
	protected Configuration config;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.config = ConfigFactory.create(Configuration.class);
	}
}
