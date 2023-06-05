<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hi ${userInfo.userName }</h1> <!-- ${userName} -->
<h2>Send result to your email</h2>
<form:form action="process-email" method="GET" modelAttribute="emailDTO">
<label>Enter your email:</label>
<form:input path="userEmail"/>
<input type="submit"  value="send"/>
</form:form>



</body>
</html>