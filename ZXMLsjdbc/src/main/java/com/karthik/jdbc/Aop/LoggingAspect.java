package com.karthik.jdbc.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LoggingAspect {
	
	
	private static Logger LOGGER =LoggerFactory.getLogger(LoggingAspect.class);
	// execution has 3 paramaters to fill class 
	// return type, fully qualified class (with package), methodname(if 
	// you want only one other wise use *(args) (..)
	//* for all the things so use the package
	// first * is for any return type 

	
	//we can mention * for everything
	long start;
	//before the method starts
	@Before("execution(* com.karthik.jdbc.employee.EmployeeConfig.*(..))")
	public void BeforStart() {
		start=System.currentTimeMillis();
		LOGGER.info("method called");
		
	}
	long end;
	// after the method executed
	@AfterReturning("execution(* com.karthik.jdbc.employee.EmployeeConfig.*(..))")
	public void AfterReturn() {
		end= System.currentTimeMillis();
		
		LOGGER.info("method execution succesfull with execution time -->" + (end-start)+" ms");
		
	}
	//after throwing an exception
	@AfterThrowing("execution(* com.karthik.jdbc.employee.EmployeeConfig.*(..))")
	public void CrashOccured(JoinPoint jp) {
		
		LOGGER.info("Exception occured-->"+jp.getSignature().getName() );
		
	}
	//final method tyoe executes even the method not executed
	@After("execution(* com.karthik.jdbc.employee.EmployeeConfig.*(..))")
	public void AfterFinal()
	{
		
		
		LOGGER.info("final stage-->" );
		
	}
	
	

}
