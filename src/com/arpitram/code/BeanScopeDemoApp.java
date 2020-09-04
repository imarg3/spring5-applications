package com.arpitram.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class); // singleton object
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class); // singleton object 
		
		// check if they are same
		boolean result = (coach == alphaCoach);
		
		// print out the result
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory location for coach : " + coach);
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach + "\n");
		
		// close the context
		context.close();
	}

}
