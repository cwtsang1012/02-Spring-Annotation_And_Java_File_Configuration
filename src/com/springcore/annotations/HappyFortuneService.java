package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {
	
	public HappyFortuneService() {
		System.out.println(">> HappyFortuneService: default constructor - HappyFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
