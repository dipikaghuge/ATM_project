<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
         body{
           background:skyblue;
           }
         .center{
          position:absolute;
          top:50%;
          left:50%;
          transform:translate(-50%,-50%);
          width:400px;
          background:white;
          border-radius:20px;
          }
          .center h2{
          text-align:center;
          padding:0 0 20px 0;
          border-bottom:1px soid silver;}
         .center form{
          padding:0 100px;
          box-sizing:border-box;}      
        form .txt_filed{
         margin:30px 0;
         padding:1 40px; }  
          
          </style>

</head>
<body>
<table align="center"> 
<form action="WithdrawServlet" method="post">
 <div class="center">     
<h2>Withdraw Amount</h2>
       <form >
        <div class="txt_filed">

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
    </div>
    </form>
    </table>
</body>
</html>