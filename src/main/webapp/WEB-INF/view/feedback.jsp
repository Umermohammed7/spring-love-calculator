<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<!--  
<form method="post" action="/feedback">
  <input type="text" name="emailDTO.userEmail" placeholder="Votre e-mail" required>
  <textarea name="feedback" placeholder="Votre feedback" required></textarea>
  <input type="submit" value="Envoyer">
</form>
-->
<form method="post" action="/spring-love-calculator/success-feedback">
Name : ${userInfo.userName }
<br>
 Email:  <input type="text" name="emailDTO.userEmail" placeholder="Votre e-mail" required>
 <br>
 FeedBack: <textarea id="feedback" name="feedback" placeholder="Votre feedback" required><c:out value="${userInfoDTO.feedback}" /></textarea>
  <input type="submit" value="Envoyer">
</form>






</body>
</html>