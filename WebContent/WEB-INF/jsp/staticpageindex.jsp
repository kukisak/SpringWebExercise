<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring landing page</title>
</head>
<body>
	<h2>Click below button to redirect to static page</h2>
	<form:form action="staticPage" method="GET">
	<table>
		<tr>
			<td><input type="submit" value="Get HTML page" ></td>
		</tr>
	</table>
	</form:form>
</body>
</html>