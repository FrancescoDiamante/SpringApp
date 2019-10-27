package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.domain.SegretariaSpring;
import mvc.repository.SegretariaRepository;

@Service
public class SegretariaServiceWithCrudRepository 
{
	private SegretariaRepository segretariaRepository;
	
	@Autowired
	public SegretariaServiceWithCrudRepository(SegretariaRepository segretariaRepository)
	{
		this.segretariaRepository=segretariaRepository;
	}

	public SegretariaSpring create(SegretariaSpring segretaria)
	{
		return  segretariaRepository.save(segretaria);
	}

	public SegretariaSpring getSegretariaByCF(String CF) {
		return segretariaRepository.findByCf(CF);
	}
}


