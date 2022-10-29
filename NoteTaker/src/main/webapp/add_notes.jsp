<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
	<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container-fluid ">
   		<%@include file="navbar.jsp"%>
   		<br>
   		<h1>Please enter your note</h1>
  
   			<!-- this is add forms -->

<form action="SaveNoteServlet" method="post">

<div class="form-group">

	<label for="title" 
	class="form-label">Notes Title</label> 
	<input 
		name="title" 
		required type="text" 
		class="form-control" 
		id="title" 
		aria-describedby="emailHelp" 
		placeholder="Enter Here"/>
	
  <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
</div>
	
	<div class="mb-3">
		<label for="content" class="form-label">Note Content</label>
		<textarea 
			name="content"
			required 
			id="content" 
			placeholder="Enter your Content here" 
			class="form-control" 
			style="height: 250px"></textarea>
	</div>
	
	<div class="container text-center">
		<button type="submit" class="btn btn-primary">Add</button>
	</div>
</form>
   </div>
</body>
</html>