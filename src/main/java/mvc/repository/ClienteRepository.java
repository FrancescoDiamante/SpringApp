package mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mvc.domain.ClienteSpring;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteSpring,String>,PagingAndSortingRepository<ClienteSpring, String>
{	
	//ClienteSpring save(ClienteSpring cliente);	
	
	//ClienteSpring update(ClienteSpring cliente);

}
