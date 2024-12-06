package com.karthik.avatar;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.karthik.avatar.service.LaptopService;

@SpringBootApplication
public class HeliumSpringApplication {

	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(HeliumSpringApplication.class, args);
	
	LaptopService service = context.getBean(LaptopService.class);
	
Laptop lap= context.getBean(Laptop.class);

	service.addLaptop(lap);
//	

	
	}

}
