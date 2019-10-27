package mvc.controller;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mvc.domain.ClienteSpring;
import mvc.domain.PersonaSpring;
import mvc.repository.ClienteRepository;
import mvc.service.ClienteServiceWithCrudRepository;
import mvc.service.PersonaService;

@RestController
@RequestMapping("/clienti")
@CrossOrigin(origins = "*")

public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	ClienteServiceWithCrudRepository clienteService;

	@Autowired
	public ClienteController(ClienteRepository authorRepository){
		this.clienteRepository = authorRepository;
	}

	@RequestMapping("/")
	public Iterable<ClienteSpring> list(){
		System.out.println("pecora");
		return clienteRepository.findAll();
	}
	
	@RequestMapping("/trovaPerMail")
	public ClienteSpring read(@RequestParam(value="email") String email){
		System.out.println("cane" + email);
		ClienteSpring cliente=null;
		System.out.println(clienteRepository.findAll());
		ArrayList<ClienteSpring> listaClienti = (ArrayList) clienteRepository.findAll();
		System.out.println(111);
		for (ClienteSpring clienteL: listaClienti) {
			System.out.println(1111);
			if(clienteL.getEmail().equals(email)) {
				cliente=clienteL;
			}
		}
		return cliente;
	}
	
	@RequestMapping(value="/registra/", consumes = "application/json", method=RequestMethod.POST)
	@ResponseBody
	public void register(@RequestBody ClienteSpring cliente) {
		System.out.println("ciao" + cliente.getCf());
//		ClienteSpring cliente=(ClienteSpring)persona;

//		cliente.setCf(cliente.getCf());
//		cliente.setCognome(cliente.getCognome());
//		cliente.setEmail(cliente.getEmail());
//		cliente.setNome(cliente.getNome());
//		cliente.setPassword(cliente.getPassword());
//		cliente.setTel(cliente.getTel());
//		cliente.setNumeroPrenotazioni(cliente.getNumeroPrenotazioni());
		clienteService.create(cliente);
	}
	
}
