package com.xworkz.kal.configuration;

import java.awt.Window.Type;

import org.springframework.context.annotation.Bean;

public class RubberConfiguration {
	public RubberConfiguration() {
	}
	
	 @Bean
		public String toName() {
			return "Doms";
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
	   public String shape() {
		   return "round";
	   }
	  
	   @Bean
	   public boolean stolen() {
		   return true;
	   }
	    
	   @Bean
	   public Integer size() {
		   return 5;
	   }


}
