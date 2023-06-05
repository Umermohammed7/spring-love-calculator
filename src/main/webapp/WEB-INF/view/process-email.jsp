<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hi ${userInfo.userName } </h2> <!-- ${userName} -->  
<label>Email successfully send to ${emailDTO.userEmail}</label>
<br>
<a href="<c:url value="/feedback"/>">Give us your feedback !</a>
</body>
</html>