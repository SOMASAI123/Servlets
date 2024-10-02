<!DOCTYPE html>
<html>
<head>
    <title>Successfully Logged In</title>
</head>
<body>
    <h1>Successfully Logged In</h1>

    <!-- Using EL to print the attributes set in the servlet -->
   <p>UserName: <%= request.getAttribute("name") %></p>
    <p>Password: <%= request.getAttribute("Password") %></p>
</body>
</html>
