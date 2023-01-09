package com.xworkz.mapingColle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PgNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 Map<String,Integer> map = new HashMap();
 map.put("Golden Pg",5250);
 map.put("Akshata Pg",5000);
 map.put("Swati Pg",4000);
 map.put("Majula Pg",3000);
 map.put("Asha Pg",4500);
 map.put("Annapurna Pg",3500);
 map.put("Yamuna Pg",6000);
 map.put("Ankita Pg",6400);
 map.put("Ananya Pg",6500);
 map.put("Sakshi Pg",7000);
 
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

	
























		
		
	


