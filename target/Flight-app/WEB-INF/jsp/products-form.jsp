<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Products List:</h2>
<table>
<tr>
<th>Product Id</th>
<th>Name</th>
<th>Price</th>
</tr>
<c:forEach var="pr" items="${products}">
<tr>
<td>${pr.productId}</td>
<td>${pr.name}<td>
<td>${pr.price}</td>
</tr>
</c:forEach>


</table>
</body>
</html>