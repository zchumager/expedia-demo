package com.expedia.test.expedia_demo.bases;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
}
