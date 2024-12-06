package com.testdb;

import java.util.ArrayList;
import java.util.List;

public class EmployeeConfig {
	
	public List<Employee> findAll(){
		
		
	
	    List<Employee> dtos = new ArrayList<>(5);
	    for (int i = 1; i <= 5; i++) { // Add 5 sample employees
            dtos.add(new Employee(i, "Employee " ));
        }
	    System.out.println(dtos);
	return dtos;
	}

}
