<%@page import="com.od.model.VoterDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
			HttpSession hse = request.getSession();
			VoterDto vto = (VoterDto) hse.getAttribute("det");
	    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.cont{
	padding-top: 150px;
	padding-left: 380px;
	padding-right: 380px;
}
.hoverTable{
	width: 500px;
	border-collapse: collapse;
}

.hoverTable td {
	text-align: left;
	padding: 7px;
	border: #4e95f4 0px solid;
}
/* Define the default color for all the table rows */
.hoverTable tr {
	background: #D7EDE1;
}
/* Define the hover highlight color for the table row */
.hoverTable tr:hover {
	background-color: #ffff99;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
</head>
<body>
	
	<div class="main">
		<div class="header">
			<jsp:include page="adminhome.jsp"></jsp:include>
		</div>
		<div class="cont">
		
		<center>
		<h1>Voter Details</h1>
		<form action="">
			<table class="hoverTable" cellspacing="5" border="0">

				<tr>
					<td>User Id</td>
					<td>${det.userid}</td>
				</tr>
				<tr>
					<td>UserName</td>
					<td>${det.username}</td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td>${det.dob}</td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td>${det.email}</td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td>${det.mnumber}</td>
				</tr>
				<tr>
					<td>Address</td>
					<td>${det.address}</td>
				</tr>

				<tr>
					<td>Aadhar Number</td>
					<td>${det.aadhar}</td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>${det.gender}</td>
				</tr>
				<tr>
					<td>Marital Status</td>
					<td>${det.marital}</td>
				</tr>
				<tr>
					<td>Education</td>
					<td>${det.education}</td>
				</tr>
				<tr>
					<td>Image</td>
					<td style='width: 150px; height: 125px;'><img
						src="images/${det.image}" /></td>
				</tr>

			</table>
			<a href="acceptvot?userid=${det.userid}"><input type="button"
				value="Accept Request"></a> <a
				href="rejectvoter?userid=${det.userid}"><input type="button"
				value="Reject Request"></a><br>
			<br>
		</form>
	</center>
	</div>
	</div>
</body>
</html>