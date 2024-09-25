<html>
    <body>
        <form action=" <%=application.getContextPath() %>/four" method="post">
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
    </body>
</html>
