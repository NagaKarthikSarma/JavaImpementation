package com.karthik.avatar.repo;

import org.springframework.stereotype.Repository;

import com.karthik.avatar.Laptop;


@Repository
//used for connection the database
public class LaptopRepository {

	public void save(Laptop lap) {
		
		System.out.println("saved in Database..");
	
	
	}


}
