package com.alakesoftware.springdemoannotations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/home")
	public String showMyPage() {
		return "index"; // View name
	}
}
