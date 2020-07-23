package com.cakefactory.bakeryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//ComponenetScan may or may not be needed, it
@SpringBootApplication
@ComponentScan("com.cakefactory.bakeryapp.controller")
public class BakeryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakeryAppApplication.class, args);
	}

}
