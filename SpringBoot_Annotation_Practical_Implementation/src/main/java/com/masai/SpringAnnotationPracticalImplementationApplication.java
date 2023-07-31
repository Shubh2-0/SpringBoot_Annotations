package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.entity.Employee;
import com.masai.entity.Student;
import com.masai2.Example;



/*
 * MAIN CLASS IS ANNOTATED WITH THESE ANNOTATION
 * MEANS THESE ANNOTATION MARKED SPRING BOOT MAIN CLASS
 *
 * @SpringBootApplication  = @EnableAutoConfiguration +
 *                           @ComponentScane +
 *                           @Configuration 
 * 
 * @EnableAutoConfiguration => WHEN WE CREATE ANY NORMAL APPLICATION USING SPRING FRAMEWORK 
 *                             SO WE HAVE TO DO MANUAL CONFIGRATION (LIKE XML , JAVA BASED)
 * 
 * 
 * @ComponentScane => THESE ANNOTATION BASICALLY SCAN THE PACKAGE AND THIER 
 *                    SUB PACKAGE FOR SPRING BEAN
 * 
 * 
 * @Configuration  => WHERE OUR BEANS IS DECLARED AND RETURN
 *                    SOURCE WHERE WE GET THE BEANS  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  * 
 * 
 * 
 */
@SpringBootApplication
public class SpringAnnotationPracticalImplementationApplication {

	
	/*
	 * BASICALLY THESE ANNOTATION 
	 * IS USED AUTOWIRING (INJECT) 
	 * THE DEPENDENCIES THAT WE HAVE 
	 * 
	 */
	@Autowired
	@Qualifier("student 2")
	private Student st;
	
	@Autowired
	private Employee emp;
	
	@Autowired
	private Example ex;
	
	
	/*
	 * WHEN WE EXECUTE OUR APPLICATION THESE
	 * MAIN METHOD IS EXECUTED
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationPracticalImplementationApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
// 
//		emp.sell();
//		st.study();
//		System.out.println(st);
//		ex.eating();
//		
//	}

}
