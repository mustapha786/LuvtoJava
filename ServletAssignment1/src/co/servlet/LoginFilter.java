package co.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("We are in the filter");
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		//out.print("<center><h3>==Pre Processing==</h3></center>");
		String uname = request.getParameter("TxtName");
		System.out.println("Username:"+ uname);
		
		String password = request.getParameter("Password");
		System.out.println("Password:"+password);
		
		// pass the request along the filter chain
		
		if ( uname.isEmpty() || password.isEmpty() )
		{
			System.out.println("Hello!!! I am doing my job 1");
			out.print("<center><h3>==Email or Password Missing==</h3></center>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
		    dispatcher.include(request, response); 
	//		dispatcher.forward(request, response);
			
		}
		else	
			System.out.println("Hello -- I am sending to Login Page");
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Login Filer is in init stage");
	}

}
