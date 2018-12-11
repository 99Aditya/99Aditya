<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link rel="stylesheet" href="style1.css">
</head>
<body>
	<div class="loginbox">
		<img src="man-shape-freepik.png" class="user">
		<h2>Admin Login</h2>
		<form action="adminlogin" method="post">
			<p>User Name:</p>
			<input type="text" name="userid" placeholder="Enter VoterId">
			<p>Password:</p>
			<input type="password" name="password" placeholder="......">
			<input type="submit" value="Sign In"><br> <a href="#">Forget
				Password</a>
		</form>
	</div>
</body>
</html>