<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
  <br/>
   <h3> Welcome existing user 
   </h3>
    <form action="Login.jsp"  method="post">
   Enter Your Name      :<input type ="text" name="TxtName" placeholder="eg: John Watson"> </br>
   
   Enter Your PassWord  :<input type ="password" name="Password" >  </br>
   
     <input type ="Submit" value ="Login" name="txtType"/>
     
   </form>
  </center>
  <% String message1 = request.getParameter("name"); 
  if ( message1 != null )
  {  
	 out.print(message1); 
  }
   %> 
  
</body>
</html>