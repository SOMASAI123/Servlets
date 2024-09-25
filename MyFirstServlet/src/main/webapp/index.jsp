<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h1>this is index page</h1>

<form action=" <%=application.getContextPath() %>/third" method="post">

<input type="text" name="message" placeholder="enter your message"></input>
<button type="submit">submit</button>
</form>
</body>
</html>