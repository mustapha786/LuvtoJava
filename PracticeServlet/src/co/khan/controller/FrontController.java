package co.khan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet({ "/FrontController", "/Dispatcher" })
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("we are in front controller");
		String type = request.getParameter("txtType");
		System.out.println("Type=="+ type);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h3>This is from Front Controller</h3>"); 
		if(type.equals("RegisterServlet")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterServlet");
			dispatcher.forward(request, response); 		// forwarding request and Response to other Servlet, and not include response
			//dispatcher.include(request, response);    // forwarding request and Response to other Servlet, and include response
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			//dispatcher.forward(request, response);
			dispatcher.include(request, response); 
		}
	}

}
