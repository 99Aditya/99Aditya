<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link rel="stylesheet" href="candidate.css">
</head>
<body>
		<div class="loginbox">
		<h1>Registration</h1>
		<form action="addadmin" method="post" enctype="multipart/form-data">
		<p>User Name:</p>
		<input type="text" name="username" placeholder="Enter User Name" maxlength="30">
		<p>Date of Birth:</p>
		<input type="date" name="dob">
		<p>Email Id:</p>
		<input type="email" name="email" placeholder="Enter Email">
		<p>Contact Number:</p>
		<input type="number" name="mnumber" placeholder="Enter Contact Number" maxlength="10">
		<p>User Id:</p>
		<input type="text" name="userid" placeholder="Enter User Id">
		<p>Password:</p>
		<input type="password" name="pass" placeholder="Enter Contact Number">
		<p>Designaton of the Admin:</p>
		<input type="text" name="designation" placeholder="Enter Designation">
		<p>Upload Image</p>
		  <input type="file" name="pic" accept="image/*">
		<input type="submit" value="Submit"><br>
		<a href="#">Forget Password</a>
		</form>	
	</div>
</body>
</html>