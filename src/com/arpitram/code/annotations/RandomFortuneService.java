package com.arpitram.code.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] fortunes = {
			"Better Day!",
			"Best Day!",
			"Not a good day!"
	};
	
	//  create a random number generator
	Random random = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = random.nextInt(fortunes.length);
		String fortune = fortunes[index];
		
		return fortune;
	}

}
