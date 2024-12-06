package com.karthik.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.karthik.security.model.UserPrincipal;
import com.karthik.security.model.Users;
import com.karthik.security.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{
 
	@Autowired
	private UserRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
	
	
	Users user = repo.findByusername(username);
	

	
	if (user==null) {
		
		System.out.println("404 error");
		throw new UsernameNotFoundException("404 error");
	}
		return new UserPrincipal(user);
	}

}
