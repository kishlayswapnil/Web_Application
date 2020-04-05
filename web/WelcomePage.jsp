<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>First Page</title>
</head>
<body>
<div style="text-align: center; background-color: cyan">
	<h1>$$ Welcome you are successfully Logged In $$</h1>

	//Using this scriptlet tag we implimenting java code.
	<%
		if(session.getAttribute("uName") == null){
			response.sendRedirect("Login.jsp");
		}
	%>
	<form action="LogOut">
		<input type="submit" value="Logout">
	</form>
</div>
</body>
</html>