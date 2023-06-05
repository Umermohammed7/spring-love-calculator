<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your registration is successfull !</h1>
	<h2>The details you have entered are:</h2>
	<br /> Name : ${userReg.name}
	<br />
	<!-- ça va utiliser le get -->
	User Name : ${userReg.userName}
	<br /> Password : ${userReg.password}
	<br /> Country : ${userReg.countryName}
	<br /> Age : ${userReg.age}
	<br /> Hobbies :
	<c:forEach var="temp" items="${userReg.hobbies}"> ${temp}</c:forEach>
	<br /> Gender : ${userReg.gender}
	<br /> Email : ${userReg.communicationDTO.email}
	<br /> Phone : ${userReg.communicationDTO.phone}
</body>
</html>