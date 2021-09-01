<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Information</title>
</head>
<body>
	<div align="center">
		<h2>Customer Information</h2>
		<form action="search" method="get">
			<input type="text" name="keyword"> &nbsp; <input
				type="submit" value="Search">
		</form>
		<h3>
			<a href="/newCustomer">New Customer</a>
		</h3>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listOfCustomers}" var="customer">
			<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.email}</td>
			<td>${customer.address}</td>
			<td>
			<a href="/edit/{customer.id}">Edit</a> &nbsp; &nbsp;&nbsp;&nbsp;
			<a href="/delete/{customer.id}">Delete</a>
			</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>