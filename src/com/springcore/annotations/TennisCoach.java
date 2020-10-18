package com.springcore.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	// define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: default constructor - TennisCoach()");
    }
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService")IFortuneService fortuneService) {
		System.out.println(">> TennisCoach: @Autowiring on constructor");
		this.fortuneService = fortuneService;
	}
	
	//define my init method
	@PostConstruct 
	public void doMyStartUpMethod() {
		System.out.println(">> TennisCoach: @PostConstruct - doMyStartUpMethod()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpMethod() {
		System.out.println(">> TennisCoach: @PreDestroy - doMyCleanUpMethod()");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
