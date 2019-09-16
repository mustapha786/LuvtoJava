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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("<< Init executed");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("<< destroy  executed");
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
	/*	boolean GrantAccess = JDBCHelper1.Login(user1.name,user1.password);
		if (GrantAccess == true )
		{
			System.out.println("Login Successful for user :" + user1.name );
		} else
		{
			System.out.println("Login NOt Successful for user :" + user1.name );
		} */
		int i = JDBCHelper1.insertId(user1);
		System.out.println("Value of i after return :"+ i);
		if ( i>=0)
		{
			System.out.println("Registration is successful for the user : "+ user1.name);
		} else
		{
			System.out.println("Registration is not successful for the user : "+ user1.name);
		}
		System.out.println("Data" + user1.toString());
		
		JDBCHelper1.closeConnection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String res = "";
		if ( i>=0)
		{
			res = user1.name+"Registered successfully";
		}
		else
			res = user1.name+"not Registered successfully";
		String htmlresponse = "<html><body><center>"+res+"</center></body></html>";
		out.print(htmlresponse);
		
	}

}
