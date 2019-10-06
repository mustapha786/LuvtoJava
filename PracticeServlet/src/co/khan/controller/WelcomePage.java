package co.khan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class WelcomePage
 */
@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		javax.servlet.http.Cookie[] ck=request.getCookies();
		if(ck!=null){  
	         String name=ck[0].getValue(); 
	       System.out.println("Cookie value::"+ name);}
		//javax.servlet.http.Cookie[] ckArr = request.getCookies();
		//System.out.println("Cookie valu::"+ ckArr[0]);
	/*	for(javax.servlet.http.Cookie ck : ckArr)
			{
			out.print("<h3>"+ck.getName()+" - "+ck.getValue()+"</h3>");
			} */
		
		String htmlresponse = "<html><body><center>"+"Welcome !!!Successfully Loggedin"+"</center></body></html>";
		out.print(htmlresponse);
	}

}
