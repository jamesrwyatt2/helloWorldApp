package com.jwctech.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Class level mapping!";
	}

}
