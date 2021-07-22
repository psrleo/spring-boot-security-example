package com.psr.springbootsecurityexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth/")
public class ApplicationSecurityController {
	
	@GetMapping("/getMssg")
	public String greetings() {
		
		return "Spring Security Greetings";
		
	}
}

