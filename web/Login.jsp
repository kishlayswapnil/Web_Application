<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>LogIn Window</title>
</head>
<body bgcolor="#00ffff" style="text-align: center">
	<div style="text-align: center;background-color: coral;height: 400px">

		//Action will send this jsp page to Login servlet.
		<form action="LogIn" method="get">
			<h3>Welcome to LogIn Page</h3>
			<table align="center" cellspacing="20">
				<tr>
					<td><label for="uName">User name:</label></td>
					<td><input type="text" id="uName" name="uName"><br></td>
				</tr>
				<tr>
					<td><label for="pswd">Password:</label></td>
					<td><input type="password" id="pswd" name="pswd"><br></td>
				</tr>
				<tr>
					<td><a href="RegistrationPage.jsp">New User</a></td>
					<td><button type="submit">Login</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>