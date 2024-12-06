package com.karthik.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZjarDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZjarDockerApplication.class, args);
	}
@GetMapping("/")
public String getMap() {
	
	return " hello World";
}
}
