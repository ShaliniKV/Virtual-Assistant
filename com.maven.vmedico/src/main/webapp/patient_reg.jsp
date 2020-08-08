<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Reg_Patient</title>
    <style>
        body {
            background-color: #a1bf3f;
            padding-top: 70px;
            padding-right: 50px;
            padding-bottom: 50px;
            padding-left: 80px;
        }
        #InputDOB{
            width:170px;
        }
    </style>
</head>
<body>
    <center>
        <div class="register_Pat">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <form class="form-container" action="PatientRegDB" method="post">
                    <heading1><font color="black" face="Times New Roman" size="15">Registration Form</font></heading1>
                    <p>Please fill this form to create an account</p>
                    <div class="form-group">
                        <label for="InputName"></label>
                        <input type="text" class="form-control" name="name" id="InputName" placeholder="Name">
                        <label for="InputEmail"></label>
                        <input type="email" class="form-control" name="email" id="InputEmail" placeholder="Email">
                        <label for="InputAddress"></label>
                        <textarea name="address" class="form-control" placeholder="Address"></textarea>
                        <label for="InputCity"></label>
                        <input type="text" class="form-control" name="city" id="InputCity" placeholder="City">
                        <label for="InputMobile"></label>
                        <input type="tel" class="form-control" name="mobile" id="InputMobile" placeholder="Mobile">
                        <br />
                        <div class="col-sm-8">
                        <label for="InputDOB">Date Of Birth</label>
                        <input type="date" id="InputDOB" name="DOB">
                        </div>
                        
                        <br /><br>
                        <div class="submit">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                 </div>
</form>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
        </div>
    </center>
</body>
</html>