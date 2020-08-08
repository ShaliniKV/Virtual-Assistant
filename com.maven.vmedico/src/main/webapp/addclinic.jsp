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
    <title>Add Clinic</title>
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
        <div class="addclinic">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <form class="addclinic-container" action="AddClinicDB" method="post">
                    <heading1><font color="black" face="Times New Roman" size="10">Clinic Details</font></heading1>
                    <p>Fill clinic details to here</p>
                    <div class="form" >
                    	<label for="InputName"></label>
                        <input type="text" name="name" class="form-control" id="InputName" placeholder="Name">
                        <label for="InputClinicName"></label>
                        <input type="text" name="clinicname" class="form-control" id="InputClinicName" placeholder="Clinic Name">
                        <label for="InputEmail"></label>
                        <input type="email"  name="email" class="form-control" id="InputEmail" placeholder="Email">
                        <label for="InputAddress"></label>
                        <textarea name="address" class="form-control"  placeholder="Address"></textarea>
                        <label for="InputMobile"></label>
                        <input type="tel" class="form-control" name="mobile" id="InputMobile" placeholder="Mobile">
                        <br />
                        <div class="submit">
                            <button type="submit" name="signup" class="btn btn-primary" >Save</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </center>
</body>
</html>