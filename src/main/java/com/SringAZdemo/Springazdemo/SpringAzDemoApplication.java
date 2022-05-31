package com.SringAZdemo.Springazdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzDemoApplication {
	@GetMapping("/message")
	public String message(){
		return "We are successfully logged in... ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzDemoApplication.class, args);
	}

}
