package com.masai.entity;

import org.springframework.stereotype.Component;


/*
 * THESE IS USED DECLARED THE CLASS AS A COMPONENT OF 
 * IOC CONTAINER MEANS NOW THE CYCLE AND DEPENDENCIES 
 * INJECTION IS MANAGED BY SPRING CONTAINER 
 * 
 */
@Component
/*   |_ @Controller (Component, MVC Controller)
 *   |_ @Service (Component, Service Basically Business Logic)
 *   |_ @Repository (Component, DAO )
 */  
public class Employee {
	
	
	public void sell() {
		
		System.out.println("SELLING ITEMS");
	}

}
