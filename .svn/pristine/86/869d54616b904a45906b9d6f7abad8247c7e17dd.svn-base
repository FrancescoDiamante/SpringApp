<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
	<head>
		<link href="header.css" rel="stylesheet" type="text/css">
		<link href="Footer.css" rel="stylesheet" type="text/css">
		<link href="SegretariaStyle.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body style="overflow:scroll;">
			<%@include file="header.jsp" %>
			
		
			<center>
				<form action="/InserimentoCliente" method="post" >
					<center>
						<img src="logoDent.png" width="10%">
						<h2> Inserisci un cliente </h2>
						<table>
							<tr>
								<td>Nome: </td>
								<td><input type="text" name="firstname" required></td>
							</tr>
							<tr>
								<td>Cognome: </td>
								<td><input type="text" name="lastname" required></td>
							</tr>
							<tr>
								<td>Email: </td>
								<td><input type="email" name="email" required></td>
							</tr>
							<tr>
								<td>Codice Fiscale: </td>
								<td><input type="text" name="cf" required></td>
							</tr>
						</table><br>
						<input type="submit" class="pulsante"value="Next" ><br><br>
						<c:if test = "${cliente.cf!=null}">
							<div class="alert" display="this.parentElement.style.display='none';">
							<span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
							<strong style="color: red;">ATTENZIONE!</strong> Il Codice Fiscale immesso non corrisponde con i restanti dati.
							</div>
						</c:if>
					</center>
				</form>
			</center>
			
		</div><br>
		<%@include file="Footer.jsp" %>
		
	</body>
</html>
