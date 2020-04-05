<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register</title>
</head>
<body bgcolor="#00ffff">
<div style="text-align: center">

	//Form redirecting to the servlet register.java with post method.
	<form action="Register" method="post">
		<h3>Registration Form</h3>

		//Table has been created to fetch basic user informaton through register servlet.
		<table align="center" cellspacing="20">
			<tr>
				<td><label for="firstName">First Name:</label></td>
				<td><input type="text" id="firstName" maxlength="12"
						   name="firstName"><br></td>
			</tr>
			<tr>
				<td><label for="lastName">Last Name:</label></td>
				<td><input type="text" id="lastName" maxlength="12"
						   name="lastName"><br></td>
			</tr>
			<tr>
				<td><label for="emailID">Email Address:</label></td>
				<td><input type="email" id="emailID" name="emailID"><br></td>
			</tr>
			<tr>
				<td><label for="contact">Mobile No:</label></td>
				<td><input type="tel" id="contact" min="10" maxlength="10"
						   name="contact"><br></td>
			</tr>
			<tr>
				<td><label for="pswd">Password:</label></td>
				<td><input type="password" id="pswd" name="pswd"><br></td>
			</tr>
			<tr>
				<td><label for="pswd1">Confirm Password:</label></td>
				<td><input type="password" id="pswd1" name="pswd1"><br></td>
			</tr>
			<tr>
				<td></td>

				//On clicking submit page is transfered to register servlet.
				<td><button type="submit">Submit</button></td>
			</tr>
		</table>
		<table align="center" cellspacing="20">
			<tr>
				<td><p>
					If Already Registered   <a href="Login.jsp">Log In</a>
				</p></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>