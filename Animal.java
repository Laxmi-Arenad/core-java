package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal {
public static void main(String args[]) {
	
	
	ArrayList<String> animal=new ArrayList<String>() ;
	
	
	animal.add("Dog ");
	animal.add("Cat ");
	animal.add("Elephant ");
	animal.add("Rabbit ");
	animal.add("Fox");
	animal.add("Lion");
	animal.add("Bear ");
	animal.add("Tiger ");
	animal.add("Camel ");
	animal.add("Horse ");
	
	Iterator<String> i = animal.iterator() ;
	while(i.hasNext()) {
		System.out.println(i.next()) ;
		
	}
	
	for(String element:animal) {
		System.out.println(element);
	}
}
}




