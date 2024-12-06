package com.karthik.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.karthik.security.model.Users;
@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{
	
	
	
	Users findByusername(String username);
	

}
