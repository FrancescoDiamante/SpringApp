package mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import mvc.domain.ClienteSpring;
import mvc.domain.DentistaSpring;

@Repository
public interface DentistaRepository extends CrudRepository<DentistaSpring, String> ,PagingAndSortingRepository<DentistaSpring, String>{
	DentistaSpring findByCf(String cf);
}
