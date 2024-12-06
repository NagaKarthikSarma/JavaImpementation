package com.karthik.jdbc.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public class JdbcConnect {
	

	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
		
	}

public List<Argon> findAll() {
String sql = "select * from Argon";
RowMapper<Argon> map = new RowMapper<Argon>() {

	@Override
	public Argon mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Argon ar = new Argon();
		ar.setAid(rs.getInt("aid"));
		ar.setAname(rs.getString("aname"));
		
		return ar;
		
		
	}
};

return jdbc.query(sql,map);

}

}