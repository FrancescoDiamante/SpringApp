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
@RequestMapping("/InserimentoCliente")


public class InserimentoClienteController {
	
	ClienteSpring cliente=new ClienteSpring();
	ClienteSpring clienteInserito;
	@Autowired
	ClienteServiceWithCrudRepository clienteRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getHandleGetRequest() {
		return "InserimentoCliente";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String getHandlePostRequest(@RequestParam String firstname, @RequestParam String email, @RequestParam String lastname, @RequestParam String cf, Model model) {
		cliente.setCf(cf);
		cliente.setCognome(lastname);
		cliente.setNome(firstname);
		cliente.setEmail(email);
		clienteInserito=clienteRepository.getClienteByCF(cf);
		if(clienteInserito!=null) {
			if((clienteInserito.getNome().equals(cliente.getNome()))&&(clienteInserito.getCognome().equals(cliente.getCognome()))&&(clienteInserito.getEmail().equals(cliente.getEmail())))
			{
				model.addAttribute("cliente", cliente);
				return "Gestione_prenotazione";
			}
			else {
				//model.addAttribute("cliente", cliente);
				return "InserimentoCliente";
			}
		}else {
			model.addAttribute("cliente", cliente);
			return "NuovoCliente";
		}
	}
}
