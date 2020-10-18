package com.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService {
	
	public DatabaseFortuneService() {
		System.out.println(">> DatabaseFortuneService: default constructor - DatabaseFortuneService()");
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
