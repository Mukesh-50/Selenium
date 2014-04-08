package JavaBasics;


// This Program shows Constructor overloading

public class TestOverload {

	public static void main(String[] args) {
		
		
		TestOverload tb=new TestOverload();
		TestOverload tb1=new TestOverload("Selenium Webdriver");
		TestOverload tb2=new TestOverload(67, 809);
		
		
	
	}
	
	
   // Default constructor	
	public TestOverload(){
		System.out.println("I m in Constructor");
	}

	
	// Parameterized Constructor
		public TestOverload(int a,int b){
		int result=a+b;
		System.out.println("I m in Constructor"+ result);
	}
	
	
	public TestOverload(String str){
		System.out.println("I m in Constructor" + str);
	}
}
