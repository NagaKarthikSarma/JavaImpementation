package com.karthik.avatar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Avatar {
	@Value("25")
	private int age;
	
	@Autowired
	//@Qualifier("laptop")
	private Computer com;
	
	
public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}


public void code() {
	
	com.compile();

}

}
