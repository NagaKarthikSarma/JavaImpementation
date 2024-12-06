package com.karthik;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
	
	
	StudentRepo repo;
	
	public Student getDetails(){
		
		//List<Student> li = repo.findAll();
		
		Student st = new Student();
		st.setRollno(1);
		st.setSname("karthik");
		
		
		
		return st;
		
	}
	
	
	

}
