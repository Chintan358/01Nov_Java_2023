<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="login" method="post">
		<span>${err}</span>
		<input type="text" name="uname" placeholder="Enter username">
		<input type="text" name="pass" placeholder="Enter password">
		<input type="submit">
		</form>
</body>
</html>