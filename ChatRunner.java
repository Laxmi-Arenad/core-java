package com.xworkz.kal.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.kal.bean.ChatCenter;

public class ChatRunner {

	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(ChatCenter.class);
		
		System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
		
		
		ChatCenter ref = app.getBean(ChatCenter.class); 
		System.out.println(ref);
}
}
