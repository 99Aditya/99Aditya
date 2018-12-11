<%@page import="com.od.model.CandidateDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.userform {
	padding-top: 280px;
}

.hoverTable {
	width: 500px;
	border-collapse: collapse;
}

.hoverTable td {
	padding: 7px;
	border: #4e95f4 0px solid;
}
/* Define the default color for all the table rows */
.hoverTable tr {
	background: #b8d1dc;
}
/* Define the hover highlight color for the table row */
.hoverTable tr:hover {
	background-color: #ffff99;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
</head>
<body>

	<div class="noti">
		<div class="inc">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div class="form">
			<div class="userform">
				<center>
					<form action="" method="get">
						<table class="hoverTable" cellpadding="5" cellspacing="5"
							border="0">
							<tr>
								<th>Candidate Id</th>
								<th>User Name</th>
							</tr>
							<c:forEach var="da" items="${det}">

								<tr>
									<td><a href=getbyposition?userid=${da.userid}><c:out
												value="${da.userid}" /></a></td>
									<td><c:out value="${da.username}" /></td>

								</tr>
							</c:forEach>
						</table>
					</form>
				</center>
			</div>
		</div>
	</div>

</body>
</html>