package mvc.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="PrenotazioneSms")

public class PrenotazioneSmsSpring extends PrenotazioneSpring {
	@Column
	String numeroTelefono;
	
	public PrenotazioneSmsSpring(String dataPrenotazione, String tipoProblema, String telefono) {
		super(dataPrenotazione, tipoProblema);
		this.numeroTelefono = telefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	@Override
	public String toString() {
		return super.toString() + "PrenotazioneSms [numeroTelefono=" + numeroTelefono + "]";
	}

	

}
