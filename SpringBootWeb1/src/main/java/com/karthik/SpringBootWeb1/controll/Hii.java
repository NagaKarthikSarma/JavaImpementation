package com.karthik.SpringBootWeb1.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hii {
	@RequestMapping("/hii")
	
	public String home() {
	System.out.println("method called");
		return "index";
	}

}
