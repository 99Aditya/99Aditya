<%@page import="com.od.model.CandidateDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.main2 {
	padding-top: 180px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
</head>
<body>
	<%
		HttpSession sess = request.getSession();
		CandidateDto cso = (CandidateDto) sess.getAttribute("det");
	%>
	<div class="main">
		<div class="main1">
			<jsp:include page="adminhome.jsp" />
		</div>
		<div class="main2">
			<center>
				<form action="">
					<table cellpadding="5" cellspacing="5" border="1">
						<tr>
							<td>User Id</td>
							<td>${det.userid}</td>
						</tr>
						<tr>
							<td>UserName</td>
							<td>${det.username}</td>
						</tr>
						<tr>
							<td>Date of Birth</td>
							<td>${det.dob}</td>
						</tr>
						<tr>
							<td>Email Id</td>
							<td>${det.email}</td>
						</tr>
						<tr>
							<td>Mobile Number</td>
							<td>${det.mnumber}</td>
						</tr>
						<tr>
							<td>Address</td>
							<td>${det.address}</td>
						</tr>
						<tr>
							<td>VoterId</td>
							<td>${det.voterid}</td>
						</tr>
						<tr>
							<td>Aadhar Number</td>
							<td>${det.aadhar}</td>
						</tr>
						<tr>
							<td>Gender</td>
							<td>${det.gender}</td>
						</tr>
						<tr>
							<td>Marital Status</td>
							<td>${det.marital}</td>
						</tr>
						<tr>
							<td>Education</td>
							<td>${det.education}</td>
						</tr>
						<tr>
							<td>Applied Position</td>
							<td>${det.position}</td>
						</tr>
						<tr>
							<td>Image</td>
							<td style='width: 150px; height: 125px;'><img
								src="${pageContext.servletContext.contextPath }/SingleCanidateDetail?image=${det.image}" /></td>
						</tr>

					</table>

				</form>
			</center>
		</div>
	</div>

</body>
</html>