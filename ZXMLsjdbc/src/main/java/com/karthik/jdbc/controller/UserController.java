package com.karthik.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.jdbc.employee.Employee;
import com.karthik.jdbc.employee.EmployeeRepo;
import com.karthik.jdbc.model.Users;
import com.karthik.jdbc.service.UserService;

@RestController
public class UserController {
	  @Autowired
	    private	UserService service;

	    	@PostMapping("/register")
	    	public Users  register(@RequestBody Users user) {
	    		
	    	
	    		
	    		return service.saveUser(user);
	    	}
//	    	
//	    	 @Autowired
//	    		EmployeeRepo emr;
//	    	    
//	        @GetMapping("/employee")
//	    	public List<Employee> getDetails(){
//	    		
//	    	List<Employee> li = emr.findAll()	;
//	    	return li;
//	    	}
	    	
}
