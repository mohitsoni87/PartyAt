package com.partyat.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partyat.model.User;

@RestController
public interface RegistrationRest {
	
	@PostMapping("/userRegistration")
	public void registerUser(User user);

}
