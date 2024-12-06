package org.karthik.Componet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class Avatar {

	public static void main(String[] args) {
	 ApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class); 
 //ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
  
//	 JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//
//     JdbcConnect jc = new JdbcConnect(jdbcTemplate); // Create JdbcConnect directly
//     List<StudentClass> students = jc.findAll();
//	 System.out.println(students);
//	  
//	 StudentClass st= context.getBean(StudentClass.class);
	 
	 
	 JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

     String sql = "select * from StudentClass";
     RowMapper<StudentClass> rowMapper = new RowMapper<StudentClass>() {
         @Override
         public StudentClass mapRow(ResultSet rs, int rowNum) throws SQLException {
             StudentClass student = new StudentClass();
             student.setRollno(rs.getInt("rollno"));
             student.setSname(rs.getString("sname"));
             student.setAge(rs.getInt("age"));
             return student;
         }
     };

     List<StudentClass> students = jdbcTemplate.query(sql, rowMapper);

     System.out.println(students);
	((ConfigurableApplicationContext) context).close(); 

	 
	 
	}

}
 