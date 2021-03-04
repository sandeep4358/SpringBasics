<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
</head>
<body>

	<h2>
		<spring:message code="lbl.page" text="Add New Employee" />
	</h2>
	<form:form method="post" id="newEntryForm" modelAttribute="employeeMA" action="submitEmployee">
		<table>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.firstName"
						text="Enter First Name" /></td>
				<td><form:input path="firstName" /></td>
					<td><form:errors path="firstName" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lastName" text="Enter Last Name" /></td>
				<td><form:errors path="lastName" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.emailid" text="Enter Email" /></td>
				<td><form:errors path="emailId" /></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
				<td></td>
			</tr>
		</table>
	</form:form>

</body>
</html>