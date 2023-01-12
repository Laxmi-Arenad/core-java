package com.xworkz.kal.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.kal")
public class SoftwareConfiguration {
	

	@Bean
	public String name() {
		return "java";
	}
	@Bean
	
	public String version(){
		return "1.8 ";
	}
	@Bean
	public String developer() {
		return " Kavya";
	}
	@Bean
	public LocalDate date() {
		return LocalDate.of(2023, 01, 10);
	}
	@Bean
	public boolean free() {
		return false;
		}
}
