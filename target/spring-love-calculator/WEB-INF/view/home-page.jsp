
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>ok</title>
<style>
.errors {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<script type = "text/javascript">

function validateUserName() {

	var userName = document.getElementById("yn").value ;
	var crushName = document.getElementById("cn").value;
	
	if(userName.length < 3 || crushName.length < 1) {
		
		alert("You have to fill in both names with atleast 3 char");
		
		return false;
		
	} else {
		
		return true;
	}
	
}

</script>

</head>

<body>

	<h1 align="center">Love Calculator !</h1>
	<hr />
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo" onSubmit=" return validateUserName()" > <!-- onSubmit=" return validateUserName()" -->
		<div align="center">
			<p>
				<label for="yn">Your name: </label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="errors"/>
				<!-- plus besoin du  type="text" -->
			</p>
			<p>
				<label for="cn">Your crush name: </label>
				<form:input id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="errors"/>
				<!-- nom dans le path doit etre meme que dans UserInfoDTO  -->
			</p>

			<p>

				<form:checkbox path="termAndCondition" id="check" />
				<label>I am agreeing this is for fun</label>
				<form:errors path="termAndCondition" cssClass="errors"/>

			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>


</body>


</html>