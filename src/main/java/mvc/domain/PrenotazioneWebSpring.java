package mvc.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity	
@Table(name="PrenotazioneWeb")

public class PrenotazioneWebSpring extends PrenotazioneSpring{
	
	@Column 
	private String email;

	public PrenotazioneWebSpring(String dataPrenotazione, String tipoProblema, String email) {
		super(dataPrenotazione, tipoProblema);
		this.email= email;
	}
	public PrenotazioneWebSpring() {
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PrenotazioneWebSpring [email=" + email + ", id=" + id + ", dataPrenotazione=" + dataPrenotazione
				+ ", tipoProblema=" + tipoProblema + ", orarioScelta=" + orarioScelta + ", note=" + note
				+ "]";
	}

	
	
}


