package com.karthik.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.karthik.User;
import com.karthik.UserService;
@Controller
public class HomeController {

	@RequestMapping({"/","home"})
	public String home(ModelAndView mv) {
		
		
	//mv.setViewName("home");
	
		
	
		return "home";
		
	}

}
