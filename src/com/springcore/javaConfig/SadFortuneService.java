package com.springcore.javaConfig;

import com.springcore.annotations.IFortuneService;

public class SadFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
