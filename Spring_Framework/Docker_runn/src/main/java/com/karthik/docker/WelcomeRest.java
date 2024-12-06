package com.karthik.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
	
	@GetMapping
	public String getMsg() {
		
		return " Hello I am karthik" ;
	}

}
