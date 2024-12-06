package com.karthik.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.karthik.security.model.Employee;

import com.karthik.security.repo.EmployeeRepo;

@Component
public class MyuserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("hi");
        Employee user = repo.findByeuser(username);
        System.out.println(user);

        if (user == null) {
            System.out.println("404 error");
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);
    }
}


