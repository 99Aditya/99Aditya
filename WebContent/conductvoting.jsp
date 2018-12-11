<%@page import="com.od.model.AddElectionDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link href="conductvoting.css" rel="stylesheet" type="text/css">
<link href="tablehover.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="main">
		<div class="main1">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div class="main2">
			<form method="get" action="" enctype="multipart/form-data">
				<table class="hoverTable" cellspacing="7" border="0">
					<tr>
						<th>Election for the Post</th>
						<th>Date of Election</th>
						<th>Date of Result</th>
						<th>Registration Start Date</th>
						<th>Registration Stop Date</th>
						<th>Candidate Details</th>
						<th>Start Election</th>
						<th>Stop Election</th>
						<th>Update Election</th>
					</tr>
					<c:forEach var="da" items="${data}">
						<tr>
							<td><c:out value="${da.position}" /></td>
							<td><c:out value="${da.dateofelection}" /></td>
							<td><c:out value="${da.dateofresult}" /></td>
							<td><c:out value="${da.registrationstartdate}" /></td>
							<td><c:out value="${da.registrationstopdate}" /></td>
							<td><a href=getcandidatelist?Applied=${da.tid}><input
									type="button" value="View Candidate"></a></td>
							<td><a href="startelect?position=${da.tid}"><input
									type="button" value="Start Election"></a></td>
							<td><a href=stopelection?stopid=${da.tid}><input
									type="button" value="Stop"></a></td>
							<td><input type="button" value="Update"></td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>