package com.karthik.security.configuration;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@SuppressWarnings("deprecation")
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
	return  	http
	            .csrf(c->c.disable())
			    .httpBasic(Customizer.withDefaults())
			    .authorizeRequests(r->r.requestMatchers("register")
			    		.permitAll()
			    		.anyRequest().authenticated())
			    .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			.build();
	
	} 
	
@SuppressWarnings("deprecation")
@Bean
public AuthenticationProvider authProvider() {
	
	DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

	provider.setUserDetailsService(userDetailsService);
provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return provider;
	
}


@Autowired
public MyuserDetailsService userDetailsService;








	
//	//Use only with out any authentication provider
//	@Bean
//	public UserDetailsService uds() {
//		
//		UserDetails user1= User.withDefaultPasswordEncoder()
//				                .username("karthik")
//				                .password("K@123")
//				                .roles("USER")
//				                .build();
//		
//		UserDetails user2= User.withDefaultPasswordEncoder()
//                .username("sarvani")
//                .password("K@123")
//                .roles("USER")
//                .build();
//	
//return new  InMemoryUserDetailsManager(user1,user2);
//	}
	
	
}
