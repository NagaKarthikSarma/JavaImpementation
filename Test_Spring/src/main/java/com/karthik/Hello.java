package com.karthik;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	public static void main(String[] args) {

	//ApplicationContext  context = new ClassPathXmlApplicationContext("Spring.xml");
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
		
	DataBase db = context.getBean(DataBase.class);
	System.out.println("hii");
	
//	List<Argon> pl= db.findAll();
//	
//	System.out.println(pl);
//
//	  Argon ar = context.getBean(Argon.class);
//	  
//	  

	}

}
