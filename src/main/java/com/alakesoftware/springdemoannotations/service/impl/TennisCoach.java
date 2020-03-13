package com.alakesoftware.springdemoannotations.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.alakesoftware.springdemoannotations.service.Coach;
import com.alakesoftware.springdemoannotations.service.FortuneService;

@Component
// @Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired								// Field injection - java Reflection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;   
	
/*	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/	
	public TennisCoach() {
		System.out.println("inside : default ctr");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff() method");
	}
	
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff() method");
	}
	
	// define a setter method
/*	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside: setter method");
		this.fortuneService = fortuneService;
	}

*/
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}
*/
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	
	
}
