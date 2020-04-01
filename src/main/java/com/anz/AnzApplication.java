package com.anz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.anz.controller","com.anz.repository","com.anz.model"})
public class AnzApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(AnzApplication.class, args);
	}

}
