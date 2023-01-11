package com.xworkz.springTasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.springTasks")
public class ActorConfiguration {
 public ActorConfiguration( ) {
	 
	 System.out.println("Default constructor of actor");
 }
 @Bean
 public Actor act() {
	  Actor ac=new Actor("Prajwal","Kannada",35);
	     return ac;
 }
	 @Bean
	 public Actor act1(){
		 Actor ac1=new Actor("Prabhas","Telagu",45);
		 return ac1;
		 
	 
	     
 }
}
