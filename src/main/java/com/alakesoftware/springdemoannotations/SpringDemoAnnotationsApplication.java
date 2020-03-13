package com.alakesoftware.springdemoannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alakesoftware.springdemoannotations.service.Coach;


@SpringBootApplication
public class SpringDemoAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAnnotationsApplication.class, args);
	
		// read spring config file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
			
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(coach.getDailyFortune());
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (coach == alphaCoach);
		
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory location for coach: "+ coach );
		System.out.println("\nMemory locaation for alphaCoach: "+ alphaCoach);
		// close the context
		context.close();
	}

}
