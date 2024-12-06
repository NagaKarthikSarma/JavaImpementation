package com.karthik.security.configuration;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.karthik.security.model.Employee;


public class UserPrincipal implements UserDetails {


	private static final long serialVersionUID = 4582891679496948471L;
	
	private Employee employee;
	
	public UserPrincipal(Employee employee) {
		this.employee=employee;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		System.out.println("helllo");
		return employee.getEpass();
	}

	@Override
	public String getUsername() {
		System.out.println("helllo");
		return employee.getEuser();
	}

}
