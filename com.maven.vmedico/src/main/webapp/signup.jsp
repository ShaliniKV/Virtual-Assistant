<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>SignUp</title>
    <style>
        body {
            background-color: #a1bf3f;
            padding-top: 110px;
            padding-right: 50px;
            padding-bottom: 70px;
            padding-left: 80px;
        }
    </style>
</head>
<body>
    <center>
        <div class="signup">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <form class="signup-container" action="SignUpDAO" method="post">
                    <heading1><font color="black" face="Times New Roman" size="10">Sign Up</font></heading1>
                    <p>Fill your details to create an account</p>
                    <div class="form" >
                        <label for="InputFirstName"></label>
                        <input type="text" name="firstname" class="form-control" id="InputFirstName" placeholder="First Name">
                        <label for="InputLastName"></label>
                        <input type="text"  name="lastname" class="form-control" id="InputLastName" placeholder="Last Name">
                        <label for="InputEmail"></label>
                        <input type="email"  name="email" class="form-control" id="InputEmail" placeholder="Email">
                        <label for="InputPassword"></label>
                        <input type="password"  name="password" class="form-control" id="InputPassword" placeholder="Password">
                        <label for="InputPassword2"></label>
                        <input type="password"  name="confirm_password" class="form-control" id="InputPassword2" placeholder="Confirm Password">
                        <br />
                        </div>
                    <label>Choose your role from the list</label>
                    <select class="btn btn-secondary dropdown-toggle" name="role">
                    <option  class="btn btn-secondary dropdown-toggle">Choose Role</option>
                    <option  class="btn btn-secondary dropdown-toggle">Chemist</option>
                    <option  class="btn btn-secondary dropdown-toggle">Doctor</option>
                    <option  class="btn btn-secondary dropdown-toggle">Health Professional</option>
                    <option  class="btn btn-secondary dropdown-toggle">Patient</option>
                    </select>
                    <br><br>
                        <br />
                        <div class="submit">
                            <button type="submit" name="signup" class="btn btn-primary" >SignUp</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </center>
</body>
</html>