package ActionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {

	
	
	
	public static String TypeByID(WebDriver driver,String localid,String localdata){
		try {
			driver.findElement(By.id(localid)).sendKeys(localdata);
			return "Pass";
		} catch (Exception e) {
		   System.out.println("Element not found");
		   return "Failed"+e.getMessage();
			
		}
	}
	
	public static void TypeByName(WebDriver driver,String localname,String localdata){
		try {
			driver.findElement(By.name(localname)).sendKeys(localdata);
		} catch (Exception e) {
		   System.out.println("Element not found");
			e.printStackTrace();
		}
	}
	
	public static String TypeByxpath(WebDriver driver,String localxpath,String localdata){
		try {
			driver.findElement(By.xpath(localxpath)).sendKeys(localdata);
			return "pass";
		} catch (Exception e) {
		   System.out.println("Element not found");
			e.printStackTrace();
			return "failed"+e.getMessage();
		}
	}
}
