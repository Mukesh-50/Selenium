package Core;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCoreClass {

	
	
	@Test
	public void TestModuler() throws BiffException, IOException{
		
		
    File f=new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\AkbarProject\\TestRekha\\TestData\\TestApplication.xls");
		
    Workbook wb=Workbook.getWorkbook(f);
    
    for(int i=0;i<wb.getSheet(0).getRows();i++){
    String uname= wb.getSheet(0).getCell(0, i).getContents();
    String last= wb.getSheet(0).getCell(1, i).getContents();
    String email= wb.getSheet(0).getCell(2, i).getContents();
    String reemail= wb.getSheet(0).getCell(3, i).getContents();
    String pas= wb.getSheet(0).getCell(4,i).getContents();
    
	WebDriver driver=new FirefoxDriver();
	ActionKeywords.OpenApp.BrowserOpen(driver, "http://www.facebook.com");
	ActionKeywords.TextBox.TypeByID(driver, "u_0_1", uname);
	ActionKeywords.TextBox.TypeByID(driver, "u_0_3",last);
	ActionKeywords.TextBox.TypeByxpath(driver, ".//*[@id='u_0_5']",email);
	ActionKeywords.TextBox.TypeByID(driver, "u_0_8",reemail);
	ActionKeywords.TextBox.TypeByID(driver, "u_0_a",pas);
	ActionKeywords.Submit.ClickById(driver, "u_0_i");
	ActionKeywords.DropDown.SelectByidandIndex(driver, "month", 2);
	driver.quit();
    }
	}
}
