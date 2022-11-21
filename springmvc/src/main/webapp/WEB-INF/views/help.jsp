<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>This is help page</h1>

	<%-- <%String name1=(String)request.getAttribute("name"); %>
<%Integer rollNo1=(Integer)request.getAttribute("rollNo"); %>
<%LocalDateTime ldt1=(LocalDateTime) request.getAttribute("time"); %> --%>

	<h1>Helper name is<%-- <%=name1 %> --%>${name}</h1>
	<h2>Their rollNo is<%-- <%=rollNo1 %> --%>${rollNo}	</h2>
	<h3>The Time is<%-- <%=ldt1 %> --%>${time}</h3>

</body>
</html>