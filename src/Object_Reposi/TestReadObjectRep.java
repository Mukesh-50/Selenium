package Object_Reposi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestReadObjectRep {

	
	
	@Test
	public void TestRead() throws Exception{
		
		
		File srclocation=new File("C:\\Users\\Mukesh_Otwani\\Desktop\\Mukesh@DeLL\\Selenium Traning\\AkbarProject\\TestRekha\\Object Repository\\Obj_Rep.properties");
		
		
		Properties pro=new Properties();
		
		FileInputStream fs=new FileInputStream(srclocation);
		
		pro.load(fs);
		
		System.out.println("Value is  "+ pro.getProperty("Application.Page.locator.id"));
	}
}
