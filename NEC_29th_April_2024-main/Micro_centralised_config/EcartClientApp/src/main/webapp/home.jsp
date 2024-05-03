<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body align="center">
<h1>User Login</h1>
<br>
<form action="userlogin" method="post" >
<label>Enter Username</label><br>
<input type="text" name="username" /><br><br>
<label>Enter Password</label><br>
<input type="password" name="password" /><br><br>
<input type="submit" name="submit" value="Log In" />
</form>
<br>
<br>
<h1>${message }</h1>
</body>
</html>