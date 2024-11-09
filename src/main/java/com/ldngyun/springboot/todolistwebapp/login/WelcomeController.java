package com.ldngyun.springboot.todolistwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	// http://localhost:8080/login?name=lyun
	@RequestMapping(value="/",method = RequestMethod.GET) // get 방식
	public String welcomePage(ModelMap model) {
		model.put("name", "lyun");
		return"welcome";
	}
	
}
