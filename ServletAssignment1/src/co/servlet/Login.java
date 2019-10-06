package co.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import C:Users.gkhan4.git.repository.PracticeServlet.src.co.khan;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.khan.JDBCHelper;
import co.khan.user;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method started");
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
		Cookie ck1 = new Cookie ("KeyUname",user1.name); 
		Cookie ck2 = new Cookie ("KeyPass",user1.password); 
		ck1.setMaxAge(1000);
		ck2.setMaxAge(1000);
		response.addCookie(ck1);
		response.addCookie(ck2);  
		if (GrantAccess == true )
		{
			System.out.println("Login Successful for user :" + user1.name );
			RequestDispatcher dispatcher = request.getRequestDispatcher("Testing");
		    dispatcher.include(request, response); 
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
			res = user1.name+" <<< Successfully Logged in with password  " + user1.password ;
			String htmlresponse = "<html><body><center>"+res+"</center></body></html>";
				out.print(htmlresponse);
		//	RequestDispatcher dispatcher = request.getRequestDispatcher("WelcomePage");
		//	dispatcher.forward(request, response); 	
			 
		}
		else
			{res = user1.name+" >>>> Login Failed";}
		
	
		
	}

}
