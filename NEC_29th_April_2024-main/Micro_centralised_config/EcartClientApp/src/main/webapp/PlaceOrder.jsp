<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Place Order</title>
<style>
table {
  border-collapse: collapse;
}
td {
  text-align: center;
}
th {
  height: 40px;
}
td {
  height: 40px;
  padding:10px;
}
button {
  background-color: #a832a2;
  border: none;
  color: white;
  padding: 5px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
</style>
</head>
<body align="center">

<table border="1px" align="center">
<tr>

<!-- <td>UserId</td> -->
<td>Product Id</td>
<td>Product Name</td>
<td>Product Price</td>
<td>Quantity</td>
<td>SubTotal</td>

</tr>

<c:forEach items="${orderItems}" var="product">
<tr>

<td>${product.getProductid()}</td>
<td>${product.getProductName()}</td>
<td>${product.getProductPrice()}</td>
<td>${product.getQuantity()}</td>
<td>${product.getSubTotal()}</td>

</tr>
</c:forEach>
</table>
<br><br>
<form method="post" action="confirmOrder">
<label>Enter Delivery Address</label><br>
<input type="text" name="address" /><br>
<label>Enter Payment Mode</label><br>
<input type="text" name="mode" /><br>
<button type="submit">Confirm Order</button>
</form>
</body>
</html>