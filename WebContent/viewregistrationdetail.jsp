<%@page import="com.od.model.AddElectionDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
.main2
{
	
	
	height: 100%;
	width: 78%;
	float: right;
	border: 0px solid blue;
	margin-top: -450px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link href="tablehover.css" rel="stylesheet" type="text/css">
<link href="HomeStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="main">
		<div id="head">
			<div id="lefthead">
				<img alt="" src="./img/evoting-logo.png"
					style="height: 93px; margin-top: 18px; margin-left: 90px;">
			</div>
			<center>
			<div id="righthead">
				<div style="margin-top: 25px; font-family: Trattatello, fantasy">
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #F36D20;">O</span><span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #000000; margin-left: 1px;">nline</span>
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #F36D20;">V</span><span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #000000; margin-left: 1px;">oting</span>
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #F36D20;">S</span>
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #000000; margin-left: -15px;">ystem</span>
				</div>
			</div>
			</center>
			<div id="button">
				<a href="candidatelogin.jsp"><input type="submit" name="login" value="login"
					style="float: right; margin-top: -44px; margin-right: 48px; height: 40px; width: 110px; border-radius: 20.55px; border: 1px solid #F36D20; font-size: 22px; color: #000000; font-family: Trattatello, fantasy; background: #ffffcc"></a>
							</div>
		</div>


		<div id="cont1">
			<div id="leftcont">
				<div style="font-size: 25px; margin-top: 10px; margin-left: 32px;">Online
					Voting System</div>
				<div style="width: 80%; margin-left: 25px;">
					<marquee direction="down"
						style="font-size: 18px; color: #141414; margin-left: 8px;">Online
						Voting System is a software that manages the voting of any
						Organization (e.g. Company, College, Community). It will have all
						basic modules and also make voting fully computerized which is
						very fast and efficient. Online Voting System is system which
						maintains records of that Organization people, Candidates and
						users. This system is developed for Online Voting which saves a
						lot of time. </marquee>

				</div>
			</div>
		</div>
			
		
		
		</div>
		<div class="main2">
			<form method="get" action="">
				<table class="hoverTable" cellspacing="5" border="1">
					<tr>

						<th>Election for the Post</th>
						<th>Date of Election</th>
						<th>Date of Result</th>
						<th>Registration Start Date</th>
						<th>Registration Stop Date</th>

						<th>Register for Election</th>
					</tr>
					<c:forEach var="da" items="${data}">
						<tr>
							<td><c:out value="${da.position}" /></td>
							<td><c:out value="${da.dateofelection}" /></td>
							<td><c:out value="${da.dateofresult}" /></td>
							<td><c:out value="${da.registrationstartdate}" /></td>
							<td><c:out value="${da.registrationstopdate}" /></td>
							<td><a href=forwordreg?electionid=${da.tid}><input
									type="button" value="Register Candidate"></a></td>

						</tr>
					</c:forEach>
				</table>
			</form>
		</div>

</body>
</html>