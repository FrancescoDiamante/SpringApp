package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.domain.DentistaSpring;
import mvc.repository.DentistaRepository;

@Service
public class DentistaServiceWithCrudRepository {

	private DentistaRepository dentistaRepository;

	@Autowired
	public DentistaServiceWithCrudRepository(DentistaRepository denstistaRepository)
	{
		this.dentistaRepository=denstistaRepository;
	}
	
	public DentistaSpring getDentistaByCF(String CF)
	{
		return  dentistaRepository.findByCf(CF);
	}
	
	public Iterable<DentistaSpring> getAllDentists() {
		return dentistaRepository.findAll();
	}
	
}
