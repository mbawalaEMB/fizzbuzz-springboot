package com.emb.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.emb.main.fizzbuzz.FizzBuzz;

@SpringBootTest
class RhenusRestTaskApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testThree() {
		FizzBuzz fbuzz = new FizzBuzz();
		fbuzz.fizzbuzz(12);
	}

}
