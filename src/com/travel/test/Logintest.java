package com.travel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.travel.phptravels.LoginModel;

public class Logintest {
	WebDriver driver;
@Test
public void test()
{
	driver.findElement(By.cssSelector("a[class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")).click();
    LoginModel lm=new LoginModel(driver);
    lm.setEmail("user@phptravels.com");
    lm.setPassword("demouser");
    lm.clickbutton("button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");
    lm.logout();
}
@BeforeTest
public void start()
{
	String browsertype="chrome";
	String url="https://www.phptravels.net/";	
    driver=com.travel.utilities.BookingUtility.Calldriver(browsertype);
	driver.get(url);
}
@AfterTest
		
public void trim()
{
	driver.close();
}
	}

