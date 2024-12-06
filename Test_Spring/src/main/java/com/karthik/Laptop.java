package com.karthik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	
 	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Autowired
	Desktop desc;
	
	public Desktop getDesc() {
		return desc;
	}

	public void setDesc(Desktop desc) {
		this.desc = desc;
	}
public Laptop() {
	
}
	public Laptop(int age, Desktop desc) {
		super();
		this.age = age;
		this.desc = desc;
	}

	public void code() {
		System.out.println("Spring framework coding");
		
		desc.code();
	}

}
