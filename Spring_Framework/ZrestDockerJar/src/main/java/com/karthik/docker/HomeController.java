package com.karthik.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String getMap() {
		
		return "Hello I am free bird now";
	}

}
