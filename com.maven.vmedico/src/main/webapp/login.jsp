<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login_Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body {
            background-color: #a1bf3f;
            font-family:'Times New Roman';
            padding-top: 120px;
            padding-right: 50px;
            padding-bottom: 50px;
            padding-left: 80px;
        }
    </style>
</head>
<body>
    <center>
        <div class="login">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <form class="form-container" action="LoginDAO" method="post">
                    <heading1><font color="black"  size="15">Welcome to VMedico!</font></heading1>

                    <div class="form-group">
                        <label for="InputEmail"></label>
                        <input type="email" name="username" class="form-control" id="exampleInputEmail1" placeholder="Username">

                        <label for="InputPassword"></label>
                        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
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
                    <div class="submit"><button type="submit" name="submit" class="btn btn-primary" >Login</button></div>
                    
                   	<div>
                    <center>Don't have an account?<a href="#" onclick="location.href='signup.jsp'"><font size="3">SignUp</form></font></a></center>
                   	</div>
                      </form>
           
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
        </div>
    </center>

</body>
</html>