package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int x,int y) {
		int output = 0;
		if(x > 0 && y > 0) {
			output = x + y;
		}else {
	        throw new IllegalArgumentException("Both parameters must be positive!");
		}
		return output;
	}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	public int randomNumberHalved() {
		int randomNumber = getRandomInt();
		int output = randomNumber / 2;
		return output;
	}
	
	
	
	
	
	
	
	
}
