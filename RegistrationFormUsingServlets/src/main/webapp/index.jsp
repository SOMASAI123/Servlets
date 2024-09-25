<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feedback Form</title>
    <!-- CSS styles for the form -->
  
<link rel="stylesheet"
	href=" <%=application.getContextPath()%>/css/style.css " />
   
</head>
<body>
    <div class="form-container">
        <form action="<%=application.getContextPath() %>/servlet1" method="post" onsubmit="return validateForm()">
            <div class="mb-3">
                <label for="InputName" class="form-label">UserName</label>
                <input type="text" class="form-control" name="name" id="InputName">
            </div>
            <div class="mb-3">
                <label for="InputPassword" class="form-label">Password</label>
                <input type="password" class="form-control" name="password" id="InputPassword">
            </div>
            <div class="mb-3">
                <label for="Inputemail" class="form-label">email</label>
                <input type="email" class="form-control" name="email" id="Inputemail">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <script src="<%=application.getContextPath()%>/javascript/script.js">
		
	</script>
</body>
</html>
