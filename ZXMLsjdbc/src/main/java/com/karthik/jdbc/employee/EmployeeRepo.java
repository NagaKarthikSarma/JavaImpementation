package com.karthik.jdbc.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> getByEname(String string);
//
//	@Query ("update employee set cuid =?1, ename=?2, esalary=?3, where id=?4 ;")
//	Employee save(Employee em, int e);
	
	
	List<Employee> findByEnameContaining(String ename);
	
	

}
