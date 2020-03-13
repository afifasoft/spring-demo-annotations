package com.alakesoftware.springdemoannotations.service.impl;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.alakesoftware.springdemoannotations.service.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Dog",
			"Cat",
			"Lion"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random string from the array
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
