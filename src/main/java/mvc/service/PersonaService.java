package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.domain.PersonaSpring;
import mvc.repository.PersonaRepository;

@Service
public class PersonaService {
	private PersonaRepository personaRepository;
	
	@Autowired
	public PersonaService(PersonaRepository personaRepository){
		this.personaRepository=personaRepository;
	}
	
	public PersonaSpring getByCf(String cf) {
		System.out.println(personaRepository.findByCf(cf));
		
		return personaRepository.findByCf(cf);
	}
	
	public PersonaSpring create(PersonaSpring persona) {
		return personaRepository.save(persona);
	}
	
	
	
}
