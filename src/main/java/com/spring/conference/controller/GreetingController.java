package com.spring.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/greeting")
	public String greet(Map<String, Object> model) {
		model.put("message", "HELLO Yanshu");
		return "greeting";
	}
}
