package com.karthik.security.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.karthik.security.model.Employee;
import com.karthik.security.service.EmployeeService;

@RestController
public class HomeController {

    @Autowired
    EmployeeService service;
   
    @PostMapping("/register")
    public ResponseEntity<Employee> registerEmployee(@RequestBody Employee emp) {
    	System.out.println("hello");
    	
      service.saveUser(emp);

        return new ResponseEntity<>(emp,HttpStatus.OK);
    }

    @GetMapping("/employee")
    public List<Employee> details() {
        return service.getDetails();
    }
    
    @GetMapping ("/hello")
    public String requestHello() {
    	
    	return "Hello";
    }
    
}