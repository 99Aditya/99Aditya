<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Online Voting</title>
<link href="" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
.mainfrom {
	padding-top: 200px;
	padding-left: 530px;
}

.part {
	width: 450px;
	height: 380px;
	box-sizing: border-box;
	background: #D7EDE1;	
}

.part p {
	
	margin-left: 60px;
	font-size: 20px;
}

.part input[type="Password"] {
	margin-left: 60px;
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 20px;
	color: #fff;
	font-size: 16px;
	width: 300px;
}

.part input[type="submit"] {
	border: none;
	outline: none;
	height: 30px;
	width: 90px;
	color: #fff;
	font-size: 16px;
	background: #ff267e;
	cursor: pointer;
	border-radius: 20px;
	margin-left: 170px;
	margin-top: 20px;
}

.part input[type="submit"]:hover {
	background: #efed40;
	color: #262626;
}
</style>
</head>
<body>
	<div class="cont">
		<div class="homescreen">
			<jsp:include page="voterhomepage.jsp"></jsp:include>
		</div>
		<div class="mainfrom">
			<div class="part">
				<form action="changgepass">
					<p>Enter Old Password</p>
					<input type="Password" name="oldpassword"
						placeholder="Enter Password Id" maxlength="10">
					<p>Enter New Password</p>
					<input type="Password" name="newpassword"
						placeholder="Enter Password Id" maxlength="10">
					<p>Confirm Password</p>
					<input type="Password" name="confirmpass"
						placeholder="Enter Password Id" maxlength="10"><br> <input
						type="submit" value="Submit">
				</form>
			</div>
		</div>
   </div>
</body>
</html>