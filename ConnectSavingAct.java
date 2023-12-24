package fbs.com.business;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import fbs.com.ClassAccount.CurrentAccount;
import fbs.com.ClassAccount.SavingAccount;
	import java.sql.Connection;

public class ConnectSavingAct 
{
  public static int registerSavingAct(SavingAccount savingact) throws ClassNotFoundException 
 {
	   try
	   {  
	   //step1 load the driver class  
	   Class.forName("oracle.jdbc.driver.OracleDriver");  
	   System.out.println("Driver loaded...");
	     
	   //step2 create  the connection using driver manager  
	   Connection conn=DriverManager.getConnection
			   ("jdbc:oracle:thin:@localhost:1521:xe","system","system");  
	    System.out.println("Connection established"); 
	    
	    System.out.println("line 25"+savingact.getActName());

	   //step3 create the statement 
	  String query="insert into AccountProjectTable(actName,actNo,actPin)values(?,?,?)";
      PreparedStatement pstmt= conn.prepareStatement(query);
		       System.out.println("query output"+query);
			        
			        pstmt.setString(1,savingact.getActName());
					pstmt.setInt(2,savingact.getActNo());
					pstmt.setInt(3,savingact.getActPin());
                    
	              int result = pstmt.executeUpdate();
	              return result;
				} catch (SQLException e){
					e.printStackTrace();
				  }
					return 0;
	   
 }
}



