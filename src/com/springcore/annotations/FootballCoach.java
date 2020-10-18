package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements ICoach {
	private IFortuneService fortuneService;
	
	//define a default constructor
	public FootballCoach() {
		System.out.println(">> FootballCoach: default constructor - FootballCoach()");
	}
	
	//Inject dependencies by calling any method on your class
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomeCrazyStuff(IFortuneService fortuneService) {
		System.out.println(">> FootballCoach: @AutoWiring - doSomeCrazyStuff()");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run the ground for 3 times!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
