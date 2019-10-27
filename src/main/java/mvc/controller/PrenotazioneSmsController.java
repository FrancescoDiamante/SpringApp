package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mvc.domain.ClienteSpring;
import mvc.domain.PrenotazioneSmsSpring;
import mvc.repository.ClienteRepository;
import mvc.repository.PrenotazioneSmsRepository;

@RestController
@RequestMapping("/prenotazioneSms")
public class PrenotazioneSmsController {
	
	PrenotazioneSmsRepository prenotazioneSmsRepository;
	
	@Autowired
	public PrenotazioneSmsController(PrenotazioneSmsRepository prenotazioneSmsRepository){
		this.prenotazioneSmsRepository = prenotazioneSmsRepository;
	}

	@RequestMapping("/")
	public Iterable<PrenotazioneSmsSpring> list(){
		return prenotazioneSmsRepository.findAll();
	}
	
	@RequestMapping("/{id}")
	public PrenotazioneSmsSpring read(@PathVariable(value="id") Long id){
		return prenotazioneSmsRepository.findOne(id);
	}
	
}

