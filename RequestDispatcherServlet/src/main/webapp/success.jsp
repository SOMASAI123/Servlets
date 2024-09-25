<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>success</h1>
  <h1>Form Data Submitted</h1>
    <p>UserName: <%= request.getAttribute("name") %></p>
    <p>Password: <%= request.getAttribute("password") %></p>
    <p>Email: <%= request.getAttribute("email") %></p>

</body>
</html>