package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
	
	@RequestMapping("")
	public ModelAndView home() {
		ModelAndView mdv = new ModelAndView("/home");
		return mdv;
	}
	

}