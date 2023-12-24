<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saving Account Form</title>
<style>    
         .center{
          position:absolute;
          top:25%;
          left:50%;
          transform:translate(-50%,-50%);
          width:400px;
          background:white;
          border-radius:20px;
          border:1px solid ;
          }
</style>
</head>
<body>

<div class="center"> 
<table align="center"> 
<form action="register" method="post">
<!--<%= request.getContextPath() %>  -->
    <div align="center">
     <h2 >Saving Account Form </h2>
     </div>
      <tr>
      <td>Enter Name</td>
      <td><input type="text" name="actName"></td>
      </tr>
      
     <tr>
      <td>Account No</td>
      <td><input type="number" name="actNo"></td>
      </tr>
      
      
      <tr>
      <td>Create 4 Digit PIN</td>
      <td><input type="password" name="actPin"></td>
      </tr>
      
      
      <tr>
      <td>
      <center><input type="submit" ></center>
      </td>
      </tr>
      
</form>
</table>
</div>  
</body>
</html>