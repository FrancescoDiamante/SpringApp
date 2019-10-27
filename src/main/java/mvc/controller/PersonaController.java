package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mvc.domain.ClienteSpring;
import mvc.domain.PersonaSpring;
import mvc.repository.ClienteRepository;
import mvc.repository.PersonaRepository;

@RestController
@RequestMapping("/persone")
public class PersonaController {
	
	PersonaRepository personaRepository;
	
	@Autowired
	public PersonaController(PersonaRepository personaRepository){
		this.personaRepository = personaRepository;
	}

	@RequestMapping("/")
	public Iterable<PersonaSpring> list(){
		return personaRepository.findAll();
	}
	
	@RequestMapping("/{id}")
	public PersonaSpring read(@PathVariable(value="id") String id){
		return personaRepository.findOne(id);
	}
	
}
