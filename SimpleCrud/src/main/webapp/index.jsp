<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="reg" method="post">
		
		<span>${msg}</span>
	<label>Username</label>
	<input type="text" name="uname" placeholder="Enter uname">

	<label>Email</label>
	<input type="text" name="Email" placeholder="Enter email">


	<label>password</label>
	<input type="password" name="pass" placeholder="Enter pass">


	<input class="btn btn-success" type="submit">
</form>

</body>
</html>