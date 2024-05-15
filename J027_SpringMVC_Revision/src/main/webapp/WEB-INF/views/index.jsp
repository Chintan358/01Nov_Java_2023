<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
		
		<span>${msg}</span>
		<form:form action="reg" modelAttribute="std">
		<form:hidden path="id"/>
		<form:label path="name">Username</form:label>
		<form:input path="name"/>
		<form:label path="email">Email</form:label>
		<form:input path="email"/>
		<input type="submit">
		</form:form>
		
		<br>
		
		<h1>Student Information</h1>
		
		<table border="1">
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th colspan="2">Action</th>
		</tr>
		<c:forEach var="dt" items="${data}">
		<tr>
		<td>${dt.getId()}</td>
		<td>${dt.getName()}</td>
		<td>${dt.getEmail()}</td>
		<td><a href="delete?did=${dt.getId()}">Delete</a></td>
		<td><a href="edit?eid=${dt.getId()}">Edit</a></td>
		</tr>
		</c:forEach>
		
		</table>
		
		
</body>
</html>