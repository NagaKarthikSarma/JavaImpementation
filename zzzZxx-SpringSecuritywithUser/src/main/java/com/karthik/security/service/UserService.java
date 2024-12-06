package com.karthik.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.karthik.security.model.Users;
import com.karthik.security.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public Users saveUser(Users user) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		
		
	user.setPassword(encoder.encode(user.getPassword()));
	System.out.println(user.getPassword());
	
	
		
		return repo.save(user);
		
	}
	

}
