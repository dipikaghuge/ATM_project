<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.sql.Connection"
import ="java.sql.PreparedStatement"
import ="java.sql.ResultSet" import="fbs.com.business.GetDbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  
int actNo=Integer.parseInt(request.getParameter("actNo"));
out.print("Welcome "+actNo); 
 session = request.getSession();
session.getAttribute("actNo");
               //int accountNo=(int)session.getAttribute("accno");
	    		GetDbConnection conn=new GetDbConnection();
				Connection cn =conn.getConnection();
				String query="select balance from AccountProjectTable where actNo=?";
				PreparedStatement stmt=cn.prepareStatement(query);
				stmt.setInt(1, actNo);
				ResultSet set=stmt.executeQuery();
				set.next();
				
				out.println("Account Balance:"+set.getInt(1));
				System.out.println("Account balance:"+request.getAttribute("actNo"));
%>
<!-- <table align="center"> 
<form action="CheckBalanceServlet" method="post">
    <div align="center">
<h2> Account Balance </h2>
           <lable><b>Account Number:</lable>
            <input type="number" placeholder="enter here.." name="actNo">
            <br> 
            <br>
         
            <lable><b>Enter Account Pin :</lable>
            <input type="number" placeholder="enter here.." name="actPin">
            <br> 
            <br>
            <input type ="submit" >
    </div>
    </form>
    </table>

 -->
</body>
</html>