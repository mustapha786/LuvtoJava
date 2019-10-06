package co.khan.controller;

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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter() {
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

		// pass the request along the filter chain
		//chain.doFilter(request, response);
		System.out.println("We are in the filter");
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		out.print("<center><h3>==Pre Processing==</h3></center>");
		String uname = request.getParameter("TxtName");
		System.out.println("Username:"+ uname);
		
		String password = request.getParameter("Password");
		System.out.println("Password:"+password);
	
		 
		
		if(uname.isEmpty() || password.isEmpty()){
			System.out.println("Hello!!! I am doing my job 1");
			out.print("<center><h3>==Email or Password Missing==</h3></center>");
		}else{
			System.out.println("Hello!!! I am doing my job 2");
			//chain.doFilter(request, response); // Dispatches the request to corresponding Servlet (LoginServlet as in web.xml=file)
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			dispatcher.forward(request, response); 
		}
		
		out.print("<center><h3>==Post Processing==</h3></center>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
