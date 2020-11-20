<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>

<%

String str = (String) request.getParameter("errorMessage");

%>
<html>
  <head>
  <meta charset="UTF-8" />
  <title>Project Opal</title>
  <link rel="stylesheet" href="css/login.css">
    <script type="text/javascript">
  		let x = document.getElementById("password").value;
  		console.log(x, "X");
  </script>
  </head>
  <body>
    <div class="container">
    <h2 class="title">Project Opal Log in</h2>
    <!-- We will put our React component inside this div. -->
	 <form method="post" action="UserServlet" class="form">
     <span class="errorMessage"></span>
		<input class="username" type="text" name="username" placeholder="Username">
		<input class="password" type="Password" name="password" placeholder="password"><br>
		<button class="submit" type="submit">Log in</button>
	  </form>
    <!-- Load React. -->
    <!-- Note: when deploying, replace "development.js" with "production.min.js". -->
    <script src="https://unpkg.com/react@16/umd/react.development.js" crossorigin></script>
    <script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js" crossorigin></script>

    <!-- Load our React component. -->
    <script src="./js/src/components/Login.jsx"></script>
  </div>
  </body>

</html>