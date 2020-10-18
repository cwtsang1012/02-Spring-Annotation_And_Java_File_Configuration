package com.springcore.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPracticeApp {

	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from the spring container
		ICoach theCoach = context.getBean("swimCoach", ICoach.class);
		
		//Call the method to get Daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
