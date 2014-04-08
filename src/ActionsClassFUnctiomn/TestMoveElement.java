package ActionsClassFUnctiomn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestMoveElement {

	
	@Test
	public void TestFF() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.xpath(".//*[@id='mNav']/div[1]/ul/li[2]/a"));
         Actions act=new Actions(driver);
          act.moveToElement(link).perform();
          
          Thread.sleep(3000);
          driver.findElement(By.linkText("Jobs by Location")).click();


	}
}
