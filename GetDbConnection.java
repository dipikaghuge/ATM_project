package fbs.com.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import fbs.com.ClassAccount.Account;

public class GetDbConnection 
{
  //deposit form 
	public  Connection  getConnection() throws SQLException 
	{ 
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");  
			   System.out.println("Driver loaded...");
			     
			   //step2 create  the connection using driver manager  
			   Connection conn=DriverManager.getConnection
					   ("jdbc:oracle:thin:@localhost:1521:xe","system","system");  
			    System.out.println("Connection established"); 
			
			return conn;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	  
	}

}