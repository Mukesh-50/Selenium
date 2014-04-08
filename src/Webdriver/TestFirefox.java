package Webdriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestFirefox {

	
	
	WebDriver driver=null;
	
	@BeforeTest
	public void TestSetup()
	
	{
	        
			// Initialize the Browser
			
		
		 driver=new FirefoxDriver();
			
			// Load a URL
			driver.get("http://www.facebook.com");
			
			// Maximize window
			driver.manage().window().maximize();
	}
	
	@Test
	public void TestFB(){
		
		// Initialize the Browser
		
		
		// find Element
	   WebElement FN=driver.findElement(By.id("u_0_1"));
	
	   // perform the actions
	    FN.sendKeys("Selenium Webriver");
	    
	    
	    // find element and perform the actions
	    
	    driver.findElement(By.name("lastname")).sendKeys("Selenium RC");
	    
	    // find element with xpath and perform actions
	    
	    driver.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("deepakselenium@webdriver.com");
	    
	    // Drop Down  Create an object for this and associate a webelement
	    
	    WebElement month=driver.findElement(By.id("month"));
	    
	    Select mon=new Select(month);
	    
	    // Select a  value by using any of function like value,index,visible text
	    mon.selectByIndex(3);
	    
	    
	    // find element and perform click actions
	    
	    driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		}
	

	@AfterTest
	public void CloseBrowser(){
		driver.quit();
	}
}
