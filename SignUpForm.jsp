<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
  <style>
         body{
          background:lightBlue;}
         .center{
          position:absolute;
          top:50%;
          left:50%;
          transform:translate(-50%,-50%);
          width:400px;
          background:white;
          border-radius:20px;}
         .center h2{
          text-align:center;
          padding:0 0 20px 0;
          border-bottom:1px soid silver;}
         .center form{
          padding:0 100px;
          box-sizing:border-box;}      
        form .txt_filed{
         margin:30px 0;
         padding:0 40px; }  
</style>
<meta charset="UTF-8">
<title>SignUp form</title>
</head>
<body>
       <div class="center">  
       <h2>Account Options</h2>
 <form>
        <div class="txt_filed">
                   <button> <a href='SavingAccount.jsp'>Saving Account</a></button>
                    <br>
                    <br>
                    <button><a href='CurrentAccount.jsp'>Current Account</a></button>
        </div>
 </form>
         </div>
</body>
</html>