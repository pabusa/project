package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import application.Config;

@Controller
public class MainController {
	@Autowired
	private Config config;
	
	@GetMapping("/")
	public ModelAndView dashboard() {
		ModelAndView mav = new ModelAndView ("index");
		
		String queryProposalHeaderForAdv = config.getQueryProposalHeaderForAdv();
		String queryProposalHeaderForRm = config.getQueryProposalHeaderForRm();
		
		mav.addObject("queryProposalHeaderForAdv",queryProposalHeaderForAdv);
		mav.addObject("queryProposalHeaderForRm", queryProposalHeaderForRm);
		
		return mav;
	}

}
