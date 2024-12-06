package com.karthik.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.karthik.jdbc.model.Users;
import com.karthik.jdbc.repo.UserRepo;


@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public Users saveUser(Users user) {
		

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
		
	user.setPassword(encoder.encode(user.getPassword()));
	

		return repo.save(user);
		
	}
	

}
