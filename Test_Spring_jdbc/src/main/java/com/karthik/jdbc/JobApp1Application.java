package com.karthik.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.karthik.employeeJdbc.Employee;
import com.karthik.employeeJdbc.EmployeeRepo;
import com.karthik.jdbc.repo.Argon;
import com.karthik.jdbc.repo.JdbcConnect;


@SpringBootApplication
public class JobApp1Application {

	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(JobApp1Application.class, args);
EmployeeRepo er = context.getBean(EmployeeRepo.class);

Employee em1 = context.getBean(Employee.class);
Employee em2 = context.getBean(Employee.class);
Employee em3 = context.getBean(Employee.class);

em1.setCuid(343926);
em1.setEname("karthik");
em1.setSalary(44000);

em2.setCuid(343927);
em2.setEname("vsck");
em2.setSalary(44000);

em3.setCuid(343928);
em3.setEname("chandana");
em3.setSalary(44000);


er.save(em1);
//er.save(em2);
//er.save(em3);
		
	}

}
