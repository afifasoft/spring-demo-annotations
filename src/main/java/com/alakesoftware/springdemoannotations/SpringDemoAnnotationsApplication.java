package com.alakesoftware.springdemoannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alakesoftware.springdemoannotations.service.Coach;
import com.alakesoftware.springdemoannotations.service.impl.SwimCoach;

// 171
@SpringBootApplication
public class SpringDemoAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAnnotationsApplication.class, args);
	
		
	/* xml config
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
		
		*/
		
		/* Annotations config */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
//		Coach coach = context.getBean("tennisCoach", Coach.class);
//		
//		System.out.println(coach.getDailyWorkout());
//		
//		System.out.println(coach.getDailyFortune());
//		
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the prop values injected
		System.out.println("email: "+swimCoach.getEmail() );
		System.out.println("team: "+swimCoach.getTeam());
	}

}
