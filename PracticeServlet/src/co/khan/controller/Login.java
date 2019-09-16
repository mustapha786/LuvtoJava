package co.khan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.khan.user;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("<< service executed");
		user user1 = new user();
		user1.name = request.getParameter("TxtName");
		user1.email = request.getParameter("Email");
		user1.password = request.getParameter("Password");
		JDBCHelper JDBCHelper1 = new JDBCHelper();
		JDBCHelper1.createConnection();
		System.out.println("user name and password :" + user1.name + user1.password);
		boolean GrantAccess = JDBCHelper1.Login(user1.name,user1.password);
		if (GrantAccess == true )
		{
			System.out.println("Login Successful for user :" + user1.name );
		} else
		{
			System.out.println("Login NOt Successful for user :" + user1.name );
		} 
		
		
		JDBCHelper1.closeConnection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String res = "";
		if ( GrantAccess == true)
		{
			res = user1.name+" <<< Successfully Logged in";
		}
		else
			res = user1.name+" >>>> Login Failed";
		String htmlresponse = "<html><body><center>"+res+"</center></body></html>";
		out.print(htmlresponse);
		
	}

}
