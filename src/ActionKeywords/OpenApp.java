package ActionKeywords;

import org.openqa.selenium.WebDriver;

public class OpenApp {

	
	public static void BrowserOpen(WebDriver driver,String URL){
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
}
