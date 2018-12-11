<jsp:include page="candidatehome.jsp" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<style type="text/css">
.idi {
	padding-top: 180px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="tablehover.css" rel="stylesheet" type="text/css">
<title>Online Voting</title>
</head>
<body>
	<div class="idi">
		<form method="get" action="verify" enctype="multipart/form-data">
			<table class="hoverTable" cellpadding="5" cellspacing="5" border="0">
				<tr>
					<th>User Id</th>
					<th>User Name</th>
					<th>Date of Birth</th>
					<th>Mobile Number</th>
					<th>Address</th>
					<th>Gender</th>
					<th>Marital Status</th>
					<th>Education</th>
					<th>Image</th>
					
				</tr>
				<c:forEach var="da" items="${data}">

					<tr>
						<td><c:out value="${da.userid}" /></td>
						<td><c:out value="${da.username}" /></td>
						<td><c:out value="${da.dob}" /></td>
						<td><c:out value="${da.address}" /></td>
						<td><c:out value="${da.voterid}" /></td>
						<td><c:out value="${da.gender}" /></td>
						<td><c:out value="${da.marital}" /></td>
						<td><c:out value="${da.education}" /></td>
						<td style='width: 150px; height: 125px;'><img
							src="images/${da.image}" /></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>
</body>
</html>