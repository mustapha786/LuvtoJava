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
JDBCHelper helper = new JDBCHelper();
helper.createConnection();
boolean GrantAccess = helper.Login(user, password);
helper.closeConnection();

if (GrantAccess == true )
{
	
	%>
	
	<jsp:forward page="Home.jsp" />; 
	
	<%
}
	else 
	{
		out.print("Please enter Valid userId and Password") ; %>
		<jsp:forward page="FirstLoginPage.jsp">
		<jsp:param name="name" value="Please enter Valid userId and Password" />  
		</jsp:forward>  
		
		<% 
	}
	%>


</body>
</html>