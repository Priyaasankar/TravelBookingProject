package com.travel.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	{
		String browsertype="chrome";
		String url="https://www.phptravels.net/";
		String email="user@phptravels.com";
		String password="demouser";
		
		WebDriver driver=com.travel.utilities.BookingUtility.Calldriver(browsertype);
		driver.get(url);
		driver.findElement(By.cssSelector("a[class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")).click();

}

}
