package com.expedia.testing.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public static void setInput(WebDriver driver, By input, String text, By listItem, int seconds) {
		new WebDriverWait(driver, seconds)
		.until(ExpectedConditions.visibilityOfElementLocated(input))
		.sendKeys(text);
		
		new WebDriverWait(driver, seconds)
		.until(ExpectedConditions.visibilityOfElementLocated(listItem))
		.click();
	}
	
	public static void setDate(WebDriver driver, By input, By button, int seconds) {
		new WebDriverWait(driver, seconds)
		.until(ExpectedConditions.elementToBeClickable(input))
		.click();
		
		new WebDriverWait(driver, seconds)
		.until(ExpectedConditions.elementToBeClickable(button))
		.click();
	}
}