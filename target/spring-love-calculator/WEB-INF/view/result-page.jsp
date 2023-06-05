<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>ok</title>

</head>

<body>

	<h1 align="center">Love Calculator !</h1>
	<hr />
	<h2>The Love Calculator estimates :</h2>
	<br/>
	${userInfo.userName} and ${userInfo.crushName} are :
	<br/>
	<!--FRIEND-->
	 ${userInfo.result} 
	<br/>
	<!--  <a href = "/spring-love-calculator/sendEmail">Send result to your email</a> -->
	<a href = "<c:url value="/sendEmail"/>">Send result to your email</a>
	
</body>


</html>