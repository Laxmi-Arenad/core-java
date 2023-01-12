package com.xworkz.alk.bean;

import java.awt.Window.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String name;
	private Type type;
	@Autowired
	@Qualifier("engineNumber")
	private int number;
	@Autowired
	@Qualifier("engineversion")
	private  int version;
	private String company;
	
	@Autowired
	public Engine(@Qualifier("engineName")String name, Type type, @Qualifier("engineCompany")String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + "]";
	}
	
	
	
	
	
	
	
	
	

}
