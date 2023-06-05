<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<form:form action="process-email" method="GET" modelAttribute="emailDTO">

Name : ${userInfo.userName }
<br>
Email : <form:input path="userEmail"/>

<br>
Feedback : <input type = "text"></input>




<input type="submit"  value="send"/>
</form:form>


</body>
</html>