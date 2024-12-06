package com.karthik.jdbc.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// porformace monitoring by single class method
//
//@Aspect
//@Component
public class LogginAdvice {
	private static Logger LOGGER =LoggerFactory.getLogger(LogginAdvice.class);
	
	@Around("execution(* com.karthik.jdbc.employee.EmployeeConfig.*(..))")
	public Object  monitorTime(ProceedingJoinPoint jp) throws Throwable {
		//method start time before execution
       long start = System.currentTimeMillis();
       
       //proxy which makes the method to execute
	Object obj=	jp.proceed();
       long end = System.currentTimeMillis();
       
       
		
		LOGGER.info("time taken for execution --> "+jp.getSignature().getName()+"  "+(end-start));
		
		return obj;
	}
	
	
	

}
