
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
<link rel="stylesheet" href="notifycandidate.css">
</head>
<body>
<div class="noti">
	<div class="inc">
		<jsp:include page="adminhome.jsp"/>  
	</div>
	<div class="form">
	<div class="userform">
	<form action="#" method="get">
		<p><c:forEach var="da" items="${data}">
		<a href="approve?userid=${da.userid}">Please click here to verify Candidate Application<c:out value="${da.userid}"/></a><br>
		</c:forEach></p>
	</form>
	</div>
	</div>
</div>
</body>
</html>