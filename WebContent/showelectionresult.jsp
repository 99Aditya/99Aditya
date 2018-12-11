<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<title>Online Voting</title>
<link href="showelectionresult.css" rel="stylesheet" type="text/css">
<body>

	<div class="noti">
		<div class="inc">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div class="form">
		<center>
			<div class="userform">
				
					<form action="" method="get">
						<table cellpadding="5" cellspacing="5" border="1">
							<tr>
								<th>Candidate Id</th>
								<th>Number of Vote</th>
							</tr>
							<c:forEach var="da" items="${det}">

								<tr>
									<td><c:out value="${da.userid}" /></td>
									<td><c:out value="${da.numberofvote}" /></td>

								</tr>
							</c:forEach>
						</table>
					</form>
				
			</div>
			</center>
		</div>
	</div>
</body>
</html>