<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Welcome to Spring MVC Home Page</h1>

<!-- EL(Expression Language) is used to display
attribute values in jsp files passed from a controller.
syntax: ${attribute} -->

<h1>Welcome to ${user} Home Page</h1>

<p> Page served on ${d} </p>

<a href="spring">Click here for one more View</a>

</body>
</html>