package com.controller;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.controller.test.ConstructorA;
import com.controller.test.ConstructorB;

public class Hello {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		
		JdbcCon  jc = context.getBean(JdbcCon.class);
		
		List<Argon> ar = jc.findAll();
		for (Argon abc : ar) {
			System.out.println(abc.getAid()+"--"+abc.getAname());
		}
		
		System.out.println(ar);
		
	

	}

}
