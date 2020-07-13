<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>

<%

String str = (String) request.getAttribute("errorMessage");

System.out.println(str);

%>
<html>
  <head>
  <meta charset="UTF-8" />
  <title>failed to log in</title>
  <link rel="stylesheet" href="css/login.css">
  </head>
  <body>
    <div class="container">
    <h2 class="title">Project Opal Log in</h2>
    <!-- We will put our React component inside this div. -->
	 <form method="post" action="UserServlet" class="form">
     <div class="errorMessage">Incorrect Username or password</div>
		<input class="username" type="text" name="username" placeholder="Username">
		<input class="password" type="Password" name="password" placeholder="password"><br>
		<button class="submit" type="submit">Log in</button>
	  </form>
    <!-- Load React. -->
    <!-- Note: when deploying, replace "development.js" with "production.min.js". -->
    <!-- Load our React component. -->
  </div>
  </body>

</html>