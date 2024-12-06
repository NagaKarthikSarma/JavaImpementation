package com.karthik.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.karthik.security.Model.Employee;
import com.karthik.security.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee saveeuser(Employee emp) {
		BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder(12);
		
		emp.setEpass(encoder.encode(emp.getEpass()));
		System.out.println(emp.getEpass());
		
		System.out.println(emp.getEuser());
		return repo.save(emp);
	}
	
	
	public List<Employee>  getDetails(){
		
		return repo.findAll();
		
	}
	
	

}
