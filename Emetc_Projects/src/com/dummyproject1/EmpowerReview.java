package com.dummyproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmpowerReview 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new FirefoxDriver();
         
		 Thread.sleep(3000);
	     driver.get("http://empower-qa.emtecinc.com ");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	     try 
	     {
			Process usercred=Runtime.getRuntime().exec("C:/Users/prem.gupta/Desktop/EmPowerAuthentication.exe");
			System.out.println(usercred);
		 } 
	     catch (Exception e) 
		 {
			e.printStackTrace();
		 }
	   
	}
}