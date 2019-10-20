package com.expedia.testing.bases;

import java.util.logging.Logger;

import org.junit.After;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest<S> {
	protected String userDir;
	protected String driverPath;
	protected WebDriver driver;
	protected Logger logger;
	
	protected S steps;
	
	public BaseTest() {
		this.userDir = System.getProperty("user.dir");
		this.driverPath = this.userDir + "/src/test/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", this.driverPath);
		
		this.logger = Logger.getLogger("logger");
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		this.driver.quit();
	}
}

