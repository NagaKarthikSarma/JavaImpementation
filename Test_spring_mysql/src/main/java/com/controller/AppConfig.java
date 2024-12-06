package com.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.controller.test.ConstructorA;
import com.controller.test.ConstructorB;

@Configuration
@ComponentScan("com.controller")
public class AppConfig {

	
	@Bean
	public ConstructorA ca() {
		
		ConstructorA cp = new ConstructorA();
		cp.setId(45);
		
		return cp;
		
	}
	
	@Bean
	public ConstructorB cb(ConstructorA ca) {
		return new ConstructorB(ca);
		
	}
	
}
