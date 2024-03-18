<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body>

	<h1 style='text-align:center; color:red'>Books Information</h1>
	<b>Books Details</b>
	<c:forEach var="booksName" items="${books}" >${booksName}, </c:forEach>

</body>
</html>