package mvc.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.domain.PrenotazioneSpring;
import mvc.service.PrenotazioneSpringService;

@Controller
public class DentistaController {
	
	@Autowired
	PrenotazioneSpringService prenotazionespringservice;
	
	
	@RequestMapping({"/dentista/" , "dottore/index"})
	public String dentista(Model model) {

		
		LocalDate oggi = LocalDate.now(); 
		List<PrenotazioneSpring> lista1 =  prenotazionespringservice.findbydate(oggi);
		model.addAttribute("data1" , oggi);
		model.addAttribute("lista1", lista1);
		
		return "profiloDottore";
	}
	
	@RequestMapping(value = "/dentista/visualizzagiorno" , method = RequestMethod.GET)
	public String cerca(@RequestParam("data1") String datax , Model model) {

		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");
		LocalDate data1 = LocalDate.parse(datax, formatter);
		List<PrenotazioneSpring> lista1 =  prenotazionespringservice.findbydate(data1);
		model.addAttribute("data1" , data1);
		model.addAttribute("lista1", lista1);
		
		return "profiloDottore";
	}
	
	@RequestMapping(value = "/dentista/dal_al" , method = RequestMethod.POST)
	public String data_1_2(@RequestParam("data1") String datax , @RequestParam("data2") String datay , Model model) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate data1 = LocalDate.parse(datax, formatter);
		LocalDate data2 = LocalDate.parse(datay, formatter);
//		List<PrenotazioneSpring> lista1 =  prenotazionespringservice.findbydatetodate(data2, data1);
		model.addAttribute("data1" , data1);
		model.addAttribute("data2" , data2);
//		model.addAttribute("lista1", lista1);
//    	
		return "profiloDottore";
	}
	
}
