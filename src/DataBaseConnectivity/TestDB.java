package DataBaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class TestDB {
	
	@Test
public void TestCon(){
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	try {
Connection con=		DriverManager.getConnection("jdbc:odbc:Test_Oracle", "system", "selenium");

System.out.println("Connection CReated");

 Statement smt= con.createStatement();
 
 System.out.println("Statment CReated");
 
ResultSet rs= smt.executeQuery("select * from facebook");

System.out.println("Query Executed");

while(rs.next()){
	
	
	
System.out.println(rs.getString("firstname"));
System.out.println(rs.getString("lastname"));
System.out.println(rs.getString("password"));
}
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
}
}
