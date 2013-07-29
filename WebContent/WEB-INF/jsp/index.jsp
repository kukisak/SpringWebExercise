<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring page redirection</title>
</head>
<body>
<h2>Spring page redirection</h2>
<p>Click below button to redirect result to new page</p>
<form:form method="GET" action="redirect">
	<table>
		<tr>
			<td><input type="submit" value="Redirect page"></td>
		</tr>
	</table>
</form:form>
</body>
</html>