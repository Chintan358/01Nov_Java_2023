<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
		<%
	      String uname = (String)session.getAttribute("uname");
			if(uname==null)
			{
				request.setAttribute("err", "Please login first !!!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		%>
		<h1>Products</h1>
		
		<ul>
		<li>TV</li>
		<li>Laptop</li>
		<li>Mobile</li>
		<li>Mouse</li>
		<li>Pendrive</li>
		</ul>
	
		<a href="logout">Logout</a>
</body>
</html>