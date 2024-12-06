package com.karthik.jdbc.model;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class UserPrincipal implements UserDetails {
	


	private Users user;
	

	public UserPrincipal(Users user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	@Override
	public String getPassword() {
		
	
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return user.getUsername();
	}

}
