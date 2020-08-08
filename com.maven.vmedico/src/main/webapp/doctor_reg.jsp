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
    <title>Reg_Doctor</title>
    <style>
        body {
            background-color: #a1bf3f;
            padding-top: 20px;
            padding-right: 50px;
            padding-bottom: 50px;
            padding-left: 80px;
        }
    </style>
</head>
<body>
<center>
    <div class="register_Dr">
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
        <div class="col-md-4 col-sm-4 col-xs-12">
            <form class="form-container" action="DoctorRegDB" method="post">
                <heading1><font color="black" face="Times New Roman" size="15">Registration Form</font></heading1>
                <p>Please fill this form to create an account</p>
                <div class="form-group">
                    <label for="InputName"></label>
                    <input type="text" name="name" class="form-control" id="InputName" placeholder="Name">
                    <label for="InputHospitalName"></label>
                    <input type="text" name="hospital_name" class="form-control" id="InputHospitalName" placeholder="Hospital Name">
                    <label for="InputEmail"></label>
                    <input type="email" name="email" class="form-control" id="InputEmail" placeholder="Email">
                    <label for="InputAddress"></label>
                    <textarea name="address" class="form-control" placeholder="Address"></textarea>
                    <label for="InputCity"></label>
                    <input type="text" name="city" class="form-control" id="InputCity" placeholder="City">
                    <label for="InputMobile"></label>
                    <input type="tel" name="mobile" class="form-control" id="InputMobile" placeholder="Mobile">
                    <br />
                    </div>
                    <label> Choose your speciality from the list</label>
                    <select class="btn btn-secondary dropdown-toggle" name="speciality">
                    <option  class="btn btn-secondary dropdown-toggle">Choose Specilaity</option>
                    <option  class="btn btn-secondary dropdown-toggle">Bones & Joints</option>
                    <option  class="btn btn-secondary dropdown-toggle">Child Specialist</option>
                    <option  class="btn btn-secondary dropdown-toggle">Dental Care</option>
                    <option  class="btn btn-secondary dropdown-toggle">Dermatologist</option>
                    <option  class="btn btn-secondary dropdown-toggle">Diabetes</option>
                    <option  class="btn btn-secondary dropdown-toggle">Ear Nose Throat</option>
                    <option  class="btn btn-secondary dropdown-toggle">Eye Specialist</option>
                    <option  class="btn btn-secondary dropdown-toggle">General Physician</option>
                    <option  class="btn btn-secondary dropdown-toggle">Skin & Hair</option>
                    <option  class="btn btn-secondary dropdown-toggle">Women Health</option>
                    </select>
                    <div class="number">
                        <label for="InputExperience"></label>
                        <input type="number" name="experience" class="form-control" id="InputExperience" placeholder="Experience">
                    </div>
                    <br>
                    <label> Add Clinic (if any)</label>
					<select class="btn btn-secondary dropdown-toggle">
    				<option class="btn btn-secondary dropdown-toggle">Yes</option>
    				<option class="btn btn-secondary dropdown-toggle">No</option>
    				</select>
    				<br><br>
                	<div class="submit">
                    <button type="submit" name="submit" class="btn btn-primary">Submit</button>
                	</div>
            </form>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
    </div>
    </center>
</body>
</html>
