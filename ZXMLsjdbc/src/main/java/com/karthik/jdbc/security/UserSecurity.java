package com.karthik.jdbc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.karthik.jdbc.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class UserSecurity {
	
	
	
@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	
	return	http.csrf((a)->a.disable())
               .authorizeHttpRequests(t->t.anyRequest().authenticated())
	          
             .httpBasic(Customizer.withDefaults())
           .sessionManagement(session -> 
          session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.build();
	

}
@Autowired
private MyUserDetailsService userdetailsservice;

@Bean
public AuthenticationProvider authProvider() {
	
DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

provider.setUserDetailsService(userdetailsservice);
provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
	return provider;
}


}
