package com.partyat.restImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.partyat.model.User;
import com.partyat.rest.RegistrationRest;
import com.partyat.service.RegistrationService;

@Component
public class RegistrationRestImpl implements RegistrationRest{

	@Autowired
	RegistrationService registrationService;
	
	@Override
	public void registerUser(User user) {
		registrationService.saveUser(user);
	}

}
