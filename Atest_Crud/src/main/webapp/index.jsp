<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="reg" method="post" enctype="multipart/form-data">
		<span>${msg}</span>
		<input type="hidden" name="id">
		<input type="text" name="name" placeholder="Enter name">
		<input type="text" name="email" placeholder="Enter email">
		<input type="password" name="pass" placeholder="Enter password">
		<input type="file" name="file">
		<input type="submit">
		<a href="display">display</a>
	 </form>
</body>
</html>