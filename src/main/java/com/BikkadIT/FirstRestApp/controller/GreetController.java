package com.BikkadIT.FirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/greetController")
public class GreetController {
	@GetMapping("/wel")
	public String greet() {
		String msg="Good morning";
		
		return msg;
		
	}
	@GetMapping("/greet1")
	public String greet1() {
		String msg="Good evening";
		
		return msg;
		
	}

}
