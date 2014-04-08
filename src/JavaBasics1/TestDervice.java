package JavaBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import JavaBasics.TestDerive;


interface TestInterface{
	
	
	public void TestAdd();
	
}


public class TestDervice implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDervice t1=new TestDervice();
		t1.TestAdd();
		t1.TestSub();
		
		TestInterface i1=new TestDervice();
		i1.TestAdd();
		
//		WebDriver driver=new AndroidDriver();
		
		

	}

	
	public void TestAdd() {
		System.out.println("i m in Test Add");
		
	}
	
	public void TestSub(){
		System.out.println("I m in Test Sub");
	}

}
