package cotrollers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	//Aliean obj =context.getBean("aliean",Aliean.class);
//		  obj.code();
//	Laptop obj1=context.getBean(Laptop.class);
		
	Aliean obj=context.getBean(Aliean.class);
	
	obj.code();
	
	Computer lap= context.getBean(Computer.class);
	lap.compile();
	
			
	
	}

}
  