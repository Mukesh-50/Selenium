package JavaBasics;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Hi Welcome in Java World");
		
		Test1 obj1=new Test1();
		obj1.TestAddition();
	int localresult	=obj1.TestAddition(78, 67, 54);
	System.out.println(localresult);

		
		
	}
	
	
	public void TestAddition(){
		
		int result=89+89+89;
		System.out.println("Your Result is " +result);
	}
	
	
public int TestAddition(int first,int second,int third){
		
		int result=first+second+third;
		System.out.println("Your Result is " +result);
		return result;
	}

}
