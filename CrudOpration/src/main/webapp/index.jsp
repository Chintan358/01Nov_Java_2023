<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
				<form action="reg" method="post" enctype="multipart/form-data">
				
				<table align="center" border="1">
				<tr>
				<td><lable>Username</lable></td>
				<td><input type="text" name="uname"> </td>
				</tr>
				
				<tr>
				<td><lable>Email</lable></td>
				<td><input type="text" name="email"> </td>
				</tr>
				
				<tr>
				<td><lable>Password</lable></td>
				<td><input type="password" name="pass"> </td>
				</tr>
				
				<tr>
				<td><lable>Gender</lable></td>
				<td><input type="radio" name="gender" value="male" checked="checked"> Male
				<input type="radio" name="gender" value="female"> Female
				</td>
				</tr>
				
				<tr>
				<td><lable>Languages</lable></td>
				<td><input type="checkbox" name="lang" value="gujarati">Gujarati
				<input type="checkbox" name="lang" value="hindi">Hindi
				<input type="checkbox" name="lang" value="english">English </td>
				</tr>
				
				
				<tr>
				<td><lable>Country</lable></td>
				<td><select name="country">
					<option value="0">---select country---</option>
					<option value="india">India</option>
					<option value="usa">USA</option>
					<option value="uk">uk</option>
				</select> </td>
				</tr>
				
				<tr>
				<td><lable>Profile Picture</lable></td>
				<td><input type="file" name="img"> </td>
				</tr>
				
				<tr>
				<td></td>
				<td><input type="submit"> </td>
				</tr>
				
				
				<tr>
				<td><a href="display">View users</a></td>
				</tr>
				</table>
				
				</form>
				
				
</body>
</html>