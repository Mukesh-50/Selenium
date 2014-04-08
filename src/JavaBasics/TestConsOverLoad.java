package JavaBasics;

// This program shows function overloading
public class TestConsOverLoad {

	public static void main(String[] args) {
		
		
		TestConsOverLoad tb=new TestConsOverLoad();
		tb.TestAddition();
		tb.TestAddition(67.8);
		tb.TestAddition(78);
		tb.TestAddition(78);
		tb.TestAddition(78);
		tb.TestAddition(78);
		tb.TestAddition(78);
		tb.TestAddition(78);
		tb.TestAddition(78);
		tb.TestAddition(56.6, 78);
	
	}
	
	public void TestAddition(){
		
	}
	
    public void TestAddition(int a){
		
	}
    
    public void TestAddition(int a,int b){
		
   	}
    
    public void TestAddition(double a){
		
   	}
    
    public void TestAddition(int a,float b){
    	
    }
    
    public void TestAddition(double a,int b){
    	
    }

}
