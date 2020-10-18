package com.springcore.javaConfig;

import com.springcore.annotations.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PingPongJavaConfigDemoApp {

	public static void main(String[] args) {
		// Read spring java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from the spring container
		//IoC = Dependency Injection -> Constructor Injection
		//ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		
		//IoC = Dependency Injection -> Setter Injection
		//ICoach theCoach = context.getBean("footballCoach", ICoach.class);
		
		//Ioc = Dependency Injection -> Field Injection(By Reflection)
		PingPongCoach theCoach = context.getBean("pingPongCoach", PingPongCoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Call the method to get Daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Call our new ping pong coach methods...has the props values injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// Close the context
		context.close();
	}

}
