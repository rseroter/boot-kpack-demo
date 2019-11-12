package com.seroter.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Value("${appruntime:Spring Boot}")
	private String appruntime;
	
	@GetMapping("/")
	public String SayHi() {
		return "Hello VMworld Europe! Greetings from " + appruntime;
	}

}
