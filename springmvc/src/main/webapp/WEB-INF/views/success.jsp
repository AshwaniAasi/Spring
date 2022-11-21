<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>${O}</h1>
	<%-- <h1>Hello, ${N }</h1>
	<br>
	<h2>your email id - ${E }</h2>
	<h2>your password are - ${P }</h2> --%>
	
	<!-- after User class -->
	<h1>Hello, ${user.nameJSP }</h1>
	<h2>your email id = ${user.emailJSP}</h2>
	<h3>your password are = ${user.passwordJSP}</h3>
	
</body>
</html>