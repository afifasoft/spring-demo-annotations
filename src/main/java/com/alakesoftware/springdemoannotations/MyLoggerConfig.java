package com.alakesoftware.springdemoannotations;

import java.util.logging.Level;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mylogger.properties")
public class MyLoggerConfig {
	
	@Value("${root.logger.level}")
	private String rootLoggerLevel;
	
	@Value("${printed.logger.level}")
	private String printedLoggerLevel;
	
	@PostConstruct
	public void initLogger() {
		
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level printedLevel = Level.parse(printedLoggerLevel);
		
	}

}
