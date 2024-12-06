package com.karthik.security.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		//http.csrf(cutomizer->customize.);
		
//http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//	http.formLogin();
//		http.httpBasic();
//	http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		//	   CUSTOMIZE tHE CSRF CONFIGURE	
//	Customizer<CsrfConfigurer<HttpSecurity>>  custcsrf = new Customizer<CsrfConfigurer<HttpSecurity>> () {
//
//		@Override
//		public void customize(CsrfConfigurer<HttpSecurity> configure) {
//			
//			configure.disable();
//		}
//		
//	};
//		http.csrf(custcsrf);
		
		//Customizer<CsrfConfigurer<HttpSecurity>> csrf = (a)->a.disable();

		// HTTPAUTHORIZEREQUESTS
//	http.csrf((a)->a.disable());
//		 
//	Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> custhttp = new 
//			Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> () {
//
//				@Override
//				public void customize(
//						AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry t) {
//					t.anyRequest().authenticated();
//					
//				}
//		
//	};
//	
//	http.authorizeHttpRequests(custhttp);
	
		http.csrf((a)->a.disable());
	
	http.authorizeHttpRequests(t->t.anyRequest().authenticated());
	
	http.httpBasic(Customizer.withDefaults());
	http.sessionManagement(session -> 
	session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		
	
		return http.build();
	 
	}
	@Autowired
	private UserDetailsService userDetailsService;
	@Bean
	public AuthenticationProvider authProvide () {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(null);
		provider.setPasswordEncoder(null);
		
		
		return provider;
		
		
		
	}
	

	
	

}
