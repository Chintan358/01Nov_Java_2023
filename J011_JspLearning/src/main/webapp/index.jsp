<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="true" errorPage="error.jsp" %>
<%-- <%@include file="home.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
		<h1>Index page</h1>
	 	<span>${msg}</span>
	 		
	 	<%-- <%
	 		int a = 10/0;
	 	%> --%>
	 	
	 	<%! public int a; %>
	 	
	 	<%
	 		int a = 30;
	 		for(int i=1;i<=10;i++)
	 		{ 
	 			out.print(i);
	 		}
	 	
	 	%>
	 	
	 	<%=a%>
	 	
</body>
</html>