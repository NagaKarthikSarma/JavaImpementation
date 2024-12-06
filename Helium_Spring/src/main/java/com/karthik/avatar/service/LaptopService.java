package com.karthik.avatar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.karthik.avatar.Laptop;
import com.karthik.avatar.repo.LaptopRepository;

@Component
public class LaptopService {
	@Autowired
	private LaptopRepository repo;

	public void addLaptop(Laptop lap) {
		repo.save(lap);
		
	}
	public boolean isGoodForprog(Laptop lap) {
		
		return true;
	}
	

}
