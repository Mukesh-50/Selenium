package JavaBasics;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAttribute {

	@Test
	public void Test1(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
      /*  String str=   driver.findElement(By.cssSelector("html#facebook body.fbIndex div._li div#globalContainer.uiContextualLayerParent div#content.fb_content div div._50dz div div.pvl div._7d h1.inlineBlock")).getAttribute("style");
	    str.substring(32, 38);
        System.out.println(str.substring(32, 38));*/
		
     List<WebElement> list_element=	driver.findElements(By.tagName("a"));
     Iterator<WebElement> ele=    list_element.iterator();
     while(ele.hasNext()){
    	 System.out.println(ele.next().getAttribute("href"));
     }
     Select mon=new Select(driver.findElement(By.id("month")));
    System.out.println(mon.isMultiple());
      List<WebElement> month=mon.getOptions();
    Iterator<WebElement> i2=     month.iterator();
    while(i2.hasNext()){
    	String result=i2.next().getText();
    	if(result.equalsIgnoreCase("March"))
    			{
    		System.out.println("March is added");
    		break;
    	}
    	
    }
    driver.quit();
	}
	
	
}
