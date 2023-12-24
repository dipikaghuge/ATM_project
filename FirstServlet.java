package fbs.com.PackageServlet;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fbs.com.business.LoginDao;  
 
@WebServlet("/Loginweb")

public class FirstServlet extends HttpServlet {  
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
	HttpSession session = request.getSession();

    //response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
	String  actNo =request.getParameter("actNo");
	String  actPin=request.getParameter("actPin");
	
	System.out.println("1"+actNo);
	System.out.println("2"+actPin);
	
    if(LoginDao.validate(actNo,actPin)){ 
    	session.setAttribute("actNo", actNo);
        RequestDispatcher rd=request.getRequestDispatcher("loginPage.jsp");  
        rd.forward(request,response);  
    }  
    else{  
    	String errorMessage = "Account Number and Pin invalid..!!!";
    	out.println(errorMessage);
        RequestDispatcher rd=request.getRequestDispatcher("Login1.html");  
    	rd.forward(request, response);
     
    }  
          
  //  out.close();  
    }  
}  


