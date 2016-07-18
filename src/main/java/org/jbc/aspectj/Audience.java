package org.jbc.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.SourceLocation;

@Aspect
public class Audience {
	
	@Pointcut(" execution(* org.jbc.aspectj.Cc1.*(..) )")
	public void perform(){}
	
	
	@Around("perform()")
	public void avantMethode1(ProceedingJoinPoint jp) throws Throwable {
		String name = jp.getSignature().getName();
		System.out.println("avant méthode : " + jp.getSignature().toString());
		jp.proceed();
		System.out.println("après méthode : " + jp.getSignature().toString());
	}
		
}

