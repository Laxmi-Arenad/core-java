package com.xworkz.kal.configuration;

import java.awt.Window.Type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.kal.bean.Pencil;

@Configuration
@ComponentScan("com.xworkz.kal")

public class PencilConfiguration {
	
	public PencilConfiguration() {
		
	}
   @Bean
	public String toName() {
		return "Nataraj";
	}
   
   @Bean
  	public Type type() {
  		return Type.NORMAL;
  	}
   
   
   @Bean
 	public Integer price() {
 		int penci = 20;
 		return penci;
 	}

   @Bean
	public String color() {
		return "Red";
	}
   
   @Bean
   public boolean sharp() {
	   return true;
   }
  
   @Bean
   public boolean stolen() {
	   return true;
   }
    
}
