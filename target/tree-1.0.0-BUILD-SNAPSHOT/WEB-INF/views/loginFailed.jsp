<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page isErrorPage="true" import="java.io.*" contentType="text/plain"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Login attempt has failed.
	
	<%=exception.getMessage()%>
	<%
	StringWriter stringWriter = new StringWriter();
	PrintWriter printWriter = new PrintWriter(stringWriter);
	exception.printStackTrace(printWriter);
	out.println(stringWriter);
	printWriter.close();
	stringWriter.close();
  %>
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
