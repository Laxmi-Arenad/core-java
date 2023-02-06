package com.xworkz.beaches.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beaches")
public class MarinaConfiguration {
	
	
	public MarinaConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

}
