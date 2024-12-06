package com.karthik.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.karthik.security.Model.Employee;
import com.karthik.security.Model.EmployeePrincipal;
import com.karthik.security.repo.EmployeeRepo;

@Component
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	EmployeeRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Employee employee =repo.findByeuser(username);
		
		return new EmployeePrincipal(employee);
	}

}
