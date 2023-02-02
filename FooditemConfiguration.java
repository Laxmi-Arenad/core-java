package com.xworkz.fooditem.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.fooditem")

public class FooditemConfiguration {
	

	public FooditemConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
}

