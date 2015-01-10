<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name='f' action="<c:url value='j_spring_security_check' />"
method='POST'>
	<label for="j_username">Username_Test</label>
	<input type="text" name="j_username" id="j_username" />
	<br/>
	<label for="j_password">Password_Test</label>
	<input type="password" name="j_password" id="j_password"/>
	<br/>
	
	<br/>
	<input type="submit" value="Login"/>
</form>
</body>
</html>