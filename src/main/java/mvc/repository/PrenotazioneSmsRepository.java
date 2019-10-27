package mvc.repository;
import org.springframework.stereotype.Repository;

import mvc.domain.ClienteSpring;
import mvc.domain.PrenotazioneSmsSpring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;



@Repository
public interface PrenotazioneSmsRepository extends CrudRepository <PrenotazioneSmsSpring , Long>, PagingAndSortingRepository<PrenotazioneSmsSpring, Long> {

	
	
}
