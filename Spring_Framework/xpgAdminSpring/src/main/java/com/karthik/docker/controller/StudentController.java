package com.karthik.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.docker.enitity.Student;
import com.karthik.docker.repo.StudentRepo;
@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	
	
	@GetMapping("/findall")
	public List<Student> getStudents(){
		
//		return List.of(new Student(1,"karthik",22),
//				new Student(2,"sarma",22),
//				new Student(3,"naga",22)
//				);
		
				
				return repo.findAll();
		
	}
	
	@PostMapping("add")
	public String addDetails(@RequestBody Student std) {
		System.out.println(std);
		repo.save(std);
		return "added";
	}
	
	@GetMapping("/hello")
	public String getHello() {
		
	return "Hello I am karthik:";
	}

}
