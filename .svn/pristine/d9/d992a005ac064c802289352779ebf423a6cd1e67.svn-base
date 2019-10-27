package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.domain.PersonaSpring;
import mvc.service.PersonaService;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleGetRequest () {
		System.out.println("sono in login con GET");
		return "Logout";
	}
	
	@RequestMapping(method = RequestMethod.POST)
    public String handlePostRequest (PersonaSpring persona, Model model) {
    	System.out.println(persona.getCf());
    	System.out.println(persona.getPassword());
    	
    	
    	personaService.getByCf(persona.getCf());
        
    	return "HomePage";
	}
}
