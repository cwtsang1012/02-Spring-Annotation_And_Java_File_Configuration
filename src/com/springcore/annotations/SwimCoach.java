package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements ICoach {
	@Autowired
	@Qualifier("fileFortuneService")
	private IFortuneService fortuneService;
	
	//define a default constructor
	public SwimCoach() {
		System.out.println(">> SwimCoach: default constructor - SwimCoach()");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do some strength first!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
