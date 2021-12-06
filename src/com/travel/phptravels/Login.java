package com.travel.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	{
		 String email;
		 String password;
		 String login;
		String browsertype="chrome";
		String url="https://www.phptravels.net/";	
		WebDriver driver=com.travel.utilities.BookingUtility.Calldriver(browsertype);
		driver.get(url);
		driver.findElement(By.cssSelector("a[class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")).click();
        LoginModel lm=new LoginModel(driver);
        lm.setEmail("user@phptravels.com");
        lm.setPassword("demouser");
        lm.clickbutton("button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");
        lm.logout();
       // lm.logout("a[href='https://www.phptravels.net/account/logout'][class='dropdown-item waves-effect']");
        driver.close();  
        
}

}
