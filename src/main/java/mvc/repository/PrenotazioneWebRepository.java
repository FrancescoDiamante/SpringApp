package mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import mvc.domain.ClienteSpring;
import mvc.domain.PrenotazioneSpring;
import mvc.domain.PrenotazioneWebSpring;

@Repository
public interface PrenotazioneWebRepository extends CrudRepository<PrenotazioneWebSpring, Long> ,PagingAndSortingRepository<PrenotazioneWebSpring, Long>
{

}
