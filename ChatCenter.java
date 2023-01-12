package com.xworkz.kal.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatCenter{
	@Autowired
 private String name;
	@Autowired
 private  int savings;
	@Autowired
 private short workers;
	@Autowired
 private byte noOfShop;
	@Autowired
 private boolean selfService;
	@Autowired
 private long phoneNo;
	@Autowired
 private char good;
 @Autowired
 private double gst;
	@Autowired
 private float quantity;
	@Override
	public String toString() {
		return "Chats [name=" + name + ", price=" + price + ", workers=" + workers + ", noOfShop=" + noOfShop
				+ ", selfService=" + selfService + ", phoneNo=" + phoneNo + ", good=" + good + ", gst=" + gst
				+ ", quantity=" + quantity + "]";
	}
 
}

