package com.karthik.security.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.karthik.security.config.Dao.UserRepo;
import com.karthik.security.model.UserPrincipal;
import com.karthik.security.model.Users;


@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
   private UserRepo repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = repo.findByUserName(username);
		
		if (user==null) {
			System.out.println("user 404");
			throw new UsernameNotFoundException("user 404");
		}
		
		
		
		return new UserPrincipal(user);
	}

}
