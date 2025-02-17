package com.karthik.security.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.security.controller.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class EmployeeSecurity {
	//@Autowired 
	private JwtFilter jwtfilter;
	
	
@Bean
public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
	
	
	return http.csrf(csrf->csrf.disable())
			    .httpBasic(Customizer.withDefaults())
			    .authorizeRequests(a->a
			    		.requestMatchers("register","login","join")
			    		.permitAll()
			    		.anyRequest().authenticated())
			    .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			    //.addFilterBefore(jwtfilter, UsernamePasswordAuthenticationFilter.class)
			    .build();
	
	
}
	

@Autowired
public MyUserDetailsService userdetailsservice;


@Bean
public AuthenticationProvider authprovider() {
	
	DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	provider.setUserDetailsService(userdetailsservice);
	provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
	return provider;
}

@Bean
public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
	
	return config.getAuthenticationManager();
}

}
