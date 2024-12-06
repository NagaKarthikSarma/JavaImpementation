package com.karthik.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.security.model.Employee;
import com.karthik.security.repository.EmployeeRepo;

@Service
public class EmployeeService {
   
	@Autowired
	EmployeeRepo repo;
	
	
	public Employee saveUser(Employee emp) {
		System.out.println("save");
		
		return repo.save(emp);
	
		
	}
	
	public List<Employee> getDetails(){
		
		List<Employee> list = (List<Employee>) repo.findAll();
		return list;
	}
}
