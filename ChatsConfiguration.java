package com.xworkz.kal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.kal")

public class ChatsConfiguration {

	@Bean
	public String toName() {
		return "Bangarpete";
	}
	@Bean
	public int savings() {
		return 8000;
	}
	@Bean
	public short workers() {
		return 4;
	}
	@Bean
	public byte  noOfshop() {
		return 2;
	}
	@Bean
	public boolean selfService() {
		return true;
	}
	@Bean
	public long phoneNo() {
		return 9234566778L ;
	}
	
	@Bean
	public char good() {
		return 'G';
	}
	@Bean
	public double gst(){
	return 10.0;
	}
	@Bean
	public float quantity() {
		return 2.5f;
		
	}
	}
		
		
		
		
	public
			}
			
		}
	}
	
}
