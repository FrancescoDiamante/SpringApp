package mvc.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class SegretariaSpring extends PersonaSpring{

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "lavora_per", 
		joinColumns = @JoinColumn(name = "pk_segretaria"), 
		inverseJoinColumns = @JoinColumn(name = "fk_dentista") )
	private List<DentistaSpring> listaDentisti = new ArrayList<DentistaSpring>();
	float salario = 0.0f;
	
	void chiSono() {
		System.out.println("Sono una segretaria");
	}
	
//	public SegretariaSpring (String nome, String cognome, String username, String password, String CF, String email) {
//		super(nome, cognome, username, password, CF, email);
//	}
	
	
	public SegretariaSpring() {
		
	}

//	ClienteSpring gestionAnagraficaCliente (ClienteSpring nuovoCliente) {
//		if (nuovoCliente.getCognome().equals("NN")) {
//			return null;
//		} else if (nuovoCliente.getNome().equals("NN")) {
//			return null;
//		}
//		
//		//insert database del cliente
//		System.out.println("cliente creato correttamente");
//		return nuovoCliente;
//	}	
//	
//	boolean gestionAnagraficaCliente (String nome, String cognome, String username, String password) {
//		
//		return false;
//	}
//	public boolean aggiungiPrenotazione(PrenotazioneSpring nuovaPrenotazione, ClienteSpring nuovoCliente) {
//		nuovoCliente.aggiungiPrenotazione(nuovaPrenotazione);
//		nuovaPrenotazione.setClientePrenotato(nuovoCliente);
//		this.aggiungiPrenotazione(nuovaPrenotazione);
//		return false;
//
//	}
	@Override
	public void setNome(String nome) {
		System.out.println("Sono il metoso setNome in segretaria");
		super.setNome(nome);
	}

	public ClienteSpring getCliente(String cognome) {
		ClienteSpring clienteEsistente=null;
		
		return clienteEsistente;
	}
	
	//metodo che aggiunge la prenotazione ad un cliente giÃ  esistente
	
//	public boolean aggiungiPrenotazione(PrenotazioneSpring nuovaPrenotazione) {
//		
//		//seleziono il coiente in base al cognome
//		ClienteSpring clienteTrovato = this.getCliente("Vano");
//		
//		if (nuovaPrenotazione.getDataPrenotazione().toString().length() != 10) {
//			return false;
//		}
//		else if (nuovaPrenotazione.getTipoProblema().equals("")) {
//			return false;
//		}
//			
//		if (nuovaPrenotazione instanceof PrenotazioneWebSpring)  {
//			System.out.println("sto registrando una prenotazione che arriva dal web.");
//			if (((PrenotazioneWebSpring) nuovaPrenotazione).getEmail().isEmpty()) {
//				
//				return false;
//			}
//		}
////		else if (nuovaPrenotazione instanceof PrenotazioneSmsSpring) {
////			System.out.println("sto registrando una prenotazione che arriva da sms.");
////			if (((PrenotazioneSmsSpring) nuovaPrenotazione).getNumeroTelefono().isEmpty()) {
////				return false;
////			}
////		}
//		
//		clienteTrovato.aggingiPrenotazioneCliente(nuovaPrenotazione);
//		
//		//aggiungo il cliente all'oggetto prenotazione
//		nuovaPrenotazione.setClientePrenotato(clienteTrovato);
//				
//		//insert db
//		System.out.println("prenotazione registrata ->" + nuovaPrenotazione);
//		
//		
//		
//		//aggiungo la prenotazione al calendario dello studio dentistico
//		CalendarioSpring.calendarioPrenotazioni.add(nuovaPrenotazione);
//		
//		return true;
//	}

//	@Override
//	public String toString() {
//		return "SegretariaSpring [salario=" + salario + ", nome=" + nome + ", cognome=" + cognome + ", username="
//				+ username + ", password=" + password + "]";
//	}

	//effettua la prenotazione, registrando un buovo cliente


//	public Segretaria(String nome, String cognome, String username, String password) {
//		super(nome, cognome, username, password);
//	}
	
	
}


