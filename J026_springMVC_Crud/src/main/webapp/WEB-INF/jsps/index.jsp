<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form action="reg" modelAttribute="user">
		
		<form:label path="name"></form:label>
		<form:input path="name"/>
		<form:label path="email"></form:label>
		<form:input path="email"/>
		<form:label path="phone"></form:label>
		<form:input path="phone"/>
		
		<input type="submit">
		
		
		</form:form>
</body>
</html>