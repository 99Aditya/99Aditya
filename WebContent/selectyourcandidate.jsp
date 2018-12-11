<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.mainpage{
	padding-top: 230px;
	padding-left: 450px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>

</head>
<body>
<div class="main">
	<div class="header">
			<jsp:include page="voterhomepage.jsp" />
	</div>
	<div class="mainpage">
	
		<form name="form1" method="get" action="getvotingfromvoter">
			<table cellpadding="5" cellspacing="5" border="1">
				<tr>
					<th>Candidate Id</th>
					<th>Candidate Name</th>
					<th>Select anyone</th>
				</tr>
				<c:forEach var="da" items="${det}">

					<tr>
						<td><a href="getbyposition?userid=${da.userid}"><c:out
									value="${da.userid}" /></a></td>
						<td><c:out value="${da.username}" /></td>
						<td><input type="radio" name="candidateid"
							value="${da.userid}"><br></td>

					</tr>

				</c:forEach>

			</table>
			<input type="submit" value="Submit" onclick="alert(document.form1.candidateid.value)" ></a><br>
		</form>
	
	</div>
</div>
</body>
</html>