package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mvc.domain.ClienteSpring;
import mvc.domain.DentistaSpring;
import mvc.repository.ClienteRepository;
import mvc.repository.DentistaRepository;

@RestController
@RequestMapping("/dentisti")
public class DentistaControllerREST {
	
	DentistaRepository dentistaRepository;
	
	@Autowired
	public DentistaControllerREST(DentistaRepository dentistaRepository){
		this.dentistaRepository = dentistaRepository;
	}

	@RequestMapping("/")
	public Iterable<DentistaSpring> list(){
		return dentistaRepository.findAll();
	}
	
	@RequestMapping("/{id}")
	public DentistaSpring read(@PathVariable(value="id") String id){
		return dentistaRepository.findOne(id);
	}
	
}
