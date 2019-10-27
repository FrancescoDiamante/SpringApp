<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<title>GestionePrenotazione</title>
		<link href="header.css" rel="stylesheet" type="text/css">
		<link href="Footer.css" rel="stylesheet" type="text/css">
		<link href="GestionePrenotazione.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		
	</head>

	<body>
		<%@include file="header.jsp" %>
		
		
		<script type="text/javascript">
			<!--
				numeroBlocchi=0;
				function sblocca() {
						if((numeroBlocchi%2)==0){
							document.getElementById("nome").disabled = false;
							document.getElementById("cognome").disabled = false;
							document.getElementById("email").disabled = false;
							document.getElementById("cf").disabled = false;
						}else{
							document.getElementById("nome").disabled = true;
							document.getElementById("cognome").disabled = true;
							document.getElementById("email").disabled = true;
							document.getElementById("cf").disabled = true;
						}
						numeroBlocchi=numeroBlocchi+1;
				}
			-->
		</script>
		

		<div name="row" class="row">
			<div name="div1" class="colonna">
				<center>
					<h2> Anagrafica Cliente	
						<label class="switch">
							<input type="checkbox" id="check" onclick="sblocca();">
							<span class="slider round"> </span>
						</label>
					</h2>
					<br>

					<!-- <form name="form" action="/Gestione_prenotazione" method="post" >-->
					<form name="form">
						Nome : <br><input type="text" value="${cliente.nome}" id="nome" disabled><br>
						Cognome : <br><input type="text" value="${cliente.cognome}" id="cognome" disabled><br>
						Email : <br><input type="email" value="${cliente.email}" id="email" disabled><br>
						Codice Fiscale : <br><input type="text" value="${cliente.cf}" id="cf" disabled><br><br>
						<input type="submit" class="pulsante" value="Salva"><br>
					</form>
				</center>
			</div>

			<div class="colonna1">
				<center>
					<h2>Effettua una prenotazione</h2>
					<form name="form1" action="/Gestione_prenotazione" method="post" >
					  <input type="hidden" name="cf" value="${cliente.cf}"/> 
						<table>
							<tr>
								<td>Dentista : </td>     

								<td><select id="dentisti" name="Dentisti">
									<option value="1d">Ivano Vano</option>
									<option value="2d">Francesco Diamante</option>
								 </select></td>
							</tr>
							<tr>
								<td>Data : </td>  
						     	<td><input type="date" name="data"></td>
							</tr>
							<tr>
								<td>Orario : </td>  
							   <td><select id="ora" name="ora">
										<option value="15:00-16:00">15:00 - 16:00</option>
										<option value="16:00-17:00">16:00 - 17:00</option>
									 </select></td>
							</tr>
							<tr>
								<td>Tipo problema : </td>
								<td><input type="text" name="problema"></td>
							</tr>
							<tr>
								<td class="tooltip">Note* : 
								<span class="tooltiptext">Inserire qui eventuali allergie o informazioni utili per gli interventi</span></td>  
						      <td><textarea name="note" rows="4" cols="40"></textarea></td>
							</tr>
						
							<!--<div class="colonnaInterna">
								<select name="Dentisti">
									<option value="1d">Ivano Vano</option>
									<option value="2d">Francesco Diamante</option>
								</select><br><br>
								<input type="date" id="data"><br><br>
								<select name="ora">
									<option value="1">15:00 - 16:00</option>
									<option value="2">16:00 - 17:00</option>
								</select><br><br>
								<input type="text" id="problema"><br><br>
								<input type="textarea"><br><br>
							</div>-->

						</table>
						<br>
						<input type="submit" class="pulsante" value="Prenota" ><br>
				</form>
				</center>
			</div>
			

			<div class="colonna">
				<h2></h2>
			</div>
		</div>
		<%@include file="Footer.jsp" %>
		
	</body>

</html>