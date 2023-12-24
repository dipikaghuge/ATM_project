package fbs.com.business;
import java.sql.*;  

public class LoginDao {
public static boolean validate(String actNo, String actPin) 
{
				boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from AccountProjectTable where actNo=? and actPin=?");  
		ps.setString(1,actNo);  
		ps.setString(2,actPin);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  

		
	}


