package com.amit.service;

import com.amit.binding.LoginForm;
import com.amit.binding.SignupForm;

public interface UserService {
	
	public boolean signUp(SignupForm form);
	
	public String login(LoginForm form);

}
