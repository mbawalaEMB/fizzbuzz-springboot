package com.emb.main.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FizzBuzzController {
	
	@RequestMapping("/fizzbuzz")
	public Object getFizzBuzzResponse(@RequestParam Long num) {
		if(num <= 0) {
			return "Enter a  number starting from 1";
		}
//		ModelAndView mv = new ModelAndView();
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setFizzBuzz(num);
//		mv.addObject("num", num);
//		mv.setViewName("index");
		return fizzBuzz;
	}

}
