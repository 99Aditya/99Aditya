<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Voting</title>
<link href="welcome.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="main">
	<marquee direction="right"  style=color:red;> Welcome to E-Voting System</marquee>
		<div id="heading">
			<div class="logo">
				<img src="evoting-logo.png" height=100px; width=450px align="left" />
			</div>
			<h1>Online Voting System</h1>
		</div>
		
		<div class="nav">
			<ul>
				<li><a href="welcome.jsp">Home</a></li>
				
				<li><a>Candidate</a>
					<ul>
					
						<li><a href="candidatelogin.jsp">Login </a></li>
					</ul></li>
				<li><a>Voters</a>
					<ul>
						<li><a href="VoterReg.jsp">Registration</a></li>
						<li><a href="voterlogin.jsp">Login</a></li>
					</ul></li>
				<li><a>Admin</a>
					<ul>
						<li><a href="adminreg.jsp">Registration</a></li>
						<li><a href="adminlogin.jsp">Login</a></li>

					</ul></li>
				
		</div>
	</div>
</body>
</html>