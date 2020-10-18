package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements IFortuneService {
	
	public RestFortuneService() {
		System.out.println(">> RestFortuneService: default constructor - RestFortuneService()");
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
