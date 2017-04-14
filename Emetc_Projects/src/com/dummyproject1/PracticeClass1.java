package com.dummyproject1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeClass1 {

	        public static WebDriver driver;
	        
		    @BeforeMethod
		    public void beforeTest()
		    {
		      System.out.println("Before Test is running");
		      //for(int i=0; i<5;i++)
		      //{
		      driver=new FirefoxDriver();
		      driver.get("http://www.google.com/");
		      //}
		    }
		    
			@Test(priority=1)
			public void firstTest() throws IOException
			{
		      System.out.println("Test priority 2 is running");
		      WebElement search= driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		      search.sendKeys("Prem");
		      getscreenshot();
			}
			  
			@Test(priority =2)
			public void secondTest() throws IOException 
			{
		      System.out.println("Test priority 1 is running");
			  WebElement search= driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		      search.sendKeys("Gupta");
			  getscreenshot();
			}
		 
			@Test(alwaysRun=true)
			public static void getscreenshot() throws IOException
			{  
			  System.out.println("Test - Screenshot method is running");
			  File snapshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			  String screenshotname= "Image";
			  String filetype= ".png";
			  int randomnumber= (int) (100 + Math.random() * ((10000 - 1) + 1));
			  String Randomscreenshotname=screenshotname+randomnumber+filetype;

			  System.out.println("Randome image name");
			  System.out.println(Randomscreenshotname);
			   
			  FileUtils.copyFile(snapshot, new File("E:\\"+Randomscreenshotname));
			  System.out.println("screenshot taken");
			  System.out.println("*************************************");
			}
			
			@Test(priority=3)
			public void randomemail()
			{
			  System.out.println("randomemail is running");
			  String startstring = "premgupta";
			  String endstring = "@yopmail.com";
			  int randomnumber = (int) (100 + Math.random() * ((10000 - 1) + 1));
			  String randomemail = startstring+randomnumber+endstring;
			  System.out.println("Random Email Is --> " +randomemail);
			}
			   
		    @AfterMethod
		    public void afterTest()
		    {
		      System.out.println("After Test is running");
		      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      driver.close();
		    }
		}
