<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="captcha.css">
</head>
<body>
	<form method="post">
		<table cellspacing="15">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Message</td>
				<td><textarea type="text" cols="25",rows="8" name="message"></textarea></td>
			</tr>
			
			<tr>
				<td>Are you Human?</td>
				<td><input type="text" name="code"></td>
			</tr>
		</table>
		<br>
		<img src="http://localhost:8080/com.medicaps.controller/Captchacreate"> 
		<br><br>
		<input type="submit" value="submit">
	</form>
	
	<br><br>
	
	<%
			String captcha=(String)session.getAttribute("captcha");
			String code=request.getParameter("code");
			
			if(captcha!=null && code!=null)
			{
				if(captcha.equals(code))
				{
					out.print("<p class='alert'>Correct</p>");
				}
				else
				{
					out.print("<p class='alert'>InCorrect</p>");
				}
			}
	%>
</body>
</html>