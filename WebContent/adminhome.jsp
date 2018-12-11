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
	<div class="main">
		<div id="heading">
			<div class="logo">
				<img src="evoting-logo.png" height=100px; width=450px align="left" />
			</div>
			<h1>Online Voting System</h1>
		</div>
		<div class="nav">
			<ul>
				<li><a href="home.jsp">Home</a></li>
				
				<li><a>Candidate</a>
					<ul>
						<li><a href="notification">Candidate Verification</a></li>
						<li><a href="viewallcandidate">Candidate Details</a></li>
					</ul></li>
				<li><a>Voters</a>
					<ul>
						<li><a href="notifyvoter">Voter Verification</a></li>
						<li><a href="viewallvoter">Voter Details</a></li>
					</ul></li>
				<li><a>Election</a>
					<ul>
						<li><a href="getelectiondetail">Add Election</a></li>
						<li><a href="addupcomingelect.jsp">Add Upcoming Election</a></li>

					</ul></li>
				<li><a>Result</a>
					<ul>
						<li><a href="electresu">Election Result</a></li>
						
					</ul></li>
				<li><a>&#8681;</a>
					<ul>
						<li><a href="CandidateReg.jsp">Candidate Registration</a></li>
						<li><a href="welcome.jsp">LogOut</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</body>
</html>