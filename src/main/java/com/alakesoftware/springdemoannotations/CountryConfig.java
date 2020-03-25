package com.alakesoftware.springdemoannotations;

import java.util.Properties;

import javax.annotation.Resource;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:countries.properties")
public class CountryConfig {
	
	
	//@Resource(name="countriesProperties")
	//private Properties countryOptions;
	
}
