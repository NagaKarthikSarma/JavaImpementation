package com.karthik.jdbc.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.jdbc.model.Users;
import com.karthik.jdbc.service.UserService;

import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeConfig {
	
	
    @GetMapping("/employee")
	public List<Employee> getDetails(){
		
	List<Employee> li = emr.findAll()	;
	return li;
	}
	
	
    @Autowired
	EmployeeRepo emr;
    
    @Autowired
    Employee emp;
    
    @Autowired
    JdbcTemplate jdbc;
    @PostMapping("/employee")
    public ResponseEntity<Employee> addDetails(@RequestBody Employee e) {
//    	String query = "insert into employee values(?,?,?);";
//		
//  
//  		
//  		jdbc.update(query,e.getCuid(),e.getEname(),e.getEsalary());
//  	
emp = emr.save(e);
 
 return new ResponseEntity<Employee>(HttpStatus.CREATED);

   
    	
    }
    @GetMapping("/name")
    public List<Employee> getName(){
   	  
   	  
  List<Employee>  li = 	  emr.getByEname("karthik");
  
  
   	  return li;
     }
    
    @PutMapping("/employeeupdate")
    public ResponseEntity<HttpStatus> update( @RequestBody Employee em ){
    	
    
    	emp = emr.save(em);
    	
    	return new ResponseEntity <>( HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{e}")
    public  ResponseEntity<HttpStatus> delete(@PathVariable int e){
    	 emr.deleteById(e);
    	
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/search/{e}")
    public List<Employee> searchKeyword(@PathVariable String e){
    	
    	return emr.findByEnameContaining(e)  ;
    	
    }
  
	
}
