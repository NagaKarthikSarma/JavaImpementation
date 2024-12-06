package com.karthik.security.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	
	private static Logger LOGGER = LoggerFactory.getLogger(AspectConfig.class);
	
	@Around("execution(* com.karthik.security.*.*(..))")
	public Object aroundAspect(ProceedingJoinPoint jp) throws Throwable {
		//method start time before execution
	       long start = System.currentTimeMillis();
	       
	       //proxy which makes the method to execute
		Object obj=	jp.proceed();
	       long end = System.currentTimeMillis();
	       
	       
			
			LOGGER.info("time taken for execution --> "+jp.getSignature().getName()+" -- "+(end-start));
			
		return obj;
		
	}

}
