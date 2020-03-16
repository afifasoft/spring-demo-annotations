package com.alakesoftware.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alakesoftware.springdemoannotations.service.Coach;
import com.alakesoftware.springdemoannotations.service.FortuneService;
import com.alakesoftware.springdemoannotations.service.impl.SadFortuneService;
import com.alakesoftware.springdemoannotations.service.impl.SwimCoach;

@Configuration
//@ComponentScan("com.alakesoftware.springdemoannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	
	// define bean for our swim coach and inject dependency 
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
