package com.emb.main.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Schreibe eine kleine Spring-Boot-Anwendung mit einer REST-API, die einen 
 * Eingabewert empfängt und eine Ergebnisliste im JSON-Format zurückgibt.
Durch die Eingabe einer Zahl gibt die Anwendung eine Liste von Werten beginnend mit 1 
bis zur eingegebenen Zahl unter Berücksichtigung der folgenden Regeln zurück:

- Wenn die Zahl durch 3 teilbar ist, dann soll ‚Fizz‘ ausgegeben werden
- Wenn Zahl durch 5 teilbar ist, soll ‚Buzz‘ ausgeben werden
- Wenn die Zahl sowohl durch 3 als auch durch 5 teilbar ist, dann soll ‚FizzBuzz‘ ausgeben werden
- Andernfalls soll nur die nächste Zahl ausgeben werden

 

Hinweise:  Verwende TDD, erkläre die Schritte, die Du durchgeführt, und beachte Fehlerfälle.
                    Es ist nicht notwendig, eine Benutzeroberfläche zu entwickeln.

 
 * */
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
