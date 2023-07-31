package com.masai.entity;

import lombok.Data;

@Data
public class Student {
	
	int rollNo;
	String name;
	

	public void study() {
		
		System.out.println("LEARNING SPRING BOOT ANNOTATIONS");
	}
	
}
