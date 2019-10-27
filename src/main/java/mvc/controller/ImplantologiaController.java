package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/implantologia")
public class ImplantologiaController {

	@RequestMapping(method = RequestMethod.GET)
	public String handleGetRequest(Model model) {
		System.out.println("sono in implantologia dentale con GET");
		return "implatologiadentale";
	}	
}
