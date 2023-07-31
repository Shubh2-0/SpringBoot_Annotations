package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/home")
	public String homeHandler() {
		
		return "LEARNING SPRING BOOT ANNOTATIONS";
		
		
	}
	
	
	@GetMapping("/add/{roll}")
	public String getRoll(@PathVariable("roll") String roll) {
		
		
		System.out.println(roll);
		return roll;
	}
	
	
}
