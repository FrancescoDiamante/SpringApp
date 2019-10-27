<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
	<head>
		<link href="HomeStyle.css" rel="stylesheet" type="text/css">
		<link href="header.css" rel="stylesheet" type="text/css">
		<link href="Footer.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	
	<body>
		<c:choose>
			<c:when test = "${persona == null}">
				<%@include file="header2.jsp" %>
			</c:when>
			<c:otherwise>
				<%@include file="header.jsp" %>			
			</c:otherwise>
		</c:choose>
		<section>
			<div class="slideshow-container">
				<div class="mySlides fade">
					<div class="numbertext">1 / 2</div>
					<img src="Immagine1.png" width="100%" height="300px"/>
				</div>

				<div class="mySlides fade">
					<div class="numbertext">2 / 2</div>
					<img src="Immagine2.png" width="100%" height="300px">
				</div>
				
				<div class="mySlides fade">
					<div class="numbertext">3 / 3</div>
					<img src="bona.png" width="100%" height="300px">
				</div>
			</div>
			
			<div id="dots" style="text-align:center">
				<span class="dot"></span> 
				<span class="dot"></span> 
				<span class="dot"></span> 
			</div>	
			
			<div id="slideCentrale">
				<h1>I NOSTRI SERVIZI</h1> 
				<center>
					<table width="80%" length="80%">
						<tr>
							<td width="20%">
								<center>
									<br/><br/>
									<img id="icona" src="calendar.png" width="20%"/>
									<br/>
								</center>
								<center>
									<br/>
										<button class="pulsante">Prenotazione Online</button>
								</center>						   
							</td>
              
							<td width="20%">
								<center>
									<br/><br/>
									<img src="dental-care.png" width="20%"/>
									<br/>
								</center>
								<center>
									<br/>
									<form action="igiene" method="get">
										<button class="pulsante">Igiene e Prevenzione</button>
									</form>
								</center>
							</td>
              
							<td width="20%">
								<center>
									<br/><br/>
									<img src="doctor.png" width="20%"/>
									<br/>
								</center>
								<center>
									<br/>
									<button class="pulsante">Equipe Medica</button>
								</center>
							</td>
						</tr>
          
						<tr>
							<td width="20%">
								<center>
									<br/><br/>
									<img src="implant.png" width="20%"/>
									<br/>
								</center>
								<center>
									<br/>
									<form action="implantologia" method="get">
										<button class="pulsante">Implantologia Dentale</button>
									</form>
								</center>
   							</td>
					           
							<td width="20%">
								<center>
									<br/><br/>
									<img src="medical-assistance.png" width="20%"/>
									<br/>
								</center>
								<center>
									<br/>
									<button class="pulsante">Titolo</button>
								</center>
							</td>
              
							<td width="20%">            
								<center>
									<br/><br/>
									<img src="teeth.png" width="20%"/>
									<br/>
								</center>
								<center>
									<br/>
									<button class="pulsante">Ortodonzia</button>
								</center>
							</td>
						</tr>
          
					</table>
				</center>
		  	</div>
        </section>
		
		<br/>

		<script>
		var slideIndex = 0;
		showSlides();

		function showSlides() {
		  var i;
		  var slides = document.getElementsByClassName("mySlides");
		  var dots = document.getElementsByClassName("dot");
		  for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none";  
		  }
		  slideIndex++;
		  if (slideIndex > slides.length) {slideIndex = 1}    
		  for (i = 0; i < dots.length; i++) {
			dots[i].className = dots[i].className.replace(" active", "");
		  }
		  slides[slideIndex-1].style.display = "block";  
		  dots[slideIndex-1].className += " active";
		  setTimeout(showSlides, 5000); // Change image every 5 seconds
		}
		</script>
		<%@include file="Footer.jsp" %>
		
	</body>

</html> 
