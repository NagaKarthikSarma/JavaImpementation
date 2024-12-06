package com.karthik.mvc;

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
	
	public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, Model model) {
		 

		int result = num+num2;
	model.addAttribute("result", result);
		
		System.out.println(num+num2);
		return "add";
	}
	
}
