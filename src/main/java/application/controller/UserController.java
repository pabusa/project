package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
//	@Autowired
//	private Config config;
//	
//	String name = config.getName();
	
	@GetMapping("/users")
	public String user(
			@RequestParam(name="name", required=false, defaultValue="Default Name") String name, 
			Model model) {
		model.addAttribute("name", name);
		return "users";
	}

}
