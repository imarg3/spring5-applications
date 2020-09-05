package com.arpitram.code.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.arpitram.code.Coach;

@Component
public class TennisCoach implements Coach {
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("randomFortuneService")
	/**
	 * Behind the scenes, Spring uses the Java Beans Introspector to generate the default 
	 * bean name. 
	 */
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	/*
	 * Constructor Injection 
	 * 
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	// define a setter method
	 * Setter / Method Injection
	 * 
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method ");
		this.fortuneService = fortuneService;
	}
	*/
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		System.out.println("Email ID: " + email + ", Team: " + team);
		return fortuneService.getFortune();
	}

}
