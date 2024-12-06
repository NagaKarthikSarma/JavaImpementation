package cotrollers;


import java.beans.ConstructorProperties;

import javax.management.ConstructorParameters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aliean {
	private int age;
	
	private Computer com  ;
	public Aliean() {
	System.out.println("object created");
	}
	//@ConstructorProperties({"age","lap"})
	//@ConstructorParameters({"age","lap"})
	public Aliean(int age,Computer lap) {
	this.age = age;
	this.com=lap;
	
	//System.out.println("para constructor call");
	}
	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
		
	}


	public Computer getLap() {
		return com;
	}

	public void setLap(Computer lap) {
		this.com = lap;
	}
	
	

	public void code() {
		System.out.println("coding");
	
		
		//com.compile();
	}

}
