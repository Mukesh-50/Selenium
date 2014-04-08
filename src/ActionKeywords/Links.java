package ActionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Links {

	
	
	public static String ClickById(WebDriver driver,String localid){
	
		
		try {
			driver.findElement(By.id(localid)).click();
			
			return "Pass";
		} catch (Exception e) {
			System.out.println("Element not found");
			e.printStackTrace();
			return "failed"+e.getMessage();
		}
	}
}
