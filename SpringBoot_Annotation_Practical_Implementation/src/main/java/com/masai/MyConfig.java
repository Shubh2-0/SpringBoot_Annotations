package com.masai;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.masai.entity.Student;


/*
 * RETURN THE SPRING BEANS
 */
@Configuration
@ComponentScan(basePackages = {"com"})
public class MyConfig {
	
	
	
	/*
	 * THESE ANNOTATION USE IS WHERE WE A CLASS WHICH ANNOTATED WITH 
	 * @Configuration ANNOTATION 
	 * REPRESENT THAT BY THESE METHOD 
	 * WE RETURN ANY BEAN 
	 */
	@Bean("student 1")
	@Lazy
	public Student getStudent() {
		System.out.println("CRETING STUDEN 1");
		Student s = new Student();
		s.setName("Student 1");
		return s;
		
	}
	
	@Bean("student 2")
	/*
	 * WHEN WE NEEDED THE THEN SPRING CONTAINER CREATED ONLY   
	 */
	@Lazy
	public Student getStudent2() {
		System.out.println("CRETING STUDEN 2");
		Student s = new Student();
		s.setName("Student 2");
		return s; 
		
	}

}
