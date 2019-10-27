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
				<form action="registrazione" method="post">
						<img src="logoDent.png" width="10%"><br>
						<h1> Registrazione </h1>
					
						<table id="registrazione">
							<br/><br/>
							
							<tr>
								
								<td> Nome* <br> <input type="text" name="nome" required><br><br></td>
								<td> Cognome* <br> <input type="text" name="cognome" required><br><br></td>
								
							</tr>
							<tr>
								<td> Codice Fiscale* <br> <input type="text" name="cf" required><br><br></td>
								<td> Numero di Telefono <br> <input type="text" name="tel" required><br><br></td>
							</tr>
							<tr>
								<td> E-mail <br> <input type="mail" name="email" required><br><br></td>
								<td> Password* <br> <input type="text" name="password" required><br><br>
							</tr>
						</table>
		
						<br>
				  <input type="submit" class="pulsante" value="Registrati"/>

				</form>
			</center>


	</body>
	<%@include file="Footer.jsp" %>
	
</html>
