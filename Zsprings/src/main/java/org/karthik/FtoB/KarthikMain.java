package org.karthik.FtoB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.karthik.FtoB.jdbc.ConfigEmployee;
import org.karthik.FtoB.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class KarthikMain {
	 private JdbcTemplate jdbcTemplate;
	 
	 
	 @Autowired
	  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	  }
	
	public void DB() {
		
		
	   
	   String sql = "select * from StudentClass";
	     
	     
     RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
         @Override
	   public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        	 Employee emp = new Employee();	             
             emp.setEmpid(rs.getInt("emid"));
            emp.setEmname(rs.getString("emname"));
          
	             return emp;
         }
     };

	     List<Employee> empdet = jdbcTemplate.query(sql, rowMapper);

	    
	     System.out.println(empdet);
	
		
	}


}
