package com.dummyproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLinks 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
				WebDriver driver=new FirefoxDriver();
				Thread.sleep(20000);
				WebDriverWait wait=new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));
				
				Thread.sleep(5000);
				driver.get("https://www.google.com/");
				
			    List <WebElement> alllinks = driver.findElements(By.tagName("a"));
			    int linkcount= alllinks.size();
			    System.out.println("Total links on the page are : " +linkcount);

			    //String aallinks = null;
				for(int i=0;i<alllinks.size();i++)
			    	
				/*if (aallinks != "")
			    	
	             {*/
			        System.out.println(alllinks.get(i).getText());
	             
	             //}
				
			    for(int i=0;i<alllinks.size();i++)
			       {
			    String allinks = null;
				if (allinks == "")
			    	
	             {
					System.out.println(alllinks.get(i).getText());
			        alllinks.get(i).click();
			        Thread.sleep(10000);
			        driver.navigate().back();
			        Thread.sleep(10000);
			       }
				
				else if(allinks != "")
				{
					System.out.println(alllinks.get(i).getText());
			        alllinks.get(i).click();
			        Thread.sleep(10000);
			        driver.navigate().back();
			        Thread.sleep(10000);
				}
	             }
			    /*try 
			      {
			        List<WebElement> links = driver.findElements(By.tagName("a"));
			        int linkcount = links.size(); 
			         System.out.println(linkcount); 
			          for (WebElement myElement : links)
			          {
			             String link = myElement.getText(); 
			             //System.out.println(link);
			             //System.out.println(myElement);   
			           if (link !="")
			             {
			             myElement.click();
			             Thread.sleep(2000);
			             System.out.println("third");
			             }
			            //Thread.sleep(5000);
			          } 
			     }
			         
			    catch (Exception e){
			    System.out.println("error "+e);
			        }*/
			
		}

	}

// For-each syntax

/*
 List<Foo> foos = ...;
for (Foo foo : foos)
{
    foo.bar();
}

// equivalent to:
List<Foo> foos = ...;
for (Iterator<Foo> iter = foos.iterator(); iter.hasNext();)
{
    Foo foo = iter.next();
    foo.bar();
}
-------------------------------------------------------------------------------

and these are two equivalent ways to iterate over an array:

-------------------------------------------------------------------------------

int[] nums = ...;
for (int num : nums)
{
    System.out.println(num);
}

// equivalent to:
int[] nums = ...;
for (int i=0; i<nums.length; i++)
{
    int num = nums[i];
    System.out.println(num);
}
*/
