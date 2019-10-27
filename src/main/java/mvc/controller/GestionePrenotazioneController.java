package mvc.controller;

import java.time.LocalDate;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.domain.ClienteSpring;
import mvc.domain.PrenotazioneWebSpring;
import mvc.service.ClienteServiceWithCrudRepository;
import mvc.service.PrenotazioneWebServiceWithCrudRepository;

@Controller
@RequestMapping("/Gestione_prenotazione")

public class GestionePrenotazioneController {
	@Autowired
	PrenotazioneWebServiceWithCrudRepository prenotazioneWebRepository;
	@Autowired
	ClienteServiceWithCrudRepository clienteRepository;
	
	PrenotazioneWebSpring prenotazione=new PrenotazioneWebSpring();
	
	@RequestMapping(method=RequestMethod.GET)
	public String handleGetRequest() {
		return "Gestione_prenotazione";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String handlePostRequest(@RequestParam String cf, @RequestParam String ora, @RequestParam String data, @RequestParam String note, @RequestParam String problema, Model model)
	{
		prenotazione.setOrarioScelta(ora);
		
		prenotazione.setNote(note);
		prenotazione.setTipoProblema(problema);
		//prenotazione.setDataPrenotazione(LocalDate.parse(data));
		ClienteSpring clientePrenotato=clienteRepository.getClienteByCF(cf);
//----->DentistaSpring dentistaAssociato=dentistaRepository.getDentistaByName();
		prenotazione.setClientePrenotato(clientePrenotato);
		System.out.println(prenotazione);
		
		prenotazioneWebRepository.create(prenotazione);
		
		return "HomePage";
	}

//	@RequestMapping(method=RequestMethod.POST)
//	public String handlePostRequest()
}
