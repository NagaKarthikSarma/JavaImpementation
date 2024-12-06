package com.karthik.security.config.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.security.model.Users;



public interface UserRepo extends  JpaRepository<Users,Integer>{
	
	Users findByUserName(String username);

}
