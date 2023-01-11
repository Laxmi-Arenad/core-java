package com.xworkz.springTasks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RocketRunner {
public static void main(String args[]) {
	ApplicationContext rock2=new AnnotationConfigApplicationContext(RocketConfiguration.class);
	
	 Rocket ref= rock2.getBean("rock1",Rocket.class);
	 System.out.println("Rocket Name:"+ref.getName());
	 System.out.println("Rocket madein Country:"+ref.getCountry());
	 System.out.println("Rocket Budget:"+ref.getPrice());
	 
	 

	 Rocket ref1= rock2.getBean("rock1",Rocket.class);
	 System.out.println("Rocket Name:"+ref1.getName());
	 System.out.println("Rocket madein Country:"+ref1.getCountry());
	 System.out.println("Rocket Budget:"+ref1.getPrice());
	 
	 

}

}
			


