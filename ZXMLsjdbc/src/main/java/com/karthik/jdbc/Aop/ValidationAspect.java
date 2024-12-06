package com.karthik.jdbc.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
	
	
private static Logger LOGGER =LoggerFactory.getLogger(ValidationAspect.class);
	
	@Around("execution(* com.karthik.jdbc.employee.EmployeeConfig.*(..))&& args(ob)")
	public Object validateAndUpdateInput(ProceedingJoinPoint jp,Object ob) throws Throwable {
		//method start time before execution
	       long start = System.currentTimeMillis();
	       
	       
	       	
	     //proxy which makes the method to execute
	       // JoinPoint jp will act as proxy methd 
		
 Object obje=	jp.proceed(new Object[] {ob});
		

	
 long end = System.currentTimeMillis();
 	
 LOGGER.info("data is present in it --> "+jp.getSignature().getName()+"  "+(end-start));
	
		return obje;
	}

}
