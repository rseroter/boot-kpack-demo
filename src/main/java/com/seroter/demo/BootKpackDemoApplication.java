package com.seroter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootKpackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootKpackDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String SayHi() {
		return "hello!";
	}

}
