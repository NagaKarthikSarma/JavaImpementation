package com.karthik.security.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.karthik.security.controller.MyUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@Component
public class JwtFilter extends OncePerRequestFilter{

	//@Autowired
	JwtService jwtservice;
	
	//@Autowired 
	ApplicationContext context;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authHeader = request.getHeader("Authorization");
		String token = null;
		String userName=null;
		
		
		
		if (authHeader !=null && authHeader.startsWith("Bearer")) {
			
			token = authHeader.substring(7);
			userName= jwtservice.extractUserName(token);
			
		}
		
		
		if (userName !=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userdetails = context.getBean(MyUserDetailsService.class).loadUserByUsername(userName);
			if (jwtservice.validateToken(token,userdetails)) {
				UsernamePasswordAuthenticationToken authToken = 
						new UsernamePasswordAuthenticationToken(userdetails,null,userdetails.getAuthorities());
			authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));	
				
			SecurityContextHolder.getContext().setAuthentication(authToken);
			
			}
			
			
		}
		
		filterChain.doFilter(request, response);
	}
	
	
	

}
