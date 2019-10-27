package mvc.repository;

import org.springframework.stereotype.Repository;

import mvc.domain.ClienteSpring;
import mvc.domain.PersonaSpring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaSpring, String>,PagingAndSortingRepository<PersonaSpring, String>{
	PersonaSpring findByCf(String cf);
}
