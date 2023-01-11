package com.xworkz.springTasks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActorRunner {
public static void main(String args[]) {
	 ApplicationContext ac= new AnnotationConfigApplicationContext(ActorConfiguration.class);
	 
	 Actor act= ac.getBean("act",Actor.class);
	   System.out.println("Actor Name:"+act.getName());
	   System.out.println("Actor langauge:"+act.getLangauge());
	   System.out.println("Actor age:"+act.getAge());
	   
	   System.out.println();
	   
	   
		 Actor act1= ac.getBean("act1",Actor.class);
		   System.out.println("Actor Name:"+act1.getName());
		   System.out.println("Actor langauge:"+act1.getLangauge());
		   System.out.println("Actor age:"+act1.getAge());

	   
}
}
