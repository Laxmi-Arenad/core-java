package com.xworkz.mapingColle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChocolateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Map<String,Integer> map = new HashMap();
 map.put("DiaryMilk",100);
 map.put("Crunch",30);
 map.put("Kitkat",40);
 map.put("MilkyBar",35);
 map.put("Perk",45);
 map.put("Snikers",50);
 map.put("Eclairs",60);
 map.put("5 Star",20);
 map.put("Boost",80);
 map.put("MilkyWay",85);
 
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

	








		
		
	


