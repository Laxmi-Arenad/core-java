package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MetroCityNames {

	public static void main(String args[]) {
		
		
		ArrayList<String>metrocitynames=new ArrayList<String>() ;
		
		
		metrocitynames.add("Mumbai ");
		metrocitynames.add("Delhi ");
		metrocitynames.add("Bangalore ");
		metrocitynames.add("Chennai ");
		metrocitynames.add("Hydrabad");
		
		
		Iterator<String> i =metrocitynames.iterator() ;
		while(i.hasNext()) {
			System.out.println(i.next()) ;
			
		}
		
		for(String element:metrocitynames) {
			System.out.println(element);
		}
	}
	}





