package com.expedia.test.expedia_demo.bases;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest<S> {
	protected String userDir;
	protected String driverPath;
	protected WebDriver driver;
	protected Logger logger;
	
	protected S steps;
	
	public BaseTest() {
		this.userDir = System.getProperty("user.dir");
		this.driverPath = this.userDir + "/src/test/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", this.driverPath);
		
		this.logger = Logger.getLogger("logger");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		this.driver.quit();
	}
}

