<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link rel="stylesheet" href="candidate1.css">
</head>
<body>
		<div class="loginbox">
		<h1>Registration</h1>
		<form action="Votefor" method="post" enctype="multipart/form-data">
		<p>User Name:</p>
		<input type="text" name="username" placeholder="Enter User Name" maxlength="30">
		<p>Date of Birth:</p>
		<input type="date" name="dob">
		<p>Email Id:</p>
		<input type="email" name="email" placeholder="Enter Email">
		<p>Contact Number:</p>
		<input type="number" name="mnumber" placeholder="Enter Contact Number" maxlength="10">
		<p>Address:</p>
		<textarea rows="4" cols="45" name="Address" placeholder="Enter Address"></textarea>
		<P>Ward No:</P>
		<textarea rows="4" cols="45" name="wardno" placeholder="Enter WardNo"></textarea>
		<p>Aadhar Number:</p>
		<input type="number" name="Aadhar" placeholder="Enter Aadhar Number">
		<div class="edu">
		<p>Education:</p>
		<select name="Education">
  			<option value="select">Select</option>
  			<option value="highersec">10th Passed</option>
  			<option value="sensec">12th Passed</option>
  			<option value="Graduate">Graduate</option>
  			<option value="pg">Post Graduate</option>
		</select>
		</div>
		<div class="gender">
		<p>Gender:</p>
			<select name="Gender">
    		<option value="select">Select</option>
    		<option value="male">Male</option>
    		<option value="Female">Female</option>
    		<option value="Transgender">Transgender</option>
  		</select>
  		</div>
  		<div class="marry">
  		<p>Marital Status</p>
  		<select name="Marital">
  			<option value="select">Select</option>
  			<option value="married">Married</option>
  			<option value="unmarried">Unmarried</option>
  		</select><br><br><br>
  		<p>Upload Image</p>
  		 <input type="file" name="image" accept="image/*">
  		</div>
  		
  		<input type="submit" value="submit">
		</form>	
	</div>
</body>
</html>