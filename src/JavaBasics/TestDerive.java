package JavaBasics;

// This programs show inheritence


// This is Base Class
 class TestBase{
	
	
	public void TestAdditionBase(){
		
	System.out.println("i m in base class");
	}
	
}

// This is Derice class which inherited all the properties of base class
public class TestDerive extends TestBase{

	
	public static void main(String []args){
		// Scenario 1	
		TestDerive t1=new TestDerive();
		t1.TestAddition();
		t1.TestAddition(78, 89);
		t1.TestAdditionBase();
		
		// Scenario 2
		
		TestBase t2=new TestBase();
		t2.TestAdditionBase();
		
		// Scenario 3 invalid
		
		//TestDerive d3=new TestBase();
		
		TestBase t3=new TestDerive();
		t3.TestAdditionBase();
	}
	
	public void TestAddition(){
		
	System.out.println("i m in Derive class");
	}
	
	public void TestAddition(int a,int b){
		
		System.out.println("i m in Drive class with parameter");
		}
}
