<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
	<head>

		<link href="HomeStyle.css" rel="stylesheet" type="text/css">
		<link href="header.css" rel="stylesheet" type="text/css">
		<link href="Footer.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

	</head>

	<body>
		<%@include file="header.jsp" %>
		
		<center>
			<form action="login" method="post">
				<img src="logoDent.png" width="10%">
				<h1> Accedi </h1>
				<table>
					<br>
					<tr>
						<td align="left">
							Codice Fiscale* <br/>
							<input type="text" name="cf" required/>
							<br/><br/>
						</td>
					</tr>
					<tr>
						<td align="left">
							Password* <br/>
							<input type="password" name="password" required/>
							<br/><br/>
						</td>
					</tr>
				</table>
				
				<br/>
				
				<button class="pulsante">Accedi</button>
				
				<br/><br/>
				
					
			</form>
				Se non sei registrato clicca <a href="${pageContext.request.contextPath}/registrazione">qui</a>

			<c:if test = "${personaTrovata!=null}">
				<c:if test = "${personaTrovata.password != password}">
					<div>*CodiceFiscale o Password errati</div>
				</c:if>
			</c:if>

		</center>

		<div class="colonna">
			<h2><center><!--colonnaDx--></center></h2>
			<p><!--...--></p>
		</div>
		
	</body>
	
	<%@include file="Footer.jsp" %>
	
</html>
