<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1 style='color:red; text-align:center'>Implementers Application</h1>
<form:form method="post" modelAttribute="impl">
	<table>
		<tr>
		<th>Implementer Id</th>
		<td><form:input path="id"/></td>
		</tr>
		
		<tr>
		<th>Implementer Name</th>
		<td><form:input path="iName"/></td>
		</tr>
		
		<tr>
		<th>Implementer City</th>
		<td><form:input path="iCity"/></td>
		</tr>
		
		<tr>
		<th>Implementer Salary</th>
		<td><form:input path="iSalary"/></td>
		</tr>
		
		<tr>
		<td><input type="submit" value="Register"></td>
		</tr>
	</table>
</form:form>
</center>

</body>
</html>