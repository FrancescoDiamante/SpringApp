package mvc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mvc.domain.PrenotazioneSpring;

@Service
public class PrenotazioneSpringService {
	
	PrenotazioneSpringCrudRepository prenotazioneSpringCrudRepository;
	
	@Autowired
	PrenotazioneSpringService(PrenotazioneSpringCrudRepository prenotazioneSpringCrudRepository){
		super();
		this.prenotazioneSpringCrudRepository= prenotazioneSpringCrudRepository;
		}
	
	public List<PrenotazioneSpring> findbydate(LocalDate data1){
		//return  prenotazioneSpringCrudRepository.findBydataPrenotazione(data1);
		System.out.println(prenotazioneSpringCrudRepository.findBydataPrenotazione(data1));
		return  prenotazioneSpringCrudRepository.findBydataPrenotazione(data1);
	}
//	public List<PrenotazioneSpring> findbydatetodate(LocalDate data2 , LocalDate data1){
//		return  prenotazioneSpringCrudRepository.findAllByStartdataPrenotazioneLessThanEqualAndEnddataPrenotazioneGreaterThanEqual(data1 , data2);
//	}
//	
}
