package com.karthik.security.Model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.karthik.security.repo.EmployeeRepo;

@Component
public class EmployeePrincipal implements UserDetails{

	Employee employee;
	
	public EmployeePrincipal(Employee emplo) {
		
		this.employee = emplo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return employee.getEpass();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return employee.getEuser();
	}
	
	

}
