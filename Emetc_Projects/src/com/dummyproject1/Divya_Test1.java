
package com.dummyproject1;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Divya_Test1 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{ 
		 /*WebDriver driver;
		 System.out.println("Caps starts here");
		  DesiredCapabilities caps = new DesiredCapabilities();
		  System.out.println("Caps object created");
		  caps.setCapability("platformName", "Android");
		  System.out.println("platformName- Android");
		  caps.setCapability("deviceName","ZX1D6466VH" );
		  System.out.println("deviceName- ZX1D6466VH");
		  caps.setCapability("platformVersion", "6.0");
		  System.out.println("platformVersion- 6.0");
		  caps.setCapability("appPackage", "com.techjoomla.easysocial");
		  System.out.println("appPackage- com.techjoomla.easysocial");
		  caps.setCapability("appActivity", "com.techjoomla.easysocial.MainActivity");
		  System.out.println("appActivity- com.techjoomla.easysocial.MainActivity");
		  caps.setCapability("appWaitActivity", "com.compass.pulse.MainActivity");
		  System.out.println("appWaitActivity- com.compass.pulse.MainActivity");
		  caps.setCapability("appium-version", "1.4.16.1");
		  System.out.println("appium-version- 1.4.16.1");
		  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		  */
	WebDriver driver;
		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set android deviceName desired capability. Set it Android Emulator.
		capabilities.setCapability("deviceName", "07910e9d");
		// Set browserName desired capability. It's Android in our case here.
		capabilities.setCapability("browserName", "Android");
		// Set android platformVersion desired capability. Set your emulator's android version.
		capabilities.setCapability("platformVersion", "6.0.1");
		// Set android platformName desired capability. It's Android in our case here.
		capabilities.setCapability("platformName", "Android");
		// Set android appPackage desired capability. It is com.android.calculator2 for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability("appPackage", "com.techjoomla.easysocial");
		// Set android appActivity desired capability. It is com.android.calculator2.Calculator for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability("appActivity", "com.techjoomla.easysocial.MainActivity");
		// Created object of RemoteWebDriver will all set capabilities.
		// Set appium server address and port number in URL string
		// It will launch calculator app in emulator. 
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
     	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     	driver.findElement(By.name("DEMO SITE")).click();
		//driver.findElement(By.xpath("//div[@class='btn btn-navbar ng-binding']")).click();
		/*driver.findElement(By.name("url")).sendKeys("demo.appcarvers.com/junite");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Prem");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("abcd1234");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log In")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.quit();*/
		}

}