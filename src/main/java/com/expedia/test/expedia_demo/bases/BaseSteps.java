package com.expedia.test.expedia_demo.bases;

import org.openqa.selenium.WebDriver;

public abstract class BaseSteps<P> {
	protected WebDriver driver;
	protected P page;
	
	public BaseSteps(WebDriver driver) {
		this.driver = driver;
	}
}
