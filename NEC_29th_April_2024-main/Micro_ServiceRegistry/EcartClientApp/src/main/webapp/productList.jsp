<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<h1>Product List</h1>
<table border="1px" align="center">
<tr>
<td>Product Id</td>
<td>Product Name</td>
<td>Product Price</td>
<td>Product Description</td>
<td>Product Image Url</td>
<td></td>
</tr>
<c:forEach items="${ProductList}" var="product">
<tr>

<td>${product.getProductId()}</td>
<td>${product.getProductName()}</td>
<td>${product.getProductPrice()}</td>
<td>${product.getProductDescription()}</td>
<td>${product.getProductImageUrl()}</td>
<td><%-- <a href="addToCart/${product.getProductId()}"> --%>
<form method="post" action="addToCart/${product.getProductId()}">
<button type="submit">Add To Cart</button>
</form></td>
</tr>
</c:forEach>
</table>
<br>
<br>
<a href="viewCart"><button>View Cart</button></a>
</body>
</html>