package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.service.PersonaService;

@Controller
@RequestMapping("/")
public class HomePageController {

    @Autowired
    private PersonaService personaService;
//    
//   @Autowired
//   User user;

    @RequestMapping(method = RequestMethod.GET)
    public String handleGetRequest (Model model) {
    	model.addAttribute("persona", null);
    	model.addAttribute("personaTrovata", "xxx");
    	System.out.println("sono qui");
    	return "HomePage";
    }
    
}