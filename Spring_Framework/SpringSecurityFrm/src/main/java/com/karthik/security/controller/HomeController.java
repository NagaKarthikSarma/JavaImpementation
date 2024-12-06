package com.karthik.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.security.Model.Employee;
import com.karthik.security.security.JWTToken;
import com.karthik.security.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
public class HomeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/register")
	public ResponseEntity<Employee> register(@RequestBody Employee emp){
		
	Employee employee= 	service.saveeuser(emp);
		return new  ResponseEntity<>(employee,HttpStatus.OK);
		
	}
	
	@GetMapping("/details")
	public List<Employee> details(){
	
		return service.getDetails();
		
	}
	@GetMapping("/index")
	public String indexing() {
		
		return "index HelloWorld";
	}
	
	@Autowired
	AuthenticationManager  authenticationManager;
	
	@Autowired
	JWTToken jwtservice;
	
	@PostMapping("login")
	public String login(@RequestBody Employee emp) {
		//spring security has in built user authentication password check
		//it return authentication. so we are using it
		// we need to put the user/employee details so we have to use 
		//authentication manager to provide that
		// create a bean for authentication manager that takes the 
		// authenticationprovider (daoAP)
		System.out.println(emp.getEuser()+" --------------");
		Authentication authentication = authenticationManager
				                  .authenticate(new UsernamePasswordAuthenticationToken(emp.getEuser(), 
				                		  emp.getEpass()));
		System.out.println(emp.getEpass()+" --------------");
		if (authentication.isAuthenticated())
			return jwtservice.generateToken(emp.getEuser());
		
		else
		
		return "Wrong Credentials";
		
		
	}
	
	
	@PostMapping("join")
	public String join(@RequestBody Employee emp) {
		
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(emp.getEuser(), emp.getEpass()));
		System.out.println(emp.getEpass()+" --------------");
		if(authentication.isAuthenticated())
		return jwtservice.generateToken(emp.getEuser());
		
		else
			return "";
		
	}
	
	

}
