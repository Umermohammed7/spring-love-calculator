
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>

<style>
.errors {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

</head>
<body>

	<h1 align="center">Please register here !</h1>

	<form:form action="registeration-success" method="GET" modelAttribute="userReg">

		<div align="center">
			<label>User :</label>
			<form:input path="name" />
			<form:errors path="name" cssClass = "errors"/>
			<br /> <label>User Name:</label>
			<form:input path="userName" />
			<form:errors path="userName" cssClass="errors"/>
			<br /> <label>Password:</label>
			<form:password path="password" />
			<br /> <label>Country:</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India" />
				<form:option value="USA" label="USA" />
				<form:option value="FR" label="France" />
			</form:select>
			<br /> <label>Age :</label>
			<form:input path="age" />
			<form:errors path="age" cssClass="errors"/>
			<br /> <label>Hobbies:</label> Cricket:
			<form:checkbox path="hobbies" value="Cricket" />
			Reading:
			<form:checkbox path="hobbies" value="Reading" />
			Travel:
			<form:checkbox path="hobbies" value="Travel" />
			Programming:
			<form:checkbox path="hobbies" value="Programming" />
			<br /> <label>Gender:</label> Male
			<form:radiobutton path="gender" value="male" />
			Female
			<form:radiobutton path="gender" value="female" />
			<br/>
			<h2>Communication:</h2><br/>
			Email :<form:input path="communicationDTO.email"/>
			<form:errors path="communicationDTO.email" cssClass="errors"/>
			<br/>
			Phone :<form:input path="communicationDTO.phone"/>
			<form:errors path="communicationDTO.phone" cssClass="errors"/>
			<br /> <input type="submit" value="register" />
		</div>
	</form:form>
</body>
</html>