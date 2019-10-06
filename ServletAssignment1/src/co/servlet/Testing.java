package co.servlet;

import java.io.IOException;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Testing
 */
@WebServlet("/Testing")
public class Testing extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
        Cookie[] ckArr = request.getCookies();
		
		for(Cookie ck : ckArr)
		   {
			out.print("<h3>"+ck.getName()+" - "+ck.getValue()+"</h3>");
			
			if(ck.getName().equals("KeyUname"))
			{
				out.print("Hey !!");
			}
		   }
		
		String htmlresponse = "<html><body><center>"+"Hello Dear!!!"+"</center></body></html>";
		out.print(htmlresponse);
	}

}
