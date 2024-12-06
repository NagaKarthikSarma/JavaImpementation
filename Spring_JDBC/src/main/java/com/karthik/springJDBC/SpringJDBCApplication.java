package com.karthik.springJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.karthik.springJDBC.model.Student;

import com.karthik.springJDBC.service.StudentService;

@SpringBootApplication
public class SpringJDBCApplication {

	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(SpringJDBCApplication.class, args);

	Student s= context.getBean(Student.class);
	s.setRollno(10);
	s.setName("Karthiksng");
	s.setMarks(100);
	
StudentService service  =context.getBean(StudentService.class);
service.addStudent(s);

List<Student> students = service.getStudents();
System.out.println(students);




	}

}
