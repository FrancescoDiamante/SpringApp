package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.domain.ClienteSpring;
import mvc.service.ClienteServiceWithCrudRepository;

@Controller
@RequestMapping("/Nuovo_cliente")
public class NuovoClienteController {
	ClienteSpring cliente=new ClienteSpring();
	@Autowired
	ClienteServiceWithCrudRepository clienteRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getHandleGetRequest() {
		System.out.println("ciao");
		return "NuovoCliente";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String getHandlePostRequest(@RequestParam String tel, @RequestParam String password, @RequestParam String firstname, @RequestParam String email, @RequestParam String lastname, @RequestParam String cf, Model model) {
		cliente.setCf(cf);
		cliente.setCognome(lastname);
		cliente.setNome(firstname);
		cliente.setEmail(email);
		cliente.setTel(tel);
		cliente.setPassword(password);
		clienteRepository.create(cliente);
		
		model.addAttribute("cliente", cliente);
		return "Gestione_prenotazione";
	}
}
