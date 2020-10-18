package com.springcore.javaConfig;

import org.springframework.beans.factory.annotation.Value;

import com.springcore.annotations.ICoach;
import com.springcore.annotations.IFortuneService;

public class PingPongCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public PingPongCoach(IFortuneService fortuneService) {
		System.out.println(">> PingPongCoach: PingPongCoach(fortuneService)");
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
