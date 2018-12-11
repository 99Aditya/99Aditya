<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
</head>
<link href="showelectionresult.css" rel="stylesheet" type="text/css">
<link href="tablehover.css" rel="stylesheet" type="text/css">
<body>
	<div class="noti">
		<div class="header">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div class="bod">
			<form method="get" action="" enctype="multipart/form-data">
				<table class="hoverTable" cellspacing="5" border="0">
					<tr>
						<th>Voter Id</th>
						<th>User Name</th>
						<th>Date of Birth</th>
						<th>Email Id</th>
						<th>Mobile Number</th>
						<th>Address</th>
						<th>Aadhar Number</th>
						<th>Gender</th>
						<th>Martial Status</th>
						<th>Education</th>
						<th>Image</th>
					</tr>
					<c:forEach var="da" items="${vdata}">

						<tr>
							<td><c:out value="${da.userid}" /></td>
							<td><c:out value="${da.username}" /></td>
							<td><c:out value="${da.dob}" /></td>
							<td><c:out value="${da.email}" /></td>
							<td><c:out value="${da.mnumber}" /></td>
							<td><c:out value="${da.address}" /></td>
							<td><c:out value="${da.aadhar}" /></td>
							<td><c:out value="${da.gender}" /></td>
							<td><c:out value="${da.marital}" /></td>
							<td><c:out value="${da.education}" /></td>
							<td><img src="images/${da.image}" width="100" height="100"></td>

						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>