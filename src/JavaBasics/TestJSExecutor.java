package JavaBasics;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJSExecutor {

	@Test
	public void TestJ(){
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
JavascriptExecutor js=(JavascriptExecutor)driver;
String title =(String)js.executeScript("return document.title");

System.out.println(title);

		
	}
}
