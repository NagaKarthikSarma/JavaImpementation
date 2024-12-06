package org.karthik.NeonPractice_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
 // Aliean obj = context.getBean(Aliean.class);
 //  obj.code();
    //Computer obj1 = context.getBean(Laptop.class);
   Laptop obj2= context.getBean(Laptop.class);
    
   
   
    	
    }
}
