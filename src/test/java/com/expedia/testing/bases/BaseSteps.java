package com.expedia.testing.bases;

import org.openqa.selenium.WebDriver;

import com.expedia.testing.config.Configuration;

public abstract class BaseSteps<P> {
	protected WebDriver driver;
	protected P page;
	protected Configuration config;
	
	public BaseSteps(WebDriver driver, Configuration config) {
		this.driver = driver;
		this.config = config;
	}
}
