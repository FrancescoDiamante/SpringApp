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
				<h1> Igiene e Prevenzione </h1>
				<br>
				<br>
				<div class="colonnaInterna"> <br><br><br><br><br> <img src ="igiene-orale.jpg" width = "70%"> <br><br><br><br> <img src = "igiene-bambini.jpg" width = "70%"></div><br><br>
				<div class= "colonnaInterna" align="left">
					
					<div align="center">
						<h2> IGIENE E PREVENZIONE </h2>
						<h3> La pulizia dei denti professionale </h3>
					</div>
					<br/><br/>
					<div align="justify">
						<p>
							<h3> - In cosa consiste l&rsquo;igiene dentale? </h3>
						</p>
						<p>
							L&rsquo;igiene dentale &egrave; quell&rsquo;insieme di pratiche, che permette una corretta e costante rimozione della placca batterica dalla superficie dentale, allo scopo di evitare l&rsquo;infiammazione gengivale, causata dai batteri presenti nella placca, che si deposita e accumula sui denti e nel cavo orale.
						</p>
						<p>
							La quotidiana pulizia domestica dei denti non basta infatti a eliminare in profondit&agrave; la placca e i batteri che si formano sulla superficie dentale, soprattutto sui lati interni e pi&ugrave; nascosti dei denti, e al limitare delle gengive. Per questo &egrave; necessario sottoporsi alle sedute di igiene dentale professionale, che consistono in un&rsquo;accurata e approfondita eliminazione di ogni residuo di placca e tartaro dalla superficie dei vostri denti.
						</p>
						
						<br/>
						
						<p>
							<h3> - La detartrasi: la pulizia dentale manuale e a ultrasuoni </h3>
						</p>
						<p>
							La detartrasi consiste nella rimozione di placca e tartaro da denti e gengive. Mentre nella pulizia dei denti domestica quotidiana, le manovre di pulizia si svolgono con l&rsquo;utilizzo di spazzolino manuale o elettrico, effettuando uno spazzolamento con movimenti decisi dalla gengiva verso il dente, e uno spazzolamento circolare sulla superficie masticante di tutti i denti, la rimozione del tartaro o detartrasi pu&ograve; essere invece effettuata solo in clinica dall&rsquo;igienista dentale, ovvero il professionista della pulizia dei denti.
						</p>
						<p>
							Durante la seduta di igiene professionale si effettua la rimozione del tartaro sotto- e sopra-gengivale con metodo manuale o a ultrasuoni, e successivamente si completa la pulizia dei denti con la lucidatura delle superfici dentali. La detartrasi sottogengivale &egrave; fondamentale per la rimozione dei residui pi&ugrave; sedimentati di placca e tartaro e per la conseguente prevenzione delle pericolose malattie parodontali.
						</p>	
						
						<br/>
						
						<p>
							<h3> - La pulizia dei denti per evitare la retrazione gengivale </h3>
						</p>
						<p>
							Una costante e curata ablazione del tartaro &egrave; un&rsquo;€™attivit&agrave; fondamentale per evitare l&rsquo;™insorgere di malattie parodontali e, oltre all&rsquo;€™igiene, comprende la possibilit&agrave; di effettuare test batteriologici e del DNA, con semplici e indolori esami di laboratorio su campione, effettuati direttamente nelle nostre cliniche, per accertare precisamente lo stato della salute gengivale e l&rsquo;€™eventuale predisposizione genetica all&rsquo;insorgere di patologie del parodonto di ogni singolo paziente.
						</p>
						<p>
							Una mancata o scorretta igiene dentale causa la retrazione gengivale e l€&rsquo;insorgenza delle malattie parodontali, spesso sottovalutate e invece particolarmente pericolose per la salute delle gengive, fino a comportare, nei peggiori casi di piorrea, una tale retrazione del tessuto gengivale, da causare la vera e propria perdita degli elementi dentali. L&rsquo;€™assenza di un&rsquo;adeguata igiene dentale rischia di indebolire gravemente la salute delle gengive, infiammando e gonfiando il tessuto gengivale, fino a comprometterlo in modo irreversibile.
						</p>
						
						<br/>
						
						<p>
							<h3> - Ogni quanto effettuare l&rsquo;igiene dentale </h3>
						</p>
						<p>
							L&rsquo;igiene dentale &egrave; una pratica della quale abbiamo bisogno tutti, a tutte le et&agrave;, quotidianamente e pi&ugrave; volte al giorno, dopo ogni pasto, a livello domestico.
						</p>
						<p>
							La seduta di igiene orale professionale &egrave; una profilassi invece cui sottoporsi con regolarit&agrave; costante, ma a intervalli di tempo variabile, a seconda delle specifiche condizioni di salute del paziente, date dalla qualit&agrave; e dall&rsquo;efficienza della pulizia dei denti domestica, dalla predisposizione genetica e dalla personale conformazione dei denti.
						</p>
						<p>
							La prevenzione &egrave; uno strumento molto utile per chi voglia prevenire patologie parodontali, conservare con la massima cura la salute del cavo orale, monitorandone lo stato batterico, e per chi ha o presume di avere in famiglia casi di predisposizione alle malattie gengivali.
						</p>
						
						<br>
						
						<p>
							<h3> - L&rsquo;igiene dentale per i bambini</h3>
						</p>
						<p>
							L&rsquo;igiene dentale rivolta ai bambini consiste principalmente nelle attivit&agrave; di prevenzione odontoiatrica, ovvero nell&rsquo;educazione e nella sensibilizzazione all&rsquo;igiene e alla pulizia dei denti.
						</p>
							I denti decidui dei pi&ugrave; piccoli vanno curati e conservati correttamente il pi&ugrave; a lungo possibile, insegnando ai bambini come lavarsi bene i denti e quanto sia importante farlo con costanza e attenzione, per crescere consapevoli del valore della salute del proprio sorriso.
						</p>
						
						<br/>
						
						<p>
							<h3> - I consigli per il mantenimento dell&rsquo;igiene dentale</h3>
						</p>
						<p>
							Dopo aver effettuato un trattamento di igiene dentale i consigli pi&ugrave; importanti che potete seguire sono:
							<ul type="square"><br/>
								<li >Svolgere regolarmente la personale igiene dentale domestica quotidiana dopo ogni pasto</li>
								<li>Pulire sempre i denti dopo il consumo di cibi e bevande come liquirizia, caff&egrave;, vino e t&egrave;</li>
								<li>Utilizzare un collutorio specifico, facendovi consigliare dal vostro igienista, per mantenere disinfettate le gengive</li>
							<br/></ul>
						</p>
						
						<br/>
						
						<p>
							<h3> - Nessun dolore</h3>
						</p>
						<p>
							Mai pi&ugrave; paura del dentista e delle cure dentali. Nelle nostre cliniche puoi scegliere di effettuare qualsiasi trattamento con l&rsquo;ausilio della sedazione analgesica cosciente, un metodo semplice, non invasivo e privo di effetti collaterali, che ti permette di affrontare qualsiasi seduta in totale tranquillit&agrave;.
						</p>
						<p>
							La sedazione cosciente consiste nella somministrazione di un farmaco analgesico tramite nebulizzazione intranasale e pu&ograve; essere utilizzata per sottoporsi a qualunque trattamento odontoiatrico, dall&rsquo;igiene, alle terapie canalari, dalla cura della carie agli interventi chirurgici.
						</p>
						<p>
					    	&Egrave; una tecnica diffusa e scientificamente riconosciuta, che riduce nel paziente la percezione del dolore e il livello ansioso, senza alcun effetto collaterale, lasciandolo cosciente e lucido. La sedazione analgesica cosciente &egrave; adatta a tutte le et&agrave; possono trarne beneficio anche i bambini. 
						</p>						
					</div>
				</div>
			</form>
		</center>
	</body>
		
	<%@include file="Footer.jsp" %>
		
</html>
