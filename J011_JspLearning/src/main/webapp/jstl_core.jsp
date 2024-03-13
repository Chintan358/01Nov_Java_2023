<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach begin="1" end="10" var="i">
	<c:out value="${i}"></c:out>
	</c:forEach>
	
	<c:if test="${100>20}">
	<c:out value="false"></c:out>
	</c:if>
	
	<c:set var="a" value="10"></c:set>
	
</body>
</html>