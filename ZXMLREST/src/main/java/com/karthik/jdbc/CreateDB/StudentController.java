package com.karthik.jdbc.CreateDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class StudentController {
	
	
	@PostMapping("/student")
	@ResponseBody
	
	public void std(@RequestBody Student std) {
		
		Student st= new Student();
		
		st.setRollno(std.getRollno());
		st.setSname(std.getSname());
		
		
		System.out.println(std.getSname()+"0--"+st.getRollno());
	}
	@Autowired
	StudentReopo sr ;
	@GetMapping(path="/student",produces="application/xml")
	@ResponseBody
	public List<Student> getDetails() {
		
		
		List<Student>  li = (List<Student>) sr.findAll(); 
		
		return li;
		
	}
	

}
