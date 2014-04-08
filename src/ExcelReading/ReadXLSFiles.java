package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.FireEvent;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXLSFiles {

	
	@Test
	public void TestExcel() throws Exception{
		
		
		File f=new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\AkbarProject\\TestRekha\\TestData\\TestApplication.xls");
		
		Workbook wb=Workbook.getWorkbook(f);
		
	String data1=wb.getSheet(0).getCell(0, 0).getContents();
	String data2=wb.getSheet(0).getCell(1, 0).getContents();
	System.out.println("Your Test Data  is  "+data1+"   "+data2);
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
String linktext=	driver.findElement(By.xpath(".//*[@id='front-container']/div[2]/div[2]/form/div[2]/a")).getAttribute("href");
	}
}
