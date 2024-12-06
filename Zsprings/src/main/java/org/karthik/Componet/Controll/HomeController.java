package org.karthik.Componet.Controll;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.karthik.Componet.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	
	@RequestMapping("/")
		public String Home() {
			
			
			System.out.println("method called");
			return "Login";
		}
@RequestMapping("/mv")
	
	public ModelAndView mv() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		System.out.println("hello");
	
		return mv;
	}
		


}
