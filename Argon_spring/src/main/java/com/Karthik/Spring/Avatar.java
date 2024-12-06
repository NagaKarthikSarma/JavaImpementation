	package com.Karthik.Spring;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	
	import cotrollers.Aliean;
	import cotrollers.Desktop;
	
	public class Avatar {
		public static void main(String[] args) {
			
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	//	 Desktop dt = context.getBean("desktop",Desktop.class);
	//	 dt.compile();
	//	 Desktop dt1 = context.getBean("desktop",Desktop.class);
	//	 dt1.compile();
	//	
		 Aliean obj1 = context.getBean(Aliean.class);
		 
		 Desktop obj2= context.getBean(Desktop.class);
		 System.out.println(obj1.getAge());
		 obj1.code();
		}
	
	}
