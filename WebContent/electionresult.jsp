<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link href="conductvoting.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div class="main">
		<div class="main1">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div class="main2">
			<form method="get" action="" enctype="multipart/form-data">
				<table class="hoverTable" cellspacing="5" border="0">
					<tr>

						<th>Candidate Name</th>

						<th>Election Result</th>
					</tr>
					<c:forEach var="da" items="${det}">
						<tr>
							<td><c:out value="${da.candidatename}" /></td>
							<td><c:out value="${da.electionid}" /></td>
							<%-- <td><a href="electionresult?Electionid=${da.tid}"><input
									type="button" value="Check Result"></a></td> --%>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>