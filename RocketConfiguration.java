package com.xworkz.springTasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.springTasks")
public class RocketConfiguration {
   public RocketConfiguration() {
	   
	   System.out.println("Default Rocket configuration Constructor\n");
   }
   @Bean
   public Rocket rock1() {
	   System.out.println("Rocket 1 Bean\n");
	   Rocket rock=new Rocket();
	   return rock;
   }
   @Bean
   public Rocket rock2() {
	   System.out.println("Rocket 2 Bean\n");
	   Rocket rock=new Rocket() ;
	   return rock;
	   
   }
	
}
