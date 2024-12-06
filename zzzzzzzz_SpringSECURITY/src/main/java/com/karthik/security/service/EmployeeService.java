package com.karthik.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.karthik.security.model.Employee;
import com.karthik.security.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepo repo;
	public List<Employee> getDetails() {
		
		
	
		return repo.findAll();
	}
	
	@Autowired
	
	
public Employee userSave(Employee emp) {

	
	return repo.save(emp);
}

}
