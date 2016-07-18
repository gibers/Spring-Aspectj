package org.jbc.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public Cc1 methode () {
		return new Cc1();
	}
	
	@Bean
	public Audience aud() {
		return new Audience();
	}
	
}
