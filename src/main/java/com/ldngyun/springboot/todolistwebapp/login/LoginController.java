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
public class LoginController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	// http://localhost:8080/login?name=Ranga
	@RequestMapping(value="/login",method = RequestMethod.GET) // get 방식
	public String loginPage() {
		
		return"login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST) // get 방식
	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return"welcome";
		}
		model.put("msg", "오류");
		return"login";
	}
}
