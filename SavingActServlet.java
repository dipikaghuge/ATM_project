package fbs.com.PackageServlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fbs.com.ClassAccount.SavingAccount;
import fbs.com.business.ConnectSavingAct;

@WebServlet("/register")
public class SavingActServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 public SavingActServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	    RequestDispatcher dispatcher = request.getRequestDispatcher("SavingAccount.jsp");
		dispatcher.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	  String actName=request.getParameter("actName");
	  System.out.println("line 32"+actName);
	  int actNo=Integer.parseInt(request.getParameter("actNo"));
	  System.out.println("line 34"+actNo);

	  int actPin=Integer.parseInt(request.getParameter("actPin"));
	  System.out.println("line 37"+actPin);

		  
	  SavingAccount savingact=new SavingAccount();
	  
	  savingact.setActName(actName);
	  savingact.setActNo(actNo);
	  savingact.setActPin(actPin);
	  
	   int flag;
	   
	try {
		flag=ConnectSavingAct.registerSavingAct (savingact);
   System.out.println("line 50 flag"+flag);
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	  
    RequestDispatcher dispatcher = request.getRequestDispatcher("SavingAccountDetails.jsp");
	dispatcher.forward(request, response);
	}

}
