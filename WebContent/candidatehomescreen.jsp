<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="w3.css">
<title>Online Voting</title>
<link href="HomeStyle.css" rel="stylesheet" type="text/css">


</head>
<body>
	<div id="main">
		<div id="head">
			<div id="lefthead">
				<img alt="" src="./img/evoting-logo .png"
					style="height: 93px; margin-top: 18px; margin-left: 90px;">
			</div>
			<div id="righthead">
				<div style="margin-top: 25px; font-family: Trattatello, fantasy">
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #F36D20;">O</span><span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #000000; margin-left: 1px;">nline</span>
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #F36D20;">V</span><span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #000000; margin-left: 1px;">oting</span>
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #F36D20;">S</span>
					<span
						style="margin-top: 25px; margin-left: 25px; font-style: italic; font-weight: bold; color: #000000; margin-left: -15px;">ystem</span>
				</div>
			</div>

			<div id="button">
				<a href="candidatelogin.jsp"><input type="submit" name="login" value="login"
					style="float: right; margin-top: -44px; margin-right: 48px; height: 40px; width: 110px; border-radius: 20.55px; border: 1px solid #F36D20; font-size: 22px; color: #000000; font-family: Trattatello, fantasy; background: #ffffcc"></a>
				<a href="viewregistrationdetail"><input type="submit" name="Ragister" value="Ragister"
					style="float: right; margin-top: -44px; margin-right: 166px; height: 40px; width: 110px; border-radius: 20.55px; border: 1px solid #F36D20; font-size: 22px; color: #000000; font-family: Trattatello, fantasy; background: #ffffcc"></a>
			</div>
		</div>


		<div id="cont">
			<div id="leftcont">
				<div style="font-size: 25px; margin-top: 10px; margin-left: 32px;">Online
					Voting System</div>
				<div style="width: 80%; margin-left: 25px;">
					<marquee direction="down"
						style="font-size: 18px; color: #141414; margin-left: 8px; ">Online
						Voting System is a software that manages the voting of any
						Organization (e.g. Company, College, Community). It will have all
						basic modules and also make voting fully computerized which is
						very fast and efficient. Online Voting System is system which
						maintains records of that Organization people, Candidates and
						users. This system is developed for Online Voting which saves a
						lot of time. </marquee>

				</div>
			</div>
			<div id="centrecont">
				<div class="w3-content">
					<img class="mySlides" src="./img/02.jpg"
						style="width: 759px; height: 500px;"> <img class="mySlides"
						src="./img/03.jpg" style="width: 759px; height: 500px;"> <img
						class="mySlides" src="./img/04.jpg"
						style="width: 759px; height: 500px;"> <img class="mySlides"
						src="./img/05.png" style="width: 759px; height: 500px;"> <img
						class="mySlides" src="./img/01.png"
						style="width: 759px; height: 500px;"> <img class="mySlides"
						src="./img/06.png" style="width: 759px; height: 500px;"> <img
						class="mySlides" src="./img/09.png"
						style="width: 759px; height: 500px;">



				</div>

				<div class="w3-center">
					<div class="w3-section">
						<button class="w3-button w3-light-grey" onclick="plusDivs(-1)">❮
							Prev</button>
						<button class="w3-button w3-light-grey" onclick="plusDivs(1)">Next
							❯</button>
					</div>
					<!-- 					<button class="w3-button demo" onclick="currentDiv(1)">1</button> -->
					<!-- 					<button class="w3-button demo" onclick="currentDiv(2)">2</button> -->
					<!-- 					<button class="w3-button demo" onclick="currentDiv(3)">3</button> -->
					<!-- 					<button class="w3-button demo" onclick="currentDiv(4)">4</button> -->
					<!-- 					<button class="w3-button demo" onclick="currentDiv(5)">5</button> -->
					<!-- 					<button class="w3-button demo" onclick="currentDiv(6)">6</button> -->
					<!-- 					<button class="w3-button demo" onclick="currentDiv(7)">7</button> -->
				</div>

			</div>

			<div id="rightcont">

				<div id="top">
					<div style="margin-left: 8px;">Welcome to e-voting System</div>
				</div>

				<div style="margin-left: 10px; margin-top: 10px;">
					<img alt="" src="./img/e-voting.jpg"
						style="width: 91%; border-radius: 6px">
				</div>

				<div>
					<input type="button" name="contact Us" value="Contact Us"
						style="height: 73px; width: 228px; margin-top: 13px; margin-left: 10px; border-radius: 6px; background-color: white; font-size: 25px; color: #60A6DB;">
					<div
						style="height: 68px; width: 80px; float: right; margin-top: 13PX; margin-right: 10px;">
						<img alt="" src="./img/tw.png" style="height: 68px; width: 68px;">
					</div>
				</div>

				<div>
					<input type="button" name="FAQs" value="FAQs"
						style="height: 73px; width: 91%; margin-top: 13px; margin-left: 10px; border-radius: 6px; background-color: #60A6DB; color: #ffffff; font-size: 29px;">

				</div>
			</div>
		</div>


	</div>


	<script type="text/javascript">
		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function currentDiv(n) {
			showDivs(slideIndex = n);
		}

		function showDivs(n) {
			var i;
			var x = document.getElementsByClassName("mySlides");
			var dots = document.getElementsByClassName("demo");
			if (n > x.length) {
				slideIndex = 1
			}
			if (n < 1) {
				slideIndex = x.length
			}
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(" w3-red", "");
			}
			x[slideIndex - 1].style.display = "block";
			
			dots[slideIndex - 1].className += " w3-red";
		}
	</script>

</body>
</html>