package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGridFF {

	@Test
	public void TestAppFF() throws MalformedURLException{
		
		
	DesiredCapabilities cap= DesiredCapabilities.firefox();
	
	
	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	
	driver.get("http://www.facebook.com");
	
	driver.manage().window().maximize();
	driver.quit();
	}
	
}
