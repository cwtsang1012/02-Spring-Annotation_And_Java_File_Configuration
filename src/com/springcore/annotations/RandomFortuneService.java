package com.springcore.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {
	
	//create an array of String
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	public RandomFortuneService() {
		System.out.println(">> RandomFortuneService: default constructor - RandomFortuneService()");
	}
 	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
