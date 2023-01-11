package com.xworkz.springTasks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Rocket {
    @Value("PSLV-B45")
    private String name;
    @Value("India")
    private String Country;
    @Value("500.0")
    private double price;
    
    public Rocket() {
    	super();
    }
    public String getName() {
    	return name;
    }
    public String getCountry() {
    	return Country;
    }
    public double  getPrice() {
    	return price;
    	
    }
}
