package com.karthik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("/")
	
	public String home() {
	System.out.println("method called");
	return "index";
	}
	

	
@RequestMapping("/add")
	public  ModelAndView add(Aliean aliean, ModelAndView mv) {

		
		return mv;
	}
 
	
	
}
