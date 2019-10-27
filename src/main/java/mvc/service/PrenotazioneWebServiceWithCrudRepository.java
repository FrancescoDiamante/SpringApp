package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.domain.PrenotazioneWebSpring;
import mvc.repository.PrenotazioneWebRepository;
@Service
public class PrenotazioneWebServiceWithCrudRepository {
	private PrenotazioneWebRepository prenotazioneRepository;
	
	public PrenotazioneWebRepository getPrenotazioneRepository() {
		return prenotazioneRepository;
	}


	public void setPrenotazioneRepository(PrenotazioneWebRepository prenotazioneRepository) {
		this.prenotazioneRepository = prenotazioneRepository;
	}


	@Autowired
	public PrenotazioneWebServiceWithCrudRepository(PrenotazioneWebRepository prenotazioneRepository){
		this.prenotazioneRepository = prenotazioneRepository;
	}

	
	public PrenotazioneWebSpring create(PrenotazioneWebSpring prenotazione){
		return  prenotazioneRepository.save(prenotazione);
	
	}
	
}
	
	
	
	

