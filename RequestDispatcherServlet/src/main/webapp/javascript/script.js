
        function validateForm() {
            var name = document.getElementById("InputName").value;
            var phno = document.getElementById("InputPhno").value;
            var feedback = document.getElementById("Inputfeedback").value;

            if (name == "" || phno == "" || feedback == "") {
                alert("All fields must be filled out");
                return false;
            }

            var phonePattern = /^[0-9]{10}$/;
            if (!phonePattern.test(phno)) {
                alert("Please enter a valid 10-digit phone number");
                return false;
            }

            return true;
        }
    