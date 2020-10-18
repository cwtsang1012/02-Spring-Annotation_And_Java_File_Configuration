package com.springcore.javaConfig;

import com.springcore.annotations.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// Read spring java file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from the spring container
		//IoC = Dependency Injection -> Constructor Injection
		//ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		
		//IoC = Dependency Injection -> Setter Injection
		//ICoach theCoach = context.getBean("footballCoach", ICoach.class);
		
		//Ioc = Dependency Injection -> Field Injection(By Reflection)
		ICoach theCoach = context.getBean("basketballCoach", ICoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Call the method to get Daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
