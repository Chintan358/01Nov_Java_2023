<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String msg = (String)request.getAttribute("msg");
		if(msg != null)	
		{ %>	
				<span><%=msg%></span>		
		<%}	
	%> --%>
	
	<span style="color: green;">${msg}</span>
	<form action="reg" method="post">
		<input type="text" name="uname" placeholder="enter username">
		<input type="text" name="email" placeholder="enter Email">
		<input type="password" name="pass" placeholder="enter Password">
		<input type="text" name="phone" placeholder="enter Phone">
		<input type="submit">
	</form>
</body>
</html>