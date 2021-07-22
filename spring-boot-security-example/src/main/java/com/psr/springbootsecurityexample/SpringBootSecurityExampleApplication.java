package com.psr.springbootsecurityexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootSecurityExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityExampleApplication.class, args);
	}

}
