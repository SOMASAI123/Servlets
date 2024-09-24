<html>
<body>
 <div class="form-container">
        <form action="<%=application.getContextPath() %>/servlet3" method="post" onsubmit="return validateForm()">
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
         
                <a href="<%=application.getContextPath()%>/servlet1" class="btn btn-primary">servlet1</a>
                <a href="<%=application.getContextPath()%>/servlet2" class="btn btn-primary">servlet2</a>
                
        </form>
    </div>
</body>
</html>
