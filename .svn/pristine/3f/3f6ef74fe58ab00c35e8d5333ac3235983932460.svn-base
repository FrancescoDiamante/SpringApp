<html>
<head>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="/profiloDottore.css">
	<link href="/header.css" rel="stylesheet" type="text/css">
	<link href="/Footer.css" rel="stylesheet" type="text/css">
</head>
<title>Studio Dentistico</title>
<body>
	<%@include file="/WEB-INF/views/header.jsp" %>
	<div>
		<nav>
			<jsp:include page="/WEB-INF/views/viewCalendario.jsp" >
			<jsp:param name="mese" value="${data1.getMonthValue()}"/>
			<jsp:param name="anno" value="${data1.getYear()}"/>
			<jsp:param name="giorno" value="${data1.getDayOfMonth()}"/>
			</jsp:include>
		</nav>
		<article>
			<c:if test="${data1.getYear() != null}">
				<div style="float: left; width: 15%;">
				<h3 style="width: 15%;">${data1.getDayOfMonth()}/${data1.getMonthValue()}/${data1.getYear()}</h3>
				</div>
			</c:if>
			<c:if test="${data2.getYear() != null}">
				<div style="float: left; width: 50%;">
				<h3>${data2.getDayOfMonth()}/${data2.getMonthValue()}/${data2.getYear()}</h3>
				</div>
			</c:if>
			<div style="float: right; width:35%;">Esegui ricerca da <form action="/dentista/dal_al" method="post" ><input type="date" name="data1"> al <input type="date" name="data2"> <input type="submit" value="Submit"></form></div>
			<br><br>
			<c:choose>
  				<c:when test="${lista1.isEmpty() != true}">
					<table>
						<tr>
							<th>Anagrafica Cliente</th>
							<th>Ora appuntamento</th>
							<th>Tipo intervento</th>
						</tr>
						<c:forEach items="${lista1}" var="element">
							<tr>
							<td>${element.getClientePrenotato().nome +  " " + element.getClientePrenotato().cognome}</td>
							<td>${element.orarioScelta}</td>
							<td>${element.tipoProblema}</td>
							</tr>
						</c:forEach>
					</table>
				</c:when>
				<c:otherwise>
					<h1>Nessuna Prenotazione!</h1>
				</c:otherwise>
			</c:choose>
		</article>
	</div>
	<%@include file="/WEB-INF/views/Footer.jsp" %>
	</body>
</html>
  