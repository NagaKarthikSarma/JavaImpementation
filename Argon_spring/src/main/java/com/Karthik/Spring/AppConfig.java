package com.Karthik.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import cotrollers.Aliean;
import cotrollers.Computer;
import cotrollers.Desktop;
import cotrollers.Laptop;

@Configuration
@ComponentScan("cotrollers")
public class AppConfig {
//
//	//@Bean(name={"com2","Beast"})
//	@Bean
////	@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
//public Aliean Aliean(@Qualifier("desktop") Computer com) {
//		
//		Aliean obj = new Aliean();
//		obj.setAge(22);
//		obj.setLap(com);
//		
//	return obj;
//}
//@Bean
//@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
//	
	
}
