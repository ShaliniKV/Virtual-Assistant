<%@page language="java" import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Advisor Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://smtpjs.com/v3/smtp.js"></script>
<script>
function sendEmail(){
Email.send({
    Host : "smtp.mailtrap.io",
    Username : "<Shalini KV>",
    Password : "<@Shalu25>",
    To : 'shalinikv20@gmail.com',
    From : "shalinikv20@gmail.com",
    Subject : "Test email",
    Body : "<html><h2>Header</h2><strong>Bold text</strong><br></br><em>Italic</em></html>"
})
}
</script>
    <style>
        body {
            background-color: #a1bf3f;
            font-family:'Times New Roman';
            padding-top: 100px;
            padding-right: 50px;
            padding-bottom: 50px;
            padding-left: 80px;
        }
        table,td {
        text-align:left;
        width:300px;
        height:30px;}
        
    </style>
</head>
<body> 
<center>
	<form class="form-container">
	<br>
	
	<%Iterator itr;
	List data= (List)request.getAttribute("data");%>
	 <table  class="advisor" name="advisordetails" cellspacing="10px" cellpadding="10px">
	<%for (itr=data.iterator(); itr.hasNext();)
	{
	%>
			<tr><td><font color="black" size="3"><%=itr.next()%></font></td><td><font color="black" size="3"><%=itr.next()%></font></td></tr>
	<%}%>
	</table>
	<br><br>
	<button type="submit" name="submit" class="btn btn-secondary" value="Send Email" onclick="sendEmail()">Send Email</button>
	</form>
</center>
</body>
</html>