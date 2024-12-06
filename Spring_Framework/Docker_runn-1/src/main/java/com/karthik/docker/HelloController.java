package com.karthik.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping 
	public String getViews() {
		
		return "Hello where are you I am here";
	}

}
