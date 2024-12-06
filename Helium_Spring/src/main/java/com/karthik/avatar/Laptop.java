package com.karthik.avatar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    @Override
	public  void compile() {
		System.out.println("compiling in laptop");
		
	}

}
