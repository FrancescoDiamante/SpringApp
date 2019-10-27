package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Offerte")
public class OfferteController {

	@RequestMapping(method=RequestMethod.GET)
	public String handleGetRequest() {
		return "Offerte";
	}
		

}

