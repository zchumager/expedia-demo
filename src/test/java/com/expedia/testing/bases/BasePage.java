package com.expedia.testing.bases;

import org.openqa.selenium.WebDriver;
import com.expedia.testing.config.Configuration;

public abstract class BasePage {
	protected WebDriver driver;
	protected Configuration config;
	
	public BasePage(WebDriver driver, Configuration config) {
		this.driver = driver;
		this.config = config;
	}
}
