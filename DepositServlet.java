package fbs.com.PackageServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fbs.com.business.GetDbConnection;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DepositServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		GetDbConnection conn=new GetDbConnection();
		PrintWriter out = response.getWriter();
		int actNo = Integer.parseInt(request.getParameter("actNo"));
		int balance =Integer.parseInt(request.getParameter("amount"));
		try {
			Connection cn =conn.getConnection();
			PreparedStatement ps =cn.prepareStatement("SELECT actNo FROM AccountProjectTable WHERE actNo = ?");
			ps.setInt(1, actNo);
			ps.execute();
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				//if(rs.getString("actNo").equals(actNo))
				//{
					PreparedStatement pst = cn.prepareStatement("UPDATE AccountProjectTable SET balance = balance + ? WHERE actNo = ?");
					pst.setInt(1, balance);
					pst.setInt(2, actNo);
					pst.executeUpdate();
					System.out.println("Record updated");
				//}
				RequestDispatcher rd = request.getRequestDispatcher("DepositDetails.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("Deposit.jsp");
				rd.forward(request, response);
			}
			
	   }catch(Exception e)
		{
		   e.printStackTrace();
		}
   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
	}
}
