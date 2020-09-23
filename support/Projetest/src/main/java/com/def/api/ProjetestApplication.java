package com.def.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.def.api.controllers"})
public class ProjetestApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProjetestApplication.class, args);
		
		
	}

}
