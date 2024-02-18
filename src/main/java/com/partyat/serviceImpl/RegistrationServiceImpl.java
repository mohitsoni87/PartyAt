package com.partyat.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partyat.model.User;
import com.partyat.repository.UserRepository;
import com.partyat.service.RegistrationService;


@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	UserRepository userRepositroy;
	
	@Override
	public void saveUser(User user) {
		userRepositroy.save(user);
	}
}
