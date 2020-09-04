package com.arpitram.code.annotations;

import org.springframework.stereotype.Component;

import com.arpitram.code.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Day";
	}

}
