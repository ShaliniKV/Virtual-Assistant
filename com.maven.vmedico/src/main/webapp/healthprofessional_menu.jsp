<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
   	<meta charset="ISO-8859-1">
    <title>HealthProfessional_Menu</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            background-color: #a1bf3f;
            padding-top: 130px;
            padding-right: 50px;
            padding-bottom: 100px;
            padding-left: 80px;
        }

        .btn-secondary {
            width: 22%;
            padding: 10px 0px 10px;
        }

        div {
            padding: 5px 5px;
        }
    </style>
</head>
<body>
    <center>
        <div class="HealthProfessionalMenu">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <form class="form-container" action="HealthProfessionalMenu" method="post">
                    <heading1><font color="black" face="Times New Roman" size="20">VMedico</font></heading1>
                    <p>Get started!</p>
                    <br />
                    <div class="CallHistory">
                        <label for="CallHistory">
                            <button type="submit" name="menu" value="reminder" class="btn btn-secondary">Call History</button>
                        </label>
                    </div>
                    <div class="Profile">
                        <label for="profile">
                            <button type="submit" name="menu" value="profile" class="btn btn-secondary">View Profile</button>
                        </label>
                    </div>
                    <div class="LogOut">
                        <label for="LogOut">
                            <button type="submit" name="menu" value="logout" class="btn btn-secondary" onclick="location.href='login.jsp'">Log Out</button>
                        </label>
                    </div>
                </form>
            </div>
        </div>
    </center>
</body>
</html>