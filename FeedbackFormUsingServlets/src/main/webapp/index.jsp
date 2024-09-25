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
        <form action="<%=application.getContextPath() %>/third" method="post" onsubmit="return validateForm()">
            <div class="mb-3">
                <label for="InputName" class="form-label">UserName</label>
                <input type="text" class="form-control" name="name" id="InputName">
            </div>
            <div class="mb-3">
                <label for="InputPhno" class="form-label">PhoneNumber</label>
                <input type="number" class="form-control" name="phno" id="InputPhno">
            </div>
            <div class="mb-3">
                <label for="Inputfeedback" class="form-label">Feedback</label>
                <input type="text" class="form-control" name="feedback" id="Inputfeedback">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <script src="<%=application.getContextPath()%>/javascript/script.js">
		
	</script>
</body>
</html>
