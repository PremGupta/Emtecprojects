package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "E:\\Mee\\Sele Notes\\Driver\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.com/");
	}

}
