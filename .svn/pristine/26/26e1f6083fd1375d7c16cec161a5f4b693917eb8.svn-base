package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/chisiamo")
public class ChiSiamoController {

    @RequestMapping(method = RequestMethod.GET)
    public String handleGetRequest (Model model) {
    	System.out.println("sono in chi siamo con GET");
    	return "chi siamo";
    }
    
	
}
