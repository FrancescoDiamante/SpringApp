package mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import mvc.domain.SegretariaSpring;

@Repository
public interface SegretariaRepository extends CrudRepository<SegretariaSpring, String> ,PagingAndSortingRepository<SegretariaSpring, String>
{	
//	SegretariaSpring save(SegretariaSpring segretaria);		
	SegretariaSpring findByCf(String cf);		

}
