package mvc.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Dentista")
public class DentistaSpring extends PersonaSpring {
//	@ManyToMany(mappedBy = "listaDentisti", cascade = CascadeType.ALL)
//	private List<SegretariaSpring> listaSegretarie = new ArrayList<SegretariaSpring>();
	
	@OneToMany(mappedBy = "clientePrenotato", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<PrenotazioneSpring> listaPrenotazioni;
	
	public boolean aggiungiPrenotazione(PrenotazioneSpring prenotazione) {
		prenotazione.setTipoProblema("anamnesi");
		return false;
	}
	
	public DentistaSpring(String nome, String cognome, String username, String password, String CF, String email) {
		super(nome, cognome, username, password, CF, email);
		
	}
	
	public DentistaSpring() {}

//	@Override
//	public String toString() {
//		return "DentistaSpring [nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", password="
//				+ password + "]";
//	}
//






}
