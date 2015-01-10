<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Simple Calculation by using c: out</title>
</head>
<body bgcolor="#FFFFCC">
<h1>Simple Calculation by using c: out</h1>
<%
  String theSharedObject = "'1'+'3'+'Hello'+'World'";
%>


<%-- Multiplying the numbers 2 * 3 dynamically --%>
<c:set var="testing" value="This is marketing bullet text @tag1"/>
<c:set var="tag1" value="'1'+'3'+'Hello'+(2*3)+'World'"/>
<c:set var="str" value="hello"/>
<c:set var="a" value='5'/>
<c:set var="b" value='6'/>
<c:out value="${a*b}+${str}" />
<c:out value="${(3*(5-2))}"/>
<span>The message is <%= theSharedObject %></span>

<!--  
<c:out value="${tag1}"/>
-->
</body>
</html>