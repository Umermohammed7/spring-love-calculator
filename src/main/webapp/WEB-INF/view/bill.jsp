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

<h1>BILL</h1>
<form:form action="bill-success" method="GET" modelAttribute="userBill">
<label>CREDIT CARD :</label>
<form:input path="creditCard"/>
<br/>
<label>AMOUNT :</label>
<form:input path="amount"/> 
<br/>
<label>DATE :</label>
<form:input path="date"/> 

<input type="submit" value="register" />

</form:form>
</body>
</html>