<!DOCTYPE html>
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
				
		<center>
			<form>
				<img src="logoDent.png" width="10%"><br><br>
				<h1> Implatologia Dentale </h1>
				<br>
				<br>
				<br>
				<br>
				<div class="colonnaInterna"> <img src ="impianto-dentale.jpg" width = "70%"></div>
				<p class= "colonnaInterna" align="justify"> <br><br>
					L&rsquo;implantologia &egrave; quella parte dell&rsquo;odontoiatria che prevede la sostituzione dei denti mancanti con radici artificiali inserite nell&rsquo;osso. Queste radici artificiali si chiamano impianti.
					Gli impianti possono rimpiazzare denti singoli (corona su impianto), pi&ugrave; denti (corone su impianti) oppure possono anche ancorare una dentiera. Grazie all&rsquo;utilizzo degli impianti si conserva l&rsquo;integrit&agrave;  dei denti naturali vicini agli spazi da riempire perch&egrave; la realizzazione delle corone su impianti di solito non prevede la limatura dei denti naturali.
				</p>
				
				<br><br><br>
						
				<h3>Da che cosa sono fatti gli impianti dentali?</h3>
						
				<p class= "colonnaInterna" align="justify">
					Nei giorni nostri gli impianti pi&ugrave; utilizzati a livello mondiale sono costituiti da titanio.
					Il titanio&egrave; un metallo bioinerte che a contatto con l&rsquo;osso non da alcuna reazione di &quot;rigetto&quot; perch&egrave; non presentando proteine non scatena alcuna reazione immunitaria inoltre il titanio non provoca neanche reazioni da corpi estranei perch&egrave; riesce a stabilire con il tessuto osseo una diretta connessione la cos&igrave; detta &quot;osteointegrazione&quot;.
				</p>
			</form>
		</center>		
	</body>
	<%@include file="Footer.jsp" %>	
	
</html>
