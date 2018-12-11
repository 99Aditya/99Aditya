<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.slider {
	padding-top: 170px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Voting</title>
</head>
<body>
	<div class="main">
		<div class="mainpage">
			<jsp:include page="candidatehome.jsp" />
		</div>
		<div class="slider">
			<div class="w3-content w3-section" style="max-width: 1500px; max-height: 500px" >
				<img class="mySlides w3-animate-fading" src="election.png" height="500px";
					style="width: 100%;"> <img class="mySlides w3-animate-fading"
					src="voting.jpg" style="width: 100%; height: 500px "> <img
					class="mySlides w3-animate-fading" src="f24_supp_vote.png"
					style="width: 100%; height: 100%"> <img class="mySlides w3-animate-fading"
					src="simply-voting-logo-blog.png" style="width: 100%; height: 500px">
			</div>
		</div>
	</div>
	<script>
		var myIndex = 0;
		carousel();
		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 9000);
		}
	</script>
</body>
</html>