package com.karthik.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
	@GetMapping("hello")
	public String Hello() {
		
		return "KALKI";
	
	}

	
}
