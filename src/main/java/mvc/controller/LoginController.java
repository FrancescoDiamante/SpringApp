package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.domain.ClienteSpring;
import mvc.domain.DentistaSpring;
import mvc.domain.PersonaSpring;
import mvc.domain.SegretariaSpring;
import mvc.service.ClienteServiceWithCrudRepository;
import mvc.service.DentistaServiceWithCrudRepository;
import mvc.service.SegretariaServiceWithCrudRepository;

@Controller
@RequestMapping("/login")
public class LoginController {
	
//	@Autowired
//	private PersonaService personaService;
	@Autowired
	private ClienteServiceWithCrudRepository clienteService;
	@Autowired
	private DentistaServiceWithCrudRepository dentistaService;
	@Autowired
	private SegretariaServiceWithCrudRepository segretariaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleGetRequest (Model model) {
		System.out.println("sono in login con GET");
		return "Login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
    public String handlePostRequest (@RequestParam String cf,
									 @RequestParam String password, 
									 Model model) {
    	System.out.println(cf);
    	
    	//PersonaSpring p=personaService.getByCf(cf);
    	
    	ClienteSpring c = clienteService.getClienteByCF(cf);
    	SegretariaSpring s = segretariaService.getSegretariaByCF(cf);
    	DentistaSpring d = dentistaService.getDentistaByCF(cf);
    	
    	
    	if(c == null){
    		if(d == null) {
    			if(s == null) {
    	    		PersonaSpring p1=new PersonaSpring();
    				p1.setPassword("");
    	    		model.addAttribute("personaTrovata", p1);
    	    		return "Login";
    			}
    			else if(!s.getPassword().equals(password)) {
    				model.addAttribute("personaTrovata", s);
    				return "Login";
    			}
    			else {
    		    	System.out.println(s.toString());
    		    	model.addAttribute("persona", s);
    		    	return "Segretaria";
    			}
    		}
    		else if(!d.getPassword().equals(password)) {
				model.addAttribute("personaTrovata", d);
				return "Login";
    		}
    		else {
    			System.out.println(d.toString());
    			model.addAttribute("persona", d);
    			return "profiloDottore";
    		}	
    	}
		else if(!c.getPassword().equals(password)) {
			model.addAttribute("personaTrovata", c);
			return "Login";
		}
		else {
			System.out.println(c.toString());
			model.addAttribute("persona", c);
			return "profiloCliente";
		}	    		
    	
//    	if(p == null) {
//    		PersonaSpring p1=new PersonaSpring();
//    		p1.setPassword("");
//    		model.addAttribute("personaTrovata", p1);
//    		return "Login";
//    	}
//    	else if(p.getPassword()!=password){
//    		model.addAttribute("personaTrovata", p);
//    		return "Login";
//    	}
//        
//    	System.out.println(p.toString());
//    	model.addAttribute("persona", p);
//    	return "HomePage";

	}
}
