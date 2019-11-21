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
		
		String v1 = config.getVar1();
		String v2 = config.getVar2();
		String v3 = config.getVar3();
		
		mav.addObject("queryProposalHeaderForAdv",queryProposalHeaderForAdv);
		mav.addObject("queryProposalHeaderForRm", queryProposalHeaderForRm);
		mav.addObject("v1", v1);
		mav.addObject("v2", v2);
		mav.addObject("v3", v3);
		
		return mav;
	}

}
