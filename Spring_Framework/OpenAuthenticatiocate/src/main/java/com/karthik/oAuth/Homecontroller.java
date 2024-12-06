package com.karthik.oAuth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	
	@GetMapping("/hello")
	public String greet() {
		
		
		return "welcome to telusko";
		
	}

}
