package com.xworkz.laserr.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(" com.xworkz.laserr")
public class SpringBeanConfiguration {

	
	public SpringBeanConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
}
