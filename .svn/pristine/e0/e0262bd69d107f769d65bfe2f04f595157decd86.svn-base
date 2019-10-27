<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="HandheldFriendly" content="true">
	<title>Profilo Cliente</title>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<link rel="stylesheet" type="text/css" href="clienteStyle.css" />
	<link href="header.css" rel="stylesheet" type="text/css">
	<link href="Footer.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<%@include file="header.jsp" %>

<!-- Begin Wrapper -->
<div id="wrapper">
</div>
</div>
  <!-- End Navigation -->
  <!-- Begin Left Column -->
  <aside id="leftcolumn">
  <FORM METHOD="POST" ACTION="http://example.com/something.php">
	<TABLE id="profile">
		<TR>
			<TH>Name</TH>
			<TD>
				<INPUT TYPE="TEXT" NAME="nome" value="Simone">
			</TD>
		</TR>
		<TR>
			<TH>Cognome</TH>
			<TD>
				<INPUT TYPE="TEXT" NAME="cognome" value="Soldo">
			</TD>
		</TR>
		<TR>
			<TH>Data di Nascita</TH>
			<TD><INPUT TYPE="TEXT" NAME="data_di_nascita" value="14/12/90">
			</TD>
				<TR>
			<TH>Username</TH>
			<TD>
				<INPUT TYPE="TEXT" NAME="username" value="Rasato">
			</TD>
		</TR>
		<TR>
			<TH>E-mail</TH>
			<TD><INPUT TYPE="TEXT" NAME="email" value="simone@libero.it"></TD>
		</TR>	<TR>
			<TH>Telefono</TH>
			<TD>
				<INPUT TYPE="TEXT" NAME="telefono" value="3331234567">
			</TD>
		</TR>
	</TABLE>
</FORM></aside>










<div id="content" style="overflow-x:auto";>

<p id="titleDentists">Scegli la data della tua prenotazione</p>
<br>
<table class="table-fill" action="/profiloCliente" method="get">
<thead>
<tr id= "table-fill-tr">
<th class="text-left">Data</th>
<th class="text-left">Ora</th>
</tr>
</thead>

<tbody  class="table-hover">
<tr id= "table-fill-tr">
<td class="text-left">18/12/2019</td>
<td class="text-left">16:50</td>
</tr>

<tr id= "table-fill-tr">
<td class="text-left">20/10/2019</td>
<td class="text-left">10:00</td>
</tr>

<tr id= "table-fill-tr">
<td class="text-left">1/02/2019</td>
<td class="text-left">12:30</td>
</tr>

<tr id= "table-fill-tr">
<td class="text-left">11/05/2019</td>
<td class="text-left">19:00</td>
</tr>

<tr id= "table-fill-tr">
<td class="text-left">6/05/2019</td>
<td class="text-left">16:00</td>
</tr>

</tbody>

</table>

 </div>
 <aside id="rightcolumn">
	<TABLE id="profile">

		
			<h4>1° Prenotazione</h4>
			<br>
			<p>Estrazione molare: 04/06/2019 - 12:00</p>
		     <br> <br>
	
			<h4>2° Prenotazione</h4>
			<br>
			<p>Dentiera: 01/06/2019 - 10:00</p>
		    <br> <br>
			
			<h4>3° Prenotazione</h4>
			<br>
			<p>Pulizia dentale: 25/05/2019 - 14:00</p>
			
	</TABLE>
	</aside>
	<!--------------------------------------------------------------->

 <script type="text/javascript">
    
 
	var elements= document.getElementsByTagName('td');
	for(var i=0; i<elements.length;i++)
	{
		(elements)[i].addEventListener("click", function(){
		
		window.location.href = "profiloCliente.html";
		confirm("Sei sicuro di prenotare per questa data " + this.innerHTML + "?");});

	}
  </script>	
  <%@include file="Footer.jsp" %>
   
</body>
</html>
