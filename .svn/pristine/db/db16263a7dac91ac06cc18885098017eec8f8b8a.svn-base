<%@page import="java.time.LocalDate" %>
<%@page import="java.time.YearMonth" %>
<html>
<head><link rel="stylesheet" href="/profiloDottore.css"></head>
	<div class="mese">      
				<ul>
					<% int anno = Integer.parseInt(request.getParameter("anno")); int mese = Integer.parseInt(request.getParameter("mese")); %>
					<%int prima = mese-1 ; int dopo = mese +1; %>
					<%int annodopo = anno ; int annoprima = anno; %>
					<%if(prima  < 1){ annodopo--; prima = 12;}%>
					<%if(dopo > 12){ annoprima++; dopo = 1;}%>
					<%YearMonth month = YearMonth.of(anno , mese);%>
					<a href="./visualizzagiorno?data1=<%=annodopo%>/<%=prima%>/1"><li class="prima">&#60;</li></a>
					<a href="./visualizzagiorno?data1=<%=annoprima%>/<%=dopo%>/1"><li class="dopo">&#62;</li></a>
					<li><%=month.getMonth().toString() %><br><span style="font-size:18px"><%=anno%></span></li>
					
				</ul>
			</div>
			<ul class="settimana">
				<li>Lu</li>
				<li>Ma</li>
				<li>Me</li>
				<li>Gi</li>
				<li>Ve</li>
				<li>Sa</li>
				<li>Do</li>
			</ul>
			<ul class="giorno">
			<%int start = month.atDay(1).getDayOfWeek().getValue();%>
			<% for(int x = 0; x < start-1 ; x+=1) { %>
				<li></li>
			<% } %>
			<%int daysInMonth = month.lengthOfMonth();%>
			<% for(int y = 1 ; y < daysInMonth+1 ; y+=1) { %>
				<% if (y== Integer.parseInt(request.getParameter("giorno"))) { %>
					<a href="/dentista/visualizzagiorno?data1=<%=anno%>/<%=mese%>/<%=y%>"><li><span class="attivo"><%=y%></span></li></a>
				<% } else {%>
					<a href="/dentista/visualizzagiorno?data1=<%=anno%>/<%=mese%>/<%=y%>"><li><%=y%></li></a>
				<% } %>
			<% } %>
			</ul>
</html>


