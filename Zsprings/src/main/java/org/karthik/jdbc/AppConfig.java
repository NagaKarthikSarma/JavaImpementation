package org.karthik.jdbc;

import javax.sql.DataSource;

import org.karthik.Componet.Controll.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class AppConfig {
	
	

	
	@RequestMapping("/mv")
	
	public ModelAndView mv() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		
		return mv;
	}
	
	@Bean
	public JdbcTemplate jdbc(DataSource dis) {
	
		return new JdbcTemplate(dis);
	}
	@Bean
	public DataSource ds() {
		
		  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
	        dataSource.setUsername("root");
	        dataSource.setPassword("D@ngereag1e");
	        return dataSource;
	}
	@Bean
	public Karthik hii(Sarma s) {
		
		return new Karthik(s);
	}
	
	@Bean
	public Sarma sar() {
		return new Sarma();
	}
	

}
