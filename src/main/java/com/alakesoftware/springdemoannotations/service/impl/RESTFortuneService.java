package com.alakesoftware.springdemoannotations.service.impl;

import org.springframework.stereotype.Component;

import com.alakesoftware.springdemoannotations.service.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Rest Service";
	}

}
