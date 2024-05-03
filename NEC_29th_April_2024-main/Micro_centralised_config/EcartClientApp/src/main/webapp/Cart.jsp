<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Cart</title>
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
  background-color: red; /* Green */
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
<% 
if (session.getAttribute("cartItems")==null){ %>
<h1>Your Cart is Empty</h1>

<%} 
else{
%>
<table border="1px" align="center">
<tr>
<td>Id</td>
<td>UserId</td>
<td>Product Id</td>
<td>Product Name</td>
<td>Product Price</td>
<td>Quantity</td>
<td>SumTotal</td>
<td></td>
</tr>

<c:forEach items="${cartItems}" var="product">
<tr>
<td>${product.getId()}</td>
<td>${product.getUserid()}</td>
<td>${product.getProductId()}</td>
<td>${product.getProductname()}</td>
<td>${product.getProductPrice()}</td>
<td>${product.getQuantity()}</td>
<td>${product.getSumTotal()}</td>
<td>
<%-- <form action="deleteFromCart/${product.getId()}"> --%>
<a href="deleteFromCart/${product.getId()}"><button type="submit">Remove</button></a>
<%-- </form> --%></td>
</tr>
</c:forEach>
</table>
<br><br>
<a href="placeOrder"><button>Place Order</button></a>
<%} %>
</body>
</html>