<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Online Voting</title>
<link href="adminpage.css" rel="stylesheet" type="text/css">
<style type="text/css">
.tab
{
	padding-top: 180px;
}
.hoverTable1 {
	width: 500px;
	border-collapse: collapse;
}

. hoverTable1 td {
	text-align: left;
	padding: 7px;
	border: #4e95f4 0px solid;
}
/* Define the default color for all the table rows */
.hoverTable1 tr {
	background: #D7EDE1;
}
/* Define the hover highlight color for the table row */
.hoverTable1 tr:hover {
	background-color: #ffff99;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>

</head>
<%String id=(String)session.getAttribute("userid"); %>
<body>
<div class="main">
		<div id="heading">
			<div class="logo">
				<img src="evoting-logo.png" height=100px; width=450px align="left" />
			</div>
			<h1>Online Voting System</h1>
		</div>
		<div class="nav">
			<ul>
				<li><a href="chome.jsp">Home</a></li>
				<li><a href="candidate">Update Detail</a></li>
				<li><a href="getcandtocnd">View Opponents</a></li>
				<li><a href="candidateresult">Check Results</a></li>
				<li><a href="voter">Voter Detail</a> 
				<li><a href="welcome.jsp">LogOut</a></li>
			</ul>
		</div>
	</div>

<div class="tab">
<center>
<form action="update">
<table class="hoverTable1" cellspacing="5" border="0">
		<tr>
			<td>User Id</td>
			<input type="hidden" name="userid" value="${det.userid}">
			<td> <input type="text" id="ui" name="userid" value="${det.userid}" placeholder="Enter User Name" maxlength="30" readonly="readonly"></td>
			  
		</tr>
		<tr>
			<td>UserName</td>
			<td><input type="text" id="un" name="username" value="${det.username}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
			
		</tr>
		<tr>
			<td>Date of Birth</td>
			<td><input type="text" id="do" name="dob" value="${det.dob}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
		</tr>
		<tr>
			<td>Email Id</td>
			<td><input type="text" id="em"  name="email" value="${det.email}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
		</tr>
		<tr>
			<td>Mobile Number</td>
			<td><input type="text" id="mn" name="mnumber" value="${det.mnumber}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
		</tr>
		<tr>
			<td>Address</td>
			<td><input type="text" id="ad" name="address" value="${det.address}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
			
		</tr>
	
		<tr>
			<td>Aadhar Number</td>
		<td>	<input type="text" id="an" name="aadhar" value="${det.aadhar}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
	
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" id="ge" name="gender" value="${det.gender}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>

		</tr>
			<tr>
			<td>Marital Status</td>
			<td><input type="text" id="ms" name="marital" value="${det.marital}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
		</tr>
			<tr>
			<td>Education</td>
		<td>	<input type="text" id="ed" name="education" value="${det.education}" placeholder="Enter User Name" maxlength="30" disabled="disabled"></td>
			
		</tr>
			
			
</table>
		<input type="button" id="ei" value="Edit Request" onclick="enableBtn()">
		<input type="submit" id="ud" value="Update Request" disabled="disabled"><br><br>
</form>
</center>
</div>
</body>
</html>
<script>
function enableBtn() {
    document.getElementById("un").disabled = false;
    document.getElementById("do").disabled = false;
    document.getElementById("em").disabled = false;
    document.getElementById("mn").disabled = false;
    document.getElementById("ad").disabled = false;
    document.getElementById("ge").disabled = false;
    document.getElementById("ms").disabled = false;
    document.getElementById("ed").disabled = false;
    document.getElementById("ei").disabled = true;
    document.getElementById("ud").disabled = false;
}

</script>