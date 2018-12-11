<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.main2 {
	padding-top: 230px;
	padding-left: 150px;
	padding-right: 150px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link href="tablehover.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="main">
		<div class="main1">
			<jsp:include page="voterhomepage.jsp" />
		</div>
		<div class="main2">
			<form method="get" action="">
				<table class="hoverTable" cellpadding="5" cellspacing="5" border="0">
					<tr>

						<th>Election for the Post</th>
						<th>Date of Election</th>
						<th>Date of Result</th>

						<th>Click here to Vote</th>

					</tr>
					<c:forEach var="da" items="${det}">
						<tr>

							<td><c:out value="${da.position}" /></td>
							<td><c:out value="${da.dateofelection}" /></td>
							<td><c:out value="${da.dateofresult}" /></td>
							<td><a href=votingoption?tid=${da.tid}><input
									type="button" value="To Vote"></a></td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>