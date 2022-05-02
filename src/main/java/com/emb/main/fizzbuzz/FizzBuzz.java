package com.emb.main.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	
	private List<String> fizzbuzz;
	
	public String fizzbuzz(long n) {
		if((n % 3 == 0) && (n % 5 == 0)) {
			return "FizzBuzz";
		}
		else {
			if(n % 3 == 0) {
				return "Fizz";
			}
			else if(n % 5 == 0) {
				return "Buzz";
			}
			else {
				return String.valueOf(n);
			}
		}
	}
	
	public void setFizzBuzz(long n) {
		fizzbuzz = new ArrayList<>();
		for(long i = 1; i <= n; i++) {
			fizzbuzz.add(fizzbuzz(i));
		}
		
	}
	
	public List<String> getFizzBuzz() {
		return fizzbuzz;
	}
	
	@Override
	public String toString() {
		if(fizzbuzz != null) {
			return Arrays.toString(fizzbuzz.toArray());
		}
		return null;
	}
	
//	public static void main(String[] args) {
//		 try (Scanner myObj = new Scanner(System.in)) {
//			System.out.println("Enter username");
//			FizzBuzz fbz = new FizzBuzz();
//			String input = myObj.nextLine();  // Read user input
//			Long num = Long.parseLong(input);
//			fbz.getNumbers(num);
//			
//			System.out.println(fbz.toString());
//		 }
//	}

}
