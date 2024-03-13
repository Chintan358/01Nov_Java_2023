<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/advjava" user="root" password="" var="ds" />
	
	<sql:query var="data" dataSource="${ds}">
	select * from reg
	</sql:query>
	
	<table>
	<tr>
	<th>Id</th>
	<th>Uname</th>
	<th>email</th>
	<th>Pass</th>
	<th>Phone</th>
	</tr>
	
	<c:forEach var="dt" items="${data.rows}">
	<tr>
	<td>${dt.id}</td>
	<td>${dt.uname}</td>
	<td>${dt.email}</td>
	<td>${dt.pass}</td>
	<td>${dt.phone}</td>
	
	</tr>
	</c:forEach>
</table>
	
</body>
</html>