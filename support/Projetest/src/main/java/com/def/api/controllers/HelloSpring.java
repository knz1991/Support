package com.def.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {

	@RequestMapping("/hello")
	public String helloSpring() {
		
		return "Hello Spring" ;
	}
}
