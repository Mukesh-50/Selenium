package ActionsClassFUnctiomn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestRightClick {

	
	@Test
	public void TestRight() throws InterruptedException{
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Servers\\IEDriverServer.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
	WebElement link=driver.findElement(By.linkText("Kannada"));
	
	act.contextClick(link).perform();
	Thread.sleep(3000);
	
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
		
	}
}
