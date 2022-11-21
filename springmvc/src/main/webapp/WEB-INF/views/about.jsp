<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<h1>
		Our branches are ${country}		
	</h1>
	<hr>
	<!-- this is not good practice so we use JSTL -->

	<c:forEach var="list" items="${country}">
		<h1>${list}</h1>
	</c:forEach>

</body>
</html>