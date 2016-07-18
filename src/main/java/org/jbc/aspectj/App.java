package org.jbc.aspectj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {        
        AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(Config.class);
        Cc1 c1 = ann.getBean(Cc1.class );        
        c1.methode1();
        
    }
}
