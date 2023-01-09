package com.xworkz.mapingColle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CityTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 Map<String,Integer> map = new HashMap();
 map.put("Bagalkot",30);
 map.put("Belagaum",25);
 map.put("Vijapur",35);
 map.put("Haveri",33);
 map.put("Gadag",23);
 map.put("Koppal",37);
 map.put("Bangalore",25);
 map.put("Kolar",38);
 map.put("Madikeri",15);
 map.put("Mandya",27);
 
 System.out.println(map);
	System.out.println(map.size());
	if(map.isEmpty()) {
		System.out.println("it is empty");
	}
	else{
		System.out.println("it is not empty");
	}
	Set<String> keys= map.keySet();
	keys.forEach(e->System.out.println(e));
	
	Collection<Integer>values= map.values();
	values.forEach(v->System.out.println(v));
	
	//Set<Entry<String,Integer>> entries=map.entrySet();
	
	//for(Entry<String,Integer> entry:entries) {
	//	System.out.println(entry.getKey()+" " +entry.getValues);
   
	}
}

	








	


