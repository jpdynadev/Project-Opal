
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
<div class="dashboardContainer">
<div class="greeting">
<h1 class="header">Hello ${name}</h1>
</div>

<h2 class="annoucement">You have ${userrole} rights</h2>
<div class="dashboardContainers">
<div class="Manage">
<h5 class="ManageTitle">Manage Employees</h5>
</div>
<div class="Analyze"></div>
<div class="Settings"></div>
</div>
</div>
</body>
</html>