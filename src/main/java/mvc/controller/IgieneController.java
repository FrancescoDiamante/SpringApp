package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/igiene")
public class IgieneController {

	@RequestMapping(method = RequestMethod.GET)
	public String handleGetRequest(Model model) {
		System.out.println("sono in igiene con GET");
		return "Igiene";
	}
}
