package org.karthik.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.karthik.Componet.StudentClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Avatar {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

	     String sql = "select * from StudentClass";
	     String insert ="insert into StudentClass(rollno,sname,age) values(?,?,?)";
	     
//	     RowMapper<StudentClass> rowMapper = new RowMapper<StudentClass>() {
//	         @Override
//	         public StudentClass mapRow(ResultSet rs, int rowNum) throws SQLException {
//	             StudentClass student = new StudentClass();
//	             
//	             student.setRollno(rs.getInt("rollno"));
//	             student.setSname(rs.getString("sname"));
//	             student.setAge(rs.getInt("age"));
//	             return student;
//	         }
//	     };

	    // List<StudentClass> students = jdbcTemplate.query(insert, rowMapper);

	     int students =jdbcTemplate.update(insert,12,"karthisar",22);
	     System.out.println(students);
		((ConfigurableApplicationContext) context).close(); 


	}

}
