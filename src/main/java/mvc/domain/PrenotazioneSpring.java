package mvc.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Entity	
@Table(name="Prenotazione")
@Inheritance
(strategy=InheritanceType.JOINED)
public abstract class PrenotazioneSpring {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	Long id;

	@Column(name="dataPrenotazione")
	String dataPrenotazione;
	@Column(name="tipoProblema")
	String tipoProblema;
	@Column(name="ora")
	String orarioScelta;
	@Column(name="note")
	String note;
	
	public String getOrarioScelta() {
		return orarioScelta;
	}
	public void setOrarioScelta(String orarioScelta) {
		this.orarioScelta = orarioScelta;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private ClienteSpring clientePrenotato;
	
//	@Autowired
	@ManyToOne
	@JoinColumn(name = "fk_dentista")
	DentistaSpring dentistaAssociato;
	
	public DentistaSpring getDentistaAssociato() {
		return dentistaAssociato;
	}
	public PrenotazioneSpring() {
		
	}
	
	public void setDentistaAssociato(DentistaSpring dentistaAssociato) {
		this.dentistaAssociato = dentistaAssociato;
	}
	public ClienteSpring getClientePrenotato() {
		return clientePrenotato;
	}
	public void setClientePrenotato(ClienteSpring clientePrenotato) {
		this.clientePrenotato = clientePrenotato;
		//System.out.println("Prenotazione assegnata al cliente ->" +clientePrenotato.getCognome());
	}
	public String getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(String dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public String getTipoProblema() {
		return tipoProblema;
	}
	public void setTipoProblema(String tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
	
	public PrenotazioneSpring(String dataPrenotazione, String tipoProblema) {
		super();
		this.dataPrenotazione = dataPrenotazione;
		this.tipoProblema = tipoProblema;
	}
//	@Override
//	public String toString() {
//		return "Prenotazione [dataPrenotazione=" + dataPrenotazione + ", tipoProblema=" + tipoProblema
//				+ ", clientePrenotato=" + clientePrenotato + "]";
//	}
//	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}


