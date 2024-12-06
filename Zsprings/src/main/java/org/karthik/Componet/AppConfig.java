package org.karthik.Componet;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("org.karthik.Componet")
public class AppConfig {

//	@Bean
//	public Student std() {
//		return new Student();
//	}
//	
	   @Bean
	    public DataSource dataSource() {
	        // Configure your DataSource implementation here, replacing placeholders with your actual details
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
	        dataSource.setUsername("root");
	        dataSource.setPassword("D@ngereag1e");
	        return dataSource;
	   }
	 @Bean
	    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	        return new JdbcTemplate(dataSource);
	    }
	
}
