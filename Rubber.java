package com.xworkz.kal.bean;

import java.awt.Window.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Rubber {
	@Autowired
	@Qualifier("toName")
	private String name;
	@Autowired
	private Type type;
	@Autowired
	private int price;
	@Autowired
	private String color;
	@Autowired
	@Qualifier("shape")
	private String shape;
	@Autowired
	private boolean stolen;
	@Autowired
	private int size;
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
	}
