package com.alakesoftware.springdemoannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alakesoftware.springdemoannotations.service.Coach;

// 55
@SpringBootApplication
public class SpringDemoAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAnnotationsApplication.class, args);
	
		// read spring config file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach coach = context.getBean("theSillyCoach", Coach.class);
			
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		// close the context
		context.close();
	}

}
