<%@page language="java" import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing Labs</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body {
            background-color: #a1bf3f;
            font-family:'Times New Roman';
            padding-top: 100px;
            padding-right: 50px;
            padding-bottom: 50px;
            padding-left: 80px;
        }
        .btn-secondary dropdown-toggle{
        width:500px;
        }
        
    </style>
</head>
<body> 
<center>
	<form class="form-container" action="LabDetails" method="get">
	<h4><font face="Times New Roman" color="black">Select a testing lab from below given list</font></h4>
	<br>
	
	<%Iterator itr;
	 List data= (List)request.getAttribute("data");%>
	 <select class="btn btn-secondary dropdown-toggle" name="testinglabs">
	<option class="btn btn-secondary dropdown-toggle">Choose Testing Lab</option>
	<%for (itr=data.iterator(); itr.hasNext(); )
	{
	%>
			<option class="btn btn-secondary dropdown-toggle"><%=itr.next()%></option>
	<%}%>
	</select>
	
	<br><br>
	<div class="submit"><button type="submit" name="submit" class="btn btn-primary" >Next</button></div>

	</form>
</center>
</body>
</html>