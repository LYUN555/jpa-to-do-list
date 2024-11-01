package com.ldngyun.springboot.todolistwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("lyun");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		
		return isValidUserName && isValidPassword;
	}
}
