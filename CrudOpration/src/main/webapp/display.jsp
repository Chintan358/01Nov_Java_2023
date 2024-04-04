<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<h1 align="center">User details</h1>
		<table align="center" border="1">
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Password</th>
		<th>Gender</th>
		<th>Languages</th>
		<th>Country</th>
		<th>Img</th>
		<th colspan="2">Action</th>
		</tr>
		
		<c:forEach var="dt" items="${data}">
		<tr>
		<th>${dt.getId()}</th>
		<th>${dt.getUname()}</th>
		<th>${dt.getEmail()}</th>
		<th>${dt.getPass()}</th>
		<th>${dt.getGender()}</th>
		<th>${dt.getLang()}</th>
		<th>${dt.getCountry()}</th>
		<th><img src="img/${dt.getImg()}" alt="${dt.getImg()}" width="50px" height="50px"></th>
		<th><a href="update?action=edit&uid=${dt.getId()}">Edit</a></th>
		<th><a href="update?action=delete&uid=${dt.getId()}">Delete</a></th>
		
		</tr>
		
		</c:forEach>
		</table>
</body>
</html>