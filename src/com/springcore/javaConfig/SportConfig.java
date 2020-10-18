package com.springcore.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springcore.annotations.*;

@Configuration
@ComponentScan({"com.springcore.annotations", "com.springcore.javaConfig"})
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Autowired
	MyLoggerConfig logger;
	
	/*
	 *  Use @Bean for bean dependency injection!!!
	 *  The @Bean annotation tells Spring that we are creating a bean component manually. 
	 *	We didn't specify a scope so the default scope is singleton.
	 */
	// define bean for our sad fortune service
	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our ping pong coach AND inject dependency
	@Bean
	public ICoach pingPongCoach() {
		PingPongCoach mypingPongCoach = new PingPongCoach(sadFortuneService());
		
		return mypingPongCoach;
	}
}
