package org.karthik.Componet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;




@Repository
public class JdbcConnect {

	@Autowired
private JdbcTemplate jdbc;
	


public JdbcConnect(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}



public List<StudentClass> findAll() {
String sql = "select * from StudentClass";
RowMapper<StudentClass> map = new RowMapper<StudentClass>() {

	@Override
	public StudentClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StudentClass student = new StudentClass();
        student.setRollno(rs.getInt("rollno"));
        student.setSname(rs.getString("sname"));
        student.setAge(rs.getInt("age"));
        return student;
		
		
	}
};

return jdbc.query(sql,map);

}
}