package com.karthik.docker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/hello")
	public String request() {
		
		return "Hello I am rep";
	}

	@GetMapping("/getall")
	public List<Student> getStudents(){
		
//		return List.of(new Student(1,"karthik",22),
//				new Student(2 ,"karthik sarma",22),
//				new Student(3," naga karthik",22)
//				
//				);
		
		
		return repo.findAll();
		
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Student std){
		
		repo.save(std);
		System.out.println(std);
		return "added succcesfully";
	}
	
}
