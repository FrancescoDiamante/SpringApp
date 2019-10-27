package mvc.controller;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mvc.domain.ClienteSpring;
import mvc.domain.DentistaSpring;
import mvc.domain.PrenotazioneSmsSpring;
import mvc.domain.PrenotazioneSpring;
import mvc.domain.PrenotazioneWebSpring;
import mvc.repository.ClienteRepository;
import mvc.repository.PrenotazioneSmsRepository;
import mvc.repository.PrenotazioneWebRepository;
import mvc.service.DentistaServiceWithCrudRepository;
import mvc.service.PrenotazioneSpringService;
import mvc.service.PrenotazioneWebServiceWithCrudRepository;

@RestController
@RequestMapping("/prenotazioneWeb")
@CrossOrigin(origins = "*")

public class PrenotazioneWebController {
	
	PrenotazioneWebRepository prenotazioneWebRepository;

	@Autowired
	PrenotazioneWebServiceWithCrudRepository prenotazioneService;
	@Autowired
	DentistaServiceWithCrudRepository dentistaService;
	@Autowired
	PrenotazioneSpringService p;

	
	@Autowired
	public PrenotazioneWebController(PrenotazioneWebRepository prenotazioneWebRepository){
		this.prenotazioneWebRepository = prenotazioneWebRepository;
	}

	@RequestMapping("/")
	public Iterable<PrenotazioneWebSpring> list(){
		return prenotazioneWebRepository.findAll();
	}
	
	@RequestMapping("/utente")
	public Iterable<PrenotazioneWebSpring> listPerCliente(@RequestParam(value="email")String email){
		ArrayList<PrenotazioneWebSpring> l= (ArrayList<PrenotazioneWebSpring>) prenotazioneWebRepository.findAll();
		ArrayList<PrenotazioneWebSpring> l1=new ArrayList();
		for(PrenotazioneWebSpring p:l) {
			if((p.getClientePrenotato().getEmail().equals(email))) //&& (p.getDataPrenotazione().after(Date.valueOf(LocalDate.now()))))
				l1.add(p);
		}
		return l1;
	}
	
	@RequestMapping(value = "/AnnullaPrenotazione", consumes = "application/json")
	public void annullaPrenotazione(@RequestBody Long id) {
		System.out.println("kjfd" + id);
	}
	
	@RequestMapping("/prenotazione")
	public PrenotazioneWebSpring read(@RequestParam(value="id") Long id){
		PrenotazioneWebSpring prenotazione = prenotazioneWebRepository.findOne(id);

		return prenotazione;
	}
	
	@RequestMapping(value="/registra/", consumes = "application/json")
	@ResponseBody
	public void register(@RequestBody PrenotazioneWebSpring prenotazione) {
		System.out.println(1);
		List<DentistaSpring> dentisti;
		DentistaSpring dentistaAssegnato=null;
		Boolean dentistaDisponibile=true;
		dentisti=(List<DentistaSpring>) dentistaService.getAllDentists();
		List<PrenotazioneWebSpring> prenotazioni=(List<PrenotazioneWebSpring>) prenotazioneWebRepository.findAll();
			for (DentistaSpring dentista: dentisti) {
				System.out.println(dentista.getNome());
				dentistaDisponibile=true;
				if(dentistaAssegnato==null) {
					
					for (PrenotazioneWebSpring pren: prenotazioni) {
						if (pren.getDentistaAssociato().getEmail().equals(dentista.getEmail())&&pren.getOrarioScelta().equals(prenotazione.getOrarioScelta())&&pren.getDataPrenotazione().equals(prenotazione.getDataPrenotazione())){
							dentistaDisponibile=false;
							System.out.println("ciao");
						}
						
					}
					if(dentistaDisponibile==true) {
						dentistaAssegnato=dentista;
					}
				}
			}
			if(dentistaAssegnato==null) {
				System.out.println("nessuno");
			}else {
				System.out.println(dentistaAssegnato.getNome());
				prenotazione.setDentistaAssociato(dentistaAssegnato);
				prenotazioneWebRepository.save(prenotazione);
			}
		}
}
