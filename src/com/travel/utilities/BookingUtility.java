package com.travel.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingUtility {

	public static WebDriver Calldriver(String browsertype) 
	{
	if(browsertype.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./src/chromedriver");
		return new ChromeDriver();
	}
	else
	{
		return new ChromeDriver();
	}
	}
}
