<html>
<body>
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
            
            <button type="submit" class="btn btn-primary">login</button>
        </form>
    </div>
    <script src="<%=application.getContextPath()%>/javascript/script.js">
		
	</script>
</body>


</body>
</html>
