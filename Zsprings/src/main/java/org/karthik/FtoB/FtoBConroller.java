package org.karthik.FtoB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.karthik.FtoB.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FtoBConroller {

	@RequestMapping("login")
	public ModelAndView  mode(Model model) {
		
		 KarthikMain km = new KarthikMain();
		 km.DB();
	   

		
		ModelAndView mv = new ModelAndView();
		System.out.println("ftob");
		mv.setViewName("Login");
		
		return mv;
		
		
	}
	
	

}
