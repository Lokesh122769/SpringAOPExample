package com.SpringRest.SpringAOPexample.AOP;

import java.time.LocalTime;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Aspect
@Component
public class StudentAOP
{

	@Before(value="execution(* com.SpringRest.SpringAOPexample.weblayer.StudentController.*(..))")
	public void beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("Request came to "+ joinPoint.getSignature()+" at "+LocalTime.now());
	}
	
	
	@After(value="execution(* com.SpringRest.SpringAOPexample.weblayer.StudentController.*(..))")
	public void afterAdvice(JoinPoint joinPoint)
	{
		System.out.println("Response came from "+ joinPoint.getSignature()+" at "+LocalTime.now()+" 1");
	}
	
	@After(value="execution(* com.SpringRest.SpringAOPexample.service.StudentServiceImpl.*(..))")
	public void afterAdviceService(JoinPoint joinPoint)
	{
		System.out.println("Response came from "+ joinPoint.getSignature()+" at "+LocalTime.now()+" 2");
	}
	
	
	@AfterThrowing(value="execution(* com.SpringRest.SpringAOPexample.service.StudentServiceImpl.*(..))", throwing ="exception" )
	public void afterAdviceService(JoinPoint joinPoint,Exception e)
	{
		System.out.println("In Exception Method");
		System.out.println("Response came from "+ joinPoint.getSignature()+" at "+LocalTime.now()+" exception is "+e.getMessage());
	}
	
	/*@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}*/
	
}
