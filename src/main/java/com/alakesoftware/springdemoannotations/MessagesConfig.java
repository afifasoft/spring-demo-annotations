package com.alakesoftware.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessagesConfig {

	@Bean
	public ResourceBundleMessageSource messageSource() {
		
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasename("messages");
		resource.setUseCodeAsDefaultMessage(true);
		
		return resource;
	}
}
