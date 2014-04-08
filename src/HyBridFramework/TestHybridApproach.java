package HyBridFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class TestHybridApproach {

	
	@Test
	public void TestRead() throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		
     File f=new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\AkbarProject\\TestRekha\\Hybrid test data\\TC_Selenium.xls");
		
		Workbook wb=Workbook.getWorkbook(f);
		
	WritableWorkbook wwb=Workbook.createWorkbook(new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\AkbarProject\\TestRekha\\Excel Reports\\result.xls"));
    WritableSheet wsh1=	wwb.createSheet("TC1", 0);	
		for(int i=1;i<wb.getSheet(0).getRows();i++){
	String Object_type=wb.getSheet(0).getCell(0, i).getContents();
	String Locator_type=wb.getSheet(0).getCell(1, i).getContents();
	String Locator_Value=wb.getSheet(0).getCell(2, i).getContents();
	String Actions=wb.getSheet(0).getCell(3, i).getContents();
	String Test_Data=wb.getSheet(0).getCell(4, i).getContents();
	String Discription=wb.getSheet(0).getCell(5, i).getContents();
	
	
	if(Object_type.equalsIgnoreCase("URL")){
		
		ActionKeywords.OpenApp.BrowserOpen(driver, Test_Data);
		
	}
	
	if(Object_type.equalsIgnoreCase("TextBox")){
			if(Locator_type.equalsIgnoreCase("id")){
			
	String result=ActionKeywords.TextBox.TypeByID(driver, Locator_Value, Test_Data);
	
	if(result.equalsIgnoreCase("pass")){
		wsh1.addCell(new Label(0, i, Discription));
		wsh1.addCell(new Label(1, i, result));
	}
	else{
		wsh1.addCell(new Label(0, i, Discription));
		wsh1.addCell(new Label(1, i, result));
	}
		}
			if(Locator_type.equalsIgnoreCase("xpath")){
			
			String result=ActionKeywords.TextBox.TypeByxpath(driver, Locator_Value, Test_Data);
			if(result.equalsIgnoreCase("pass")){
				wsh1.addCell(new Label(0, i, Discription));
				wsh1.addCell(new Label(1, i,result));
			}
			else{
				wsh1.addCell(new Label(0, i, Discription));
				wsh1.addCell(new Label(1, i,result));
			}
		}
			if(Locator_type.equalsIgnoreCase("name")){
	
	ActionKeywords.TextBox.TypeByName(driver, Locator_Value, Test_Data);
}
		
	}
	
	
	if(Object_type.equalsIgnoreCase("Submit")){
		if(Locator_type.equalsIgnoreCase("id")){
			
	    String result		=ActionKeywords.Submit.ClickById(driver, Locator_Value);
	    
	    if(result.equalsIgnoreCase("Pass")){
	    	wsh1.addCell(new Label(0, i, Discription));
	    	wsh1.addCell(new Label(1, i, result));
	    }
	    else{
	    	wsh1.addCell(new Label(0, i, Discription));
	    	wsh1.addCell(new Label(1, i, result));
	    }
		}
	}
		}
		
		wwb.write();
		wwb.close();
		
		
	}
}
