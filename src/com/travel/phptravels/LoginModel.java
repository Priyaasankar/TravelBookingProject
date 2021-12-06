package com.travel.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModel {
	
	WebDriver driver;
	public LoginModel(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void setEmail(String email) {
		driver.findElement(By.name("email")).sendKeys(email);;
	}
	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);;
	}

public void clickbutton() 
{
driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"))	.click();
}
}
