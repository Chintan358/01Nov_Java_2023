<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String str = "hello java";
		boolean b =  str.contains("java");
		if(b)
		{
			System.out.println("yes");
		}
	%> --%>
	
	<c:set var="str" value="Hello java"></c:set>
	
	<c:if test="${fn:contains(str,'java')}">
	<c:out value="yes"></c:out>
	</c:if>
	
</body>
</html>