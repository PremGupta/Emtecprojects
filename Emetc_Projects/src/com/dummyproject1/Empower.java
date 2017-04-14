package com.dummyproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Empower {

	public static void main(String[] args) throws InterruptedException {
		
   WebDriver driver=new FirefoxDriver();
   
  
   Thread.sleep(3000);
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get("http://empower-qa.emtecinc.com ");
   
   try {
		Runtime.getRuntime().exec("C:/Users/prem.gupta/Desktop/EmPowerAuthentication.exe");
	} catch (Exception e) {
		e.printStackTrace();
	}
   
   
   /*String URL = "http://" + username + ":" + password + "@" + empower-qa.emtecinc.com;
   driver.get(URL);
   Alert alert = driver.switchTo().alert();
   alert.accept();*/
  
  /* driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get("http://sandeep.kodag:Hacker@9096@empower-qa.emtecinc.com");
   */
   //driver.get("http://sandeep.kodag:Hacker@9096@empower-qa.emtecinc.com");
   //driver.get("https://empower-qa.emtecinc.com/");
   
   
   /*WebDriverWait wait = new WebDriverWait(driver, 10);
   Alert alert = wait.until(ExpectedConditions.alertIsPresent());
   alert.authenticateUsing(new UserAndPassword("sandeep.kodag", "Hacker@9096"));*/

   //driver.navigate().to("http://sandeep.kodag:Hacker@9096@empower-qa.emtecinc.com");
   
/*   public static final String TEST_ENVIRONMENT = "the-site.com";
   private WebDriver driver;

   public void login(String uname, String pwd){
     String URL = "http://" + uname + ":" + pwd + "@" + TEST_ENVIRONMENT;
     driver.get(URL);
   }

   @Test
   public void testLogin(){
      driver = new FirefoxDriver();
      login("Pavel", "UltraSecretPassword");
      //Assert...
   }
   */
   
   /*driver.switchTo().alert();
 //Selenium-WebDriver Java Code for entering Username & Password as below:
 driver.findElement(By.id("userID")).sendKeys("sandeep.kodag");
 driver.findElement(By.id("password")).sendKeys("Hacker@9096");
 driver.switchTo().alert().accept();
 driver.switchTo().defaultContent();*/
   
	}
}
