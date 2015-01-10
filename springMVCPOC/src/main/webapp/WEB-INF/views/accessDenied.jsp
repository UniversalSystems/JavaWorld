<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page isErrorPage="true" import="java.io.*" contentType="text/html"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Access Denied!</h1>
	<h2><%request.getUserPrincipal(); %></h2>
</body>
</html>
