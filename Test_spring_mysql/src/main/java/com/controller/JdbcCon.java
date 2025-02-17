package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcCon {

	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
@Autowired
	public void setJdbc(JdbcTemplate jdbc) {  
		this.jdbc = jdbc;
	}

public List<Argon> findAll() {
	String sql = "select * from Argon;";
	RowMapper<Argon> map = new RowMapper<Argon>() {

		@Override
		public Argon mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Argon ar = new Argon();
			ar.setAid(rs.getInt("Aid"));
			ar.setAname(rs.getString("Aname"));
			
			return ar;
		}
		
	};
	
	return jdbc.query(sql,map);
}
	
	
}
