<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC form handling</title>
</head>
<body>
	<h2>Submitted student information from sub-dir exceptionHandling</h2>
	<table>
		<tr>
			<td>Name</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${age}</td>
		</tr>
		<tr>
			<td>Id</td>
			<td>${id}</td>
		</tr>
	</table>
</body>
</html>