package org.karthik.FtoB.jdbc;

import javax.sql.DataSource;

import org.karthik.FtoB.FtoBConroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("org.karthik.FtoB")
public class ConfigEmployee {

	
@Bean

public JdbcTemplate jdbc(DataSource ds) {
	
	return new JdbcTemplate(ds);
}

@Bean
public DataSource dst() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
    dataSource.setUsername("root");
    dataSource.setPassword("D@ngereag1e");
    return dataSource;
	
}

}
