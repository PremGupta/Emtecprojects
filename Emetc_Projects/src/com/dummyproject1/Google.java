package com.dummyproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	
	public static void main (String args[])
	{
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.className("gsfi"));
		
		
	}

}
