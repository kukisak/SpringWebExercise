<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC form handling</title>
</head>
<body>
<h2>Student information from dir jsp</h2>
<form:form method="POST" action="addStudent">
	<table>
		<tr>
			<td><form:label path="name">Name</form:label></td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td><form:label path="age">Age</form:label></td>
			<td><form:input path="age"/></td>
		</tr>
		<tr>
			<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit"></td>
		</tr>	
	</table>
</form:form>

</body>
</html>