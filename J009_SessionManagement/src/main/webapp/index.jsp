<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
		<form action="login">
		<span>${err}</span>
		<input type="text" name="uname" placeholder="Enter username">
		<input type="password" name="pass" placeholder="Enter password">
		<input type="submit">
		</form>
</body>
</html>