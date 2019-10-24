package com.expedia.testing.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	public static List<WebElement> getLiElements(WebDriver driver, By children, int seconds) {
		return new WebDriverWait(driver, seconds)
		.until(ExpectedConditions.presenceOfAllElementsLocatedBy(children));
	}
	
	public static String getFirstLiHour(List<WebElement> list) {
		return list.get(0).getText();
	}
	
	public static String getLastLiHour(List<WebElement> list) {
		return list.get(list.size()-1).getText();
	}
	
	@SuppressWarnings("serial")
	public static Map<String, String> getTimeMap(String text) {
		String[] lines = text.split("\n");
		String departureTime = lines[0].trim();
		String arrivalTime = lines[1].split(" ")[1].trim();
		
		return new HashMap<String, String>() {
		{put("departureTime", departureTime); put("arrivalTime", arrivalTime);}};
	}
	
	
	public static int convertAmPm(String time) {
		int hour = Integer.parseInt(time.replaceAll("[^0-9]", ""));
		String timeSuffix = time.replaceAll("[^A-Za-z]", "");
		
		if(timeSuffix.equals("pm")) {
			hour+=1200;
		}
		
	    return hour;
	}
}