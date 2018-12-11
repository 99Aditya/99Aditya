
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="adminpage.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="main1">
		<div id="head">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div id="form">
			<div id="loginform">
				<form action="addelection" method="get">
				<p>Position of Election:</p>
				<input type="text" name="position" placeholder="Enter position Name"maxlength="30">
				<p>Required Qualification:</p>
				<input type="text" name="qualification">
				<p>Required Application:</p>
				<input type="text" name="application">
				<p>Election Date:</p>
				<input type="date" name="dateofelect">
				
				<p>Election Result Date:</p>
				<input type="date" name="dateofresult"><br><br>
				
				<p>Registration Start Date:</p>
				<input type="date" name="Registrationstartdate"><br><br>
				
				<p>Registration Stop Date:</p>
				<input type="date" name="Registrationstartdate"><br><br>
				<input type="submit" value="Submit"></a>
				</form>
			</div>

		</div>


	</div>
</body>
</html>