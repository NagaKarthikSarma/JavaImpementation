package com.karthik.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.docker.entity.Student;
import com.karthik.docker.repo.StudentRepo;

@RestController
public class StudentController {
	
	@GetMapping("/")
	public String hello() {
	
		return "Hello students, How are you";
	}
	@Autowired
	StudentRepo repo;
	@PostMapping("/add")
	public Student add(@RequestBody Student std){
		
	return	 repo.save(std);
	}
	
	@GetMapping("findall")
	public List<Student> find() {
		
		return repo.findAll();
	}

}
