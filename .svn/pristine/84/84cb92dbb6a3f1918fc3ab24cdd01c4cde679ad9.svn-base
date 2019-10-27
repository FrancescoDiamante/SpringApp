package mvc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mvc.domain.PrenotazioneSpring;

@Repository
public interface PrenotazioneSpringCrudRepository extends CrudRepository<PrenotazioneSpring , Long> {
	
	
	List<PrenotazioneSpring> findBydataPrenotazione(LocalDate data1);
	
//	List<PrenotazioneSpring> findAllByStartdataPrenotazioneLessThanEqualAndEnddataPrenotazioneGreaterThanEqual(LocalDate data2 , LocalDate data1);
//	
}
