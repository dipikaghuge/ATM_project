<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
         body{
           background-repeat:no-repeat;
           background-size: 100% ,100%;
           background-color:lightblue;
         
           /*background:linear-gradient(120deg,#2980b9,#8e44ad);*/
           }
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

</head>
<body>
<%
int actNo=Integer.parseInt(request.getParameter("actNo"));
out.print("Welcome "+actNo); 
 session = request.getSession();
session.getAttribute("actNo");
 %>
       <div class="center"> 
       <h2>Welcome To Bank</h2>
       <form >
        <div class="txt_filed">
                   <button> <a href='Deposit.jsp'>Deposit Amount</a></button>
                    <br>
                    <br>
                    <button><a href='Withdraw.jsp'>Withdraw Amount</a></button>
                    <br>
                    <br>
                    <button><a href='CheckBalance.jsp'>CheckBalance Amount</a></button>
                    
        </div>
 </form>
         </div>

</body>
</html>