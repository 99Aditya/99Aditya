<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Voting</title>
<link href="adminpage.css" rel="stylesheet" type="text/css">
</head>
<body>
<%String s=(String)session.getAttribute("userid"); %>
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
				<!-- <li><a href="voter">Voter Detail</a>  -->
				<li><a href="welcome.jsp">LogOut</a></li>
			</ul>
		</div>
	</div>
</body>

</html>