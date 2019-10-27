package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Segretaria")
public class SegretariaController {

	@RequestMapping(method=RequestMethod.GET)
	public String handleGetRequest() {
		return "Segretaria";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String handlePostRequest(Model model) {
		model.addAttribute("cliente", null);
		return "InserimentoCliente";
	}
}
