package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.service.ClienteServiceWithCrudRepository;

@Controller


public class SceltaServizioController {
	@Autowired
	ClienteServiceWithCrudRepository clienterepository;
	
	@RequestMapping(value="/sceltaServizio", method=RequestMethod.GET)
	public String handleGetRequest() {
		return "sceltaServizio";
	}
	
	@RequestMapping(value="/sceltaServizio",method=RequestMethod.POST)
	public String handlePostRequest(/*@RequestParam String nome, @RequestParam String cognome, @RequestParam String cf, @RequestParam String email, @RequestParam String telefono,*/ Model model) {
		/*ClienteSpring cliente=new ClienteSpring();
		cliente.setNome(nome);
		cliente.setCognome(cognome);
		cliente.setCf(cf);
		cliente.setEmail(email);
		cliente.setTel(telefono);
		
		clienterepository.update(cliente);*/
		return "sceltaServizio";
	}
	
	/*@RequestMapping(value="/SceltaDentista",method=RequestMethod.POST)
	public String handlePostRequest1(@RequestParam String nome, @RequestParam String cognome, @RequestParam String cf, @RequestParam String email, @RequestParam String telefono, Model model) {
		return "/sceltaServizio";
	}*/
}
