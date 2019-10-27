package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.domain.PrenotazioneSmsSpring;
import mvc.repository.PrenotazioneSmsRepository;

@Service
public class PrenotazioneSmsServiceWithRepository {
	
	
   private PrenotazioneSmsRepository prenotazionesmsRepository;
	
	public PrenotazioneSmsRepository getPrenotazioneRepository() {
		return prenotazionesmsRepository;
	}


	@Autowired
	public PrenotazioneSmsServiceWithRepository(PrenotazioneSmsRepository prenotazionesmsRepository){
		this.prenotazionesmsRepository = prenotazionesmsRepository;
	}

	
	public PrenotazioneSmsSpring create(PrenotazioneSmsSpring prenotazionesms){
		return  prenotazionesmsRepository.save(prenotazionesms);
	
	}
	
	
}
