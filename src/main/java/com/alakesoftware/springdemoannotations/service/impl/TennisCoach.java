package com.alakesoftware.springdemoannotations.service.impl;

import org.springframework.stereotype.Component;

import com.alakesoftware.springdemoannotations.service.Coach;

@Component("theSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

}
