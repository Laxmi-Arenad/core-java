package com.xworkz.kal.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.kal.bean.Hardware;
import com.xworkz.kal.bean.Pencil;
import com.xworkz.kal.bean.Rubber;
import com.xworkz.kal.bean.Software;
import com.xworkz.kal.bean.SoftwareEngineer;


public class Runner {

	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(Pencil.class);
		
		System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
		
		
		Pencil ref = app.getBean(Pencil.class); 
		System.out.println(ref);
		
		Rubber ref1 = app.getBean(Rubber.class); 
		System.out.println(ref1);
		
		Software ref2 = app.getBean(Software.class); 
		System.out.println(ref2);
		
		Hardware ref3 = app.getBean(Hardware.class);
		System.out.println(ref3);
		
	     SoftwareEngineer ref4 = app.getBean(SoftwareEngineer.class);
		System.out.println(ref4);
		
		
		

	}

}
