package com.karthik.security.security;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAround {
	
	private static Logger LOGGER =LoggerFactory.getLogger(AspectAround.class);
	@Around("execution(* com.karthik.security.controller.HomeController.*(..))")
	public Object aroundAspect(ProceedingJoinPoint jp) throws Throwable {
		long start = System.currentTimeMillis();
		Object obj = jp.proceed();
		
		long end = System.currentTimeMillis();
		LOGGER.info("time take to completion--> "+ jp.getSignature().getName()+" in "+ (end-start)+" ms");
		return obj;
	}
	
	@AfterThrowing("execution(* com.karthik.security.controller.HomeController.*(..))")
	public void exceptionHandler (JoinPoint jp) {
		
		LOGGER.info("EXCEPTION OCCURED --> "+ jp.getSignature().getName());
	}
	

}
