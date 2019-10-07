<%@ page import="co.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
  <%
    
	String user = request.getParameter("TxtName");
	String password = request.getParameter("Password");
	if ( !user.isEmpty() && !password.isEmpty() )
	{
		%>
		
		<jsp:forward page="JDBC.jsp" />; 
		<% 
	} else
	    
		response.sendRedirect("FirstLoginPage.jsp");	
	
%>
	
	
  
   
  
</body>
</html>