package fbs.com.PackageServlet;

import fbs.com.ClassAccount.CurrentAccount;
import fbs.com.business.ConnectCurrentAct;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register1")
public class CurrentActServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 public CurrentActServlet() {
        super();
    }
	protected void doGet(HttpRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(((HttpServletRequest) request).getContextPath());
	
	    RequestDispatcher dispatcher = ((ServletRequest) request).getRequestDispatcher("CurrentAccount.jsp");
		dispatcher.forward((ServletRequest) request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		  String actName=request.getParameter("actName");
		  int actNo=Integer.parseInt(request.getParameter("actNo"));
		  int actPin=Integer.parseInt(request.getParameter("actPin"));
		  int balance=Integer.parseInt(request.getParameter("balance"));
		
	      System.out.println("1"+actName);
	  
	  CurrentAccount currentact=new CurrentAccount();
	  
	  currentact.setActName(actName);
	  currentact.setActNo(actNo);
	  currentact.setActPin(actPin);
	  currentact.setBalance(balance);

	try {
		  ConnectCurrentAct.registerCurrentAct (currentact);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	  
    RequestDispatcher dispatcher = request.getRequestDispatcher("CurrentAccountDetails.jsp");
	dispatcher.forward(request, response);
	}

}
