package ActionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	
	public static String SelectByidandIndex(WebDriver driver,String localid,int localindex){
		
		try {
			Select sel=new Select(driver.findElement(By.id(localid)));
			sel.selectByIndex(localindex);
			
			
			return "pass";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "Failed"+e.getMessage();
		}
	}
}
