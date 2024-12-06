package com.karthik.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.security.model.Employee;
import com.karthik.security.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	

	@GetMapping("/hello")
	public String greet(HttpServletRequest request) {
		
		return "Hello World! "+ request.getSession().getId();
		
		
	}
	@Autowired
	EmployeeService service;
	
	@GetMapping("/details")
	public List<Employee> details(){
		
		List<Employee> list = service.getDetails();
		
		return list;
		
	}
	@Autowired
	Employee employee;
	
	
	@PostMapping("register")
	public ResponseEntity<Employee> saveDetils(@RequestBody Employee emp){
	employee= service.userSave(emp);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	

	@GetMapping("csrf")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return (CsrfToken) request.getAttribute("_csrf");
		
	}
	
	

	
	
}
