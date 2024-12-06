package com.karthik.springJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.springJDBC.model.Student;
import com.karthik.springJDBC.repo.Repo;
import com.karthik.springJDBC.repo.StudentRepo;
@Service
public class StudentService {
	
	private Repo jparepo;
	
   
	public Repo getJparepo() {
		return jparepo;
	}
	@Autowired
	public void setJparepo(Repo jparepo) {
		this.jparepo = jparepo;
	}
	private StudentRepo repo;
	
	public StudentRepo getRepo() {
		return repo;
		
	}
	  @Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void addStudent(Student s) {
	repo.save(s);
	}
	public List<Student> getStudents() {
		
		return repo.findAll();
	}
}
