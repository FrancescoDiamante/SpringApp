package mvc.domain;
//package mvc;
//
//import java.util.ArrayList;
//import java.util.Date;
//
//
//public class CalendarioSpring {
//	public static ArrayList<PrenotazioneSpring> calendarioPrenotazioni = new ArrayList<>();
//	
//	public static boolean aggingiPrenotazione(PrenotazioneSpring nuovaPrenotazione) {
//		calendarioPrenotazioni.add(nuovaPrenotazione);
//		return true;
//	}
//	
//	public static void consultaCalendarioStudioDentistico() {
//		System.out.println("Prenotazioni dello Studio Dentistico alla data " + (new Date()));
//		for (PrenotazioneSpring p : calendarioPrenotazioni) {
//			System.out.println("Il cliente ");
//			System.out.println(p.getClientePrenotato().getCognome() +"-"+p.getClientePrenotato().getNome());
//			System.out.println("ha prenotato nel giorno " + p.getDataPrenotazione());
//			System.out.println("per il seguente problema "+p.getTipoProblema());
//		}
//	}
//	
////	public static void consultaCalendarioCliente(ClienteSpring Ivano) {
////		  for (PrenotazioneSpring p : calendarioPrenotazioni)
////		  {
////		   if(Ivano.equals(p.clientePrenotato))
////		   System.out.println(p);
////		  }
////	}
//	
//	public static void consultaCalendarioDentista(DentistaSpring dentista) 
//	{
//		for(PrenotazioneSpring indice : calendarioPrenotazioni)
//		{
//			if(dentista.getNome().equals(indice.dentistaAssociato.getNome()))
//				System.out.println(indice);
//
//		}
//	}
//	
//}



