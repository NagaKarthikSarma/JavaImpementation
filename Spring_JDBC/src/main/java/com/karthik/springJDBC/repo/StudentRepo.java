package com.karthik.springJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.karthik.springJDBC.model.Student;

@Repository
public class StudentRepo {

	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
		
	}

	public void save(Student s) {

	String Query="insert into student values(?,?,?)";
	
	int a = s.getRollno();
	String b =s.getName();
	int c= s.getMarks();
	
 int row=  jdbc.update(Query,a,b,c);
 
   System.out.println(row +" --> effected");
   
	}

	public List<Student> findAll() {
String sql = "select * from student";
RowMapper<Student> mapped = new RowMapper<Student>() {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setRollno(rs.getInt("rollno"));
	    s.setName( rs.getString("name"));
		s.setMarks(rs.getInt("marks"));
	return s ;
	}	
};
return  jdbc.query(sql,mapped);

		
	}
}
