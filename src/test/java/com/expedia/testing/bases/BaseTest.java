package com.expedia.testing.bases;

import java.util.logging.Logger;

import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.openqa.selenium.WebDriver;

import com.expedia.testing.config.Configuration;
import com.google.common.annotations.VisibleForTesting;

public abstract class BaseTest {
	protected String userDir;
	protected String driverPath;
	protected WebDriver driver;
	protected Logger logger;
	@VisibleForTesting protected Configuration config;
	
	public BaseTest() {
		this.userDir = System.getProperty("user.dir");
		this.driverPath = this.userDir + "/src/test/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", this.driverPath);
		
		this.logger = Logger.getLogger("logger");
		this.config = ConfigFactory.create(Configuration.class);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		this.driver.quit();
	}
}