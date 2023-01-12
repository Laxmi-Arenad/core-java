package com.xworkz.kal.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Software {
	@Autowired
	@Qualifier("toName")
 private String name;
	@Autowired
	@Qualifier("version")
 private String version;
	@Autowired
	
 private String Developer;
	@Autowired
 private LocalDate date;
	@Autowired
 private boolean free;
 
 public Software() {
	 System.out.println("Default constructor of software");
 }

@Override
public String toString() {
	return "Software [name=" + name + ", version=" + version + ", Developer=" + Developer + ", date=" + date + ", free="
			+ free + "]";
}
 
 }

