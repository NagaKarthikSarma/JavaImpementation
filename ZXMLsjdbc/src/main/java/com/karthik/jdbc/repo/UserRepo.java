package com.karthik.jdbc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.jdbc.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{
	
	Users findByUsername(String Username);

}
