package com.karthik.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.docker.entity.Student;
import com.karthik.docker.repo.StudentRepo;



@RestController
public class StudentController {
	
	@GetMapping("/")
	public String geteRequest() {
		System.out.println("hello");
		return "hiii welcome";
	}
	
	@Autowired
	StudentRepo repo;
	
	@GetMapping("/findall")
	public List<Student> getAllStudents(){
		
		return repo.findAll();
	}
	@PostMapping("/add")
	public Student addData(@RequestBody Student std) {
		
		return 	repo.save(std);
		
	}

}
