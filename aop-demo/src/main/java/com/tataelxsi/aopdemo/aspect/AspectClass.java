package com.tataelxsi.aopdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectClass {
	Logger logger=Logger.getLogger(AspectClass.class.getName());
	
	@Before("execution(* com.tataelxsi.aopdemo.service.ServiceClass.*(..))")
	//("") contents within the quotes denote the pointcut,(..)->all arguments, * after sevice class denotes all methods within that service class
	public void logBefore() {
		logger.info("Before the service class");
}
//	
//
//	@After("execution(* com.tataelxsi.aopdemo.service.ServiceClass.*(..))")
//	public void logAfter() {
//		logger.info("After the service class");
//	}
	
//	@Around("execution(* com.tataelxsi.aopdemo.service.ServiceClass.*(..))")
//	public void logAround(ProceedingJoinPoint jointPoint) throws Throwable {
//		logger.info("Before service");
//		jointPoint.proceed();
//		logger.info("After Service");
//	}
//
}
