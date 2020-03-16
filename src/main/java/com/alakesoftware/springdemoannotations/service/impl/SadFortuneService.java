package com.alakesoftware.springdemoannotations.service.impl;




import com.alakesoftware.springdemoannotations.service.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is a sad day!";
	}

}
