package com.springcore.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements ICoach {
	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	//define a default constructor
	public BasketballCoach() {
		System.out.println(">> BasketballCoach: default constructor - BasketballCoach()");
	}
	
	//define my init method
	@PostConstruct 
	public void doMyStartUpMethod() {
		System.out.println(">> BasketballCoach: @PostConstruct - doMyStartUpMethod()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpMethod() {
		System.out.println(">> BasketballCoach: @PreDestroy - doMyCleanUpMethod()");
	}
	
	
	@Override
	public String getDailyWorkout() {
		System.out.println(">> BasketballCoach: getDailyWorkout()");
		//return "Warm up by running 5 minutes!";
		return team + " - " + email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
