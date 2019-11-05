package com.seroter.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/")
	public String SayHi() {
		return "Hello VMworld!";
	}

}
