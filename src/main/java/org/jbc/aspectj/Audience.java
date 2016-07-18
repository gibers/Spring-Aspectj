package org.jbc.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Before(" execution(* org.jbc.aspectj.Cc1.methode1())")
	public void avantMethode1() {
		System.out.println("avant méthode 1");
	}
		
}

