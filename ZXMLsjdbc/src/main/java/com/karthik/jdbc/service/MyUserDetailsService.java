package com.karthik.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.karthik.jdbc.model.UserPrincipal;
import com.karthik.jdbc.model.Users;
import com.karthik.jdbc.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
  private	UserRepo repo;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = repo.findByUsername(username);

		if (user==null) {
			
			System.out.println("404 error");
			throw new UsernameNotFoundException("404 error");
		}
		
		
		
		return new UserPrincipal(user);
	}
	

}
