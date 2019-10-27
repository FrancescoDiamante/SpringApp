package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.domain.PersonaSpring;
import mvc.service.PersonaService;

@Controller
@RequestMapping("/registrazione")
public class RegistrazioneController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleGetRequest (Model model) {
		System.out.println("sono in registrazione con GET");
		return "Registrazione";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String handlePostRequest (@RequestParam String cf,
			 						 @RequestParam String nome,
			 						 @RequestParam String cognome,
			 						 @RequestParam String tel,
			 						 @RequestParam String email,
			 						 @RequestParam String password,
			 						 Model model) {
    	System.out.println("post"+cf);
    	
    	PersonaSpring p = personaService.getByCf(cf);
    	if(p == null)
    	{
    		System.out.println("p == NULL");
    		PersonaSpring persona = new PersonaSpring(nome, cognome, password, cf, email, tel);
    		System.out.println("prima di create()" +persona);
    		personaService.create(persona);
    		System.out.println("prima di addAttribute()");
        	model.addAttribute("persona", persona);
    		
        	System.out.println(persona.toString());
    	}
    	//System.out.println(p.toString());
    	
    	return "HomePage";
	}
}
