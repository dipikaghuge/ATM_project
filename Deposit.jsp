<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="center"> 
<table align="center"> 
<form action="DepositServlet" method="post">
    <div align="center">
<h2>Deposit Amount</h2>
           <lable><b>Account Number:</lable>
            <input type="number" placeholder="enter here.." name="actNo">
            <br> 
            <br>
         
            <lable><b>Enter Amount:</lable>
            <input type="number" placeholder="enter here.." name="amount">
            <br> 
            <br>
            <input type ="submit" >
    </div>
    </form>
</body>
</html>