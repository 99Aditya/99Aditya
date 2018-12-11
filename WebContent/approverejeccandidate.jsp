<jsp:include page="adminhome.jsp" /> 
<%@page import="com.od.model.CandidateDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.tab
{
	padding-top: 180px;
}
.hoverTable1 {
	width: 500px;
	border-collapse: collapse;
}

.hoverTable1 td {
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

<body>
<%
HttpSession sess=request.getSession();
CandidateDto cso=(CandidateDto)sess.getAttribute("det");
%>
<div class="tab">
<center>
<form action="">
<table class="hoverTable1" cellspacing="5" border="0">
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
			<td>VoterId</td>
			<td>${det.voterid}</td>
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
			<td style='width:150px; height:125px;'><img src="${pageContext.servletContext.contextPath }/SingleCanidateDetail?image=${det.image}"/></td>
		</tr>	
</table>
		<a href="accept?userid=${det.userid}"><input type="button" value="Accept Request"></a>
		<a href="reject?userid=${det.userid}"><input type="button" value="Reject Request"></a><br><br>
</form>
</center>
</div>
</body>
</html>