package com.karthik.docker.com.karthik.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@GetMapping("/")
	public String greet() {
		
		return "Hello World";
	}
}
