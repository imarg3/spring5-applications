package com.arpitram.code.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arpitram.code.Coach;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
	  // read the spring config file
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
	  // get the bean from spring container
	  Coach coach = context.getBean("tennisCoach", Coach.class);
		
	  // call a method on the bean
	  System.out.println(coach.getDailyWorkout());
	  
	  // call method to get the daily fortune
	  System.out.println(coach.getDailyFortune());

		
	  // close the context
	  context.close();
	}
}
